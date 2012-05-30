package com.wordmaster.po;

import java.util.List;

public class WordItem {

	private long id;
	private String word;
	private WordType type;
	private String englishTranslation;
	private String chineseTranslation;
	private String note;
	private List<String> examples;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public WordType getType() {
		return type;
	}

	public void setType(WordType type) {
		this.type = type;
	}

	public String getEnglishTranslation() {
		return englishTranslation;
	}

	public void setEnglishTranslation(String englishTranslation) {
		this.englishTranslation = englishTranslation;
	}

	public String getChineseTranslation() {
		return chineseTranslation;
	}

	public void setChineseTranslation(String chineseTranslation) {
		this.chineseTranslation = chineseTranslation;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<String> getExamples() {
		return examples;
	}

	public void setExamples(List<String> examples) {
		this.examples = examples;
	}

}
