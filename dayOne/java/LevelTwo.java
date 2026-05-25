public class LevelTwo{


    public static int [] mostOccuringNumber(int [] collections){

        int appearance = collections[0];
        int appear = 0;
		int count = 0;
		
		for(;count < collections.length; count++){

			int counter = 0;
			for(int counting = count+1; counting < collections.length; counting++){

				if (collections[counting] == collections[count]){
				counter++;
                }
			}
		    if (counter > appear){
                appear = counter;
                appearance = collections[count];
            }
        }
        return collections;
    }

    public static int [] sort(int [] collections){

        int index = 0;

        for (;index < collections.length; index++){
            int counter = index+1;
            for (;counter < collections.length; counter++){
                if (collections[index] < collections[counter]){
                    int swap = collections[index];
                    collections[index] = collections[counter];
                    collections[counter] = swap;
                }
            }
        }
        return collections;
    }
}
