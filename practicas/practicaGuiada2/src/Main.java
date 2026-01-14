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
        
        //Agregamos unos pets
        Pet mijaus = new Pet("Mijaus", "Cat");
        Pet mijausJr = new Pet("Mijaus Jr", "Cat");

        if(person.addPet(mijaus)) {
            IOManager.printMessage("Pet addded successfully.");
        } else {
            IOManager.printMessage("Failed to add pet.");
        }

        if(person.addPet(mijausJr)) {
            IOManager.printMessage("Pet addded successfully.");
        } else {
            IOManager.printMessage("Failed to add pet.");
        }

        //Quitamos un pet
        if(person.removePet(mijausJr)) {
            IOManager.printMessage("Pet removed successfully.");
        } else {
            IOManager.printMessage("Failed to remove pet.");
        }
        
        //Mostrar los pets
        IOManager.printMessage("\nPets: ");

        if(person.getPets().length == 0) {
            IOManager.printMessage("No pets found.");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());  
            }
        }
        
        
        

        

        
        



        
        



    }
}