/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import javax.swing.JComboBox;
import edu.towson.cis.cosc442.project1.monopoly.Player;
import edu.towson.cis.cosc442.project1.monopoly.IOwnable;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class GUITradeDialogOkButton.
 */
public class GUITradeDialogOkButton implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The btn OK. */
	private JButton btnOK;
	
	/** The cbo properties. */
	private JComboBox<Object> cboProperties;

	/**
	 * Gets the btn OK.
	 *
	 * @return the btn OK
	 */
	public JButton getBtnOK() {
		return btnOK;
	}

	/**
	 * Sets the btn OK.
	 *
	 * @param btnOK the new btn OK
	 */
	public void setBtnOK(JButton btnOK) {
		this.btnOK = btnOK;
	}

	/**
	 * Gets the cbo properties.
	 *
	 * @return the cbo properties
	 */
	public JComboBox<Object> getCboProperties() {
		return cboProperties;
	}

	/**
	 * Sets the cbo properties.
	 *
	 * @param cboProperties the new cbo properties
	 */
	public void setCboProperties(JComboBox<Object> cboProperties) {
		this.cboProperties = cboProperties;
	}

	/**
	 * Update properties combo.
	 *
	 * @param player the player
	 */
	public void updatePropertiesCombo(Player player) {
		cboProperties.removeAllItems();
		IOwnable[] cells = player.getAllProperties();
		btnOK.setEnabled(cells.length > 0);
		for (int i = 0; i < cells.length; i++) {
			cboProperties.addItem(cells[i]);
		}
	}
}