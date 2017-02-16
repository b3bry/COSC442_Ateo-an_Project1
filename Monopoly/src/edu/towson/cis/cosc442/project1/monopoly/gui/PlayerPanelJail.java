package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelJail implements Serializable {
	private JButton btnGetOutOfJail;

	public JButton getBtnGetOutOfJail() {
		return btnGetOutOfJail;
	}

	public void setBtnGetOutOfJail(JButton btnGetOutOfJail) {
		this.btnGetOutOfJail = btnGetOutOfJail;
	}

	/**
	* Checks if is gets the out of jail button enabled.
	* @return  true, if is gets the out of jail button enabled
	*/
	public boolean isGetOutOfJailButtonEnabled() {
		return btnGetOutOfJail.isEnabled();
	}

	/**
	* Sets the gets the out of jail enabled.
	* @param b  the new gets the out of jail enabled
	*/
	public void setGetOutOfJailEnabled(boolean b) {
		btnGetOutOfJail.setEnabled(b);
	}
}