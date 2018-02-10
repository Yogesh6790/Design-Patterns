package creational.builder;

public class RobotEngineer {
	
	private RobotBuilder builder;
	
	RobotEngineer(RobotBuilder builder){
		this.builder = builder;
	}
	
	public Robot getRobot(){
		return this.builder.build();
	}
	
	public void makeRobot(String head, String legs){
		this.builder.makeHead(head);
		this.builder.makeLegs(legs);
	}
	


}
