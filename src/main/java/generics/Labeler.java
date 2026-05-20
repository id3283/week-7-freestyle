package generics;
public class Labeler {
    // A generic method that displays a label and a value
    static <T> void displayWithLabel(String label, T someObject){
        // T is inferred from the type of thing we 👆🏼passed in for the second parameter...
        System.out.println(label + ": " + someObject);


    // 👇🏼this means I can use T as a type for a variable:
        T anotherValue = someObject;

        System.out.println("The type of T is: " + someObject.getClass());
    }

    //     👇🏼 I can also use T as a return type
    static <T> T displayAndReturnWithLabel(String label, T someObject){
        System.out.println(label + ": " + someObject);

        T anotherValue = someObject;

        System.out.println("The type of T is: " + someObject.getClass());

        // Returning an object of type T
        return anotherValue;
    }
}
