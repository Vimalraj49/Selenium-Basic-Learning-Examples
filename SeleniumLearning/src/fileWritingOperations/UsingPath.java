package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.io.Files;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.file location //2.content

		String location = "UsingPathInterface.txt";
		String content = "Congrats successfully written using Path Interface!";
		
		Path path = Paths.get(location);
		Files.write(content.getBytes(), path.toFile());
	}

}
