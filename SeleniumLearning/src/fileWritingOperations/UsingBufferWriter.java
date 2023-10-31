package fileWritingOperations;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.file location //2.content

		String location = "UsingBufferWriter.txt";
		String content = "Congrats successfully written using Buffer writer!";
		
		FileWriter filewriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
