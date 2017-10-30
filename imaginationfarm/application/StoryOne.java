package imaginationfarm.application;

import imaginationfarm.abst.cake.Cake;
import imaginationfarm.abst.interpret.BinaryExpression;
import imaginationfarm.abst.interpret.NumberExpression;
import imaginationfarm.abst.interpret.OpExpressionEnum;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.charactor.SuperVisor;
import imaginationfarm.spirit.cloths.Suit;
import imaginationfarm.spirit.cloths.Wardrobe;
import imaginationfarm.spirit.creature.animal.AnimalFactory;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;
import imaginationfarm.spirit.item.Crisper;
import imaginationfarm.spirit.item.Refrigerator;
import imaginationfarm.spirit.item.breakfirst.Meal;
import imaginationfarm.spirit.visitor.FarmForVisitor;
import imaginationfarm.spirit.visitor.FarmVisitor;
import imaginationfarm.story.action.CheckStateAction;
import imaginationfarm.story.action.VisitAction;
import imaginationfarm.story.bakeCake.BakeCake;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by xueyingchen on 2017/10/30.
 */

public class StoryOne {

    private ArrayList<ChineseZodiac> getAnimalList(AnimalFactory af) {
        ArrayList<ChineseZodiac> cz = new ArrayList<>();
        String names[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};
        for (String name : names) {
            cz.add((ChineseZodiac) af.getAnimal(name));
        }
        return cz;
    }


    @Test
    public void test() {
        FarmForVisitor farm = new FarmForVisitor();

        AnimalFactory af = new AnimalFactory();
        Rooster rooster = (Rooster) af.getAnimal("rooster");

        ArrayList<ChineseZodiac> czArrList = getAnimalList(af);

        Wardrobe wardrobe = Wardrobe.getInstance();
        wardrobe.setcBuilder(new Suit());

        rooster.crow(czArrList);

        Farmer farmer = new Farmer(wardrobe);
        farmer.wear();

        SuperVisor superVisor = new SuperVisor("pig");
        superVisor.addSuperVisor(new Pig());

        FarmVisitor farmVisitor = new FarmVisitor();
        farmVisitor.setSubject(farmer.getClass().getSimpleName());
        farmVisitor.visit(farm.getCanteen());

        for (ChineseZodiac cz : czArrList) {
            superVisor.addObserver(cz);
        }

        superVisor.announce("The farmer has left.");
        superVisor.announce(new VisitAction(farm.getCanteen()));

        Meal breakfast = new Meal();
        BakeCake cakes = new BakeCake();
        cakes.bakeCake();
        for (Cake cake: cakes.getCakes()) {
            breakfast.addItem(cake);
        }
        Crisper breakfastCrisper = new Crisper(breakfast);
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addCrisper(breakfastCrisper);
        breakfastCrisper.getMeal().showItems();

        OpExpressionEnum plus = OpExpressionEnum.PlusExpression;
        int result = new BinaryExpression(new NumberExpression(8), plus, new NumberExpression(2)).interpret();
        System.out.println("Two hours later, the time is " + result + " am");

        Monkey monkey = (Monkey) czArrList.get(8);
        Goat goat = (Goat) czArrList.get(7);

        CheckStateAction csa = new CheckStateAction(superVisor.getSuperVisor(), monkey);

        goat.takeOrder(csa);
        goat.placeOrders();

    }
}
