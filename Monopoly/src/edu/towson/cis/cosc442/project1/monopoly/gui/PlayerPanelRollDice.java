package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelRollDice implements Serializable {
	private JButton btnRollDice;

	public JButton getBtnRollDice() {
		return btnRollDice;
	}

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