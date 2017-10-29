package Breakfast;

public class OrderBreakfast {
    public static void orderBreakfast() {
        String[] typeOfBreakfast = {"Bread and milk", "Noodle and chicken soup", "Steamed buns and porridge", "Fried bread stick and soy milk"};
        Kitchen k = Kitchen.getKitchen();
        int[] orders = {4, 2, 3, 1, 3};
        BreakfastBuilder[] builders = {new BreadAndMilk(), new Noodles(), new SteamedBuns(), new FriedBreadStick()};
        System.out.println("=====================Order breakfast=====================");
        System.out.println("1. Bread and milk");
        System.out.println("2. Noodle and chicken soup");
        System.out.println("3. Steamed buns and porridge");
        System.out.println("4. Fried bread stick and soy milk");
        System.out.println("=========================================================");
        String str = new String("Recieved Orders ");
        for(int order : orders){
            str += (order + ", ");
        }
        System.out.println(str);
        System.out.println("------------------Making Breakfast-------------------");
        for(int i : orders) {
            System.out.println();
            k.setBreakfastBuilder(builders[i - 1]);
            k.cook();
            k.getBreakfast();
            System.out.println(typeOfBreakfast[i - 1] + " are served.");
        }
        System.out.println();
        System.out.println("--------------------Order up--------------------");
    }
}
