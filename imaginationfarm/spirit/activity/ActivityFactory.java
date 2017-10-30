package imaginationfarm.spirit.activity;

import imaginationfarm.spirit.item.breakfirst.Meal;

import java.util.HashMap;

public class ActivityFactory {
    private static final HashMap<String, Activity> activityMap = new HashMap<>();
    public Activity getActivity(String name) {
        Activity activity = (Activity) activityMap.get(name);
        if (activity != null) return activity;
        switch (name.toLowerCase()) {
            case "party":
                activityMap.put("party", new Party());
                break;
            case "breakfast":
                activityMap.put("breakfast", new BreakFast());
                break;
            default:
                return null;
        }
        return (Activity) activityMap.get(name);
    }
}