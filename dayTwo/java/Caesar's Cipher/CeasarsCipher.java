public class CeasarsCipher{
    public static void main(String... nnM){
    
        int key = 3;
        String name = "call me tommorrow";
        String na = "abc" ;
        System.out.println(caesarShift(name, key));
        System.out.println(decryptCaesarShift(na, 1));

    }
  

    public static String caesarShift(String message, int key){
        int getAsciiValue;
        int valueToConvert = (int)'A';
        int lowerCaseValueToConvert = (int)'a';
        int convertAsciiValueToAlphabetNumber;
        String newKey = "";
        String convertToString;
        int count = 0;
        for(; count < message.length(); count++){
            char letter = (char)message.charAt(count);

            if(Character.isLetter(letter) && Character.isUpperCase(letter)){
                getAsciiValue = (int)letter;
                convertAsciiValueToAlphabetNumber = getAsciiValue - valueToConvert;
                int getShiftPosition = (convertAsciiValueToAlphabetNumber + key)%26;
                char newAsciiToChar = (char)(getShiftPosition + valueToConvert);
                convertToString = Character.toString(newAsciiToChar);
                newKey += convertToString;
            }
            else if(Character.isLetter(letter) && Character.isLowerCase(letter)){
                getAsciiValue = (int)letter;
                convertAsciiValueToAlphabetNumber = getAsciiValue - lowerCaseValueToConvert;
                int getShiftPosition = (convertAsciiValueToAlphabetNumber + key)%26;
                char newAsciiToChar = (char)(getShiftPosition + lowerCaseValueToConvert);
                convertToString = Character.toString(newAsciiToChar);
                newKey += convertToString;

            }
            else{
                convertToString = Character.toString(letter);
                newKey += convertToString;
            }
         
        }
        return newKey;

    }

    public static String decryptCaesarShift(String message, int key){
        int getAsciiValue;
        int valueToConvert = (int)'A';
        int lowerCaseValueToConvert = (int)'a';
        int convertAsciiValueToAlphabetNumber;
        String newKey = "";
        String convertToString;
        int count = 0;
        for(; count < message.length(); count++){
            char letter = (char)message.charAt(count);

            if(Character.isLetter(letter) && Character.isUpperCase(letter)){
                getAsciiValue = (int)letter;
                convertAsciiValueToAlphabetNumber = getAsciiValue - valueToConvert;
                int getShiftPosition = ((convertAsciiValueToAlphabetNumber - key)+ 26 )%26;
                char newAsciiToChar = (char)(getShiftPosition + valueToConvert);
                convertToString = Character.toString(newAsciiToChar);
                newKey += convertToString;
            }
            else if(Character.isLetter(letter) && Character.isLowerCase(letter)){
                getAsciiValue = (int)letter;
                convertAsciiValueToAlphabetNumber = getAsciiValue - lowerCaseValueToConvert;
                int getShiftPosition = ((convertAsciiValueToAlphabetNumber - key) + 26)%26;
                char newAsciiToChar = (char)(getShiftPosition + lowerCaseValueToConvert);
                convertToString = Character.toString(newAsciiToChar);
                newKey += convertToString;
            }
            else{
                convertToString = Character.toString(letter);
                newKey += convertToString;
            }
         
        }
        return newKey;

    }

}
