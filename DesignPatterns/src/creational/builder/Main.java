package creational.builder;

/**
 * 
 * Complex Objects are built using simple objects.
 * Creation of these simple objects is independent of the main object.
 * RobotEngineer --> RobotBuilder --> Robot
 *
 */
public class Main {

	public static void main(String[] args) {
		RobotBuilder builder = new RobotBuilderClass();
		RobotEngineer engineer = new RobotEngineer(builder);
		engineer.makeRobot("Metal head", "Iron Legs");
		Robot robot = engineer.getRobot();
		System.out.println("Head : "+robot.getHead());
		System.out.println("Legs : "+robot.getLegs());
	}

}
