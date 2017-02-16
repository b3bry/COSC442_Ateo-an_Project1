/*
 * 
 */
package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class GameBoardCardAssist.
 */
public class GameBoardCardAssist {
	
	/** The game board card. */
	private GameBoardCard gameBoardCard = new GameBoardCard();
	
	/** The community chest cards. */
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	/**
	 * Gets the game board card.
	 *
	 * @return the game board card
	 */
	public GameBoardCard getGameBoardCard() {
		return gameBoardCard;
	}

	/**
	 * Gets the community chest cards.
	 *
	 * @return the community chest cards
	 */
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