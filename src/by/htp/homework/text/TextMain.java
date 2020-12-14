package by.htp.homework.text;

import java.util.ArrayList;
import java.util.List;

public class TextMain {
public static void main(String[] args) {
	TextAggregator textAggregator = new TextAggregator();
	TextView newPrint = new TextView();
	WordFiller wordListFiller = new WordFiller();
	
	List<Word> wordList = new ArrayList<Word>();
	List<Sentence> sentenceList = new ArrayList<Sentence>();
	List<Text> textList = new ArrayList<Text>();
		
	wordListFiller.splitBy(wordList);
	textAggregator.toSentence(wordList, sentenceList);
	textAggregator.toParagraph(sentenceList, textList);
	
	//newPrint.printWord(wordList);
	//newPrint.printSentence(sentenceList); 
	//newPrint.printText(textList);
	newPrint.printWordToText(wordList);
}
}
