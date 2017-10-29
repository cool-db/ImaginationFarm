public class CompositePatternDemo {
    //Composite Pattern
    public static void main(String[] args) {
        Fowl King = new Fowl("Eggsy","Fowl King", 5, 200);

        Fowl leftGuard = new Fowl("Roxanne","Left Guard", 10, 20000);

        Fowl rightGuard = new Fowl("Charles","Right Guard", 12, 20000);

        Fowl kingsman1 = new Fowl("Harry","Kingsman", 20, 10000);
        Fowl kingsman2 = new Fowl("Merlin","Kingsman", 18, 10000);

        Fowl loser1 = new Fowl("Dean","Loser", 30, 10000);
        Fowl loser2 = new Fowl("Chester","Loser", 35, 10000);

        King.add(leftGuard);
        King.add(rightGuard);

        leftGuard.add(loser1);
        leftGuard.add(loser2);

        rightGuard.add(kingsman1);
        rightGuard.add(kingsman2);

        //Print the info of all Kingsmans and Losers
        System.out.println(King);
        for (Fowl headFowl : King.getSubordinates()) {
            System.out.println(headFowl);
            for (Fowl fowl : headFowl.getSubordinates()) {
                System.out.println(fowl);
            }
        }
    }
}