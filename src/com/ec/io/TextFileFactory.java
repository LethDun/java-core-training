package com.ec.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextFileFactory {

  public static boolean saveFile(ArrayList<String> dsData, String path) {
    try {
      FileOutputStream fos = new FileOutputStream(path);
      OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
      BufferedWriter bw = new BufferedWriter(osw);
      for (String data : dsData) {
        bw.write(data);
        bw.newLine();
      }
      bw.close();
      osw.close();
      fos.close();
      return true;
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return false;
  }

  public static ArrayList<String> loadFile(String path){
    ArrayList<String> dsData = new ArrayList<>();

    try {
      FileInputStream fis = new FileInputStream(path);
      InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
      BufferedReader br = new BufferedReader(isr);
      String line = br.readLine();
      while (line != null){
        if (line.length()>0){
          dsData.add(line);
        }
        line = br.readLine();
      }
      br.close();
      isr.close();
      fis.close();
    }
    catch (Exception exception) {
      exception.printStackTrace();
    }
    return dsData;
  }
}
