package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.file location 

		String location = "UsingBufferWriter.txt";
		
		FileReader fileReader = new FileReader(location);
		
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String currentline ;
		
		while((currentline = bufferedReader.readLine()) != null)
		{
		System.out.println(currentline);//if not looped then will output only the first/single line
		}
		
		bufferedReader.close();
		

		//NOTE: "BufferedReader" method used over fetching plain text files alone.
	}

}
