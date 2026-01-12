public class Person {
    private String name;
    private int age;
    private PetManager pets;

    public Person(String name, int age, int numberOfPets) {
        this.name = name;
        this.age = age;
        pets = new PetManager(numberOfPets);
    }

    public PetManager getPetManager() {
        return pets;
    }

    public boolean addPet(Pet pet) {
        return pets.addPet(pet); 
    }

    public void setPets(PetManager pets) {
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
