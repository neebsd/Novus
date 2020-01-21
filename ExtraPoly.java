class DevOps{
	public void description() {
		System.out.println("DevOps deals with both development and testing");
	}
}

class Automation extends DevOps{
	public void description() {
		System.out.println("Automation deals with testing");
	}
}

class Software extends DevOps{
	public void description() {
		System.out.println("Software deals with development");
	}
}

public class ExtraPoly {
	public static void main(String[] args) {
		DevOps a = new DevOps();
		DevOps b = new Automation();
		DevOps c = new Software();
		
		a.description();
		b.description();
		c.description();
	}
}