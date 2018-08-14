public class MainBuilder implements PersonBuilder {

    private Person person;

    public MainBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("构造头部");
    }

    @Override
    public void buildBody() {
        person.setBody("构造身体");
    }

    @Override
    public void buildFoot() {
       person.setFoot("构造脚部");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
