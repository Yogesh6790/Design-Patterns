package creational.builder;

public class Robot implements RobotPlan {
	
	private String head;
	
	private String legs;
	

	@Override
	public void buildHead(String head) {
		this.head = head;
	}
	
	public String getHead(){
		return head;
	}

	@Override
	public void buildLegs(String legs) {
		this.legs = legs;
	}
	
	public String getLegs(){
		return legs;
	}

}
