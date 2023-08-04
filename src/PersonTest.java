public class PersonTest {
    public static void main(String[] args) {

        Person whatEver = new Person("Donald", "Twitty");
        System.out.println(whatEver.getFirstname());
        System.out.println(whatEver.getLastname());

        whatEver.sayHello();

        whatEver.setFirstname("Zephaniah");
        System.out.println(whatEver.getFirstname());

        whatEver.setLastname("Jedi");
        System.out.println(whatEver.getLastname());
    }
}
