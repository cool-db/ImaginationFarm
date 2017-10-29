package imaginationfarm.spirit.hairstate;

import imaginationfarm.abst.printFormat.Printer;

//Character wears wig hair
public class WigState implements State {
	private volatile static WigState wigState = null;
	private WigState()  { }
	public static WigState getInstance()   {
		if (wigState== null)  {
          synchronized (WigState.class) {
              if (wigState== null)  {
            	  wigState= new WigState();
              }
          }
      }
      return wigState;
	}
	public void doAction(Character character) {
//	      System.out.println("Player is in wig state");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Player is in wig state");
	      character.setState(this);    
	   }

	   public String toString(){
	      return "Wig state";
	   }
}
