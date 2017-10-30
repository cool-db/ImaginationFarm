package imaginationfarm.spirit.item.buildingshape;

import imaginationfarm.abst.printFormat.Printer;

public class Square extends Shape {

	   public Square(){
	     type = "Square";
	   }

	   @Override
	   public void draw() {
//	      System.out.println("Inside Square::draw() method.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "draw "+type);
	   }
	}