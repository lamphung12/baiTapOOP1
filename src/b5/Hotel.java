package b5;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Hotel() {
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public void delete(String passport) {
        int inDexOf = search(passport);
        if(inDexOf==-1){
            System.out.println("Ko co id ");
        }else{
            persons.remove(inDexOf);
        }
    }

    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
//        Person person=new Person();
        int inDexOf = search(passport);
        if(inDexOf==-1){
            System.out.println("Ko co id ");
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        for (int i = 0; i < persons.size() ; i++) {
            System.out.println(persons.get(i));
        }
    }
    public int search(String passport){
        for (int i = 0; i < persons.size() ; i++) {
            if(persons.get(i).getPassport().equals(passport)){
                System.out.println(persons.get(i));
            }
        }
        return 0;
    }
}
