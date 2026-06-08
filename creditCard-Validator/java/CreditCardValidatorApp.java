public class CreditCardValidatorApp{

    public static void main(String... nnamdi){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.println("------------------------------------------------------Welcome to the CREDIT CARD VALIDATOR------------------------------------------------------");

        long userNumber = 0;
        int lengthOfDigits = 0;
        String cardType = null;
        String cardValidity = null;
        String checkingNumberValidity = "Start";
        boolean checking = checkingNumberValidity.equals("Start");
        while(checking){
//            int lengthOfDigits;
//            String cardType;
            boolean doubtingNumber = true;
            while(doubtingNumber){
                try{
                    System.out.print("Hello, Kindly Enter Card details to verify: ");
                    userNumber = inputCollector.nextLong();
//                    String convertToString = userNumber + "";
//                    if (convertToString.isEmpty()){
//                        throw new IllegalArgumentException("Enter a number!\n");
//                    }      
//
                }
                catch(java.util.InputMismatchException error){
                    System.out.print("Invalid Input! Check that your inputs are all numbers\nTry Again!\n");
                    inputCollector.next();
                }
                
                lengthOfDigits = CreditCardValidator.checkNumberLength(userNumber);
                cardType = CreditCardValidator.checkCardType(userNumber);
                if(lengthOfDigits == 0 && cardType == null){
                    System.out.println("Check that Your credit card digits are between 13 and 16 digits\nAlso check that the first digits starts with either \"4\" \"5\", \"37\", or \"4\"");
                    
                    doubtingNumber = true;
                }
                else if(lengthOfDigits != 0 && cardType == null){
                    System.out.println("Check that the first digits starts with either \"4\", \"5\", \"37\", or \"4\"\n");
                    doubtingNumber = true;
                }
                else if(lengthOfDigits == 0 && cardType != null){
                    System.out.println("Check that Your credit card digits are between 13 and 16 digits");
                    doubtingNumber = true;
                }
                else
                    doubtingNumber = false;
            }
            
        cardValidity = CreditCardValidator.checkValidity(userNumber);
        
        if (doubtingNumber == false){
            checkingNumberValidity = "Ends";
            checking = false;
            
        }               
                     

        }


        System.out.printf("""
************************************************************************************

** Credit Card Type  :            {%s}
** Credit Card Number:            {%d}
** Credit Card Digit Length:      {%d}
** Credit Card Validity Status:   {%s}

************************************************************************************
"""
,cardType, userNumber,lengthOfDigits, cardValidity);
    
    }

}
