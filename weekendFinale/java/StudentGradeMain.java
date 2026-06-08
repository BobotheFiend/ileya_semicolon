public class StudentGradeMain{
    public static void main(String... nnamdi){
    
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int amountOfStudents = 0;
        int numberOfSubjects = 0;
        String checkingInput = "Yes";
        boolean checkIsRunning = checkingInput.equals("Yes");
        while(checkIsRunning){
    
            try{
                System.out.print("Enter the number of student in the class?.... ");
                amountOfStudents = inputCollector.nextInt();

                System.out.print("Enter the amount of subjects they offer?....  ");
                numberOfSubjects = inputCollector.nextInt();

                System.out.printf("%nSaving >>>>>>>>>>>>>>>>>>>>%n");

                checkIsRunning = checkingInput.equals("No");
            }

            catch(java.util.InputMismatchException error){
                System.out.printf("Invalid Input\nMAke sure to Enter a number\n ");
                inputCollector.next();
            }
            
        }
        System.out.println("Saved Sucessfully! ");

        int [][] studentScores = new int [amountOfStudents][numberOfSubjects];

        int firstIndex = 0;
        for(; firstIndex < amountOfStudents; firstIndex++){
                        
            int secondIndex = 0;
            for(; secondIndex < numberOfSubjects; secondIndex++){
                System.out.printf("Entering Score for Student %d%n", firstIndex +1);
                System.out.printf("Enter Grade Score for Subject %d%n", secondIndex+1);
                System.out.print("Input Score: ");
                int studentScore = inputCollector.nextInt();
                
                if (StudentGradeMethods.checkScoreIsValid(studentScore) == true){
                    studentScores[firstIndex][secondIndex] = studentScore;
                    System.out.printf("%n%nSaving >>>>>>>>>>>>>>>>>>>>%n%n");
                }
                    

                else{
                    while(StudentGradeMethods.checkScoreIsValid(studentScore) == false){
                        System.out.print("Invalid Score Input!\nTry Again!\n\n");

                        System.out.printf("Entering Score for Student %d%n", firstIndex +1);
                        System.out.printf("Enter Grade Score for Subject %d%n", secondIndex+1);
                        System.out.print("Input Score: ");
                        studentScore = inputCollector.nextInt();

                        if (StudentGradeMethods.checkScoreIsValid(studentScore) == true){
                            studentScores[firstIndex][secondIndex] = studentScore;
                            System.out.printf("%n%nSaving >>>>>>>>>>>>>>>>>>>>%n%n");
                        }

                    }
                }
    
                
            }
            System.out.println("Subjects Saved Sucessfully!\n");
        }

        int [] studentsTotal = StudentGradeMethods.getstudentTotalScores(amountOfStudents, numberOfSubjects, studentScores);
        double [] studentsAverage = StudentGradeMethods.getStudentAverage(amountOfStudents, numberOfSubjects, studentScores);
        int [] studentPositions = StudentGradeMethods.allocateStudentsPositions(amountOfStudents, numberOfSubjects, studentScores);

        System.out.print("""
============================================================================================================================

  STUDENT           """
);

        int count = 0;
        for (;count < numberOfSubjects; count++){
            String subject = "SUB";
            System.out.printf(" %8s%d ",subject, count+1);
        }
        System.out.print("     TOT     AVG          POS \n");
        System.out.println("\n============================================================================================================================");
        
        int outterCount = 0;
        for(; outterCount < amountOfStudents; outterCount++){
            System.out.printf("Student %d", outterCount +1);
            int innerCount = 0;
            for(; innerCount < numberOfSubjects; innerCount++){
                System.out.printf(" %8d  ", studentScores[outterCount][innerCount]);
            }
            System.out.printf("%8d %8.2f %10d",  studentsTotal[outterCount], studentsAverage[outterCount], studentPositions[outterCount]);
            System.out.printf("%n");
        }
        System.out.print("""
============================================================================================================================

============================================================================================================================\n"""
);



        System.out.println("\n------------------------------------------------------------- S U B J E C T ------ S U M M A R Y -------------------------------------------------------------\n");

        StudentGradeMethods.studentSubjectSummary(amountOfStudents, numberOfSubjects, studentScores);


        System.out.println("\n------------------------------------------------------------- C L A S S ------ S U M M A R Y -------------------------------------------------------------\n");

        System.out.printf("""

The Hardest subject is --> Subject %d with %d failures
The Easiest subject is --> Subject %d with %d passes
The overall Highest Score is Scored by --> Student %d in subject %d scoring %d
The overall Lowest Score is Scored by  --> Student %d in subject %d scoring %d

============================================================================================================================


---------------------------------- G I F T --- T I M E ----------------------------------

🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️

 THE BEST GRADUATING STUDENT IS ----> STUDENT %d scoring %d

🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️🥳️




😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️

 THE FOUNDATION OF THE CLASS IS ----> STUDENT %d scoring %d

😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️😿️💩️


============================================================================================================================

Class Total Score is: %d

Class Average Score is: %.2f

============================================================================================================================
"""
        ,StudentGradeMethods.getTheHardestSubject(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.getAmountOfFailures(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.getTheEasiestSubject(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.getAmountOfPasses(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallHighestStudentScore(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallHighestSubject(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallHighestScore(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallLowestStudentScore(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallLowestSubject(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callOverallLowestScore(amountOfStudents, numberOfSubjects, studentScores),  StudentGradeMethods.callBestGraduatingStudent(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callBestGraduatingStudentScore(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callWorstGraduatingStudent(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.callWorstGraduatingStudentScore(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.getTotalScores(amountOfStudents, numberOfSubjects, studentScores), StudentGradeMethods.getAverageScore(amountOfStudents, numberOfSubjects, studentScores));


    }
}
