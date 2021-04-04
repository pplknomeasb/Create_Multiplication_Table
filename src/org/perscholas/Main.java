package org.perscholas;

public class Main {

public static void main(String[] args) {

    double primeNumber;
    //double onlyTwenty=1;


    //System.out.println(Math.sqrt(primeNumber)*Math.sqrt(primeNumber)/primeNumber);

    for(primeNumber=1, primeNumber<=20, primeNumber++)
    {
        if (Math.sqrt(primeNumber)*Math.sqrt(primeNumber)/primeNumber>=1)
        {
            System.out.println(primeNumber);
        }
    }
    /*
    do{


        if(Math.sqrt(primeNumber)*Math.sqrt(primeNumber)/primeNumber>1){

            System.out.println(primeNumber);
            onlyTwenty=onlyTwenty+1;
            primeNumber=primeNumber+1;

        }
        else if((Math.sqrt(primeNumber))/primeNumber>=1){

            primeNumber=primeNumber+1;



        }
    }
    while(onlyTwenty!=21);

     */


    }
}

