package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MovementScreen extends Screen implements MouseMotionListener, MouseListener{

	private Graphic mario;
	private Button back;
	
	public MovementScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		mario = new Graphic(200,200,.25,"resources/sampleImages/hand-gestures-oh.jpg");
		back = new Button(50,50,100,60,"Back", 
				Color.GRAY, new Action() {
			
			public void act() {
				MouseFollower.game.
				setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(mario);
		viewObjects.add(back);
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}

	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
}