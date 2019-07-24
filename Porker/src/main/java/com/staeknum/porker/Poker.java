package com.staeknum.porker;

/**
 *
 * @author STAEKNUM
 *
 *
 */
public class Poker {

	private char[] num = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K' };
	private char[] suit = { '❤', '♠', '♦', '♣' };

	public Poker(char[] num, char[] suit) {
		super();
		this.num = num;
		this.suit = suit;
	}

	public Poker() {

	}

	public char[] getNum() {
		return num;
	}

	public void setNum(char[] num) {
		this.num = num;
	}

	public char[] getSuit() {
		return suit;
	}

	public void setSuit(char[] suit) {
		this.suit = suit;
	}
}
