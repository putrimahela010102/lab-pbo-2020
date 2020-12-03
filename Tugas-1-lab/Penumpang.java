
/**
 * Write a description of class Penumpang here.
 *
 * @author (Putri Mahela)
 * (1908107010007)
 */
public class Penumpang
{
    // instance variables - replace the example below with your own
    private String nama;
    private int umur;
    private boolean hamil;

    /**
     * Constructor for objects of class Penumpang
     */
    public Penumpang(String nama, int umur, boolean hamil)
    {
        // initialise instance variables
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public int getUmur()
    {
        return this.umur;
    }
    
    public boolean getHamil()
    {
        return this.hamil;
    }

}
