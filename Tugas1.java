
import java.util.Scanner;
public class Persegi {
    static {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
      int sisi, luas, keliling;
       
        Scanner O=new Scanner (System.in);
        System.out.print("Masukkan sisinya : ");
        sisi=O.nextInt();
       
        luas=(sisi*sisi);
        System.out.println("Luas dari persegi adalah : "+luas);
       
        keliling=(4*sisi);
        System.out.println("Keliling dari persegi adalah : "+keliling);
    }
}
    }