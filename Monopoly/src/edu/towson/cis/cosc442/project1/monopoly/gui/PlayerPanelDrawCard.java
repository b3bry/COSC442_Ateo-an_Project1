package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelDrawCard implements Serializable {
	private JButton btnDrawCard;

	public JButton getBtnDrawCard() {
		return btnDrawCard;
	}

	public void setBtnDrawCard(JButton btnDrawCard) {
		this.btnDrawCard = btnDrawCard;
	}

	/**
	* Checks if is draw card button enabled.
	* @return  true, if is draw card button enabled
	*/
	public boolean isDrawCardButtonEnabled() {
		return btnDrawCard.isEnabled();
	}

	/**
	* Sets the draw card enabled.
	* @param b  the new draw card enabled
	*/
	public void setDrawCardEnabled(boolean b) {
		btnDrawCard.setEnabled(b);
	}
}