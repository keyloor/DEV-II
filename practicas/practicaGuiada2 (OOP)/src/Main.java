public class Main {
    public static void main(String[] args) {
        //Agregamos una persona
        Person person = new Person("Charlie", 23, 2);
        
        //Agregamos unos pets
        Pet mijaus = new Pet("Mijaus", "Cat");
        Pet mijausJr = new Pet("Mijaus Jr", "Cat");

        //Agregamos el pet
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

        //Reemplazamos un pet
        if(person.updatePet(mijausJr, 0)) {
            IOManager.printMessage("Pet updated successfully.");
        } else {
            IOManager.printMessage("Failed to update pet.");
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