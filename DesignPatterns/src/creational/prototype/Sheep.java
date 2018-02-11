package creational.prototype;

public class Sheep implements Animal {
	
	private String type;
	
	Sheep(){
		type = "Huge";
		System.out.println("Sheep object is created");
	}

	@Override
	public Animal makeCopy() {
		Sheep sheepObject  = null;
		try {
			sheepObject = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheepObject;
	}
	
    public String toString(){
        return "This is a sheep Object";
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
