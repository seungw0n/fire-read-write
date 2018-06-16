package Arrange;

/*
 * FileIO.java		ver_2
 * Created by SEUNG WON JOENG 2018-06-13
 * Copyright © 2018 SEUNG WON JOENG. All rights reserved.
 * 
 */

import java.io.*;
import java.util.ArrayList;

public class FileIO {
	
	public static ArrayList<Data> input(String fileName) throws IOException {
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		/*Skip the first line
		 *First line should not be null*/
		String line = "";
		line = br.readLine();
		
		String[] arr = new String[2];
		String email = "", name = "";
		
		while((line=br.readLine()) != null) {
	
			arr = line.split(",",2);
			email = arr[0];
			name = arr[1];
			
			Data information = new Data(email, name);
			list.add(information);
		}
		br.close();
		return list;
	}
	
	
	public static void output(ArrayList<Data> datas, File file) throws IOException {
		
		String loaded_DATA = "";
		for(int i = 0; i < datas.size(); i++) {
			loaded_DATA += "EMAIL : " + datas.get(i).getEmail() +"\nNAME : " +datas.get(i).getName() + "\n"
					+ "-------------------------------------------------------------------------------\n";
		}
		
		if(!file.exists()) file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("-------------------------------------------------------------------------------\n");
		bw.write(loaded_DATA);
		
		bw.close();
	}
}
