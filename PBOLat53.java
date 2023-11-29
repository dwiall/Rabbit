/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Animal {
    String name;
    boolean isVegetarian;
    String eats;
    int numberOfLegs;
    String color;

    void animalInfo() {
        System.out.println("Hello, His name is " + name);
        System.out.println(name + " is Vegetarian? " + isVegetarian);
        System.out.println(name + " eats " + eats);
        System.out.println(name + " " + numberOfLegs + " legs.");
        System.out.println(name + " color is " + color);
    }
}

public class PBOLat53 {
    public static void main(String[] args) {
        Animal peter = new Animal();
        peter.name = "Peter";
        peter.isVegetarian = false;
        peter.eats = "grass";
        peter.numberOfLegs = 4;
        peter.color = "grey";

        peter.animalInfo();
    }
}
