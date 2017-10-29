package imaginationfarm.spirit.exerorder;

import imaginationfarm.abst.printFormat.Printer;

public class ExerCommand {
	private String name = "exercise command";
	private int section = 0;

    public void gymnastics(){
//	  System.out.println("ExerCommand [ Name: "+name+",Section: " + ++section +" ] gymnastics");
	  Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "[ Name: "+name+", Section: " +section +" ] gymnastics");
	}
	public void ballet(){
//	   System.out.println("ExerCommand [ Name: "+name+", Section: " + ++section +" ] ballet");
	   Printer.getInstance().print(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), "[ Name: "+name+", Section: " +section +" ] ballet");
	}	
}
