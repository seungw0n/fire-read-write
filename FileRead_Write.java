/**********************************************************
  FileRead_Write.java         ver_1
  Created by 정승원 on 2018-06-13.
  Copyright © 2018 SEUNG WON JOENG. All rights reserved.
***********************************************************/


import java.io.*;

public class FileRead_Write {
  
  public static void main(String[] args) throws IOException {
    
    FileReader fr = new FileReader("test.csv");
    BufferedReader br = new BufferedReader(fr);
    
    String line = "";
    String[] arr = new String[2];
    String email = "", name = "";
    
    line = br.readLine(); //Skip the first line
    
    String loading = "";
    
    while((line = br.readLine()) != null) {
      arr = line.split(",", 2);
      
      for(int i = 0; i < arr[1].length(); i++) {
        if(arr[1].charAt(i) != '"') name += arr[1].charAt(i);
      }
      
      for(int i = 0; i < arr[0].length(); i++) {
        if(arr[0].charAt(i) != '"') email += arr[0].charAt(i);
      }
      
      if(email.charAt(0) == '/') email = "In my contact";
      
      loading += "EMAIL : " + email + "\n" + "NAME : " + name + "\n" 
        + "-------------------------------------------------------------------------------\n";
      
      email = "";
      name = "";
    }
    
    br.close();
    
    File file = new File("result.txt");
    
    //Creating result file in txt
    if(!file.exists()) file.createNewFile();
    
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("-------------------------------------------------------------------------------\n");
    bw.write(loading);
    
    bw.close();
  }
  
}
