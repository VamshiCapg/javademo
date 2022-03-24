package com.capg.iostreams;

//import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereader 
{
 public static void main(String[] args) throws Exception
 {
	 FileReader fr=new FileReader("abc.txt");
	 int x=fr.read();
	 while(x!=-1)
	 {
		 System.out.println((char)x);
		 x=fr.read();
	 }
 }
}
//Filereader is used to read the data character by character it may cause
//the traffic to avoid this use BufferedReader