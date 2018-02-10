package creational.builder;

public class RobotBuilderClass implements RobotBuilder{
	
	private Robot robot;
	
	RobotBuilderClass(){
		robot = new Robot();
	}

	@Override
	public void makeHead(String head) {
		robot.buildHead(head);
	}

	@Override
	public void makeLegs(String legs) {
		robot.buildLegs(legs);
	}

	@Override
	public Robot build() {
		return this.robot;
	}

}
