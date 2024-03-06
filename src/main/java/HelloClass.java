package main.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloClass {

	static {
		System.setProperty("logback.configurationFile", "./src/main/java/logback.xml");
	}
	private static final Logger logger = LoggerFactory.getLogger(HelloClass.class);

	public static void main(String[] args) throws IOException {

		logger.info("Hello Info");
		logger.debug("Hello Debug");
		logger.error("Hello Error");

		File source = new File("D:/bg-imgame.zip");
		File dest = new File("D:/abc/bg-imgame.zip");

		Files.copy(source.toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
		
		File file = new File("D:/bg-imgame.zip");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}

//        Path copied = Paths.get("src/test/resources/copiedWithNio.txt");
//        Path originalPath = original.toPath();
//        Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);

	}
}
