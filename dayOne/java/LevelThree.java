public class LevelThree{

    public int [] mergeSort(int [] collectionsOne, int[] collectionsTwo){
        int [] coJoin = new int [collectionsOne.length + collectionsTwo.length];

        int index = 0;
        int indexCount = 0;
        for (int element : collectionsOne){
            coJoin[index++] = element;
            indexCount++;
        }

        for (int number : collectionsTwo){
            coJoin[indexCount++] = number;
        }
//        return coJoin;
        int count = 0;
        for (; count < coJoin.length; count++){
            int innerCount = count+1;
            for(; innerCount < coJoin.length; innerCount++){
                if(coJoin[count] > coJoin[innerCount]){
                    int swap = coJoin[count];
                    coJoin[count] = coJoin[innerCount];
                    coJoin[innerCount] = swap;
                }
            }
        }
        return coJoin;
    } 


}
