package com.amazing.software.Model;

import java.util.Stack;

public class Korrigan extends Race {


    public Korrigan() {
        this.name = "Korrigan";
        this.power = "Draw 2 random cards within your opponent hand";
    }
    @Override
    public void Power(Player p1,Player p2,Stack<Card> Deck,Card card){
        if(p2.getHand().size()==0){

        }else if(p2.getHand().size()==1){
            p1.getHand().add(p2.getHand().remove(0));
        }
        else {
            for(int i=0;i<2;i++){
                int randomNum = (int)(Math.random() * p2.getHand().size());
                p1.getHand().add(p2.getHand().remove(randomNum));
            }
        }
    }


}
