public class Main {
    public static void main(String[] args) {
        // int[] numbers = {10, 20, 30, 40, 50};
        // String[] fruits = new String[3];

        // System.out.println(numbers[2] + " | " + fruits[2]);

        Person person = new Person("Charlie", 23, 2);

        //Sin iterador
        // System.out.println("Sin iterador: ");
        // System.out.println(person.getPets()[0].getPetName());
        // System.out.println(person.getPets()[1].getPetName());
        
        //Agregamos pets
        if(person.addPet(new Pet("Mijaus", "Cat"))) {
            IOManager.printMessage("Pet addded successfully.");
        } else {
            IOManager.printMessage("Failed to add pet.");
        }

        if(person.addPet(new Pet("Mijaus Jr", "Cat"))) {
            IOManager.printMessage("Pet addded successfully.");
        } else {
            IOManager.printMessage("Failed to add pet.");
        }
        
        //Con iterador
        IOManager.printMessage("\nPets: ");
        
        for (Pet pet : person.getPetManager().getPets()) {
            if(pet != null) {
                IOManager.printMessage(pet.getPetName());
            }
        }
        

        

        
        



        
        



    }
}