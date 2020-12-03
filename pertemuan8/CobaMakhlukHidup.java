public class CobaMakhlukHidup 
{          
	/**      
	 * Method main untuk mencoba kelas makhluk hidup, Manusia dan Hewan      
	 */     

	public static void main (String args[])     
	{         
		Manusia mnsia = new Manusia();         
		Hewan hwan = new Hewan();                  

		mnsia.bernapas();         
		mnsia.makan();         
		mnsia.berjalan();                  

		hwan.bernapas();         
		hwan.makan();         
		hwan.berjalan();     
	} 
} 