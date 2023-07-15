public class MethodExercise02 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "ywc";
        p.age = 22;

        Mytools m = new Mytools();
        Person1 p2 = m.copyPerson(p);

        System.out.println(p == p2);
    }
}

class Mytools {
    public Person1 copyPerson(Person1 p) {
        Person1 person = new Person1();
        person.name = p.name;
        person.age = p.age;
        return person;
    }
}

class Person1 {
    String name;
    int age;
}