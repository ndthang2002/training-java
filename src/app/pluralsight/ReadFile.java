package app.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("E:\\haha.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		String line = reader.readLine();
		System.out.println(line);
		
	}
}
