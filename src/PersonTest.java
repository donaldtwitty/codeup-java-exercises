public class PersonTest {
    public static void main(String[] args) {

        Person whatEver = new Person("Donald");
        System.out.println(whatEver.getName());

        whatEver.sayHello();

        whatEver.setName("Zephaniah");
        System.out.println(whatEver.getName());

    }
}
