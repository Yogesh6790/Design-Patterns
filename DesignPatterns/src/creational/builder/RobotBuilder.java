package creational.builder;

public interface RobotBuilder {
	
	public void makeHead(String head);
	
	public void makeLegs(String legs);
	
	public Robot build();

}
