package com.scrabble.client.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellContantTest {

    @Test
    void toCharacter() {
       CellContant cellContant=CellContant.EMPTY;
       CellContant cellContant1=CellContant.A;
       Character character=cellContant.toCharacter();
       Character character1=cellContant1.toCharacter();
        Assertions.assertEquals(' ',character);
        Assertions.assertEquals('A',character1);
        System.out.println(cellContant.toCharacter());
        System.out.println(cellContant1.toCharacter());
    }
}