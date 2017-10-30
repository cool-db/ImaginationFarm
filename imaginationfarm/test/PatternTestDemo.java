package imaginationfarm.test;

import imaginationfarm.abst.singlecharacter.*;
import imaginationfarm.spirit.item.buildingshape.*;
import imaginationfarm.spirit.item.cleaner.*;
import imaginationfarm.spirit.activity.exerorder.*;
import imaginationfarm.spirit.item.hairstate.*;
import imaginationfarm.spirit.item.hairstate.Character;
import imaginationfarm.spirit.place.*;
import imaginationfarm.story.game.*;

public class PatternTestDemo {
	private static AbstractCleaner getChainOfCleaner(){

		AbstractCleaner catCleaner = new CatCleaner(AbstractCleaner.CLASSROOM);
		AbstractCleaner dogCleaner = new DogCleaner(AbstractCleaner.MEETINGROOM);

		catCleaner.setNextLogger(dogCleaner);

	    return catCleaner;    
	 }
	public static void main(String[] args) throws Exception {
		
		//test for imaginationfarm.spirit.item.cleaner (ChainPattern)
		  AbstractCleaner cleanerChain = getChainOfCleaner();

		  cleanerChain.cleanSomePlace(AbstractCleaner.MEETINGROOM, 
	         "Cleaning meetingroom.");

		  cleanerChain.cleanSomePlace(AbstractCleaner.PLAYGROUND, 
	         "Cleaning playground.");

		  cleanerChain.cleanSomePlace(AbstractCleaner.CLASSROOM, 
	         "Cleaning classroom.");
		  
		  
		//test for imaginationfarm.spirit.activity.exerorder (CommandPattern)
		  ExerCommand exerCommand = new ExerCommand();

	      GymnasCommand gymnasCommand = new GymnasCommand(exerCommand);
	      BalletCommand balletCommand = new BalletCommand(exerCommand);

	      Broker broker = new Broker();
	      broker.takeOrder(gymnasCommand);
	      broker.takeOrder(balletCommand);

	      broker.placeOrders();
	      
	      
	    //test for imaginationfarm.spirit.item.buildingshape (PrototypePatternDemo)
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      clonedShape.draw();

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      clonedShape2.draw();

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      clonedShape3.draw();
	      
	      
	    //test for imaginationfarm.lib.singlecharacter (SingleTonDemo)
	      Farmer s = (Farmer) Farmer.getInstance(Farmer.class);
	      Farmer s1 = (Farmer) SingleTonParent.getInstance(Farmer.class);
	      Farmer s2 = (Farmer) SingleTonParent.getInstance(Farmer.class);
	      PigGirl pp = (PigGirl) SingleTonParent.getInstance(PigGirl.class);
	      s2.evolve();
	      pp.evolve();
	      pp.evolve();
	      s1.codingForManaSystem(10);
	      s.commWithPigGirl("hi");
		  
		  
	    //test for imaginationfarm.spirit.item.hairstate (StateDemo)
	      Character context = new Character();

	      BaldState baldState = BaldState.getInstance();
	      baldState.doAction(context);

	      ThickHairState thickHairState = ThickHairState.getInstance();
	      thickHairState.doAction(context);
	      
	      WigState wigState = WigState.getInstance();
	      wigState.doAction(context);
	      
	      
	    //test for imaginationfarm.story.game (TemplatePatternDemo)
	      Recreation game = new BoardGame();
	      game.play();
	      game = new BasketballGame();
	      game.play();        
	      
	      
	    //test for imaginationfarm.spirit.place (VisitorDemo)
	      FarmForVisitor farmForVisitor = new FarmForVisitor();
	      farmForVisitor.accept(new FarmVisitor());
		  
	   }
}
