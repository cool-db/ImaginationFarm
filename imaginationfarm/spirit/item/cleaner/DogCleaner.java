package imaginationfarm.spirit.item.cleaner;

import imaginationfarm.abst.printFormat.Printer;

public class DogCleaner extends AbstractCleaner {
	public DogCleaner(int level){
	      this.level = level;
	   }

	   @Override
	   protected void clean(String message) {        
//	      System.out.println("DogCleaner::clean: " + message);
		   Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), message);
	   }
}
