package imaginationfarm.spirit.visitor;

import imaginationfarm.abst.printFormat.Printer;

public class FarmVisitor implements FarmPartVisitor{
	   @Override
	   public void visit(Dormitory dormitory) {
//	      System.out.println("Visiting Dormitory.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Visiting Dormitory.");
	   }

	   @Override
	   public void visit(Playground playground) {
//	      System.out.println("Visiting Playground.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Visiting Playground.");
	   }

	   @Override
	   public void visit(Canteen canteen) {
//	      System.out.println("Visiting Canteen.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Visiting Canteen.");
	   }

	   @Override
	   public void visit(School school) {
//	      System.out.println("Visiting School.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Visiting School.");
	   }

	   @Override
	   public void visit(FarmForVisitor farmForVisitor) {
//		   System.out.println("Visiting Farm.");
		   Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Visiting Farm.");
		
	   }
}
