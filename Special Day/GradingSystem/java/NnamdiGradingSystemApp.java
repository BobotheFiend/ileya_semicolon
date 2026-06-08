import java.util.ArrayList;

public class NnamdiGradingSystemApp{

    public static void main(String... nnamdi){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);
 
        ArrayList<String> studentAndScores = new ArrayList<>();

        System.out.print("Enter the amount of student enrolled: ");
        int amountOfStudents = inputCollector.nextInt();

        System.out.print("Enter the amount of Number of quizzes taken?.. ");
        int numberOfQuiz = inputCollector.nextInt();

        
        double average = 0;
        int [][] justScores = new int[amountOfStudents][numberOfQuiz];
        ArrayList<Integer> onlyScores = new ArrayList<>();
        int row = 0;
        for(;row < amountOfStudents; row++){
            String studentDisplay = String.format("Student %d%n", row+1);
            studentAndScores.add(studentDisplay);
            int column = 0;
            System.out.printf("----- Student %d -----%n",row+1);
            int total = 0;
            for(; column < numberOfQuiz; column++){
                
                System.out.print("Enter the score of the student: ");
                int quizScore = inputCollector.nextInt();
                boolean chekingStudentScoreIsValid = true;
                if(quizScore >= 0 && quizScore <= 100){
                    String convert = quizScore + "";
                    studentAndScores.add(convert);
                    justScores[row][column] = quizScore;
                    onlyScores.add(quizScore);
                    total+=quizScore;
                
                }
                else{
                    while(chekingStudentScoreIsValid){
                        System.out.println("Wrong input check that score is within the range of 0-100");
               
                        System.out.print("Please enter the valid score of the student: ");
                        quizScore = inputCollector.nextInt();
                        if(quizScore >= 0 && quizScore <= 100){
                            String convert = quizScore + "";
                            studentAndScores.add(convert);
                            justScores[row][column] = quizScore;
                            onlyScores.add(quizScore);
                            total+=quizScore;
                            chekingStudentScoreIsValid = false;
                        }
                    }
                }
            }   
        
            average = total/numberOfQuiz;
            String convert = average + "";
            studentAndScores.add(convert);

        }


//        System.out.println(studentAndScores);
//        System.out.println(java.util.Arrays.deepToString(justScores));
//        System.out.println(onlyScores);

        ArrayList<String> quizAverage = new ArrayList<String>();
        double largest = 0;
        double averages = 0;
        int questionWithHighestAverage = 0;
        int indexIncreament = numberOfQuiz;
        int index = 0;
        for (; index < numberOfQuiz; index++){
            if (amountOfStudents == 1){
                double question = onlyScores.get(index);
                averages = question/amountOfStudents;
                String convertAverageToString = averages + "";
                quizAverage.add(convertAverageToString);
                double averageTotal = averages;
                if(averageTotal > largest){
                    largest = averageTotal;
                    questionWithHighestAverage+=1;
                }
                    indexIncreament+=1;

            }
    
            else{
                double question = onlyScores.get(index) + onlyScores.get(indexIncreament);
                averages = question/amountOfStudents;
                String convertAverageToString = averages + "";
                quizAverage.add(convertAverageToString);
                double averageTotal = averages;
                if(averageTotal > largest){
                    largest = averageTotal;
                    questionWithHighestAverage+=1;
                }
                indexIncreament+=1;
            }
        }

        System.out.printf("""
========================= QUIZ GRADE REPORT =========================

STUDENT       """
                                );
        int displayQuizCount = 0;
        for(; displayQuizCount < numberOfQuiz; displayQuizCount++){
            System.out.printf("      QZ%d   ", displayQuizCount+1);
        }
        System.out.print("    AVG\n");
        System.out.print("-------------------------------------------------------------------------\n");
        

        int dummyForQuizAmount = numberOfQuiz;
        int incrementByQuiz = 1;
        int innerRow = 0;
        for(;innerRow < amountOfStudents; innerRow++){
            int displayScores = incrementByQuiz;
            System.out.printf("Student %d   ", innerRow+1);
            for(;displayScores < dummyForQuizAmount+2; displayScores++){
                System.out.printf("%s    ",studentAndScores.get(displayScores));
            }
            incrementByQuiz+=numberOfQuiz+3;
            dummyForQuizAmount+=numberOfQuiz+3;
            System.out.printf(" ");
        }

        System.out.printf("""

------------------------------------------------------------------------- %n"""
        );
        

        System.out.print("The average of ");
        int displayQuizzes = 0;
        for (;displayQuizzes < numberOfQuiz; displayQuizzes++){
            System.out.printf("Quiz%d, ",displayQuizzes +1);
        }

        System.out.println(quizAverage);
        System.out.printf("Best Quiz: Quiz %d (avg: %.2f)%n",questionWithHighestAverage, largest );
        
    }
}
