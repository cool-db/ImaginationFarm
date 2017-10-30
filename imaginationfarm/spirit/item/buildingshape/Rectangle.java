package imaginationfarm.spirit.item.buildingshape;

import imaginationfarm.abst.printFormat.Printer;

public class Rectangle extends Shape {

	   public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
//	      System.out.println("Inside Rectangle::draw() method.");
	      Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "draw "+type);
	   }
	}
