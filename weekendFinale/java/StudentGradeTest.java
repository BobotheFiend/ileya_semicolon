import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class StudentGradeTest{


    @Test
    void thatTheMethodReturnTrueIfScoreIsValidAndReturnsFalseIfNotValid(){
        int score = 0;
        boolean expectedResult = StudentGradeMethods.checkScoreIsValid(0);
        boolean actualResult = true;
        assertEquals(actualResult, expectedResult);

        assertTrue(StudentGradeMethods.checkScoreIsValid(90));
        assertTrue(StudentGradeMethods.checkScoreIsValid(100));

        assertFalse(StudentGradeMethods.checkScoreIsValid(101));
        assertFalse(StudentGradeMethods.checkScoreIsValid(-1));
    }

    
    @Test
    void thatTheMethodReturnsTheTotalScoreOfEachStudent(){
        int students = 2;
        int subjects = 2;
        int [][] studentScores = {{60,90}, {80,88}};
        int [] expected =  StudentGradeMethods.getstudentTotalScores(students, subjects, studentScores);
        int [] actual = {150, 168};
        assertArrayEquals(actual, expected);

        int ssOneArts = 4;
        int ssOneArtsSubjects = 2;
        int [][] sssOneStudentScores = {{50,50}, {60,60}, {90,90}, {60,40}};
        int [] expectedTotal =   StudentGradeMethods.getstudentTotalScores(ssOneArts, ssOneArtsSubjects, sssOneStudentScores);
        int [] actualTotal = {100, 120, 180, 100};
        assertArrayEquals(actualTotal, expectedTotal);
    }

    @Test
    void thatTheMethodReturnsTheActualStudentAverageForAllSubjects(){
        int students = 3;
        int subjects = 2;
        int [][] studentScores = {{90,80}, {60,80}, {70,30}};
        double [] expected = StudentGradeMethods.getStudentAverage(students, subjects, studentScores);
        double [] actual = {85.0, 70.0, 50.0};
        assertArrayEquals(actual, expected);
        
    }

    @Test
    void testThatMethodThatTheMethodReturnsAnArrayThatISSortedFromHighestToLowest(){
        int [] collections = {56, 88, 90, 6, 101, 47, 78, 56, 71, 30};
        int [] expected = StudentGradeMethods.getSortedElementsHighToLow(collections);
        int [] actual = {101, 90, 88, 78, 71, 56, 56, 47, 30, 6};
        assertArrayEquals(actual, expected);
    }

    @Test
    void testThatMethodReturnsTheActualPositionOfTheScores(){
        int students = 3;
        int subjects = 2;
        int [][] studentScores = {{90,80}, {60,80}, {70,30}};
        int [] expectedPositions = StudentGradeMethods.checkStudentPostion(students, subjects, studentScores);
        int [] actualPositions = {1,2,3};
        assertArrayEquals(actualPositions, expectedPositions);
    }

    @Test
    void testThatTheMethodReturnsTheHardestSubjectOfAllSubjects(){
        int students = 3;
        int subjects = 4;
        int [][] studentScores = {{89, 69, 38, 94}, {92, 90, 76, 97}, {90, 80, 49, 79}};
        int expected = StudentGradeMethods.getTheHardestSubject(students, subjects, studentScores);
        int actual = 3;
        assertEquals(actual, expected);
    }

    @Test
    void thatTheMethodReturnsTheEasisestSubjectOfAllSubjects(){
        int students = 4;
        int subjects = 2;
        int [][] studentScores = {{89,95}, {49, 77}, {45, 40}, {79, 88}};
        int expected = StudentGradeMethods.getTheEasiestSubject(students, subjects, studentScores);
        int actual = 2;
        assertEquals(actual, expected);
    }

    @Test
    void thatTheMethodReturnsTheActualPositionsForEachStudents(){
        int students = 5;
        int subjects = 1;
        int [][] studentScores = {{55}, {98}, {78}, {89}, {67}};
        int [] expectedPositions = StudentGradeMethods.allocateStudentsPositions(students, subjects, studentScores);
        int [] actualPositions = {5, 1, 3, 2, 4};
        assertArrayEquals(actualPositions, expectedPositions);
    }

    @Test
    void thatTheMethodReturnsTheSubjectWithTheMostNumberOfStudentsWhoFailed(){
        int students = 5;
        int subjects = 2;
        int [][] studentScores = {{49,50}, {80,90}, {70,56}, {33, 40}, {48,60}};
        int expectedFails = StudentGradeMethods.getAmountOfFailures(students, subjects, studentScores);
        int actualFails = 3;
        assertEquals(actualFails, expectedFails);
    }

    @Test
    void thatTheMethodReturnsTheSubjectWithTheMostNumberOfStudentsWhoPassed(){
        int students = 5;
        int subjects = 2;
        int [][] studentScores = {{49,50}, {80,90}, {70,56}, {33, 40}, {48,60}};
        int expectedFails = StudentGradeMethods.getAmountOfPasses(students, subjects, studentScores);
        int actualFails = 4;
        assertEquals(actualFails, expectedFails);
    }

    @Test
    void thatTheMethodCallsTheOverallHighestScoreSubjectAndStudentLookingAtAllStudentsAndSubjects(){
        int students = 5;
        int subjects = 2;
        int [][] studentScores = {{55,65}, {99, 98}, {78, 89}, {89,97}, {67, 77}};
        int expectedScore = StudentGradeMethods.callOverallHighestScore(students, subjects, studentScores);
        int actualScore = 99;
        assertEquals(actualScore, expectedScore);

        int expectedStudentWithTheHighestScore = StudentGradeMethods.callOverallHighestStudentScore(students, subjects, studentScores);
        int actualStudentWithTheHighestScore = 2;
        assertEquals(actualStudentWithTheHighestScore, expectedStudentWithTheHighestScore);

        int expectedSubjectWithTheHighestScore = StudentGradeMethods.callOverallHighestSubject(students, subjects, studentScores);
        int actualSubjectWithTheHighestScore = 1;
        assertEquals(actualSubjectWithTheHighestScore, expectedSubjectWithTheHighestScore);
    }

    @Test
    void thatTheMethodCallsTheOverallLowestScoreSubjectAndStudentLookingAtAllStudentsAndSubjects(){
        int students = 5;
        int subjects = 2;
        int [][] studentScores = {{55,65}, {99, 98}, {78, 89}, {89,97}, {33, 77}};
        int expectedScore = StudentGradeMethods.callOverallLowestScore(students, subjects, studentScores);
        int actualScore = 33;
        assertEquals(actualScore, expectedScore);

        int expectedStudentWithTheLowestScore = StudentGradeMethods.callOverallLowestStudentScore(students, subjects, studentScores);
        int actualStudentWithTheLowestScore = 5;
        assertEquals(actualStudentWithTheLowestScore, expectedStudentWithTheLowestScore);

        int expectedSubjectWithTheLowestScore = StudentGradeMethods.callOverallLowestSubject(students, subjects, studentScores);
        int actualSubjectWithTheLowestScore = 1;
        assertEquals(actualSubjectWithTheLowestScore, expectedSubjectWithTheLowestScore);
    }


    @Test
    void thatTheBestScoreIsCalledAlongWithTheStudentWithTheBestScore(){
        int sudents = 4;
        int subjects = 3;
        int [][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int expectedBestStudent = StudentGradeMethods.callBestGraduatingStudent(sudents, subjects, scores);
        int actualBestStudent = 4;
        assertEquals(actualBestStudent, expectedBestStudent);

        int expectedBestScore = StudentGradeMethods.callBestGraduatingStudentScore(sudents, subjects, scores);
        int actualBestScore = 227;
        assertEquals(actualBestScore, expectedBestScore);
    }

    @Test
    void thatTheWorstScoreIsCalledAlongWithTheStudentWithTheWorstScore(){
        int sudents = 4;
        int subjects = 3;
        int [][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int expectedWorstStudent = StudentGradeMethods.callWorstGraduatingStudent(sudents, subjects, scores);
        int actualWorstStudent = 1;
        assertEquals(actualWorstStudent, expectedWorstStudent);

        int expectedWorstScore = StudentGradeMethods.callWorstGraduatingStudentScore(sudents, subjects, scores);
        int actualWorstScore = 137;
        assertEquals(actualWorstScore, expectedWorstScore);
    }

    @Test
    void thatTheMethodReturnsTheSumTotalOfAllTheSubjectScores(){
    
        int sudents = 4;
        int subjects = 3;
        int [][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int expected = StudentGradeMethods.getTotalScores(sudents, subjects, scores);
        int actual = 734;
        assertEquals(actual, expected);
    }

    @Test
    void thatTheMethodReturnsTheAverageOfTheSumTotalOfSubjectScores(){
        int sudents = 4;
        int subjects = 3;
        int [][] scores = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        double expected = StudentGradeMethods.getAverageScore(sudents, subjects, scores);
        double actual = 183.5;
        assertEquals(actual, expected);
    }
}
