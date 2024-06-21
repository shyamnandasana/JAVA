abstract class Vegetable {
    private String color;
    public Vegetable(String color) {
        this.color = color;
    }
    abstract String getName();
    public String toString() {
        return() + " (Color: " + color + ")";
    }
}
class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }
    String Name() {
        return "Potato";
    }
}
class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }
    String Name() {
        return "Brinjal";
    }
}
class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }
   String getName() {
        return "Tomato";
   }
}public class VegetableDemo {
    public static void main(String[] args) {

        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
