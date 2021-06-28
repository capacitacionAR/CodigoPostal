import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner teclado = new Scanner(System.in);
        Scanner archivo = new Scanner(new File("CodigoPostal.txt"));
        archivo.useDelimiter("[;\\n]");

        System.out.print("Ingresa una localidad: ");
        String n = teclado.next();

        while (archivo.hasNext()){

            String prov = archivo.next();
            int codPostal = archivo.nextInt();
            String loc = archivo.next();

           // System.out.println("Provincia: " + prov + " Localidad: "+loc+" Codigo Postal: "+codPostal);
            //System.out.println(n);

            CodigoPostal cp = new CodigoPostal(prov, codPostal, loc);

            if (cp.getLocalidad().contains(n)) {
                System.out.println("Salida " +cp.getProvincia()+" "+cp.getLocalidad()+" "+cp.getCodigo());
            }
        }
    }
}
