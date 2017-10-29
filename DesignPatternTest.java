import imaginationfarm.spirit.charactor.ChineseZodiacs;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.CreatureFactory;
import imaginationfarm.spirit.creature.FactoryProducer;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.breakfirst.MealBuilder;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesignPatternTest {

    @Test
    public void Factory() {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.println(animalFactory.getAnimal("rat"));
        System.out.println(animalFactory.getAnimal("rat"));
    }

    @Test
    public void AbstractFactory() {
        CreatureFactory animalFactory = FactoryProducer.getFactory("animal");
        System.out.println(animalFactory.getAnimal("rat"));
        System.out.println(animalFactory.getAnimal("rat"));
    }

    @Test
    public void Singleton() {
        Assert.assertTrue(ChineseZodiac.INSTANCE.getAnimal("rat") == ChineseZodiac.INSTANCE.getAnimal("rat"));
    }

    @Test
    public void Builder() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }

    @Test
    public void Prototype() {

    }

    @Test
    public void Adapter() {

    }

    @Test
    public void Bridge() {

    }

    @Test
    public void Filter() {

    }

    @Test
    public void Composite() {

    }

    @Test
    public void Decorator() {

    }

    @Test
    public void Facade() {

    }

    @Test
    public void Flyweight() {

    }

    @Test
    public void Proxy() {

    }

    @Test
    public void ChainofResponsibility() {

    }

    @Test
    public void Command() {

    }

    @Test
    public void Interpreter() {

    }

    @Test
    public void Iterator() {

    }

    @Test
    public void Mediator() {

    }

    @Test
    public void Memento() {

    }

    @Test
    public void Observer() {

    }

    @Test
    public void State() {

    }

    @Test
    public void NullObject() {

    }

    @Test
    public void Strategy() {

    }

    @Test
    public void Template() {

    }

    @Test
    public void Visitor() {

    }
}