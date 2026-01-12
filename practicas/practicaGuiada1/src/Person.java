public class Person {
    private String name;
    private int age;
    private Pet[] pets;

    public Person(String name, int age, int numberOfPets) {
        this.name = name;
        this.age = age;
        pets = new Pet[numberOfPets];
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    
}
