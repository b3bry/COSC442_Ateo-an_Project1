package edu.towson.cis.cosc442.project1.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

// TODO: Auto-generated Javadoc
/**
 * The Class GameBoard.
 */
public class GameBoard {

	/** The game board card. */
	private GameBoardCard gameBoardCard = new GameBoardCard();
	
	/** The game board cell manager. */
	private GameBoardCellManager gameBoardCellManager = new GameBoardCellManager();
	
	/** The community chest cards. */
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();
	
	/**
	 * Instantiates a new game board.
	 */
	public GameBoard() {
		Cell go = new GoCell();
		addCell(go);
	}

    /**
     * Adds the card.
     *
     * @param card the card
     */
    public void addCard(Card card) {
        gameBoardCard.addCard(card, this.communityChestCards);
    }
	
	/**
	 * Adds the cell.
	 *
	 * @param cell the cell
	 */
	public void addCell(Cell cell) {
		gameBoardCellManager.getCells().add(cell);
	}
	
	/**
	 * Adds the cell.
	 *
	 * @param cell the cell
	 */
	public void addCell(PropertyCell cell) {
		gameBoardCellManager.addCell(cell);
	}

    /**
     * Draw CC card.
     *
     * @return the card
     */
    public Card drawCCCard() {
        Card card = (Card)communityChestCards.get(0);
        communityChestCards.remove(0);
        gameBoardCard.addCard(card, this.communityChestCards);
        return card;
    }

    /**
     * Draw chance card.
     *
     * @return the card
     */
    public Card drawChanceCard() {
        return gameBoardCard.drawChanceCard(this.communityChestCards);
    }

	/**
	 * Gets the cell.
	 *
	 * @param newIndex the new index
	 * @return the cell
	 */
	public Cell getCell(int newIndex) {
		return gameBoardCellManager.getCell(newIndex);
	}
	
	/**
	 * Gets the cell number.
	 *
	 * @return the cell number
	 */
	public int getCellNumber() {
		return gameBoardCellManager.getCellNumber();
	}
	
	/**
	 * Gets the properties in monopoly.
	 *
	 * @param color the color
	 * @return the properties in monopoly
	 */
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		return gameBoardCellManager.getPropertiesInMonopoly(color);
	}
	
	/**
	 * Gets the property number for color.
	 *
	 * @param name the name
	 * @return the property number for color
	 */
	public int getPropertyNumberForColor(String name) {
		return gameBoardCellManager.getPropertyNumberForColor(name);
	}

	/**
	 * Query cell.
	 *
	 * @param string the string
	 * @return the cell
	 */
	public Cell queryCell(String string) {
		return gameBoardCellManager.queryCell(string);
	}
	
	/**
	 * Query cell index.
	 *
	 * @param string the string
	 * @return the int
	 */
	public int queryCellIndex(String string){
		return gameBoardCellManager.queryCellIndex(string);
	}

    /**
     * Removes the cards.
     */
    public void removeCards() {
        communityChestCards.clear();
    }
}
