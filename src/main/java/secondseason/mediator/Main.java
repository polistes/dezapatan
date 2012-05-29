package secondseason.mediator;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements Runnable{
	private GameMaster gm;
	public MyPanel(){
		gm = new GameMaster();
		this.setFocusable(true);
		this.addKeyListener(gm);
	}
	public void paintComponent(Graphics g){
		g.clearRect(0, 0, 500, 500);
		gm.draw(g);
	}
	@Override
	public void run() {
		while(true){
			gm.run();
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyPanel panel = new MyPanel();
		JFrame win = new JFrame();
		win.add(panel);
		win.setSize(500,500);
		win.setVisible(true);
		
		// ×ボタンでCLOSE
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread th = new Thread(panel);
		th.start();
	}

}
