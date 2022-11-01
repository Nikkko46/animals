public class Animal {

    private String type;
    private Integer age;
    private double length;
    private String species;

    public String getType(String type) {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String sayAnimalType() {
        return "This is a " + this.type + ". It has a life expectancy of " + this.age + " years, being " + this.length + " m long" + " and it's a " + this.species + ".";
        }
}
