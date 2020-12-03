
/**
 * Write a description of class televisi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class televisi implements kontrolTV
{
    private String merek;
    private boolean hidup;
    private String[] saluran = {"RCTI","SCTV","INDOSIAR","TPI","ANTV","TRANSTV","TRANS7"}; 
    private int volume = 0;
    
    public televisi(String merek)
    {
        this.merek = merek;
    }
    
    public void hidupkan(boolean hidup)
    {
        if(hidup)
        {
            this.hidup = true;
            System.out.println("Televisi dihidupkan");
        }
        
        else
        {
            this.hidup = false;
            System.out.println("televisi dimatikan");
        }
    }
    
}
