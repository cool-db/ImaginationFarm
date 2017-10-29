package imaginationfarm.abst.singlecharacter;

import java.util.HashMap;
import java.util.Map;

import imaginationfarm.abst.printFormat.Printer;

interface evolveInter{
	void evolve_single();
}

//SingleTonParent is the base class of all the singleton classes
public class SingleTonParent implements evolveInter{
	
	public enum GENDER{
		MALE,FEMALE,NULL
	}
	
	public class Birthday{
		public int year;
		public int month;
		public int day;
		public String getBirthday() {
			return year+":"+month+":"+day;
		}
		public String setBirthday(int year,int month,int day) {
			this.year=year;
			this.month=month;
			this.day=day;
					
			return year+":"+month+":"+day;
		}
	};
	//time of getting up, sleeping, having lunch and having dinner
	public class TimeTable{
		public String getUpTime="7:00";
		public String lunchTime="12:00";
		public String dinnerTime="17:00";
		public String sleepTime="22:00";
	}
	
	protected int age;
	protected GENDER gende = GENDER.NULL;
	protected Birthday birthday = new Birthday();
	protected TimeTable timeTable = new TimeTable();
	protected int evolveTime;
	private String printFormat="SingleTonParent: SingleTonParent: ";
	
	//Observer pattern
	public void notifyAllObservers(){
	    for (SingleTonParent observer : INSTANCES_MAP.values()) {
	       (observer).evolve_single();
	    }
//	    System.out.println(printFormat+"evolve: "+"evolution "+evolveTime);
	    Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "evolution "+evolveTime);
	}  
	
    public void evolve() {
    		notifyAllObservers();
	}

	private static Map<Class<? extends SingleTonParent>, SingleTonParent> INSTANCES_MAP = new HashMap<>();

	//every singleton call this method to create and get the unique instance
    public static <E extends SingleTonParent> SingleTonParent getInstance(Class<E> instanceClass) throws Exception {
        if(INSTANCES_MAP.containsKey(instanceClass)){
            return INSTANCES_MAP.get(instanceClass);
        } else {
        		synchronized (SingleTonParent.class) {
        			if(INSTANCES_MAP.containsKey(instanceClass)){
        				return INSTANCES_MAP.get(instanceClass);
        			}
	            E instance = instanceClass.newInstance();
	            INSTANCES_MAP.put(instanceClass, instance);
	            return instance;
        		}
        }
    }

    //default constructor
    protected SingleTonParent(){
    }

	@Override
	public void evolve_single() {
		// TODO Auto-generated method stub
		
	}
    
}