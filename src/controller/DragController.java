package controller;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import javax.swing.JLabel;

public class DragController extends MouseAdapter implements MouseMotionListener {

	List<Rectangle> valid;
	private JLabel pilhaDescarte1;
	private JLabel pilhaDescarte2;
	private JLabel pilhaDescarte3;
	private JLabel pilhaDescarte4;
	private JLabel base1;
	private JLabel base2;
	private JLabel base3;
	private JLabel base4;
	private JLabel pilhaReserva1Icon ;

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
		aoArrastarComponente(e);
	}

	public void aoArrastarComponente(MouseEvent e) {
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
		aoSelecionarComponente(e);
	}

	public void aoSelecionarComponente(MouseEvent e) {
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
		aposSoltarComponente(e);
	}

	public void aposSoltarComponente(MouseEvent e) {
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

	public JLabel getPilhaDescarte1() {
		return pilhaDescarte1;
	}

	public void setPilhaDescarte1(JLabel pilhaDescarte1) {
		this.pilhaDescarte1 = pilhaDescarte1;
	}

	public JLabel getPilhaDescarte2() {
		return pilhaDescarte2;
	}

	public void setPilhaDescarte2(JLabel pilhaDescarte2) {
		this.pilhaDescarte2 = pilhaDescarte2;
	}

	public JLabel getPilhaDescarte3() {
		return pilhaDescarte3;
	}

	public void setPilhaDescarte3(JLabel pilhaDescarte3) {
		this.pilhaDescarte3 = pilhaDescarte3;
	}

	public JLabel getPilhaDescarte4() {
		return pilhaDescarte4;
	}

	public void setPilhaDescarte4(JLabel pilhaDescarte4) {
		this.pilhaDescarte4 = pilhaDescarte4;
	}

	public JLabel getBase1() {
		return base1;
	}

	public void setBase1(JLabel base1) {
		this.base1 = base1;
	}

	public JLabel getBase2() {
		return base2;
	}

	public void setBase2(JLabel base2) {
		this.base2 = base2;
	}

	public JLabel getBase3() {
		return base3;
	}

	public void setBase3(JLabel base3) {
		this.base3 = base3;
	}

	public JLabel getBase4() {
		return base4;
	}

	public void setBase4(JLabel base4) {
		this.base4 = base4;
	}

	public JLabel getPilhaReserva1Icon() {
		return pilhaReserva1Icon;
	}

	public void setPilhaReserva1Icon(JLabel pilhaReserva1Icon) {
		this.pilhaReserva1Icon = pilhaReserva1Icon;
	}

}