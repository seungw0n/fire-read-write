package Arrange;

/*
 * Run.java		ver_2
 * Created by SEUNG WON JOENG 2018-06-13
 * Copyright © 2018 SEUNG WON JOENG. All rights reserved.
 * 
 */

import java.util.*;
import java.io.*;

public class Run {
	
	public static void main(String[] args) throws IOException {
		
		
		
		ArrayList<Data> data = FileIO.input("test.csv");
		
		/*SYSOUT*/
		File file = new File("sol.txt");
		
		FileIO.output(data, file);
		
		
	}
	
}
