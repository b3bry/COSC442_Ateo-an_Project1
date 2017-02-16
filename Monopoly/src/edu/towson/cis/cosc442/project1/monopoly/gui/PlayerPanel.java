package edu.towson.cis.cosc442.project1.monopoly.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;
import javax.swing.border.BevelBorder;

import edu.towson.cis.cosc442.project1.monopoly.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerPanel.
 */
public class PlayerPanel extends JPanel {

    private PlayerPanelDrawCard playerPanelDrawCard = new PlayerPanelDrawCard();

	private PlayerPanelRollDice playerPanelRollDice = new PlayerPanelRollDice();

	private PlayerPanelPurchaseProperties playerPanelPurchaseProperties = new PlayerPanelPurchaseProperties();

	private PlayerPanelJail playerPanelJail = new PlayerPanelJail();

	private PlayerPanelBuyHouse playerPanelBuyHouse = new PlayerPanelBuyHouse();

	private PlayerPanelEndTurn playerPanelEndTurn = new PlayerPanelEndTurn();

	/** The player panel trading. */
    private PlayerPanelTrading playerPanelTrading = new PlayerPanelTrading();
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The lbl money. */
    private JLabel lblMoney;
    
    /** The lbl name. */
    private JLabel lblName;
    
    /** The player. */
    private Player player;
    
    /** The txt property. */
    private JTextArea txtProperty;

