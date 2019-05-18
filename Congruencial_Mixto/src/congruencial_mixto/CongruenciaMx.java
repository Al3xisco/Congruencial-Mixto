
package congruencial_mixto;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class CongruenciaMx {

    public static void main(String[] arg) {

        Scanner entrada = new Scanner(System.in);
        double const_Mult_a, const_Adit_c;
        double Xn1;
        int Xn, mod, i;
        double result;

        DecimalFormat formtDec = new DecimalFormat("0.00");
        DecimalFormat formtDec2 = new DecimalFormat("0.000");

        System.out.println("GENERADOR CONGRUENCIAL MIXTO");
        
        System.out.println("Escriba una constante multiplicativa \'a\': ");
        const_Mult_a = entrada.nextDouble();

        System.out.println("Escriba una constante Aditiva \'c\': ");
        const_Adit_c = entrada.nextDouble();

        System.out.println("Escriba el módulo \'mod\': ");
        mod = entrada.nextInt();

        System.out.println("Ingrese semilla \'Xo\':");
        double semilla = entrada.nextDouble();
        System.out.println("\n");
        

        System.out.println("| N | " + "  Xn  |" + " (AXn+c)m   |" + "  Xn+1 |" + " Resultado # ");

        for (i = 0; i < 8; i++) {
            Xn1 = ((const_Mult_a * semilla) + const_Adit_c) / mod;
            Xn = (int) ((const_Mult_a * semilla) + const_Adit_c) % mod;
            result = (double)(Xn / (double)mod);
            System.out.println(" ------------------------------------------ ");
            System.out.println("| " +  i + " |   " + (int) semilla + "   |    " + formtDec2.format(Xn1) + "   |   " + (int) (Xn) + "   |   " + result);
            semilla = Xn;

        }

    }
}
