package inheritancerefresher;

public class Customer extends Person{

    public Customer(String name) {
        super("Dave", 57);

        System.out.println("The name you passed in is: " + name);
    }

}
