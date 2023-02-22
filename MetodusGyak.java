package metodusgyak;


public class MetodusGyak {

   
    public static void main(String[] args) {
       elso10SzamOsszege();
       
    
    }
  
    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg +=1;
        }
        kiiratas(osszeg);
    }

    private static void kiiratas(int osszeg) {
        System.out.println("Az elso 10 szam osszege:" + osszeg);
    }
    private static void osszead(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }                            

}
    
    
    
    
    

