package com.FileHandling.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) {
		
		File file  = new File("src/test.txt");
		try {
			System.out.println("Is new file Created now "+file.createNewFile());
			FileWriter Writer=new FileWriter(file,true);
			Writer.write("ABC HELLO GUYS, SL");
				Writer.flush();
			FileInputStream reader=new FileInputStream(file);
			int num=0;
					while((num=reader.read())!=-1){
						System.out.println((char)num);
					}
					Files.deleteIfExists(Paths.get("src/test.text"));
					
				
						
						
					}catch (IOException e) {
						e.printStackTrace();
		}

	}

}