    /**
     * Instantiates a new player panel.
     *
     * @param player the player
     */
    public PlayerPanel(Player player) {
        JPanel pnlAction = new JPanel();
        JPanel pnlInfo = new JPanel();
        playerPanelRollDice.setBtnRollDice(new JButton("Roll Dice"));
        playerPanelPurchaseProperties.setBtnPurchaseProperty(new JButton("Purchase Property"));
        playerPanelEndTurn.setBtnEndTurn(new JButton("End Turn"));
        playerPanelBuyHouse.setBtnBuyHouse(new JButton("Buy House"));
        playerPanelJail.setBtnGetOutOfJail(new JButton("Get Out of Jail"));
        playerPanelDrawCard.setBtnDrawCard(new JButton("Draw Card"));
        playerPanelTrading.setBtnTrade(new JButton("Trade"));
        this.player = player;
        lblName = new JLabel();
        lblMoney = new JLabel();
        txtProperty = new JTextArea(30, 70);

        txtProperty.setEnabled(false);

        JPanel pnlName = new JPanel();
        JPanel pnlProperties = new JPanel();

        pnlInfo.setLayout(new BorderLayout());
        pnlInfo.add(pnlName, BorderLayout.NORTH);
        pnlInfo.add(pnlProperties, BorderLayout.CENTER);

        pnlProperties.setLayout(new OverlayLayout(pnlProperties));

        pnlName.add(lblName);
        pnlName.add(lblMoney);
        pnlProperties.add(txtProperty);

        pnlAction.setLayout(new GridLayout(3, 3));
        pnlAction.add(playerPanelBuyHouse.getBtnBuyHouse());
        pnlAction.add(playerPanelRollDice.getBtnRollDice());
        pnlAction.add(playerPanelPurchaseProperties.getBtnPurchaseProperty());
        pnlAction.add(playerPanelJail.getBtnGetOutOfJail());
        pnlAction.add(playerPanelEndTurn.getBtnEndTurn());
        pnlAction.add(playerPanelDrawCard.getBtnDrawCard());
        pnlAction.add(playerPanelTrading.getBtnTrade());

        pnlAction.doLayout();
        pnlInfo.doLayout();
        pnlName.doLayout();
        pnlProperties.doLayout();
        this.doLayout();

        setLayout(new BorderLayout());
        add(pnlInfo, BorderLayout.CENTER);
        add(pnlAction, BorderLayout.SOUTH);

        playerPanelRollDice.getBtnRollDice().setEnabled(false);
        playerPanelPurchaseProperties.getBtnPurchaseProperty().setEnabled(false);
        playerPanelEndTurn.getBtnEndTurn().setEnabled(false);
        playerPanelBuyHouse.getBtnBuyHouse().setEnabled(false);
        playerPanelJail.getBtnGetOutOfJail().setEnabled(false);
        playerPanelDrawCard.getBtnDrawCard().setEnabled(false);
        playerPanelTrading.getBtnTrade().setEnabled(false);

        setBorder(new BevelBorder(BevelBorder.RAISED));

        playerPanelRollDice.getBtnRollDice().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnRollDiceClicked();
            }
        });

        playerPanelEndTurn.getBtnEndTurn().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnEndTurnClicked();
            }
        });

        playerPanelPurchaseProperties.getBtnPurchaseProperty().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnPurchasePropertyClicked();
            }
        });

        playerPanelBuyHouse.getBtnBuyHouse().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnBuyHouseClicked();
            }
        });

        playerPanelJail.getBtnGetOutOfJail().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnGetOutOfJailClicked();
            }
        });

        playerPanelDrawCard.getBtnDrawCard().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Card card = GameMaster.instance().btnDrawCardClicked();
                JOptionPane
                        .showMessageDialog(PlayerPanel.this, card.getLabel());
                displayInfo();
            }
        });

        playerPanelTrading.getBtnTrade().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMaster.instance().btnTradeClicked();
            }
        });
    }

    /**
     * Display info.
     */
    public void displayInfo() {
        lblName.setText(player.getName());
        lblMoney.setText("$ " + player.getMoney());
        StringBuffer buf = new StringBuffer();
        IOwnable[] cells = player.getAllProperties();
        for (int i = 0; i < cells.length; i++) {
            buf.append(cells[i] + "\n");
        }
        txtProperty.setText(buf.toString());
    }
    
    /**
     * Checks if is buy house button enabled.
     *
     * @return true, if is buy house button enabled
     */
    public boolean isBuyHouseButtonEnabled() {
        return playerPanelBuyHouse.isBuyHouseButtonEnabled();
    }

    /**
     * Checks if is draw card button enabled.
     *
     * @return true, if is draw card button enabled
     */
    public boolean isDrawCardButtonEnabled() {
        return playerPanelDrawCard.isDrawCardButtonEnabled();
    }

    /**
     * Checks if is end turn button enabled.
     *
     * @return true, if is end turn button enabled
     */
    public boolean isEndTurnButtonEnabled() {
        return playerPanelEndTurn.isEndTurnButtonEnabled();
    }
    
    /**
     * Checks if is gets the out of jail button enabled.
     *
     * @return true, if is gets the out of jail button enabled
     */
    public boolean isGetOutOfJailButtonEnabled() {
        return playerPanelJail.isGetOutOfJailButtonEnabled();
    }
    
    /**
     * Checks if is purchase property button enabled.
     *
     * @return true, if is purchase property button enabled
     */
    public boolean isPurchasePropertyButtonEnabled() {
        return playerPanelPurchaseProperties.isPurchasePropertyButtonEnabled();
    }
    
    /**
     * Checks if is roll dice button enabled.
     *
     * @return true, if is roll dice button enabled
     */
    public boolean isRollDiceButtonEnabled() {
        return playerPanelRollDice.isRollDiceButtonEnabled();
    }

    /**
     * Checks if is trade button enabled.
     *
     * @return true, if is trade button enabled
     */
    public boolean isTradeButtonEnabled() {
        return playerPanelTrading.isTradeButtonEnabled();
    }

    /**
     * Sets the buy house enabled.
     *
     * @param b the new buy house enabled
     */
    public void setBuyHouseEnabled(boolean b) {
        playerPanelBuyHouse.setBuyHouseEnabled(b);
    }

    /**
     * Sets the draw card enabled.
     *
     * @param b the new draw card enabled
     */
    public void setDrawCardEnabled(boolean b) {
        playerPanelDrawCard.setDrawCardEnabled(b);
    }

    /**
     * Sets the end turn enabled.
     *
     * @param enabled the new end turn enabled
     */
    public void setEndTurnEnabled(boolean enabled) {
        playerPanelEndTurn.setEndTurnEnabled(enabled);
    }

    /**
     * Sets the gets the out of jail enabled.
     *
     * @param b the new gets the out of jail enabled
     */
    public void setGetOutOfJailEnabled(boolean b) {
        playerPanelJail.setGetOutOfJailEnabled(b);
    }

    /**
     * Sets the purchase property enabled.
     *
     * @param enabled the new purchase property enabled
     */
    public void setPurchasePropertyEnabled(boolean enabled) {
        playerPanelPurchaseProperties.setPurchasePropertyEnabled(enabled);
    }

    /**
     * Sets the roll dice enabled.
     *
     * @param enabled the new roll dice enabled
     */
    public void setRollDiceEnabled(boolean enabled) {
        playerPanelRollDice.setRollDiceEnabled(enabled);
    }

    /**
     * Sets the trade enabled.
     *
     * @param b the new trade enabled
     */
    public void setTradeEnabled(boolean b) {
        playerPanelTrading.setTradeEnabled(b);
    }
}