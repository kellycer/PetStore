public class Horse extends Veterinary{
    private String disease;
    private String specie;

    public Horse() {
    }

    public Horse(String disease, String specie) {
        this.disease = disease;
        this.specie = specie;
    }

    public Horse(String name, int age, double weight, String disease, String specie) {
        super(name, age, weight);
        this.disease = disease;
        this.specie = specie;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public String toString() {
        String texto = "el caballo " + getName() +
                "\n tiene la edad de " + getAge() +
                "\n con peso de " + getWeight();
        return texto;
    }
    public String soy(){

        return "estoy en la veterninaria y soy un caballo";
    }
}
