package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;

public class GameBoardCardAssist {
	private GameBoardCard gameBoardCard = new GameBoardCard();
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	public GameBoardCard getGameBoardCard() {
		return gameBoardCard;
	}

	public ArrayList<Card> getCommunityChestCards() {
		return communityChestCards;
	}

	/**
	* Draw CC card.
	* @return  the card
	*/
	public Card drawCCCard() {
		Card card = (Card) communityChestCards.get(0);
		communityChestCards.remove(0);
		gameBoardCard.addCard(card, this.communityChestCards);
		return card;
	}

	/**
	* Removes the cards.
	*/
	public void removeCards() {
		communityChestCards.clear();
	}
}