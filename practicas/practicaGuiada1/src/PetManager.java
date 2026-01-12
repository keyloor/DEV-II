public class PetManager {
    //Contador
    private int size;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        pets = new Pet[numberOfPets];
    }

    public Pet[] getPets() {
        return pets;
    }

    public boolean addPet(Pet pet) {
        //Iteramos el arreglo en busca de un slot vacio
        for (int i = 0; i < pets.length; i++) {
            //Lo encontramos
            if(pets[i] == null) {
                //Asignamos el pet y aumentamos el size
                pets[i] = pet;
                size++;
                return true;
            }
        }
        //Si no se encontro el slot
        return false;
    }

    

}
