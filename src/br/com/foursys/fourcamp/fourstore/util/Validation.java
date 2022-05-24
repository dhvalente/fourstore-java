package br.com.foursys.fourcamp.fourstore.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public void regexValidation(String input, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
	}

	String regex = "([0-9])+([0-9]?)+.?([0-9])?";

}
