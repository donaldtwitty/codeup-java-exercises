// Object Basics Exercise //
public class Person {
    private String firstname;
    private String lastname;
//    private String sayHello;

    //Getters//
    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    //Setters//
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //Other Method //
    public void sayHello() {
        System.out.printf("Greetings, my name is %s %s %n", this.firstname, this.lastname);
    }

    // Constructor //
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }
}
