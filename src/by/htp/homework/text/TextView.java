package by.htp.homework.text;

import java.util.List;


public class TextView {
	
	public void printWord(List<Word> listToPrint) {
		System.out.println("Word:");
		for (Word object : listToPrint) {
			System.out.println(object.toString());
		}
	}
	
	public void printSentence(List<Sentence> listToPrint) {
		System.out.println("Sentence:");
		for (Sentence object : listToPrint) {
			System.out.println(object.toString());
		}
	}
	
	public void printText(List<Text> listToPrint) {
		System.out.println("Text:");
		for (Text object : listToPrint) {
			System.out.println(object.toString());
		}
	}
	
	public void printWordToText(List<Word> listToPrint) {
		System.out.println("word -> text: ");
		TextAggregator workWithText = new TextAggregator();
	 String text = workWithText.toText(listToPrint);
			System.out.println(text);
	}
}
