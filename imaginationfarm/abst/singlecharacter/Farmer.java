package imaginationfarm.abst.singlecharacter;

import imaginationfarm.abst.printFormat.Printer;

public class Farmer extends SingleTonParent {

	//Normal way of singleton
//	private volatile static Farmer farmer = null;
//	
//	private Farmer()  {    }
//    public static Farmer getInstance()   {
//        if (farmer== null)  {
//            synchronized (Farmer.class) {
//                if (farmer== null)  {
//                	farmer= new Farmer();
//                }
//            }
//        }
//        return farmer;
//    }
    enum POSITION{
    	    OUTSIDEFARM,INSIDEFARM,NULL
    }
    public class ManaSystem{
    		private int manageSystemProcess;//Measured by time
    }
	private String name;//Farmer's name
	private String printFormat="Farmer: Farmer: ";
	private POSITION position=POSITION.NULL;
	private ManaSystem manageSystem = new ManaSystem();
	
	public int codingForManaSystem(int time) {
		manageSystem.manageSystemProcess+=time;
//		System.out.println(printFormat+"codingForManaSystem: "+"The farmer has spent "+manageSystem.manageSystemProcess+" hour(s) to build the ManageSystem");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer has spent "+manageSystem.manageSystemProcess+" hour(s) to build the ManageSystem");
		return manageSystem.manageSystemProcess;
	}
	public int getManaSystemProcess() {
//		System.out.println(printFormat+"getManaSystemProcess: "+"The farmer has spent "+manageSystem.manageSystemProcess+" hour(s) to build the ManageSystem");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer has spent "+manageSystem.manageSystemProcess+" hour(s) to build the ManageSystem");
		return manageSystem.manageSystemProcess;
	}
	public void commWithPigGirl(String commContent) {
//		System.out.println(printFormat+"commWithPigGirl: "+"The farmer said "+commContent+" to the pig girl.");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer said "+commContent+" to the pig girl.");
	}
	public void beginMeeting() {
//		System.out.println(printFormat+"beginMeeting: "+"The farmer began a meeting");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer began a meeting");
	}
	public void endMeeting() {
//		System.out.println(printFormat+"beginMeeting: "+"The farmer ended a meeting");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer ended a meeting");
	}
	public void leaveFarm() {
		position=POSITION.OUTSIDEFARM;
//		System.out.println(printFormat+"leaveFarm: "+"The farmer left the farm");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer left the farm");
	}
	public void backToFarm() {
		position=POSITION.INSIDEFARM;
//		System.out.println(printFormat+"backToFarm: "+"The farmer went back to the farm");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer went back to the farm");
	}
	public void playWithPigGirl() {
//		System.out.println(printFormat+"playWithPigGirl: "+"The farmer listened to the pig girl playing piano");
//		System.out.println(printFormat+"playWithPigGirl: "+"The farmer played chess with pig girl");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer listened to the pig girl playing piano");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer played chess with pig girl");
	}
	public void changeName(String name) {
		this.name=name;
//		System.out.println(printFormat+"changeName: "+"The farmer changed name to "+name);
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer changed name to "+name);
	}
	public void haveBirthdayParty() {
		this.age+=1;
//		System.out.println(printFormat+"haveBirthdayParty: "+"The farmer held "+age+"-year-old birthday party.");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The farmer held "+age+"-year-old birthday party.");
	}
	public void evolve_single() {
		this.evolveTime+=1;
//		System.out.println(printFormat+"evolve: "+"evolution "+evolveTime);
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "evolution "+evolveTime);
	}
	

}
