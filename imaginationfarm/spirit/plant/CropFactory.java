package imaginationfarm.spirit.plant;
import java.util.HashMap;

public class CropFactory {
    private static final HashMap<String, Crop> wheatMap = new HashMap<>();

    public static Crop getWheat(String strain) {
        Wheat wheat = (Wheat) wheatMap.get(strain);

        if(wheat == null) {
            wheat = new Wheat(strain);
            wheatMap.put(strain, wheat);
            System.out.println("Planting wheat of strain : " + strain);
        }
        return wheat;
    }
}