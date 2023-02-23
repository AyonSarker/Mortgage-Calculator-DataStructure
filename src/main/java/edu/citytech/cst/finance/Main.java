package edu.citytech.cst.finance;


import edu.citytech.cst.finance.service.MortgageService;

import static edu.citytech.cst.finance.model.MortgageOptions.*;

public class Main {
    public static void main(String[] args) {

        double interestRate = 0.06;
        int years = 30;
        double loanAmount = 300_000d;
        double scheduledPayments = 0;
        double totalInterest = 0;

        String message = "loan amount is %s, annual " +
                "interest rate %s, loan period is %s, scheduled payments is %s " +
                "total interest paid is  ";

        for (int i = 0; i < args.length; i++) {

            if(! isValidOption(args[i])){
                System.out.println("Invalid option entered");
            }

            var mode = args[i];
            var value = "";

            if(mode.equals(I.text) ||mode.equals (INTEREST.text)){
                value  =args[++i];
                interestRate = Double.valueOf(value);
                //System.out.println("Interest was Detected!! value:" + value);

            }

            if(mode.equals(Y.text) ||mode.equals (YEARS.text)){
                value  =args[++i];
                years = Integer.valueOf(value);
               // System.out.println("Years was Detected!! value:" + value);

            }
            if(mode.equals(L.text) ||mode.equals (LOAN_AMOUNT.text)){
                value  =args[++i];

                loanAmount = Double.valueOf(value);
                //System.out.println("Loan_Amount was Detected!! value:" + value);

            }
            if(mode.equals(D.text) ||mode.equals (DETAIL.text)){
                //System.out.println("Detail was Detected!! value:");

            }


        }
        scheduledPayments = MortgageService.getSchedulePayments(loanAmount,years,interestRate);
        System.out.format(message,loanAmount,interestRate,years,scheduledPayments);
    }
}
