public class AnimalType {

    public static void main(String[] args) {
         Animal animal1 = new Animal();
         animal1.setType("Gecko");
         animal1.setAge(15);
         animal1.setLength(0.1);
         animal1.setSpecies("Reptile");

         System.out.println(animal1.sayAnimalType());

         Animal animal2 = new Animal();
         animal2.setType("Cat");
         animal2.setAge(12);
         animal2.setLength(0.5);
         animal2.setSpecies("Mammal");

         System.out.println(animal2.sayAnimalType());

         Animal animal3 = new Animal();
         animal3.setType("Dog");
         animal3.setAge(15);
         animal3.setLength(1);
         animal3.setSpecies("Mammal");

         System.out.println(animal3.sayAnimalType());

         Animal animal4 = new Animal();
         animal4.setType("Salmon");
         animal4.setAge(4);
         animal4.setLength(1);
         animal4.setSpecies("Fish");

         System.out.println(animal4.sayAnimalType());

         Animal animal5 = new Animal();
         animal5.setType("Parrot");
         animal5.setAge(50);
         animal5.setLength(1);
         animal5.setSpecies("Bird");

         System.out.println(animal5.sayAnimalType());


    }
}
