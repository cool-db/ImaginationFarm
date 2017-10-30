package imaginationfarm.spirit.activity.exerorder;

public class BalletCommand implements Order{
	private ExerCommand exerCommand;

	public BalletCommand(ExerCommand exerCommand){
		this.exerCommand = exerCommand;
	}

	public void execute() {
		exerCommand.ballet();
	}
}
