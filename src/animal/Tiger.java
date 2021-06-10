package animal;
import edible.Edible;
public class Tiger extends Animal implements Edible{
    public String makeSound(){
        return "Roar";
    }
    public String howToEat(){
        return "Take bone to make wine";
    }
}
