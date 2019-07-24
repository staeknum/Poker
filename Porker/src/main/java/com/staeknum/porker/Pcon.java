package com.staeknum.porker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playPoker")
public class Pcon {

	@RequestMapping("fivePoker")
	public PokerEngine pokerMachine(int get) {
		PokerEngine p = new PokerEngine();
		p.fivePokerEngine();

		return p;

	}

}
