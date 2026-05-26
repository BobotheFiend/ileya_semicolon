public class LevelOne{

    public static int [][] oddEvenArraySplitter(int [] collections){

        int oddCount = 0;
        int evenCount = 0;
        for(int count : collections){
            if (count % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        int [] evenCollections = new int [evenCount];
        int [] oddCollections = new int [oddCount];

        int index = 0;
        int indexTwo = 0;
        for(int element : collections){
            if(element % 2 == 0){
                evenCollections[index] = element;
                index++;
            }
            else{
                oddCollections[indexTwo] = element;
                indexTwo++;
            }
            
        }
    
        int [][] combinedArray = {oddCollections, evenCollections};

        return combinedArray;
    }

    public static boolean palindromeArray(int [] collections){
        int startOfArray = 0;
        int endOfArray = collections.length - 1;
    
        for(; startOfArray < endOfArray; startOfArray++){
            if (collections[startOfArray] != collections[endOfArray--]){
                return false;
            }
        }
        return true;
    }

    public static int [] perfectSquareNumber(int [] collections){
        java.util.ArrayList<Integer> perfectSq = new java.util.ArrayList<Integer>();

        for(int count : collections){
            if(count % Math.sqrt(count) == 0)
                perfectSq.add(count);
        }
        
        int [] perfectSquare = new int [perfectSq.size()];
        int index = 0;
        for(; index < perfectSquare.length; index++){
            perfectSquare[index] = perfectSq.get(index);    
        }
        return perfectSquare;
    }

    public static int [] nonPerfectSquareNumber(int [] collections){
        java.util.ArrayList<Integer> nonPerfectSq = new java.util.ArrayList<Integer>();

        for(int count : collections){
            if(count % Math.sqrt(count) == 0){
                nonPerfectSq.add(count);
            }
            else{
                nonPerfectSq.add(-1);
            }
        }
        
        int [] nonPerfectSquare = new int [nonPerfectSq.size()];
        int index = 0;
        for(; index < nonPerfectSquare.length; index++){
            nonPerfectSquare[index] = nonPerfectSq.get(index);    
        }
        return nonPerfectSquare;
    }
}
