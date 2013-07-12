package controller;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

public class DragController extends MouseAdapter implements MouseMotionListener {

	List<Rectangle> valid;

	int baseX = -1;
	int baseY = -1;

	int lastValidX = -1;
	int lastValidY = -1;

	public DragController(List<Rectangle> valid) {
		this.valid = valid;
	}

	/**
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	public void mouseDragged(MouseEvent e) {
		Component c = e.getComponent();
		int x = c.getX() + e.getX() - this.baseX;
		int y = c.getY() + e.getY() - this.baseY;
		Container parent = c.getParent();
		Dimension pSize = parent.getSize();
		Rectangle cSize = c.getBounds();

		x = Math.max(x, 0);
		x = Math.min(x, pSize.width - cSize.width);
		y = Math.max(y, 0);
		y = Math.min(y, pSize.height - cSize.height);

		c.setLocation(x, y);
		c.getParent().repaint();
	}

	/**
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved(MouseEvent e) {
		//
	}

	/**
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e) {
		Component c = e.getComponent();
		Container parent = c.getParent();
		Component[] all = parent.getComponents();
		for (int i = 0; i < all.length; i++) {
			parent.remove(all[i]);
		}
		parent.add(c);
		for (int i = 0; i < all.length; i++) {
			if (all[i] != c) {
				parent.add(all[i]);
			}
		}
		this.baseX = e.getX();
		this.baseY = e.getY();
		this.lastValidX = c.getX();
		this.lastValidY = c.getY();
	}

	/**
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent e) {
		boolean ok = false;
		int x = e.getComponent().getX();
		int y = e.getComponent().getY();
		int width = e.getComponent().getWidth();
		int height = e.getComponent().getHeight();
		for (Rectangle rect : valid) {
			if (x > rect.x && x + width < rect.x + rect.width && y > rect.y
					&& y + height < rect.y + rect.height) {
				ok = true;
			}
		}

		if (!ok) {
			Component c = e.getComponent();
			c.setLocation(lastValidX, lastValidY);
			c.getParent().repaint();
		} else {
			lastValidX = -1;
			lastValidY = -1;
		}

		this.baseX = -1;
		this.baseY = -1;
	}

}