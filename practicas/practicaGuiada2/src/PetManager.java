public class PetManager {
    //Contador
    private int size;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        pets = new Pet[numberOfPets];
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

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.size];

        for(int i = 0; i < this.size; i++) {
            pets[i] = this.pets[i];
        }

        return pets;
    }


    public boolean removePet(Pet pet) {
        //Se recorre el array
        for (int i = 0; i < pets.length; i++) {
            //Si el pet es el que buscamos
            if(pets[i] != null && pets[i].equals(pet)) {
                //Se realiza el corrimiento a la izquierda
                for (int j = i; j < pets.length - 1; j++) {
                    //Los pets pasan a reemplazar la posición del que vamos a eliminar
                    pets[j] = pets[j + 1];
                }

                //Borramos el ultimo para que no este duplicado
                pets[pets.length - 1] = null;
                size--;
                return true;
            }
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    

}
