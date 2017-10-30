package imaginationfarm.spirit.item.hairstate;

import imaginationfarm.abst.printFormat.Printer;

//wrong way of printing
//Character becomes bald
public class BaldState implements State {
	private volatile static BaldState baldState = null;
	private BaldState()  { }
	public static BaldState getInstance()   {
		if (baldState== null)  {
          synchronized (BaldState.class) {
              if (baldState== null)  {
            	  baldState= new BaldState();
              }
          }
      }
      return baldState;
	}
	public void doAction(Character character) {
//	      System.out.println("Player is in bald state");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Player is in bald state");
	      character.setState(this);    
	   }

	   public String toString(){
	      return "Bald state";
	   }
}
