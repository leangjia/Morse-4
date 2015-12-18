package com.stuehmer.justin.morse.models;

public class Message {

	private String text;

	public Message(String text) {
		setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text.length() > 40) {
			throw new MessageTooLongException();
		}
		else {
			this.text = text;
		}
	}
}
