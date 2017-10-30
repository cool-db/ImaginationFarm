package imaginationfarm.story.chooseOutfits;

import imaginationfarm.spirit.item.cloths.ClothBuilder;
import imaginationfarm.spirit.item.cloths.*;

public class ChoosOutfits {
    public static void chooseOutfits() {
        String[] typeOfOufits = {"Suit", "Dress", "Bikini", "Nightwear"};
        int[] orders = {3, 4, 1, 2};
        ClothBuilder[] builders = {new Suit(), new Dress(), new Bikini(), new Nightwear()};
        Wardrobe w = Wardrobe.getInstance();
        System.out.println("=====================Today wear=====================");
        System.out.println("1. Suit");
        System.out.println("2. Dress");
        System.out.println("3. Bikini");
        System.out.println("4. Nightwear");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println("------------------Matching Outfits-------------------");
        for(int i : orders) {
            System.out.println();
            w.setcBuilder(builders[i - 1]);
            w.wear();
            w.getCloth();
            System.out.println("She's not satisfied and took it off.");
        }
        System.out.println();
        System.out.println("Finally, she decided to turn to pig.");
        System.out.println();
        System.out.println("--------------------Make up--------------------");
    }
}
