package edu.citytech.cst.finance.test.other;

import edu.citytech.cst.finance.model.Payment;
import edu.citytech.cst.finance.service.MortgageService;
import static edu.citytech.cst.finance.service.MortgageService.*;

import java.util.Date;

public class T3_Main {

    public static void main(String[] args) {

        double extraPayment=200;
       Payment[] payments= getAllMonthlyPayments( 300_000,30,0.06,extraPayment );

        for (Payment cp:payments) {

            System.out.println(cp);

        }
    }
}
