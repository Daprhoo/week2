package com.cembora.listeviewexample;

public class Animal {
    private String type;
    private int picId;

    public Animal(String type, int picId){
        this.picId= picId;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }

    public void setPicId(int picId){
        this.picId= picId;
    }
    public int getPicId(){
        return picId;
    }

}
