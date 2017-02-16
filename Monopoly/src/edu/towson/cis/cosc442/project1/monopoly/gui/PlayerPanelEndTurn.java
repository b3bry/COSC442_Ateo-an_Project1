package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelEndTurn implements Serializable {
	private JButton btnEndTurn;

	public JButton getBtnEndTurn() {
		return btnEndTurn;
	}

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