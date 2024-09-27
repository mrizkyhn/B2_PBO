
package pertemuan6;
        

public class Komputer implements Mouse { 
    public static String jenis;
    public String merk;
    
    public static String spesifikasi(){
        return "Komputer Jenis: "+ jenis;
    }
    public static String upgrade(){
        return "Komputer terupgrade ";
    }

    public void klik_kanan(){
        System.out.println("Mouse klik kanan");
    }
    
    public void klik_kiri(){
        System.out.println("Mouse klik kiri");
    }
    public void double_klik(){
        System.out.println("Mouse double klik ");
    }
}
