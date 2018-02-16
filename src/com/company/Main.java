package com.company;

import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        Transactions genesisTransactions = new Transactions(100, "Rick sent morty 1000 Bitcoin");

        Block genesisBlock = new Block(0, genesisTransactions);

        Transactions blockTwoTransactions = new Transactions(1000, "Rick sent Summer 200  Bitcoin");
        Block blockTwo = new Block(genesisBlock.getBlockHash(), blockTwoTransactions);

        System.out.println("Hash of genesis Block : "+genesisBlock.getBlockHash());
        System.out.println("Hash of Block Two : "+ blockTwo.getBlockHash());

    }
}
