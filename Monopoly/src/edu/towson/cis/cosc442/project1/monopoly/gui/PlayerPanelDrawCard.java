/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelDrawCard.
 */
public class PlayerPanelDrawCard implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn draw card. */
	private JButton btnDrawCard;

	/**
	 * Gets the btn draw card.
	 *
	 * @return the btn draw card
	 */
	public JButton getBtnDrawCard() {
		return btnDrawCard;
	}

	/**
	 * Sets the btn draw card.
	 *
	 * @param btnDrawCard the new btn draw card
	 */
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