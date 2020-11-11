package com.scrabble.client.model;

public enum CellContant {
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,EMPTY;


    public String toString(){
        if(this!=CellContant.EMPTY){
            return super.toString();
        }
        return " ";
    }
    public  Character toCharacter(){
        return toString().toCharArray()[0];
    }
}
