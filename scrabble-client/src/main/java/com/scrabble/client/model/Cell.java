package com.scrabble.client.model;

public class Cell {
    private CellContant contant;


    public Cell(CellContant contant){
        this.contant=contant;
    }
    public Cell(){
        this.contant=CellContant.EMPTY;


    }

    public CellContant getContant() {
        return contant;
    }

    public void setContant(CellContant contant) {
        this.contant = contant;
    }
}
