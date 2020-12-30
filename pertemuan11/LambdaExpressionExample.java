interface Drawable{       
	public void draw();   
}   
 
public class LambdaExpressionExample {  
	public static void main(String[] args) {           
		int width=10;              

		//tanpa adanya lambda expression,   
		//implementasi Drawable menggunakan anonymous inner class 
 
   	 	Drawable d=new Drawable(){               
    		public void draw(){     
    			System.out.println("Drawing "+width);    
    		}           
    	};           
    	d.draw();       
    }   
}