// Object Basics Exercise //
public class Person {
    private String name;
//    private String sayHello;

    //Getters//
    public String getName() {
        return this.name;
    }


    //Setters//
    public void setName(String name) {
        this.name = name;
    }

    //Other Method //
    public void sayHello() {
        System.out.printf("Greetings, my name is %s %n", this.name);
    }

    // Constructor //
    public Person(String name) {
        this.name = name;

    }
}
