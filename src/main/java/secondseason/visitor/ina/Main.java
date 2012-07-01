package secondseason.visitor.ina;

import java.util.ArrayList;
import java.util.Stack;

interface Visitor{ //Elementの構造をたどって何かしらを行うVisitor
	public void visit(TNum n);
	public void visit(TAdd n);
	public void visit(TMul n);
	public void visit(TStatement n);
}

class Value{
	public int v = 0;
	public Value(int a){
		v = a;
	}
	public Value add(Value a){
		return new Value(a.v + v);
	}
	public Value mul(Value a){
		return new Value(a.v * v);
	}
}

// 答えを計算するVisitor
class Operate implements Visitor{
	public Stack<Value> arr;
	public Operate(){
		arr = new Stack<Value>();
	}

	@Override
	public void visit(TNum n) {
		arr.push(n.value);
	}
	@Override
	public void visit(TAdd n) {
		n.a.accept(this);
		n.b.accept(this);

		Value a = arr.pop();
		Value b = arr.pop();
		arr.push(a.add(b));
	}

	@Override
	public void visit(TMul n) {
		n.a.accept(this);
		n.b.accept(this);
		Value a = arr.pop();
		Value b = arr.pop();
		
		arr.push(a.mul(b));
	}

	@Override
	public void visit(TStatement n) {
		n.a.accept(this);
	}

}

//元の数式を表示するVisitor
class View implements Visitor{
	public View(){
	}

	@Override
	public void visit(TNum n) {
		System.out.print(n.value.v);
	}
	@Override
	public void visit(TAdd n) {
		n.a.accept(this);
		System.out.print("+");
		n.b.accept(this);
	}

	@Override
	public void visit(TMul n) {
		n.a.accept(this);
		System.out.print("*");
		n.b.accept(this);
	}
	@Override
	public void visit(TStatement n) {
		n.a.accept(this);
		System.out.println();
	}
}

//元の数式(後置記法)を表示するVisitor
class ViewPost implements Visitor{
	public ViewPost(){
	}

	@Override
	public void visit(TNum n) {
		System.out.print(n.value.v + " ");
	}
	@Override
	public void visit(TAdd n) {
		n.a.accept(this);
		n.b.accept(this);
		System.out.print("+");
	}

	@Override
	public void visit(TMul n) {
		n.a.accept(this);
		n.b.accept(this);
		System.out.print("*");
	}
	@Override
	public void visit(TStatement n) {
		n.a.accept(this);
		System.out.println();
	}
}

//左右の項を交換するVisitor
class Conv implements Visitor{
	public TStatement s;
	public Stack<Element> stack;
	public Conv(){
		s = null;
		stack = new Stack<Element>();
	}

	@Override
	public void visit(TNum n) {
		stack.push(n);
	}
	@Override
	public void visit(TAdd n) {
		n.a.accept(this);
		n.b.accept(this);
		stack.push(new TAdd(stack.pop(),stack.pop()));
	}

	@Override
	public void visit(TMul n) {
		n.a.accept(this);
		n.b.accept(this);
		stack.push(new TMul(stack.pop(),stack.pop()));
	}
	@Override
	public void visit(TStatement n) {
		n.a.accept(this);
		s = new TStatement(stack.pop());
	}
}

//構文要素
abstract class Element{
	abstract public void accept(Visitor v);
}
//数字
class TNum extends Element{
	Value value;
	public TNum(int n){
		value = new Value(n);
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}	
}
//文
class TStatement extends Element{
	public Element a;
	public TStatement(Element x){
		a = x;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}	
}
//加算
class TAdd extends Element{
	public Element a;
	public  Element b;
	public TAdd(Element x, Element y){
		a = x;
		b = y;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}	
}
//掛け算
class TMul extends Element{
	public Element a;
	public Element b;
	public TMul(Element x, Element y){
		a = x;
		b = y;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}	
}


public class Main {
	public static void main(String[] args) {
		// 今回はこの形は与えられているものとする(本当は文字列からこの形に持ってくる)
		Element e = new TStatement(new TAdd(new TNum(10), new TMul(new TNum(5), new TNum(3))));
		
		//表示してみる
		System.out.print("View: ");
		View v = new View();
		e.accept(v);
		
		//表示してみる2
		System.out.print("ViewPost: ");
		ViewPost vp = new ViewPost();
		e.accept(vp);
		
		//計算してみる
		Operate o = new Operate();
		e.accept(o);
		
		System.out.print("Operate: ");		
		System.out.println(o.arr.pop().v);
		System.out.println("===================");
		// 変換してみる
		Conv c = new Conv();
		e.accept(c);
		
		// 表示してみる
		System.out.print("Conv+View: ");		
		View v2 = new View();
		v2.visit(c.s);

	}

}
