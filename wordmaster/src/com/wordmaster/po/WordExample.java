package com.wordmaster.po;

public class WordExample {

	private long id;
	private String example;
	private WordItem wordItem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public WordItem getWordItem() {
		return wordItem;
	}

	public void setWordItem(WordItem wordItem) {
		this.wordItem = wordItem;
	}

}
