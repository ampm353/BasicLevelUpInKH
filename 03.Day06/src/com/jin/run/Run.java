package com.jin.run;

import com.jin.game.BaskinRobbins;
import com.jin.game.CoinGame;
import com.jin.game.Dice;
import com.jin.game.RSP;
import com.jin.game.UpAndDown;
import com.jin.random.RandomTest;
import com.jin.star.JustStar;

public class Run {

	public static void main(String[] args) {

		JustStar star = new JustStar();
//		star.star1();
//		star.number1();
//		star.number2();
//		star.number3();
//		star.number4();
		
//		star.whileTest();
//		star.whileExam1();
//		star.whileExam2();
//		star.whileExam3();
//		star.whileExam4();
		
		RandomTest random = new RandomTest();
		
		random.lotto();
//		random.randomTest1();
		
		CoinGame cg = new CoinGame();
		
//		cg.coinGame();
		
		RSP rsp = new RSP();
//		rsp.rsp();
		
		UpAndDown uad = new UpAndDown();
//		uad.upAndDown();
		
		BaskinRobbins br = new BaskinRobbins();
//		br.baskinRobbins();
		
		Dice d = new Dice();
//		d.dice();
		
	}

}
