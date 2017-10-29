package imaginationfarm.story.game;

import imaginationfarm.abst.printFormat.Printer;

public class BoardGame extends Recreation {
	@Override
	   void endPlay() {
//	      System.out.println("Board Game Finished!");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Board Game Finished!");
	   }

	   @Override
	   void initialize() {
//	      System.out.println("Board Game Initialized! Start playing.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Board Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
//	      System.out.println("Board Game Started. Enjoy the game!");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Board Game Started. Enjoy the game!");
	   }
}
