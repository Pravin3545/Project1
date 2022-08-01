package upcasting;

public class son extends father {

	public void bike() {
		System.out.println("honda shine");
	}
	
	
	public void car()  // override
	{
		System.out.println("kia seltos");
	}
	
	public void money() //override
	{
		System.out.println("2L");
	}
	
	//public void home() {
	//	System.out.println("2 bhk");
	//}
	
}
