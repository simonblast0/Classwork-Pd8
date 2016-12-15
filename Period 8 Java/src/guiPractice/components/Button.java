package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
		
		
	}

	

	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
		update();
	}



	public Action getAction() {
		return action;
	}



	public void setAction(Action action) {
		this.action = action;
	}



	public void update(Graphics2D g) {
		g = clear();// clears image and gets new graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		int arcWidth = 30;
		int arcHeight = 30;
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
		if (getText() != null) {
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.setColor(Color.black);
			g.drawString(getText(), 4, getHeight() - 5);
		}

		// TODO Auto-generated constructor stub
	}

}
