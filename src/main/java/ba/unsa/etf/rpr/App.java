package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        //Test Builder patterna
        Phone mobitel = (new PhoneBuilder("Android")).setBaterija(5000).setMegapixeli(48).setProcesor("Snapdragon 865 5nm").build();
        System.out.println(mobitel);
    }
}
