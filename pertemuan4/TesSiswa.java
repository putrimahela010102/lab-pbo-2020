public class TesSiswa 
{     
	public static void main(String[] ar)     
	{         
		Siswa s = new Siswa(12345);                  
		
		System.out.println(s.getNrp());                 

		s.setNrp(8030001);         

		System.out.println(s.getNrp());     
	} 
} 