public class TypeCastingExample {
    public static void show() {
        double myDouble = 9.78;
        int myInt = 9;

        int castedInt = (int) myDouble;  // Explicitly casting double to int
        double castedDouble = myInt;     // Implicitly casting int to double

        System.out.println("casted int = " + castedInt);
        System.out.println("casted double = " + castedDouble);
    }
}
