package com.scrabble.client.model;

public class Board {
    Cell[][] cells=new Cell[14][14];
    public Board(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j]=new Cell();
            }

        }
    }
    public boolean insertCell(int x,int y,CellContant cellContant){
       if(cells[x][y].getContant()==CellContant.EMPTY){
           cells[x][y].setContant(cellContant);
          return true;
       }
           return false;
    }
    public CellContant getCellContant(int x, int y){
      return   cells[x][y].getContant();
    }
}