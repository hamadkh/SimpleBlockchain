package com.company;
import java.util.Arrays;

public class Block {

    private int prevHash;
    private Transactions transactions;
    private int blockHash;

    public Block(int prevHash, Transactions transactions)
    {
        this.prevHash = prevHash;
        this.transactions = transactions;

        // calculate hash of transaction based on all transactions and previous hashes
        Object[] contents = {transactions.hashCode(), prevHash};
        this.blockHash = Arrays.hashCode(contents);

    }

    public int getPrevHash() {
        return prevHash;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
