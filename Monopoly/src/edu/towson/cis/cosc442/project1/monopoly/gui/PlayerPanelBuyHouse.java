package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelBuyHouse implements Serializable {
	private JButton btnBuyHouse;

	public JButton getBtnBuyHouse() {
		return btnBuyHouse;
	}

	public void setBtnBuyHouse(JButton btnBuyHouse) {
		this.btnBuyHouse = btnBuyHouse;
	}

	/**
	* Checks if is buy house button enabled.
	* @return  true, if is buy house button enabled
	*/
	public boolean isBuyHouseButtonEnabled() {
		return btnBuyHouse.isEnabled();
	}

	/**
	* Sets the buy house enabled.
	* @param b  the new buy house enabled
	*/
	public void setBuyHouseEnabled(boolean b) {
		btnBuyHouse.setEnabled(b);
	}
}