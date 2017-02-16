/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JPanel;
import edu.towson.cis.cosc442.project1.monopoly.GameBoard;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class MainWindowPanelManager.
 */
public class MainWindowPanelManager implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The east panel. */
	private JPanel eastPanel = new JPanel();
	
	/** The north panel. */
	private JPanel northPanel = new JPanel();
	
	/** The south panel. */
	private JPanel southPanel = new JPanel();
	
	/** The west panel. */
	private JPanel westPanel = new JPanel();

	/**
	 * Gets the east panel.
	 *
	 * @return the east panel
	 */
	public JPanel getEastPanel() {
		return eastPanel;
	}

	/**
	 * Gets the north panel.
	 *
	 * @return the north panel
	 */
	public JPanel getNorthPanel() {
		return northPanel;
	}

	/**
	 * Gets the south panel.
	 *
	 * @return the south panel
	 */
	public JPanel getSouthPanel() {
		return southPanel;
	}

	/**
	 * Gets the west panel.
	 *
	 * @return the west panel
	 */
	public JPanel getWestPanel() {
		return westPanel;
	}

	/**
	 * Sets the up game board.
	 *
	 * @param board  the new up game board
	 * @param mainWindow the main window
	 */
	public void setupGameBoard(GameBoard board, MainWindow mainWindow) {
		Dimension dimension = GameBoardUtil.calculateDimension(board.getCellNumber());
		northPanel.setLayout(new GridLayout(1, dimension.width + 2));
		southPanel.setLayout(new GridLayout(1, dimension.width + 2));
		westPanel.setLayout(new GridLayout(dimension.height, 1));
		eastPanel.setLayout(new GridLayout(dimension.height, 1));
		mainWindow.addCells(northPanel, GameBoardUtil.getNorthCells(board));
		mainWindow.addCells(southPanel, GameBoardUtil.getSouthCells(board));
		mainWindow.addCells(eastPanel, GameBoardUtil.getEastCells(board));
		mainWindow.addCells(westPanel, GameBoardUtil.getWestCells(board));
		mainWindow.buildPlayerPanels();
	}
}