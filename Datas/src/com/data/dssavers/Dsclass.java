package com.data.dssavers;

public class Dsclass {
    int regno;
    String name,dob,address;
    public String set(int regno, String dob, String name, String address){
        boolean rn=false,db=false,nam=false,addres=false;
        this.regno=regno;
        this.dob=dob;
        this.name=name;
        this.address=address;
        if(name.matches("[a-zA-z]+")){
            nam=true;
        }
        if(dob.matches("[0-9\\-]+")){
            db=true;
        }
        if(true){
            addres=true;
        }
        if(regno>0&&String.valueOf(regno).matches("[1-9]{5}")){
            rn=true;
        }
        if(rn&&addres&&db&&nam){
        String st=regno+"\t"+name+"\t"+dob+"\t"+address;
        return st;}else{
            return null;
        }
    }
}
