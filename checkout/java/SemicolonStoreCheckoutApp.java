import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SemicolonStoreCheckoutApp{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);

        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("EE, dd-MMM-YY  HH:mm:ss a");
        LocalDateTime getDateTime = LocalDateTime.now();
        String todaysDateTime = getDateTime.format(formatDateTime);

        java.util.ArrayList<String> items = new java.util.ArrayList<>();

        double total = 0;
        double subTotal = 0;
        String customerName = customerName();
        String customerItems = whatUserBought();
        items.add(customerItems);
        int amountOfItems = howManyItems();
        int costOfItems = howMuch();

        total = amountOfItems * costOfItems;

        subTotal += total;

        String amountOfItemInString = convertItemToString(amountOfItems);
        items.add(amountOfItemInString);
        String costOfItemsInString =  convertItemToString(costOfItems);
        items.add(costOfItemsInString);
        String totalToString = convertItemToString((int)total);
        items.add(totalToString);

        String moreItemsToAdd = addMoreToCart();

        
        while(moreItemsToAdd.equalsIgnoreCase("yes")){
            customerItems = whatUserBought();
            items.add(customerItems);
            amountOfItems = howManyItems();
            costOfItems = howMuch();

            total = amountOfItems * costOfItems;
            subTotal += total;

            amountOfItemInString = convertItemToString(amountOfItems);
            items.add(amountOfItemInString);
            costOfItemsInString =  convertItemToString(costOfItems);
            items.add(costOfItemsInString);
            totalToString = convertItemToString((int)total);
            items.add(totalToString);

            moreItemsToAdd = addMoreToCart();
        }

        System.out.print("What is your name?.. ");
        String cashierName = input.nextLine();

        System.out.print("How much discount will be gotten?.. ");
        int discountAmount = input.nextInt();

    System.out.printf(""" 

  
--------------------------------------------------------------------
 SEMICOLOCN STORES                                                  
 MAIN BRACH                                                         
 LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.              
 TEL: 0329828343                                                    
 Date: %s                                                        
 Cashier: %s                                                        
 Customer Name: %s                                                  
                                                                   
=================================================================== 

              ITEM        QTY       PRICE              TOTAL(NGN)  
     
-------------------------------------------------------------------
                    """
                        ,todaysDateTime,cashierName,customerName);

        int indexOne  = 0;
        int indexTwo = 1;
        int indexThree = 2;
        int indexFour = 3;
        for(int count = 0; count < items.size();count+=4){

            System.out.printf("""

           %s          %s           %s                %s%n"""
                      ,items.get(indexOne), items.get(indexTwo),items.get(indexThree),items.get(indexFour)); 
            
        indexOne+=4;
        indexTwo+=4;
        indexThree+=4;
        indexFour+=4;
        }

        double discount = subTotal * ((double)discountAmount/100);
        double vat = subTotal * (17.50/100);
        double billTotal = (subTotal + vat) - discount;

            System.out.printf("""
-------------------------------------------------------------------

                                  Sub Total:     %.2f
                                   Discount:     %.2f
                                VAt @ 17.50:     %.2f
===================================================================
                                 Bill Total:     %.2f
===================================================================
    THIS IS NOT A RECEIPT KINDLY PAY  %.2f
===================================================================%n
            """        
,subTotal, discount, vat, billTotal, billTotal);
        

        double amountCollected = amountToPay();
        double balance = amountCollected - billTotal;

        if (balance >= 0){

//RECIPT OUT PUT TO GIVE THE USER...............

    System.out.printf("""   



--------------------------------------------------------------------
 SEMICOLOCN STORES                                                  
 MAIN BRACH                                                         
 LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.              
 TEL: 0329828348993                                                    
 Date: %s                                                        
 Cashier: %s                                                        
 Customer Name: %s                                                  
                                                                   
=================================================================== 

              ITEM        QTY       PRICE              TOTAL(NGN)  
     
-------------------------------------------------------------------

                    """
                        ,todaysDateTime,cashierName,customerName);

        int indexOneOutput  = 0;
        int indexTwoOutput = 1;
        int indexThreeOutput = 2;
        int indexFourOutput = 3;
        for(int countOutput = 0; countOutput < items.size();countOutput+=4){

            System.out.printf("""

             %s          %s           %s                %s%n"""
                      ,items.get(indexOneOutput), items.get(indexTwoOutput),items.get(indexThreeOutput),items.get(indexFourOutput)); 
            
        indexOneOutput+=4;
        indexTwoOutput+=4;
        indexThreeOutput+=4;
        indexFourOutput+=4;
        }

            System.out.printf("""
-------------------------------------------------------------------

                                  Sub Total:     %.2f
                                   Discount:     %.2f
                                VAt @ 17.50:     %.2f
===================================================================
                                 Bill Total:     %.2f
                                Amount Paid:     %.2f
                                    Balance:     %.2f
===================================================================
            THANK YOU FOR YOUR PATRONAGE
===================================================================%n
            """        
,subTotal, discount, vat, billTotal, amountCollected, balance);


        }
//        else{
//            while(balance < 0){
//
//                        
//    
//            }
   
    }
    
    public static String convertItemToString(int input){
        String converted = input + "";
        return converted;
    }

    public static String customerName(){
    java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print(" What is the customers name...  ");
        String name = input.nextLine();

        return name;
    } 


    public static String whatUserBought(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print(" What did the user buy?...  ");
        String items = input.nextLine();

        return items;
    }

    public static int howManyItems(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean catchingError = true;
        int countOfItems = 0;
        while(catchingError){
            try{
                System.out.print(" How many pieces?...  ");
                countOfItems = input.nextInt();
                catchingError = false;
            }
            catch(java.util.InputMismatchException error){
                input.next();
                System.out.println("Invalid pieces! Check that you entered the a digit\nTry again ");

            }
        }
        return countOfItems;
    }

    public static int howMuch(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean catchingError = true;
        int costOfItems = 0;
        while(catchingError){
            try{
                System.out.print(" How much per unit?...  ");
                costOfItems = input.nextInt();
                catchingError = false;
            }
            catch(java.util.InputMismatchException error){
                System.out.println("Invalid Amount! Check that you entered the a number\nTry again ");
                input.next();

            }    
        }

        return costOfItems;
    }

    public static String addMoreToCart(){    
        java.util.Scanner input = new java.util.Scanner(System.in);
        String moreItemsToAdd = "";
        boolean catchingError = true;
        while(catchingError){

            System.out.print(" Add more items[Yes/No]?...  ");
            moreItemsToAdd = input.nextLine().replace(" ","");
        
            if(moreItemsToAdd.equalsIgnoreCase("yes") || moreItemsToAdd.equalsIgnoreCase("no")){
                catchingError = false;
            }
            else{
                System.out.println("Invaild Input! Check that you entered either Yes or No\nTry again ");

            }
        }

        return moreItemsToAdd;
    }


    public static double amountToPay(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double whatToPay = 0;
        boolean catchingError = true;
        while(catchingError){
            try{
                System.out.print(" How much did the customer give to you..?   ");
                whatToPay = input.nextDouble();
                catchingError = false;
                
            }
            catch(java.util.InputMismatchException error){
                System.out.println("Invaild Input! Check that you entered a number only!\nTry again ");
                input.next();
            }
        }
        return whatToPay;
    }


}
