import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Dewayne");
        people[1] = new Person("Jane");
        people[2] = new Person("Joseph");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person[] newPeople = addPerson(people, new Person("Leo"));

        //Incomplete--Finish Code//
        people = addPerson(people, new Person("Leo"));
        for (Person person : people) {
            System.out.println();
        }
    }

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = personToAdd;
        return newPeople;
    }
}
