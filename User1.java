package pack2;

public class User1 {
    public int age;
    public String firstName;
    public String lastName;
    public double height;
    public double weight;
    double index;

   public User1() {
    firstName = "Oleg";
    }
    public User1(String firstName ) {
        this.firstName = firstName;
    }
    public User1(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printUserFilds() {
        System.out.println("Person: The name is: " + firstName);
        System.out.println("Person: The last name is: " + lastName);
        System.out.println("Person: age is: " + age);
        System.out.println("Person: height is: " + height);
        System.out.println("Person: weigth is: " + weight);
    }
    public int bodyIndex() {
        double index = (int)height/(weight*2/10);
        return (int) index;

    }
}

