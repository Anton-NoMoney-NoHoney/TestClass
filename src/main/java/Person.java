public class Person {

    String firstName;
    String lastName;
    Integer age;

    public Person(){
    }

    public Person(String firstName, String lastName, Integer age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }


    public String myNameIs(){
        String str="my name is "+ firstName+" "+ lastName+ " old age "+age;
        return str;
    }
}
