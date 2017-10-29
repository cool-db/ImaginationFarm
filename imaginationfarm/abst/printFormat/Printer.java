package imaginationfarm.abst.printFormat;

public class Printer {
	private volatile static Printer printer = null;
	
	private Printer()  {    }
    public static Printer getInstance()   {
        if (printer== null)  {
            synchronized (Printer.class) {
                if (printer== null)  {
                	printer= new Printer();
                }
            }
        }
        return printer;
    }
    
    public void print(String classname,String methodname,String actiondesc) {
		System.out.println(classname+": "+methodname+": "+actiondesc);
	}
}
