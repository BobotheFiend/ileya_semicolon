public class StudentGradeMethods{


    public static boolean checkScoreIsValid(int input){

        if(input >= 0 & input <= 100) return true;
        else return false;
    }


    public static int [] getstudentTotalScores(int students, int subjects, int [][] scores){
    
        int [] studentTotalScores = new int [students];

        int index = 0;
        for(; index < students; index++){
            int totalScores = 0;
            int innerIndex = 0;
            for(;innerIndex < subjects; innerIndex++){
                totalScores += scores[index][innerIndex];
            }
            studentTotalScores[index] = totalScores;
            
        }
        
        return studentTotalScores;
    }


    public static double [] getStudentAverage(int students, int subjects, int [][] scores){

        int [] studentsTotal = getstudentTotalScores(students, subjects, scores);
        double [] studentAverageScore = new double [students];

        double averageScore = 0;
        int index = 0;
        for(; index < studentsTotal.length; index++){
            averageScore = studentsTotal[index] / subjects;
            studentAverageScore[index] = averageScore;
        }
        
        return studentAverageScore;
    }


    public static int [] getSortedElementsHighToLow(int [] collections){
        int [] array = new int [collections.length];
        int count = 0;
        for(; count < collections.length; count++){
            int index = count + 1;
            for(; index < collections.length; index++){
                if (collections[count] < collections[index]){
                    int holdThis = collections[count];
                    collections[count] = collections[index];
                    array[count] = collections[count];
                    collections[index] = holdThis;
                    array[index] = holdThis;
                }
            }
        }
        return collections;
    }


    public static int [] checkStudentPostion(int students, int subjects, int [][] scores){

        int [] studentsTotal = getstudentTotalScores(students, subjects, scores);
        int [] studentPosition = new int [students];
        int [] sortedPosition = getSortedElementsHighToLow(studentsTotal);
        
        int index = 0;
        for(; index < studentsTotal.length; index++){
            int innerIndex = 0;
            for(; innerIndex < sortedPosition.length; innerIndex++){
                if(studentsTotal[index] == sortedPosition[innerIndex]){
                    studentPosition[index] = innerIndex+1;
                    break;
                }
            }
            
        }
        return studentPosition;
    } 

    public static void studentSubjectSummary(int students, int subjects, int [][] studentScores){

        int subjectIndex = 0;
        for(; subjectIndex < subjects; subjectIndex++){

            System.out.printf("-----SUBJECT %d-----%n", subjectIndex+1);
            int numberOfPasses = 0;
            int numberOfFailures = 0;
            int gettingScores = 0;
            int highestStudentScore = -1;
            int lowestStudentScore = 101;
            int highestStudent = 0;
            int lowestStudent = 0;
            double averageStudents = 0;
            int totalScores = 0;

            int studentIndex = 0;
            for(; studentIndex < students; studentIndex++){

                gettingScores = studentScores[studentIndex][subjectIndex];
                totalScores += gettingScores;

                if(gettingScores > highestStudentScore){ 
                    highestStudentScore = gettingScores;
                    highestStudent = studentIndex+1;
                }
                if(gettingScores < lowestStudentScore){
                    lowestStudentScore = gettingScores;
                    lowestStudent = studentIndex+1;
                }
                if(gettingScores > 49) numberOfPasses++;
                else numberOfFailures++;
                
            }
            averageStudents = totalScores/students;
            System.out.printf("""

Highest Scoring Student is: Student %d, scored %d
Lowest Scoring Student is: Student %d, scored %d
Total Score is: %d
Average Score is: %.2f
Number of Passes: %d
Number of Fails: %d%n
"""

            ,highestStudent, highestStudentScore, lowestStudent, lowestStudentScore, totalScores, averageStudents, numberOfPasses, numberOfFailures);
        }


    }

    public static int getTheHardestSubject(int students, int subjects, int [][] studentScores){

        int hardestSubject = 0;
        int storeFails = 0;
        int outterIndex = 0;
        for(; outterIndex < subjects; outterIndex++){
            
            int failures = 0;   
            int innerIndex = 0;
            for(; innerIndex < students ; innerIndex++){
                int score = studentScores[innerIndex][outterIndex];
                if(score < 50) failures++;
            }
            if(failures > storeFails){
                storeFails = failures;
                hardestSubject = outterIndex+1;
            }
        }
        return hardestSubject;
    }

    public static int [] allocateStudentsPositions(int students, int subjects, int [][] studentScores){

        int [] studentTotalSore = getstudentTotalScores(students, subjects, studentScores);

        int [] studentPositions = new int [students];
        int index = 0;
        for(; index < studentTotalSore.length; index++){

        int studentPosition = 1;

        int innerIndex = 0;
        for(; innerIndex < studentTotalSore.length;){
            if (studentTotalSore[index] < studentTotalSore[innerIndex++]) studentPosition++;
        }
        studentPositions[index] = studentPosition;
        }
        return studentPositions;
    }


    public static int getTheEasiestSubject(int students, int subjects, int [][] studentScores){

        int easiestSubject = 0;
        int storePasses = 0;
        int outterIndex = 0;
        for(; outterIndex < subjects; outterIndex++){
            
            int passes = 0;   
            int innerIndex = 0;
            for(; innerIndex < students ; innerIndex++){
                int score = studentScores[innerIndex][outterIndex];
                if(score > 49) passes++;
            }
            if(passes > storePasses){
                storePasses = passes;
                easiestSubject = outterIndex+1;
            }
        }
        return easiestSubject;
    }

    public static int getAmountOfFailures(int students, int subjects, int [][] studentScores){
    
        int storeFails = 0;
        int outterIndex = 0;
        for(; outterIndex < subjects; outterIndex++){
            
            int failures = 0;   
            int innerIndex = 0;
            for(; innerIndex < students ; innerIndex++){
                int score = studentScores[innerIndex][outterIndex];
                if(score < 50) failures++;
            }
            if(failures > storeFails){
                storeFails = failures;
            }
        }
        return storeFails;
    }

    public static int getAmountOfPasses(int students, int subjects, int [][] studentScores){
    
        int storePasses = 0;
        int outterIndex = 0;
        for(; outterIndex < subjects; outterIndex++){
            
            int passes = 0;   
            int innerIndex = 0;
            for(; innerIndex < students ; innerIndex++){
                int score = studentScores[innerIndex][outterIndex];
                if(score > 49) passes++;
            }
            if(passes > storePasses){
                storePasses = passes;
            }
        }
        return storePasses;
    }

    public static int callOverallHighestScore(int students, int subjects, int [][] scores){
    
        int score = scores[0][0];
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
            
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] > score)
                    score = scores[outterIndex][innerIndex];
            }
        }
        return score;
    }

    public static int callOverallHighestStudentScore(int students, int subjects, int [][] scores){
    
        int score = scores[0][0];
        int studentIndex = 0;
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
            
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] > score){
                    score = scores[outterIndex][innerIndex];
                    studentIndex = outterIndex+1;
                }
            }

        }
        return studentIndex;
    }

    public static int callOverallHighestSubject(int students, int subjects, int [][] scores){
    
        int score = scores[0][0];
        int studentIndex = 0;
        int subjectIndex = 0;
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
             
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] > score){
                    score = scores[outterIndex][innerIndex];
                    studentIndex = outterIndex+1;
                    subjectIndex = innerIndex+1;
                }
            }

        }
        return subjectIndex;
    }

    public static int callOverallLowestScore(int students, int subjects, int [][] scores){
    
        int score = 101;
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
               
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] < score)
                    score = scores[outterIndex][innerIndex];
            }
        }
        return score;
    }

    public static int callOverallLowestStudentScore(int students, int subjects, int [][] scores){
    
        int score = 101;
        int studentIndex = 0;
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
            
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] < score){
                    score = scores[outterIndex][innerIndex];
                    studentIndex = outterIndex+1;
                }
            }

        }
        return studentIndex;
    }

    public static int callOverallLowestSubject(int students, int subjects, int [][] scores){
    
        int score = 101;
        int studentIndex = 0;
        int subjectIndex = 0;
        int outterIndex = 0;
        for(; outterIndex < students; outterIndex++){
             
            int innerIndex = 0;
            for(; innerIndex < subjects ; innerIndex++){

                if(scores[outterIndex][innerIndex] < score){
                    score = scores[outterIndex][innerIndex];
                    studentIndex = outterIndex+1;
                    subjectIndex = innerIndex+1;
                }
            }

        }
        return subjectIndex;
    }

    public static int callBestGraduatingStudentScore(int students, int subjects, int [][] scores){
    
        int [] studentTotal = getstudentTotalScores(students, subjects, scores);
        int bestScore = -1;
        int count = 0;
        for(; count < studentTotal.length; count++){
            if (studentTotal[count] > bestScore)
                bestScore = studentTotal[count];
        }
        return bestScore;
    }

    public static int callBestGraduatingStudent(int students, int subjects, int [][] scores){
    
        int [] studentTotal = getstudentTotalScores(students, subjects, scores);
        int bestScore = -1;
        int bestStudent = 0;
        int count = 0;
        for(; count < studentTotal.length; count++){
            if (studentTotal[count] > bestScore){
                bestScore = studentTotal[count];
                bestStudent = count +1;
            }
        }
        return bestStudent;
    }

    public static int callWorstGraduatingStudentScore(int students, int subjects, int [][] scores){
    
        int [] studentTotal = getstudentTotalScores(students, subjects, scores);
        int worstScore = studentTotal[0];
        int count = 0;
        for(; count < studentTotal.length; count++){
            if (studentTotal[count] <= worstScore)
                worstScore = studentTotal[count];
        }
        return worstScore;
    }

    public static int callWorstGraduatingStudent(int students, int subjects, int [][] scores){
    
        int [] studentTotal = getstudentTotalScores(students, subjects, scores);
        int worstScore = studentTotal[0];
        int worstStudent = 0;
        int count = 0;
        for(; count < studentTotal.length; count++){
            if (studentTotal[count] <= worstScore){
                worstScore = studentTotal[count];
                worstStudent = count + 1;
            }
        }
        return worstStudent;
    }

    public static int getTotalScores(int students, int subjects, int [][] scores){
    
        int [] studentTotal = getstudentTotalScores(students, subjects, scores);
        int total = 0;
        int count = 0;
        for(; count < studentTotal.length; count++){
            total += studentTotal[count];
        }

        return total;
    }

    public static double getAverageScore(int students, int subjects, int [][] scores){
        int total = getTotalScores(students, subjects, scores);
        double average = total/students;
        return (float)average;
    }

} 
