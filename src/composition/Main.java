package composition;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Sue Shoe",23,new Address("750 Main St.", 55555, "Wisconsin", "414-262-5555"));
        Student student2 = new Student("Bob Fredrickson",32,new Address("555 1st North St.", 51515, "Illinois", "262-414-5555"));

        System.out.println(student1.getName() + " is from " + student1.getAddress().getState());
        System.out.println(student2.getName() + " is from " + student2.getAddress().getState());
    }
}
