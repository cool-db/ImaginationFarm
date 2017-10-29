package imaginationfarm.spirit.cleaner;

import imaginationfarm.abst.printFormat.Printer;

public class CatCleaner extends AbstractCleaner {
	public CatCleaner(int level){
	      this.level = level;
	   }

	   @Override
	   protected void clean(String message) {        
//	      System.out.println("CatCleaner::clean: " + message);
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), message);
	   }
}
