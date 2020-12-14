package by.htp.homework.text;

import java.util.ArrayList;
import java.util.List;

public class TextAggregator {

	// collect word to sentence
	public void toSentence(List<Word> listWord, List<Sentence> sentenceList) {
		List<Word> newSentence = new ArrayList<Word>();
		for (Word word : listWord) {
			newSentence.add(word);
			// Sentence(List<Word>, boolean isEndOfParagraph)
			if (word.isEndOfParagraph) {
				sentenceList.add(new Sentence(newSentence, true));
				newSentence = new ArrayList<Word>();
			} else if (word.isEndOfSent) {
				sentenceList.add(new Sentence(newSentence, false));
				newSentence = new ArrayList<Word>();
			}
		}
	}

	void toParagraph(List<Sentence> sentenceList, List<Text> textList) {
		List<Sentence> newParagraph = new ArrayList<Sentence>();
		int count = 0;
		for (Sentence sentence : sentenceList) {
			newParagraph.add(sentence);
			// Sentence(List<Sentence>, boolean isTitle)
			if (sentence.isEndOfParagraph) {
				if (count == 0) {
					textList.add(new Text(newParagraph, true));
					newParagraph = new ArrayList<Sentence>();
					count++;
				} else {
					textList.add(new Text(newParagraph, false));
					newParagraph = new ArrayList<Sentence>();
					count++;
				}
			}
		}
	}

	String toText(List<Word> listWord) {
		String sentenceLine = "";
		String endOfWord = "";
		for (Word word : listWord) {
			if (word.getEndOf() == null) {
				endOfWord = "";
			} else {
				endOfWord = word.getEndOf();
			}
			sentenceLine += word.getContent() + endOfWord + " ";
			if (word.isEndOfParagraph) {
				sentenceLine += "\n";
			}
		}
		return sentenceLine;
	}
}
