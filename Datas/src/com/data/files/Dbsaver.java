package com.data.files;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Dbsaver {
public void save(String str,String fname){
    String s="G:\\local drive\\java practice\\Datas\\Files\\datas";
    File f=new File(s);{

        if(f.mkdirs()){
            System.out.println("new directory created");
        }
        Scanner sc=new Scanner(System.in);
        File f1= new File(s+"\\"+fname+".txt");
        try {
            if(f1.exists()){
                FileWriter fw=new FileWriter(f1,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(str);
                bw.newLine();
                bw.flush();
                bw.close();
            }
            else if (f1.createNewFile()) {
                System.out.println("new file is created");
                FileWriter fw=new FileWriter(f1,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(str);
                bw.newLine();
                bw.flush();
                bw.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
}
