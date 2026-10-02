package com.epam.prep.pattern.Function;

import java.util.function.Function;

public class Strategy {
    static Function<Transaction, TransactionDTO> mapper =
            transaction -> new TransactionDTO(
                    transaction.getId(),
                    transaction.getAmount()
            );

    public static void main(String[] args){
        Transaction txn = new Transaction("12", (double)10000, "UPI");
        TransactionDTO dto = mapper.apply(txn);
        System.out.println(dto);
    }

}
