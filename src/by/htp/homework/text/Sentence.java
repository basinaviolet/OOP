package by.htp.homework.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements TextStructure {

	List<Word> contentList = new ArrayList<Word>();
	boolean isEndOfParagraph;

	public Sentence(List<Word> contentList, boolean isEndOfParagraph) {
		super();
		this.contentList = contentList;
		this.isEndOfParagraph = isEndOfParagraph;
	}

	public String getContent() {
		String content = "";
		for (Word item : contentList) {
			if (item.getEndOf() == null) {
				content += item.content + " ";
			} else {
				content += item.content + item.getEndOf() + " ";
			}
		}
		return content;
	}

	@Override
	public int endOfText(String endOf) {
		int check = 0;
		for (PunctuationMark.SentenceMark item : PunctuationMark.SentenceMark.values()) {
			if (item.getMark() == endOf) {
				check = 1;
			}
		}
		return check;
	}

	public boolean isEndOfParagraph() {
		return isEndOfParagraph;
	}

	public void setEndOfParagraph(boolean isEndOfParagraph) {
		this.isEndOfParagraph = isEndOfParagraph;
	}

	public List<Word> getContentList() {
		return contentList;
	}

	public void setContentList(List<Word> contentList) {
		this.contentList = contentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentList == null) ? 0 : contentList.hashCode());
		result = prime * result + (isEndOfParagraph ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (contentList == null) {
			if (other.contentList != null)
				return false;
		} else if (!contentList.equals(other.contentList))
			return false;
		if (isEndOfParagraph != other.isEndOfParagraph)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String content = "";
		String informString = "";
		if (isEndOfParagraph) {
			informString = " is the end of the paragraph.";
		}
		content = getContent();
		return "Sentence " + " [" + content + "]" + informString;
	}
}
