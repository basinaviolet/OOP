package by.htp.homework.text;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextStructure {

	List<Sentence> contentList = new ArrayList<Sentence>();
	boolean isTitle;

	public Text(List<Sentence> contentList, boolean isTitle) {
		super();
		this.contentList = contentList;
		this.isTitle = isTitle;
	}

	public int endOfText(String endOf) {
		int check = 0;
		for (PunctuationMark.ParagraphMark item : PunctuationMark.ParagraphMark.values()) {
			if (item.getMark() == endOf) {
				check = 1;
			}
		}
		return check;
	}

	public String getContent() {
		String content = "";
		for (Sentence item : contentList) {
			content += item.getContent();
		}
		return content;
	}

	public boolean isTitle() {
		return isTitle;
	}

	public void setTitle(boolean isTitle) {
		this.isTitle = isTitle;
	}

	public List<Sentence> getContentList() {
		return contentList;
	}

	public void setContentList(List<Sentence> contentList) {
		this.contentList = contentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentList == null) ? 0 : contentList.hashCode());
		result = prime * result + (isTitle ? 1231 : 1237);
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
		Text other = (Text) obj;
		if (contentList == null) {
			if (other.contentList != null)
				return false;
		} else if (!contentList.equals(other.contentList))
			return false;
		if (isTitle != other.isTitle)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String content = "";
		String title = "";
		if (isTitle) {
			title = " is a title";
		}
		content = getContent();
		return "Text " + " [" + content + "]" + title;
	}
}