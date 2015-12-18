package com.stuehmer.justin.morse.models;

import java.util.HashMap;
import java.util.Map;

public class Encoder {

	private Map<Character, String> codes = new HashMap<>();
	private String code;

	public Encoder() {
		codes.put('A', "101110");
		codes.put('B', "1110101010");
		codes.put('C', "111010111010");
		codes.put('D', "11101010");
		codes.put('E', "10");
		codes.put('F', "1010111010");
		codes.put('G', "1110111010");
		codes.put('H', "10101010");
		codes.put('I', "1010");
		codes.put('J', "10111011101110");
		codes.put('K', "1110101110");
		codes.put('L', "1011101010");
		codes.put('M', "11101110");
		codes.put('N', "111010");
		codes.put('O', "111011101110");
		codes.put('P', "101110111010");
		codes.put('Q', "11101110101110");
		codes.put('R', "10111010");
		codes.put('S', "101010");
		codes.put('T', "1110");
		codes.put('U', "10101110");
		codes.put('V', "1010101110");
		codes.put('W', "1011101110");
		codes.put('X', "111010101110");
		codes.put('Y', "11101011101110");
		codes.put('Z', "111011101010");
		codes.put('0', "101110111011101110");
		codes.put('1', "1010111011101110");
		codes.put('2', "10101011101110");
		codes.put('3', "101010101110");
		codes.put('4', "1010101010");
		codes.put('5', "111010101010");
		codes.put('6', "11101110101010");
		codes.put('7', "1110111011101010");
		codes.put('8', "111011101110111010");
		codes.put('9', "11101110111011101110");
		codes.put(' ', "00");
	}

	public void encode(Message message) {
		code = "";
		for (int i = 0; i < message.getText().length(); i++){
			Character c = message.getText().charAt(i);
			code += codes.get(Character.toUpperCase(c)) + "00";
		}
	}

	public String getCode() {
		return code;
	}

}