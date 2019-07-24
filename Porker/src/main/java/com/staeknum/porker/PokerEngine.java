package com.staeknum.porker;

public class PokerEngine {
	Poker p = new Poker();

	public StringBuilder fivePokerEngine(int methodNum) {
		assert methodNum == 5 : texasPoker();
		//引数が5以外ならテキサスホールデムモードへ

		int suitRes, numRes;
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 5; j++) {
			suitRes = ((int) (Math.random() * p.getSuit().length));
			numRes = ((int) (Math.random() * p.getNum().length));
			sb.append(p.getSuit()[suitRes]);
			sb.append(p.getNum()[numRes]);
			sb.append(":");
			sb.append("\n");
		}
		return sb;
	}

	public StringBuilder texasPoker() {
		StringBuilder texasRes = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			int suit, num;
			suit = (int) (Math.random() * p.getSuit().length);
			num = (int) (Math.random() * p.getNum().length);
			texasRes.append(p.getSuit()[suit]);
			texasRes.append(p.getNum()[num]);
			texasRes.append("\n");
		}
		return texasRes;

	}

	public StringBuilder userHand(String str) {
		StringBuilder userHand = new StringBuilder();
		while (str.equals("Change")/*プレイヤーの手札が5以下の時の処理を追加*/) {
			for (int i = 0; i < 1; i++) {
				int suit, num;
				suit = (int) (Math.random() * p.getSuit().length);
				num = (int) (Math.random() * p.getNum().length);
				userHand.append(p.getSuit()[suit]);
				userHand.append(p.getNum()[num]);
				userHand.append("\n");
			}
		}
		return userHand;
	}

}
