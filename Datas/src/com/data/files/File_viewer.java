package com.data.files;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class File_viewer {
    public void display(String str){
        Scanner sc=new Scanner(System.in);
        String s="G:\\local drive\\java practice\\Datas\\Files\\datas\\"+str+".txt";
        File f=new File(s);
        if(f.exists()){
            try{
                FileReader fr=new FileReader(f);
                int i=fr.read();
                while (i!=-1){
                    System.out.print((char) i);
                    i= fr.read();
                }
                fr.close();
            }catch (Exception e){
                System.err.println(e);
            }
        }
        else{
            System.err.println("file not exist");
        }
    }
}
