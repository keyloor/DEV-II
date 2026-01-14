public class PetManager {
    //Contador
    private int size;
    private static Pet[] pets;

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

    //Cuando se obtienen los pets solo se obtiene un array sin nulls
    public Pet[] getPets() {
        Pet[] pets = new Pet[this.size];

        for(int i = 0; i < this.size; i++) {
            pets[i] = this.pets[i];
        }

        return pets;
    }

    //Se encarga de hacer crecer el arreglo de pets
    public static void grow(){
        //Se crea un nuevo tamaño con el doble del original
        int newLen = pets.length * 2;

        //Se crea el array temporal con el nuevo tamaño
        Pet[] sizedPets = new Pet[newLen];
        
        //Se itera el array original para ponerle los valores al nuevo
        for(int i = 0; i < pets.length; i++){
            sizedPets[i] = pets[i];
        }
        
        //El viejo pasa a ser el nuevo, mismos valores distinto tamaño
        pets = sizedPets;
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

    public boolean updatePet(Pet pet, int index) {
        //Se revisa el pet y el indice
        if(pet != null && index >= 0 && index < size) {
            //Se reemplaza el pet
            pets[index] = pet;
            return true;
        }

        return false;
    }

    

}
