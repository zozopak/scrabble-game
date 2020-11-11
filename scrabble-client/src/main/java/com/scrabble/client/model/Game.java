package com.scrabble.client.model;

import com.scrabble.client.view.Observer;

import java.util.List;

public  abstract class Game implements Observable {
   private Board board;
   List<Observer> observers;

   @Override
   public void addObserver(Observer observer) {
        observers.add((Observer<Game> )observer);
   }

   @Override
   public void updateObserver() {
    observers.forEach(z->z.update(this));
   }
}
