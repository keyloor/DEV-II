public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, int numberOfPets) {
        this.name = name;
        this.age = age;
        petManager = new PetManager(numberOfPets);
    }

    public PetManager getPetManager() {
        return petManager;
    }

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet); 
    }

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

    public Pet[] getPets() {
        return petManager.getPets();
    }


    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
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
