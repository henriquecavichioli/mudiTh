package br.com.alura.mvc.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Util {

	public static LocalDate parseDate(String strDate) {
		try {
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate ld = LocalDate.parse(strDate, formatter);
			System.out.println(ld.getClass());
			return ld;
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return null;

	}

}
