package com.tscode.lawyersreckoner.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LoggerCreation {

	static String path = System.getProperty("user.home") + "\\tscode\\LawyersReckoner\\log.txt";

	public static void log(String str) {

		try {

			Files.write(Paths.get(path), (str + "\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public static void init() {
		File file = new  File(path);
		if (!file.exists()) {
			file.mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
