package imaginationfarm.application;

import imaginationfarm.abst.interpret.BinaryExpression;
import imaginationfarm.abst.interpret.NumberExpression;
import imaginationfarm.abst.interpret.OpExpressionEnum;
import imaginationfarm.abst.logger.Logger;
import imaginationfarm.abst.mediator.ConcreteMediator;
import imaginationfarm.spirit.activity.ActivityFactory;
import imaginationfarm.spirit.activity.BreakFast;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.charactor.SuColleague;
import imaginationfarm.spirit.charactor.SuperVisor;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.item.Crisper;
import imaginationfarm.spirit.item.Refrigerator;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.item.cakes.Cake;
import imaginationfarm.spirit.item.cloths.Suit;
import imaginationfarm.spirit.item.cloths.Wardrobe;
import imaginationfarm.spirit.place.FarmForVisitor;
import imaginationfarm.spirit.place.FarmVisitor;
import imaginationfarm.story.action.CheckStateAction;
import imaginationfarm.story.action.VisitAction;
import imaginationfarm.story.bakeCake.BakeCake;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class StoryTwo {
    private ArrayList<ChineseZodiac> getAnimalList(AnimalFactory af) {
        ArrayList<ChineseZodiac> cz = new ArrayList<>();
        String names[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};
        for (String name : names) {
            cz.add((ChineseZodiac) af.getAnimal(name));
        }
        return cz;
    }


    @Test
    public void partyTest() {
        Logger.i("A new day is coming.");

        AnimalFactory animalFactory = new AnimalFactory();
        ArrayList<ChineseZodiac> czArrList = getAnimalList(animalFactory);
        Rooster rooster = (Rooster) animalFactory.getAnimal("rooster");

        FarmForVisitor farm = new FarmForVisitor();
        ActivityFactory acf = new ActivityFactory();


        rooster.crow(czArrList);


        Meal breakfast = new Meal();
        BakeCake cakes = new BakeCake();
        cakes.bakeCake();
        for (Cake cake : cakes.getCakes()) {
            breakfast.addItem(cake);
        }

        BreakFast bfa = (BreakFast) acf.getActivity("breakfast");
        bfa.setMeal(breakfast);
        bfa.play();

        Crisper breakfastCrisper = new Crisper(breakfast);
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addCrisper(breakfastCrisper);


        Logger.i("We will have a big party tonight.");

        Wardrobe wardrobe = Wardrobe.getInstance();
        wardrobe.setcBuilder(new Suit());


        ConcreteMediator chatRoom = new ConcreteMediator();
        Farmer farmer = new Farmer(chatRoom, wardrobe);
        SuColleague suColleague = new SuColleague(chatRoom);
        SuperVisor superVisor = new SuperVisor("Tiger", suColleague);

        chatRoom.init(farmer, suColleague);

        farmer.contact("Tiger, you're in charge of the party.");
        superVisor.contact("OK, I'll make it.");

        superVisor.addSuperVisor(czArrList.get(2));


        FarmVisitor fvFarmer = new FarmVisitor();
        fvFarmer.setSubject(farmer.getClass().getSimpleName());
        fvFarmer.visit(farm.getPlayground());


        for (ChineseZodiac cz : czArrList) {
            superVisor.addObserver(cz);
        }

        superVisor.announce("The farmer has left.");
        superVisor.announce(new VisitAction(farm.getPlayground()));
        farmer.breedAnimal(rooster);


        Tiger tiger = (Tiger) czArrList.get(2);
        Dragon dragon = (Dragon) czArrList.get(4);
        Snake snake = (Snake) czArrList.get(5);

        tiger.getCr().addNextNotifier(dragon);
        dragon.getCr().addNextNotifier(snake);
        tiger.getCr().notify("Go and fetch the cakes.");


        tiger.addSubordinates(dragon);
        dragon.addSubordinates(snake);


        VisitAction partyOrder = new VisitAction(farm.getCanteen(), "fetch cakes");
        tiger.getSubordinates().forEach(item -> item.takeOrder(partyOrder));

        FarmVisitor fvSuperVisor = new FarmVisitor();
        fvSuperVisor.setSubject(tiger.getClass().getSimpleName());
        fvSuperVisor.visit(farm.getCanteen());

        tiger.getSubordinates().forEach(ChineseZodiac::placeOrders);

        tiger.sleep();

        CheckStateAction csa = new CheckStateAction(snake, tiger);
        dragon.takeOrder(csa);
        dragon.placeOrders();

        FarmVisitor fvGoat = new FarmVisitor();
        fvGoat.setSubject(snake.getClass().getSimpleName());
        fvGoat.visit(farm.getCanteen());

        Meal snacks = refrigerator.getCrisper(0).getMeal();
        snacks.showItems();


        OpExpressionEnum plus = OpExpressionEnum.PlusExpression;
        int result = new BinaryExpression(new NumberExpression(7), plus, new NumberExpression(3)).interpret();
        Logger.i("It is " + result + " pm now. The party is over.");
    }
}
