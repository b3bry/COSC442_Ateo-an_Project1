/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelJail.
 */
public class PlayerPanelJail implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn get out of jail. */
	private JButton btnGetOutOfJail;

	/**
	 * Gets the btn get out of jail.
	 *
	 * @return the btn get out of jail
	 */
	public JButton getBtnGetOutOfJail() {
		return btnGetOutOfJail;
	}

	/**
	 * Sets the btn get out of jail.
	 *
	 * @param btnGetOutOfJail the new btn get out of jail
	 */
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