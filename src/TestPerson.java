public class TestPerson {

    public static void main(String[] args){
        PersonDirector personDirector = new PersonDirector();

        Person person = personDirector.directorPerson(new MainBuilder());

        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
