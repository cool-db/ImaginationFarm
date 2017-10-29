package imaginationfarm.story.game;

import imaginationfarm.abst.printFormat.Printer;

public class BasketballGame extends Recreation{
	   @Override
	   void endPlay() {
//	      System.out.println("Basketball Game Finished!");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Basketball Game Finished!");
	   }

	   @Override
	   void initialize() {
//	      System.out.println("Basketball Game Initialized! Start playing.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Basketball Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
//	      System.out.println("Basketball Game Started. Enjoy the game!");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Basketball Game Started. Enjoy the game!");
	   }
}
