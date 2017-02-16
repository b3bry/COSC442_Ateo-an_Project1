package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelPurchaseProperties implements Serializable {
	private JButton btnPurchaseProperty;

	public JButton getBtnPurchaseProperty() {
		return btnPurchaseProperty;
	}

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