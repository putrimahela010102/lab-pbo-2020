interface Sayable{       
	void say();   
}   

public class InstanceMethodReference {       
	public void saySomething(){           
		System.out.println("Hello, this is non-static method.");       
	}       
	public static void main(String[] args) {     
		// Creating object           
		InstanceMethodReference methodReference = new InstanceMethodReference();             

		// Referring non-static method using reference           
		Sayable sayable = methodReference::saySomething;              

		// Calling interface method           
		sayable.say();              

		// Referring non-static method using anonymous object           
		Sayable sayable2 = new InstanceMethodReference()::saySomething; 

		// Calling interface method     
		sayable2.say();       
	}   
}