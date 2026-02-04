public class Pet {
    private String petName;
    private String type;

    public Pet(String petName, String type) {
        this.petName = petName;
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }
    
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}

