public class MbtiPersonalityApplication{
    public static void main(String... nnamdi){

    Mbti test = new Mbti();
    System.out.printf("-------------------------------------------------------W E L C O M E---TO--THE--P E R S O N A L I T Y---TEST----------------------------------------------------------%n");

    System.out.println("\t\t\t\t\t\t\t\t\t" + test.todaysDateTime());
    String name = test.whatIsYourName();
    System.out.println(name);


    System.out.print("--------------------------------------------------Answer These Series Of Question to get Your Personality Trait--------------------------------------------------\n\n\t\tPlease Input Either A or B to make your choices\n");
    System.out.println(test.userResponseChoices());

    System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%s%n%nHello %s You Selected%n%n",test.todaysDateTime(), name);
    test.selectionsOutput();
    test.personalityMessage();
    }
}
