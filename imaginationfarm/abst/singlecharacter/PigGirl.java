package imaginationfarm.abst.singlecharacter;
import java.util.HashSet;
import java.util.Set;

import imaginationfarm.abst.printFormat.Printer;

public class PigGirl extends SingleTonParent{
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
	private String nickName;
	private String printFormat="PigGirl: PigGirl: ";
	private POSITION position=POSITION.NULL;
	private Set<String> gifts=new HashSet<String>();
	
	public void commWithFarmer(String commContent) {
//		System.out.println(printFormat+"commWithFarmer: "+"The pig girl said "+commContent+" to the pig girl.");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl said "+commContent+" to the pig girl.");
	}
	public void leaveFarm() {
		position=POSITION.OUTSIDEFARM;
//		System.out.println(printFormat+"leaveFarm: "+"The pig girl left the farm");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl left the farm");
	}
	public void backToFarm() {
		position=POSITION.INSIDEFARM;
//		System.out.println(printFormat+"backToFarm: "+"The pig girl went back to the farm");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl went back to the farm");
	}
	public void playWithFarmer() {
//		System.out.println(printFormat+"playWithFarmer: "+"The pig girl played piano");
//		System.out.println(printFormat+"playWithFarmer: "+"The pig girl played chess with the farmer");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl played piano");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl played chess with the farmer");
	}
	public void changeNickName(String name) {
		this.nickName=name;
//		System.out.println(printFormat+"changeName: "+"The pig girl changed name to "+name);
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl changed name to "+name);
	}
	public void haveBirthdayParty() {
		this.age+=1;
//		System.out.println(printFormat+"haveBirthdayParty: "+"The pig girl held "+age+"-year-old birthday party.");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl held "+age+"-year-old birthday party.");
	}
	public void receiveGift(String gift) {
		gifts.add(gift);
//		System.out.print(printFormat+"receiveGift: "+"The pig girl has these gifts: ");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl has these gifts: ");
		for (String str : gifts) {  
		      System.out.print(str);  
		}   
		System.out.println();
	}
	public void actCute() {
//		System.out.print(printFormat+"actCute: "+"The pig girl is acting cute");
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "The pig girl is acting cute");
	}
	public void evolve_single() {
		this.evolveTime+=1;
//		System.out.println(printFormat+"evolve: "+"evolution "+evolveTime);
		Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "evolution "+evolveTime);
	}
	
}
