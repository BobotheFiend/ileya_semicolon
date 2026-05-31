
public class CreditCardValidator{
 
    public static String convertNumber(long input){
        String numberAsString = input + "";
        return numberAsString;
    }
    public static int checkNumberLength(long input){
        int length = 0;
        String numberConverted = convertNumber(input);
        int numberLength = numberConverted.length();
        if(numberLength >= 13 && numberLength <= 16) {
            length = numberLength;
        }
        return length;
    }
    
    public static String checkCardType(long input){

        String numberType = convertNumber(input);
        String cardType = null; 
        if(numberType.startsWith("4")){
            cardType = "VisaCard";
        }
        else if(numberType.startsWith("5")){
            cardType = "MasterCard";
        }
        else if(numberType.startsWith("37")){
            cardType = "American ExpressCard";
        }
        else if(numberType.startsWith("6")){
            cardType = "DiscoverCard";
        }
        return cardType;
    }

    public static String checkValidity(long input){
    int [] numbersSplit = new int [checkNumberLength(input)];
    
    String numberString = convertNumber(input);
    int index = 0;
    for (char numbers : numberString.toCharArray()){
        int convertBackToInt = Character.getNumericValue(numbers);
        numbersSplit[index++] = convertBackToInt;
    }

    int addEvenIndex = 0;
    int evenCount = numbersSplit.length - 2;
    for (; evenCount > -1;  evenCount-=2){
        int multiply = numbersSplit[evenCount] * 2;
        String multiplyToString = convertNumber(multiply);
        if(multiplyToString.length() > 1){
            int add = 0;
            while(multiply > 0){
                int extractor = multiply % 10;
                add += extractor;
                multiply = multiply / 10;
            }
            addEvenIndex += add;
        }
        else{
            addEvenIndex += multiply;
        }
    }

    int addOddIndex = 0;
    int oddCount = numbersSplit.length - 1;
    for (; oddCount > -1;  oddCount-=2){
        int getElements = numbersSplit[oddCount];
        addOddIndex += getElements;
    }      
    
    int sumOfOddEvenIndex = addOddIndex + addEvenIndex;
    String isValid = null;
    if(sumOfOddEvenIndex % 10 == 0){
        isValid = "Valid";
    }
    else{
        isValid = "Invalid";
    }
    return isValid;
    }


}
