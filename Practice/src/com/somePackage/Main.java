package com.somePackage;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner p = new Scanner(System.in);
    System.out.print("Principal: ");
    int principal = p.nextInt();

    Scanner r = new Scanner(System.in);
    System.out.print("Annual Interest Rate: ");
    float rate = r.nextFloat();
    float monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;

    Scanner n = new Scanner(System.in);
    System.out.print("Period (Years): ");
    byte years = n.nextByte();
    int numberOfPayments = years * MONTHS_IN_YEAR;

    double monthlyPayments = principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            /(Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayments);
    System.out.println("Your monthly payments will be: " + mortgageFormatted);

    String role = "admin";

    switch (role) {
      case "admin":
        System.out.println("You're an admin!");
        break;

      case "moderator":
        System.out.println("You're a moderator!");
        break;

      default:
        System.out.println("You're a guest!");
    }

    if (role == "admin")
      System.out.println("You're an admin!");
    else if (role == "moderator")
      System.out.println("You're a moderator!");
    else
      System.out.println("You're a guest!");
  }
}