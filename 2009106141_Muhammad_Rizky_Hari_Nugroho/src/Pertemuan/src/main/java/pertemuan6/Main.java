
package pertemuan6;


public class Main {
    public static void main(String[] args){
        Komputer komputer = new Komputer();
        komputer.klik_kanan();
        komputer.klik_kiri();
        komputer.double_klik();
          Komputer.jenis = "Notebook";
          System.out.println(Komputer.spesifikasi());
          Komputer.upgrade();
          Komputer.jenis = "Laptop";
          System.out.println(Komputer.spesifikasi());
        
    }
}
