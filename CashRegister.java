package com.netcracker.homeworks.project3;

public class CashRegister {
   private double purchase;
   private double payment;
   private int itemCounter;
   private double taxRate;
   private double totalTax = 0;
   private double totalSales;
   private double purchasesWithoutTax;
   private double purchasesWithTax;


   public CashRegister(double taxRate){
      purchase = 0;
      payment = 0;
      itemCounter = 0;
      totalSales = 0;
      purchasesWithoutTax = 0;
      purchasesWithTax = 0;
      this.taxRate = taxRate / 100;
   }

   public void recordPurchase(double amount){
      purchase = purchase + amount;
      itemCounter = ++itemCounter;
      totalSales = purchase;
      purchasesWithoutTax = purchasesWithoutTax + purchase;
   }

   public void receivePayment(double amount){
      payment = payment + amount;
   }


   /* -------P3.1 Enhance the CashRegister class so that it counts the purchased items. Provide a get-
   ItemCount method that returns the count.--------*/
   public int getItemCounter(){
      return itemCounter;
   }

   /*-------P3.2 Support computing sales tax in the CashRegister class. The tax rate should be supplied
   when constructing a CashRegister object. Add recordTaxablePurchase and getTotal-
   Tax methods. (Amounts added with recordPurchase are not taxable.) The giveChange
   method should correctly reflect the sales tax that is charged on taxable items.-----------*/
   public double recordTaxablePurchase(double amount){
      purchase = purchase + (amount + (amount * taxRate));
      itemCounter = ++itemCounter;
      totalTax = totalTax + (amount * taxRate);
      totalSales = purchase;
      purchasesWithTax = purchasesWithTax + amount + (amount * taxRate);
      return purchase;
   }

   public double getTotalTax(){
      return totalTax;
   }


   public double giveChange(){
      System.out.println("Your sales tax: " + totalTax);
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      totalTax = 0;
      return change;
   }

   public double getTotalSales(){
      return totalSales;
   }

   @Override
   public String toString() {
      return " --------------------------------" +
              "\n An item quantity: " + itemCounter +
              "\n PurchasesWithoutTax = " + purchasesWithoutTax +
              "\n PurchasesWithTax = " + purchasesWithTax +
              "\n /TaxRate = " + taxRate * 100 + "%/" +
              "\n --------------------------------" +
              "\n Total sales: " + totalSales +
              "\n ================================" +
              "\n Received: " + payment +
              "\n An expected change: " + (payment - purchase);
   }
}
