public class Manajer2 extends Pegawai2 
{  
	private String departemen;    

	public Manajer2(String nama, double gaji, String departemen)  
	{   
		super(nama, gaji);   
		this.departemen = departemen;  
	}    

	public void setDepartemen(String departemen)  
	{   
		this.departemen = departemen;  
	}    

	public String getDepartemen()  
	{   
		return this.departemen;  
	} 
}