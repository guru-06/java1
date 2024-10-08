public class Main {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("John", 30);

        // Using methods of the Person class
        person1.displayInfo();
    }
    
    // Inner class for Person
    static class Person {
        // Fields (Instance Variables)
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
   // Method
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
