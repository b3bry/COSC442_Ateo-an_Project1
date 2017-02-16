/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelRollDice.
 */
public class PlayerPanelRollDice implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn roll dice. */
	private JButton btnRollDice;

	/**
	 * Gets the btn roll dice.
	 *
	 * @return the btn roll dice
	 */
	public JButton getBtnRollDice() {
		return btnRollDice;
	}

	/**
	 * Sets the btn roll dice.
	 *
	 * @param btnRollDice the new btn roll dice
	 */
	public void setBtnRollDice(JButton btnRollDice) {
		this.btnRollDice = btnRollDice;
	}

	/**
	* Checks if is roll dice button enabled.
	* @return  true, if is roll dice button enabled
	*/
	public boolean isRollDiceButtonEnabled() {
		return btnRollDice.isEnabled();
	}

	/**
	* Sets the roll dice enabled.
	* @param enabled  the new roll dice enabled
	*/
	public void setRollDiceEnabled(boolean enabled) {
		btnRollDice.setEnabled(enabled);
	}
}