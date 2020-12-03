import java.util.ArrayList;
import java.util.*; 
/**
 * Write a description of class Bus here.
 *
 * @author (Putri Mahela)
 * (1908107010007)
 */
public class Bus  
{
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    private ArrayList<Penumpang> semuaPenumpang; 
    Scanner input = new Scanner (System.in);
    
    public Bus()
    {
        penumpangBiasa = new ArrayList<Penumpang >();
        penumpangPrioritas = new ArrayList<Penumpang>();
        semuaPenumpang = new ArrayList<Penumpang>();
    }
    
    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        for(Penumpang penumpang : penumpangBiasa)
        {
            penumpang.getNama();
        }
        return penumpangBiasa;
    }
    
    public int getJumlahPenumpangBiasa()
    {
        int jmlh = penumpangBiasa.size();
        System.out.println("Jumlah Penumpang Biasa : " +jmlh);
        return jmlh; 
    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas()
    {
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangPrioritas()
    {
        int jumlah = penumpangPrioritas.size();
        System.out.println("Jumlah Penumpang Prioritas : " +jumlah);
        return jumlah; 
    }
    
    public int getJumlahSemuaPenumpang()
    {
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }
    
    public boolean naik(Penumpang penumpang)
    {
        if((penumpangPrioritas.size() < 1) && (penumpang.getUmur()<10 || penumpang.getUmur() > 60) || (penumpang.getHamil() == true))
        { 
            System.out.println("Penumpang Prioritas Bernama " +penumpang.getNama()+ " BERHASIL Ditambahkan");
            return penumpangPrioritas.add(penumpang); 
        }
        else if(penumpangBiasa.size() < 5)
        {
            System.out.println("Penumpang Biasa Bernama " +penumpang.getNama()+ " BERHASIL Ditambahkan");
            return penumpangBiasa.add(penumpang);
        }
        else
        {
            System.out.println("Penumpang Bernama " +penumpang.getNama()+ " GAGAL Ditambahkan Karena Tidak Ada Kursi Kosong");
            return false;
        }
    }
    
    public boolean turun(String nama)
    {
        for(int i=0; i < penumpangBiasa.size(); i++)
        {
            if(nama.equals(penumpangBiasa.get(i).getNama()))
            {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Biasa Bernama : " +nama+ "Berhasil Diturunkan");
                return penumpangBiasa.equals(nama);
            }
        }
        for(int j=0; j < penumpangPrioritas.size(); j++)
        {
            if(nama.equals(penumpangPrioritas.get(j).getNama()))
            {
                penumpangPrioritas.remove(j);
                System.out.println("Penumpang Prioritas Bernama : " +nama+ "Berhasil Diturunkan");
                return penumpangPrioritas.equals(nama);
            }
        }
        for(int k = 0; k <semuaPenumpang.size(); k++)
        {
            if((nama != (penumpangPrioritas.get(k).getNama()) || (nama != penumpangBiasa.get(k).getNama())))
            {
                System.out.println("Tidak Ada Penumpang Yang Dimaksud");
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }
    
    public ArrayList<Penumpang> semuaPenumpang()
    {
        semuaPenumpang = penumpangBiasa;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.println("Semua Penumpang : ");
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }
        return semuaPenumpang;
    } 
    
    public String toString()
    {
        String result1 = " ";
        String result2 = " ";
        System.out.println("");
        for(Penumpang penumpang : penumpangBiasa)
        {
            result1 += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : penumpangPrioritas)
        {
            result2 += penumpang.getNama().toString();
        }
        if(penumpangBiasa.isEmpty() == true)
        {
            System.out.println("Daftar Nama Penumpang Biasa = KOSONG");
        }
        else
        {
            System.out.println("Daftar Nama Penumpang Biasa = " +result1);
        }
        if(penumpangPrioritas.isEmpty() == true)
        {
            System.out.println("Daftar Nama Penumpang Prioritas = KOSONG");
        }
        else
        {
            System.out.println("Daftar Nama Penumpang Prioritas = " +result2);
        }
        System.out.println("Jumlah Semua Penumpang = " +getJumlahSemuaPenumpang());
        return "daftar1 nama penumpang biasa = " +result1+ "daftar1 nama penumpang prioritas = " +result2+ "jmlh semua penumpang = " +getJumlahSemuaPenumpang()+ "\n";
    }
}
