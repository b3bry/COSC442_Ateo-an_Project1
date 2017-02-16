package edu.towson.cis.cosc442.project1.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoard {

	private GameBoardCard gameBoardCard = new GameBoardCard();
	private GameBoardCellManager gameBoardCellManager = new GameBoardCellManager();
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();
	public GameBoard() {
		Cell go = new GoCell();
		addCell(go);
	}

    public void addCard(Card card) {
        gameBoardCard.addCard(card, this.communityChestCards);
    }
	
	public void addCell(Cell cell) {
		gameBoardCellManager.getCells().add(cell);
	}
	
	public void addCell(PropertyCell cell) {
		gameBoardCellManager.addCell(cell);
	}

    public Card drawCCCard() {
        Card card = (Card)communityChestCards.get(0);
        communityChestCards.remove(0);
        gameBoardCard.addCard(card, this.communityChestCards);
        return card;
    }

    public Card drawChanceCard() {
        return gameBoardCard.drawChanceCard(this.communityChestCards);
    }

	public Cell getCell(int newIndex) {
		return gameBoardCellManager.getCell(newIndex);
	}
	
	public int getCellNumber() {
		return gameBoardCellManager.getCellNumber();
	}
	
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		return gameBoardCellManager.getPropertiesInMonopoly(color);
	}
	
	public int getPropertyNumberForColor(String name) {
		return gameBoardCellManager.getPropertyNumberForColor(name);
	}

	public Cell queryCell(String string) {
		return gameBoardCellManager.queryCell(string);
	}
	
	public int queryCellIndex(String string){
		return gameBoardCellManager.queryCellIndex(string);
	}

    public void removeCards() {
        communityChestCards.clear();
    }
}
