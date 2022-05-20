package com.data.main;
import java.util.*;

import com.data.dssavers.Dsclass;
import com.data.files.Dbsaver;
import com.data.files.File_viewer;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter file name to process");

        String str=sc.nextLine();
        while (true){
            System.out.println("enter the operation to perform");
            System.out.println("1 for view file content");
            System.out.println("2 for enter data to file");
            System.out.println("end to exit");

            String s=sc.nextLine();
            if(s.equals("end")||s.equals("END")){
                break;
            }
            switch (s){
                case "1":
                {
                    File_viewer f=new File_viewer();
                    f.display(str);
                }
                break;
                case "2":
                {
                    Dbsaver ds=new Dbsaver();
                    Dsclass dc=new Dsclass();
                    ArrayList<String> arr=new ArrayList<>();
                    int i=1;
                    while(true){
                        try {
                            System.out.println("do you want to add another press yes");
                            String t=sc.next();
                            if(t.equals("yes")||t.equals("YES")) {
                                System.out.println("enter reg no for " + i + "th student");
                                int regno = sc.nextInt();
                                sc.nextLine();
                                System.out.println("enter dob");
                                String name = sc.nextLine();
                                System.out.println("enter name");
                                String dob = sc.nextLine();
                                System.out.println("enter address");
                                String addresss = sc.nextLine();
                                String temp = dc.set(regno, name, dob, addresss);
                                if (temp == null) {
                                    System.err.println("enter valid data");
                                } else if (temp != null) {
                                    arr.add(temp);
                                    ds.save(String.valueOf(arr.get(i - 1)), str);
                                    i++;
                                }
                            }else if(t.equals("no")||t.equals("NO")){
                                break;
                            }
                        }catch (Exception e){
                            System.err.println("enter valid input");
                        }
                    }
                    sc.nextLine();
                }
                break;
                default:
                    System.err.println("Invalid operation");
            }
    }}
}
