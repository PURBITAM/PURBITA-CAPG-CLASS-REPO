package javaioxamples;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

	public static void main(String[] args) {
		System.out.println("Starting the file read ... ");
		RandomAccessFile raFile;
		try {
			raFile = new RandomAccessFile("src/data.txt","rw");
			FileChannel fCh=raFile.getChannel();
			System.out.println("Created File Channel . . . ");
			//Creating ByteBuffer with capacity of 48 bytes
			ByteBuffer buffer=ByteBuffer.allocate(48);
			//reading data from the ByteBuffer
			int bytesRead=fCh.read(buffer);
			//iterating through the bytes
			while(bytesRead!=-1)
			{
				System.out.println("\nRead"+bytesRead);
				buffer.flip();
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
