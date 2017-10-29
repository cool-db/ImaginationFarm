package imaginationfarm.spirit.exerorder;

public class GymnasCommand implements Order {
	private ExerCommand exerCommand;

	   public GymnasCommand(ExerCommand exerCommand){
	      this.exerCommand = exerCommand;
	   }

	   public void execute() {
		   exerCommand.gymnastics();
	   }
}
