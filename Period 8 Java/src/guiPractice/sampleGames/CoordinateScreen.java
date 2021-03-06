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
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	private Graphic picture;
	private Button myButton;
	private TextLabel label;
	private TextArea paragraph;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40, 85, 760, 500, "This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge" + " of the page, a new line is created.");
		Graphic picture= new Graphic(50,50,2,"resources/sampleImages/hand-gestures-oh.jpg");



	myButton = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
		
		public void act(){
			MouseFollower.game.setScreen(MouseFollower.moveScreen);
		}
		
	});

	viewObjects.add(picture);
	viewObjects.add(label);
	viewObjects.add(paragraph);
	viewObjects.add(myButton);
	MovingComponent mc = new MovingComponent(30, 60,80, 80);
	mc.setVy(3);
	mc.play();
	viewObjects.add(mc);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent m) {
		if(m.getX()<200&m.getY()<300){
			label.setText("Send Nudes");
		}
		
		else label.setText("Mouse at " + m.getX() + ", " + m.getY());
	
	
	}

	public MouseMotionListener getMouseMotionListener() {
		return this;
	
}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	public void mouseClicked(MouseEvent m){
	if(myButton.isHovered(m.getX(),m.getY())){
		myButton.act();
	}
}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}