import java.util.*;   
 
class TestGenerics1{    
	public static void main(String args[]){     
		ArrayList<String> list=new ArrayList<String>();     
		list.add("rani");     
		list.add("rijal");     
		list.add(32);  //compile time error          

		String s=list.get(1); //tidak perlu melakukan casting    
		System.out.println("element is: "+s);          

		Iterator<String> itr=list.iterator();     
		while(itr.hasNext()){      
			System.out.println(itr.next());     
		}    
	}   
}     