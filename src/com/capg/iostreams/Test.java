package com.capg.iostreams;

import java.io.File;
import java.io.IOException;

public class Test
{
	public static void main(String[] args)
	{
		File f=new File("xyz.txt");
		try {
			f.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		System.out.println(f.exists());
	}

}
