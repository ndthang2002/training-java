package apppluralsight;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

public class writingFiles {

	public static void main(String[] args) throws IOException  {
		
		Path path = Path.of("E:\\thang.txt");
		 BufferedWriter writer = Files.newBufferedWriter(path);
		String text ="anh la thang ne";
		writer.write(text);
			writer.close();	
		System.out.println("Done!");
	    
	}
}
