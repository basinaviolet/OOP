package by.htp.homework.text;

public class Word implements TextStructure {

	String content;
	String endOf;
	boolean isEndOfSent;
	boolean isEndOfParagraph;

	public Word(String content, String endOf, boolean isEndOfSent, boolean isEndOfParagraph) {
		super();
		this.content = content;
		this.endOf = endOf;
		this.isEndOfSent = isEndOfSent;
		this.isEndOfParagraph = isEndOfParagraph;
	}
	
	@Override
	public int endOfText(String endOf) {
		int check = 0;
		for (PunctuationMark.WordMark item : PunctuationMark.WordMark.values()) {
			if (item.getMark() == endOf) {
				check = 1;
			}
		}
		return check;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEndOf() {
		return endOf;
	}

	public void setEndOf(String endOf) {
		this.endOf = endOf;
	}

	public boolean isEndOfSent() {
		return isEndOfSent;
	}

	public void setEndOfSent(boolean isEndOfSent) {
		this.isEndOfSent = isEndOfSent;
	}

	public boolean isEndOfParagraph() {
		return isEndOfParagraph;
	}

	public void setEndOfParagraph(boolean isEndOfParagraph) {
		this.isEndOfParagraph = isEndOfParagraph;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((endOf == null) ? 0 : endOf.hashCode());
		result = prime * result + (isEndOfParagraph ? 1231 : 1237);
		result = prime * result + (isEndOfSent ? 1231 : 1237);
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
		Word other = (Word) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (endOf == null) {
			if (other.endOf != null)
				return false;
		} else if (!endOf.equals(other.endOf))
			return false;
		if (isEndOfParagraph != other.isEndOfParagraph)
			return false;
		if (isEndOfSent != other.isEndOfSent)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String endOfSent = "";
		String endOfPar = "";
		if (isEndOfSent) {
			endOfSent = "is the end of sentence";
		}
		if (isEndOfParagraph) {
			endOfPar = ", is the end of paragraf";
		}
		if (endOf == null) {
			endOf = "";
		}
		return "Word " + " [" + content + endOf + "] " + endOfSent + endOfPar;
	};
}
