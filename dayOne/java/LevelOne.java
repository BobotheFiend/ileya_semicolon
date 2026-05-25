public class LevelOne{
    public static void main(String... args){
        int [] numbers = {45, 0, 8, 0, 45};
        System.out.println(oddEvenArraySplitter(numbers));
    }

    public static java.util.ArrayList<java.util.ArrayList<Integer>> oddEvenArraySplitter(int [] collections){
        java.util.ArrayList<java.util.ArrayList<Integer>> combinedArrayList = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> evenCollections = new java.util.ArrayList<Integer>();
        java.util.ArrayList<Integer> oddCollections = new java.util.ArrayList<Integer>();

        for(int count : collections){
            if (count % 2 == 0){
                evenCollections.add(count);
            }
            else{
                oddCollections.add(count);
            }
        }
        combinedArrayList.add(oddCollections);
        combinedArrayList.add(evenCollections);
    
//        int [][] combinedArray = new int [2][];
//    
//        combinedArray[0] = evenCollections.get(0);
//        combinedArray[1] = oddCollections.get(0);
//
//        return combinedArray;
        return combinedArrayList;
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
