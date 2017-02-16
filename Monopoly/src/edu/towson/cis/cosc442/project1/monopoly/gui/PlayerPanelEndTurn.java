/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelEndTurn.
 */
public class PlayerPanelEndTurn implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn end turn. */
	private JButton btnEndTurn;

	/**
	 * Gets the btn end turn.
	 *
	 * @return the btn end turn
	 */
	public JButton getBtnEndTurn() {
		return btnEndTurn;
	}

	/**
	 * Sets the btn end turn.
	 *
	 * @param btnEndTurn the new btn end turn
	 */
	public void setBtnEndTurn(JButton btnEndTurn) {
		this.btnEndTurn = btnEndTurn;
	}

	/**
	* Checks if is end turn button enabled.
	* @return  true, if is end turn button enabled
	*/
	public boolean isEndTurnButtonEnabled() {
		return btnEndTurn.isEnabled();
	}

	/**
	* Sets the end turn enabled.
	* @param enabled  the new end turn enabled
	*/
	public void setEndTurnEnabled(boolean enabled) {
		btnEndTurn.setEnabled(enabled);
	}
}