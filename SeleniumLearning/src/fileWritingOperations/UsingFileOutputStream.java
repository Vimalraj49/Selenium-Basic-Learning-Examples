package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.file location //2.content

		String location = "UsingFileOutputStream.txt";
		String content = "Congrats successfully written using FOS!";
		
		FileOutputStream outputStream = new FileOutputStream(location);// "FileOutputStream" writed contents in raw bytes(i.e images)
		
		byte[] writeThis = content.getBytes();//converting content into bytes and store in byte array
		outputStream.write(writeThis);//after that writing those byte contents
		outputStream.close();

	}

}
