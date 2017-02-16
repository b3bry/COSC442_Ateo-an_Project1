/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelTrading.
 */
public class PlayerPanelTrading implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn trade. */
	private JButton btnTrade;

	/**
	 * Gets the btn trade.
	 *
	 * @return the btn trade
	 */
	public JButton getBtnTrade() {
		return btnTrade;
	}

	/**
	 * Sets the btn trade.
	 *
	 * @param btnTrade the new btn trade
	 */
	public void setBtnTrade(JButton btnTrade) {
		this.btnTrade = btnTrade;
	}

	/**
	 * Checks if is trade button enabled.
	 *
	 * @return true, if is trade button enabled
	 */
	public boolean isTradeButtonEnabled() {
		return btnTrade.isEnabled();
	}

	/**
	 * Sets the trade enabled.
	 *
	 * @param b the new trade enabled
	 */
	public void setTradeEnabled(boolean b) {
		btnTrade.setEnabled(b);
	}
}