
/**
 *Asal sayı bulma
 * @author soyka
 */
public class NewClass11 {
    public static void main(String[] args) {
        int sayi= 3;
        boolean asal = true ;//başlangıçta true kabul ettik
        for (int k=2 ;k<sayi  ; k++) {
            if(sayi% k ==0 ){
              asal=false ;
            //break;//  asal sayı değil döngüden çık}
                   }
            if (asal){
                System.out.print(sayi+ " Asal");
                
            }else {
                System.out.print(sayi +" Asal Değil ");
            }
                
           
        }
    }

  