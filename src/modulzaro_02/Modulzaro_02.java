//Sóti Bence
package modulzaro_02;


public class Modulzaro_02 {
    private static int[] tomb;
    private static final String SEP = System.lineSeparator();


    public static void main(String[] args) {
        programozoiTetelek();
    }

    private static void programozoiTetelek() {
        velSzam(2 , 20);
        feltolt(velSzam(2 , 6));
        kiir(2);
        osszegzesBemutatasa();
        megszamlalalsBemutatasa();
        minHelyBemutatasa();
        maxHelyBemutatasa();
        //kivalasztasBemutatasa();
        eldontesegyBemutatasa();
        eldontesMindBemutatasa();
        linKerBemutatasa();
        
    }

    private static int velSzam(int also, int felso) {
        int szam;
        szam =(int)(Math.random()*(felso - also +1)+ also);
        return szam;
    }

    private static int[] feltolt(int db) {
        int also = 0;
        int felso = 6;
        tomb = new int[db];
        for (int i = 0; i < db; i++) {
            tomb[i] = (int)(Math.random()*(felso - also +1)+ also);
        }
        return tomb;
    }

    private static void kiir(int oszlop) {
        for (int i = 0; i < tomb.length; i++) {
            if (i != 0 && i % oszlop == 0 ) {
                System.out.println("");
            }
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }
    
    private static int osszegzes(){
        int osszeg = 0;
        for (int szam : tomb) {
            osszeg += szam;
        }
        return osszeg;
    }
    
        private static void osszegzesBemutatasa() {
            System.out.print("A tömb összege: ");
            konzolraIr(osszegzes() + SEP);
        }
    
    private static int megszamlalas(){
        int db = 0;
        for (int szam : tomb) {
            if(szam == 0){
                db++;
            }
        }
        return db;
    }
    
        private static void megszamlalalsBemutatasa() {
             konzolraIr("A nullák száma: " + megszamlalas() + SEP);
        }
    
    private static int minHely(){
        int m = 0;
        for (int i = 1; i < tomb.length; i++) {
            if(tomb[i] < tomb[m]){
                m = i;
            }
        }
        return m;
    }
        private static void minHelyBemutatasa() {
        int index = minHely();
        String s = "a legkisebb elem helye: %d".formatted(index);
        konzolraIr(s + SEP);
        }
    
    private static int maxHely(){
        int m = 0;
        for (int i = 1; i < tomb.length; i++) {
            if(tomb[i] > tomb[m]){
                m = i;
            }
        }
        return m;
    }
        private static void maxHelyBemutatasa() {
        int index = maxHely();
        String s = "a legnaygobb elem helye: %d".formatted(index);
        konzolraIr(s + SEP);
        }
    
//     private static int kivalasztas(){
//         int index = 0;
//        int i = 0;
//        while( !(tomb[i] %5 != 0)){
//            index = i;
//            i++;
//        }
//        return index;
//    }
//         private static void kivalasztasBemutatasa() {
//              konzolraIr("Az első elem helye, ami oszthato 5 el: ");
//        konzolraIr(tomb[kivalasztas()] + SEP);
//         }
     
     private static boolean eldontesEgy(){
        int i = 0;
        int N = tomb.length;
        while(i < N && !(tomb[i] % 2 == 1)){
            i++;
        }
        return i < N;
    }
         private static void eldontesegyBemutatasa() {
              String valasz = eldontesEgy() ? "igen" : "nincs";
        konzolraIr("Van legalább 1 tökéletes szám: " + valasz + SEP);
         }
    
      private static boolean eldontesMind(){
        int m = 0;
        int i = 0;
        int N = tomb.length;
        while(i < N && m <= tomb[i]){
            m = tomb[i];
            i++;
        }
        return m < tomb[i];
    }
      
          private static void eldontesMindBemutatasa() {
        String valasz = eldontesMind() ? "igen" : "nem";
        konzolraIr("növekvő sorrendben haladnak a számok: " + valasz + SEP);
    }
      
       private static int linKer(){
        int i = 0;
        int N = tomb.length;
        while(i < N && tomb[i] != 13){
            i++;
        }
        if(i < N){
            return i;
        }else{
            return -1;
        }
    }
           private static void linKerBemutatasa() {
        konzolraIr("A keresett szám:13" + SEP);
        int i = linKer();
        if(i != -1){
            konzolraIr("Van iylen szám, a(z) %d%s".formatted(tomb[i], SEP));
        }else{
            konzolraIr("Nincs ilyen szám!" + SEP);
        }
           }
       
       private static void konzolraIr(String kimenet){
           System.out.print(kimenet);
       }









}
