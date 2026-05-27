public class CeasarsCipher{
  

    public static String caesarShift(String message, int key){
        int getAsciiValue;
        int valueToConvert = (int)'A';
        int convertAsciiValueToAlphabetNumber;
        String newKey = "";
        String convertToString;
        int count = 0;
        for(; count < message.length(); count++){
            char letter = (char)message.charAt(count);

            if(Character.isLetter(letter)){
                getAsciiValue = (int)Character.toUpperCase(letter);
                convertAsciiValueToAlphabetNumber = getAsciiValue - valueToConvert;
                int getShiftPosition = (convertAsciiValueToAlphabetNumber + key)%26;
                char newAsciiToChar = (char)(getShiftPosition + valueToConvert);
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
        int convertAsciiValueToAlphabetNumber;
        String newKey = "";
        String convertToString;
        int count = 0;
        for(; count < message.length(); count++){
            char letter = (char)message.charAt(count);

            if(Character.isLetter(letter)){
                getAsciiValue = (int)Character.toUpperCase(letter);
                convertAsciiValueToAlphabetNumber = getAsciiValue - valueToConvert;
                int getShiftPosition = (convertAsciiValueToAlphabetNumber - key)%26;
                char newAsciiToChar = (char)(getShiftPosition + valueToConvert);
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
