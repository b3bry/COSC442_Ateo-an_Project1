/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelBuyHouse.
 */
public class PlayerPanelBuyHouse implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn buy house. */
	private JButton btnBuyHouse;

	/**
	 * Gets the btn buy house.
	 *
	 * @return the btn buy house
	 */
	public JButton getBtnBuyHouse() {
		return btnBuyHouse;
	}

	/**
	 * Sets the btn buy house.
	 *
	 * @param btnBuyHouse the new btn buy house
	 */
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