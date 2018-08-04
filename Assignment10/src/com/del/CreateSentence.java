package com.del;

import java.util.Random;

public class CreateSentence {

	public static void main(String[] args) {
		String[] article = { "the", "a", "one", "some" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };

		Random ran = new Random();

		for (int i = 0; i < 20; i++) {
			String sentence = article[ran.nextInt(article.length)] + " " + noun[ran.nextInt(noun.length)] + " "
					+ verb[ran.nextInt(verb.length)] + " " + preposition[ran.nextInt(preposition.length)] + " "
					+ article[ran.nextInt(article.length)] + " " + noun[ran.nextInt(noun.length)];
			sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1, sentence.length()) + ".";
			System.out.println(sentence);
		}

	}

}
