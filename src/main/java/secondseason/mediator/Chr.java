package secondseason.mediator;
import java.awt.Graphics;


public class Chr {
	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	protected int size = 16;
	protected int weight = 10;
	protected ChrMediator cm;
	public Chr(int x, int y){
		this.x = x;
		this.y = y;
		
		this.dx = 0;
		this.dy = 0;
	}
	public void setChrMediator(ChrMediator cm){
		this.cm = cm;
	}
	public void draw(Graphics g){
		
		g.drawRect(x, y, size, size);
		g.drawString(""+weight, x, y);
	}
	public int getX(){return x;}
	public int getY(){return y;}
	public int getDx(){return dx;}
	public int getDy(){return dy;}
	public int getSize(){return size;}
	public int getWeight(){return weight;}
	public void setDx(int x){dx = x;}
	public void setDy(int y){dy = y;}
	public void setWeight(int w){weight = w;}
	
	public void moveX(){
		x += dx;
		cm.changed(this);
	}
	public void moveY(){
		y += dy;
		cm.changed(this);
	}
	public boolean isHit(Chr c){
		if(
				Math.abs((x + size/2) - (c.getX() + c.getSize()/2)) < (size + c.getSize())/2 &&
				Math.abs((y + size/2) - (c.getY() + c.getSize()/2)) < (size + c.getSize())/2
		){
				return true;
		}
		return false;
	}
	public int distX(Chr c){
		if(x < c.x){
			return (x+size) - c.getX();
		}else{
			return -(c.getX() + c.getSize() - x);
		}
	}
	public int distY(Chr c){
		if(y < c.y){
			return (y+size) - c.getY();
		}else{
			return -(c.getY() + c.getSize() - y);
		}
	}
	public void run(){
		
	}
	
}
