package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        obj1.log("First log message");

        Logger obj2 = Logger.getInstance();
        obj2.log("Second log message");

        System.out.println("Same instance? " + (obj1 == obj2));
    }
}