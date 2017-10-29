package imaginationfarm.spirit.visitor;

public class FarmForVisitor implements FarmPart{
	FarmPart[] parts;

	   public FarmForVisitor(){
	      parts = new FarmPart[] {new Dormitory(), new School(), new Canteen(), new Playground()};        
	   } 


	   @Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(farmPartVisitor);
	      }
	      farmPartVisitor.visit(this);
	   }
}
