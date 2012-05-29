package secondseason.mediator;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;


public class GameMaster extends ChrMediator implements KeyListener{
	final int EMAX  = 50;
	protected int swidth = 200;
	protected int sheight = 200;
	protected MyChr my;
	
	public GameMaster(){
		list = new ArrayList<Chr>();
		init();
	}
	private void init(){
		my = new MyChr(swidth/2, sheight/2);
		list.add(my);
		my.setWeight(5);
		my.setChrMediator(this);

		Chr c;
		for(int i = 0; i < EMAX; i++){
			c = new Chr((int)(Math.random() * swidth), (int)(Math.random()* sheight));
			while(isHit(c)){c = new Chr((int)(Math.random() * swidth), (int)(Math.random()* sheight));};
			c.setChrMediator(this);
			list.add(c);
			c.setWeight((Math.random()>0.3)?5:10);
		}
	}
	public boolean isHit(Chr target){
		Iterator<Chr> it = list.iterator();
		Chr c;
		while(it.hasNext()){
			c = it.next();
			if(c.isHit(target))return true;
		}
		return false;
	}
	public void run(){
		// random walk
		Iterator<Chr> it = list.iterator();
		Chr c;
		while(it.hasNext()){
			c = it.next();
			c.run();
		}
	}
	public void draw(Graphics g){
		Iterator<Chr> it = list.iterator();
		Chr c;
		while(it.hasNext()){
			c = it.next();
			c.draw(g);
		}
	}
	@Override
	public void changed(Chr c) {
		//hit check
		Iterator<Chr> it;
		Chr target;
		boolean flag = true;
		while(flag){
			flag = false;
			it = list.iterator();
			while(it.hasNext()){
				target = it.next();
				if(target != c){
					
					// c is stronger
					if(c.getWeight() >= target.getWeight()){
						if(c.isHit(target)){
							if(c.getDx() != 0){
								target.setDx(c.distX(target));
								target.setDy(0);
								target.moveX();
								target.setDx(0);
							}else if(c.getDy() != 0){
								target.setDx(0);
								target.setDy(c.distY(target));
								target.moveY();
								target.setDy(0);
							}else{
								// error
								System.out.println("error");
							}
							flag = true;
							break;
						}
					}else{
						// target is stronger
						if(c.isHit(target)){
							if(c.getDx() != 0){
								c.setDx(target.distX(c));
								c.setDy(0);
								c.moveX();
								c.setDx(0);
							}else if(c.getDy() != 0){
								c.setDx(0);
								c.setDy(target.distY(c));
								c.moveY();
								c.setDy(0);
							}else{
								// error
								System.out.println("error");
							}
							flag = true;
							break;
						}
					}
				}
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyChar()){
		case 'l':
			my.setDx(1);
			my.setDy(0);
			break;
		case 'h':
			my.setDx(-1);
			my.setDy(0);
			break;
		case 'k':
			my.setDx(0);
			my.setDy(-1);
			break;
		case 'j':
			my.setDx(0);
			my.setDy(1);
			break;
			
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
