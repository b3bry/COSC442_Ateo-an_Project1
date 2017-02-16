/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanelPurchaseProperties.
 */
public class PlayerPanelPurchaseProperties implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The btn purchase property. */
	private JButton btnPurchaseProperty;

	/**
	 * Gets the btn purchase property.
	 *
	 * @return the btn purchase property
	 */
	public JButton getBtnPurchaseProperty() {
		return btnPurchaseProperty;
	}

	/**
	 * Sets the btn purchase property.
	 *
	 * @param btnPurchaseProperty the new btn purchase property
	 */
	public void setBtnPurchaseProperty(JButton btnPurchaseProperty) {
		this.btnPurchaseProperty = btnPurchaseProperty;
	}

	/**
	* Checks if is purchase property button enabled.
	* @return  true, if is purchase property button enabled
	*/
	public boolean isPurchasePropertyButtonEnabled() {
		return btnPurchaseProperty.isEnabled();
	}

	/**
	* Sets the purchase property enabled.
	* @param enabled  the new purchase property enabled
	*/
	public void setPurchasePropertyEnabled(boolean enabled) {
		btnPurchaseProperty.setEnabled(enabled);
	}
}