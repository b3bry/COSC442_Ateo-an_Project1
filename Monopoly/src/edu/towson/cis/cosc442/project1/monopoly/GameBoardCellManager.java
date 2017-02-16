package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoardCellManager {
	private GameBoardCellManagerAssistant gameBoardCellManagerAssistant = new GameBoardCellManagerAssistant();
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();

	public ArrayList<Cell> getCells() {
		return gameBoardCellManagerAssistant.getCells();
	}

	public Cell getCell(int newIndex) {
		return gameBoardCellManagerAssistant.getCell(newIndex);
	}

	public int getCellNumber() {
		return gameBoardCellManagerAssistant.getCellNumber();
	}

	public Cell queryCell(String string) {
		return gameBoardCellManagerAssistant.queryCell(string);
	}

	public int queryCellIndex(String string) {
		return gameBoardCellManagerAssistant.queryCellIndex(string);
	}

	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer) colorGroups.get(name);
		if (number != null) {
			return number.intValue();
		}
		return 0;
	}

	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
		gameBoardCellManagerAssistant.getCells().add(cell);
	}

	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < gameBoardCellManagerAssistant.getCellNumber(); i++) {
			IOwnable c = gameBoardCellManagerAssistant.getCell(i);
			if (c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell) c;
				if (pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}
}