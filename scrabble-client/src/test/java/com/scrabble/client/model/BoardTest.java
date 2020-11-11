package com.scrabble.client.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void insertCell() {
       Board board=new Board();
        board.insertCell(2,2,CellContant.A);
       CellContant cellContant= board.getCellContant(2,2);
        Assertions.assertEquals(cellContant,CellContant.A);
        board.insertCell(2,2,CellContant.E);
        Assertions.assertEquals(cellContant,CellContant.A);

    }
}