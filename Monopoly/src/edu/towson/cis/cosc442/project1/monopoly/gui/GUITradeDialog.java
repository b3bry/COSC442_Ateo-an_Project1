/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import edu.towson.cis.cosc442.project1.monopoly.*;

// TODO: Auto-generated Javadoc
/**
 * The Class GUITradeDialog.
 */
public class GUITradeDialog extends JDialog implements TradeDialog {
    
    /** The g UI trade dialog ok button. */
    private GUITradeDialogOkButton gUITradeDialogOkButton = new GUITradeDialogOkButton();
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The btn cancel. */
	private JButton btnCancel;
    
    /** The cbo sellers. */
    private JComboBox<Object> cboSellers;

    /** The deal. */
    private TradeDeal deal;
    
    /** The txt amount. */
    private JTextField txtAmount;
    
    /**
     * Instantiates a new GUI trade dialog.
     *
     * @param parent the parent
     */
    public GUITradeDialog(Frame parent) {
        super(parent);
        
        setTitle("Trade Property");
        cboSellers = new JComboBox<Object>();
        gUITradeDialogOkButton.setCboProperties(new JComboBox<Object>());
        txtAmount = new JTextField();
        gUITradeDialogOkButton.setBtnOK(new JButton("OK"));
        btnCancel = new JButton("Cancel");
        
        gUITradeDialogOkButton.getBtnOK().setEnabled(false);
        
        buildSellersCombo();
        setModal(true);
             
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4, 2));
        contentPane.add(new JLabel("Sellers"));
        contentPane.add(cboSellers);
        contentPane.add(new JLabel("Properties"));
        contentPane.add(gUITradeDialogOkButton.getCboProperties());
        contentPane.add(new JLabel("Amount"));
        contentPane.add(txtAmount);
        contentPane.add(gUITradeDialogOkButton.getBtnOK());
        contentPane.add(btnCancel);
        
        btnCancel.addActionListener(new ActionListener(){
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                GUITradeDialog.this.hide();
            }
        });
        
        cboSellers.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                Player player = (Player)e.getItem();
                gUITradeDialogOkButton.updatePropertiesCombo(player);
            }
        });
        
        gUITradeDialogOkButton.getBtnOK().addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                int amount = 0;
                try{
                    amount = Integer.parseInt(txtAmount.getText());
                } catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(GUITradeDialog.this,
                            "Amount should be an integer", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                IOwnable cell = (IOwnable)gUITradeDialogOkButton.getCboProperties().getSelectedItem();
                if(cell == null) return;
                Player player = (Player)cboSellers.getSelectedItem();
                Player currentPlayer = GameMaster.instance().getCurrentPlayer();
                if(currentPlayer.getMoney() > amount) { 
	                deal = new TradeDeal();
	                deal.setAmount(amount);
	                deal.setPropertyName(cell.getName());
	                deal.setSellerIndex(GameMaster.instance().getPlayerIndex(player));
                }
                hide();
            }
        });
        
        this.pack();
    }

    /**
     * Builds the sellers combo.
     */
    private void buildSellersCombo() {
        List<?> sellers = GameMaster.instance().getSellerList();
        for (Iterator<?> iter = sellers.iterator(); iter.hasNext();) {
            Player player = (Player) iter.next();
            cboSellers.addItem(player);
        }
        if(sellers.size() > 0) {
            gUITradeDialogOkButton.updatePropertiesCombo((Player)sellers.get(0));
        }
    }

    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.TradeDialog#getTradeDeal()
     */
    public TradeDeal getTradeDeal() {
        return deal;
    }

}
