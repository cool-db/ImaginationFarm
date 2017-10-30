package imaginationfarm.spirit.item.buildingshape;

import imaginationfarm.abst.printFormat.Printer;

public class Circle extends Shape {

	   public Circle(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
//	      System.out.println("Inside Circle::draw() method.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "draw "+type);
	   }
	}