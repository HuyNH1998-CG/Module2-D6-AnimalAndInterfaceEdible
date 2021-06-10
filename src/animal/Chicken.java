package animal;
import edible.Edible;
public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Quark";
    }
    public String howToEat(){
        return "Fried or Grilled or Boiled";
    }
}
