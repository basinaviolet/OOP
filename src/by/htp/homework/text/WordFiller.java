package by.htp.homework.text;

import java.util.List;

public class WordFiller {

	public String inputText = "Я помню чудное мгновенье!\n" + "Я помню чудное мгновенье: " + "передо мной явилась ты, "
			+ "как мимолетное виденье, " + "как гений чистой красоты.\n" + "В томленьях грусти безнадежной, "
			+ "в тревогах шумной суеты, " + "звучал мне долго голос нежный " + "и снились милые черты.\n"
			+ "Шли годы. Бурь порыв мятежный " + "рассеял прежние мечты, " + "и я забыл твой голос нежный, "
			+ "твои небесные черты. " + "В глуши, во мраке заточенья" + "тянулись тихо дни мои. "
			+ "Без божества, без вдохновенья, " + "без слез, без жизни, без любви.\n" + "Душе настало пробужденье: "
			+ "и вот опять явилась ты, " + "как мимолетное виденье, " + "как гений чистой красоты.\n"
			+ "И сердце бьется в упоенье, " + "и для него воскресли вновь " + "и божество, и вдохновенье, "
			+ "и жизнь, и слезы, и любовь. ";

	public void splitBy(List<Word> wordList) {
		String stringForSplit = inputText;
		stringForSplit = readyToRead(stringForSplit);
		String[] textArray;
		// split -> Paragraph
		textArray = stringForSplit.split(PunctuationMark.ParagraphMark.END.getMark());
		for (int i = 0; i < textArray.length; i++) {
			// split -> Word
			String[] wordArray = textArray[i].split(" ");
			for (int j = 0; j < wordArray.length; j++) {
				// toWord(String stringForInsert, List<Word> wordList)
				if (j == wordArray.length - 1) {
					toWord(wordArray[j] + "\n", wordList);
				} else {
					toWord(wordArray[j], wordList);
				}
			}

		}
	}

	// preparing text for insert
	public String readyToRead(String stringForSplit) {
		String newline;
		newline = stringForSplit.replaceAll("\n", "\n ");
		newline = stringForSplit.replaceAll("\n\n", "\n");
		return newline;
	}

	public void toWord(String stringForInsert, List<Word> wordList) {
		// Word(String content, String endOf, boolean isEndOfSent, boolean
		// isEndOfParagraph)
		String symbol = endOfWord(stringForInsert);
		wordList.add(
				new Word(stringToWord(stringForInsert), symbol, ifLastInSent(symbol), ifLastInPar(stringForInsert)));
	}

	// select word
	public String stringToWord(String line) {
		line = line.replaceAll("\n", "");
		for (PunctuationMark.WordMark enumItem : PunctuationMark.WordMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				line = line.substring(0, line.length() - 1);
			}
		}
		return line;
	}

	// the end of paragraph
	public boolean ifLastInPar(String line) {
		int check = 0;
		for (PunctuationMark.ParagraphMark enumItem : PunctuationMark.ParagraphMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				check = 1;
			}
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	// the end of sentence
	public boolean ifLastInSent(String symbol) {
		int check = 0;
		for (PunctuationMark.SentenceMark enumItem : PunctuationMark.SentenceMark.values()) {
			if (symbol != null) {
				if (symbol.charAt(0) == enumItem.getMark().charAt(0)) {
					check = 1;
				}
			}
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	// the end of word
	public String endOfWord(String line) {
		String symbol = null;
		line = line.replaceAll("\n", "");
		for (PunctuationMark.WordMark enumItem : PunctuationMark.WordMark.values()) {
			if (line.endsWith(enumItem.getMark())) {
				symbol = Character.toString(line.charAt(line.length() - 1));
			}
		}
		return symbol;
	}
}
