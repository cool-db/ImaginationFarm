package imaginationfarm.spirit.hairstate;

import imaginationfarm.abst.printFormat.Printer;

//Character has the thick hair
public class ThickHairState implements State {
	private volatile static ThickHairState thickHairState = null;
	private ThickHairState()  { }
	public static ThickHairState getInstance()   {
		if (thickHairState== null)  {
          synchronized (ThickHairState.class) {
              if (thickHairState== null)  {
            	  thickHairState= new ThickHairState();
              }
          }
      }
      return thickHairState;
	}
	public void doAction(Character character) {
//	      System.out.println("Player is in thick hair state");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Player is in thick hair state");
	      character.setState(this);    
	   }

	   public String toString(){
	      return "Thick hair state";
	   }
}
