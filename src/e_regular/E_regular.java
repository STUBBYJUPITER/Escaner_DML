package e_regular;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
//sergio galicia barron
//Jesús Alonso Geraldo Hernández

public class E_regular {

    static int cont = 1;

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        E_regular.cont = cont;
    }

    public static void main(String[] args) {

        Expresiones expresion = new Expresiones();
        Texto texto = new Texto();
        System.out.println(texto.texto1);
        System.out.println("NO.  | NO.Linea  | Cadena  | Tipo ");
        ValidarExpresionReal(texto, expresion);
        ValidarExpresionExponencial(texto, expresion);
        ValidarExpresionPorcentaje(texto, expresion);
        //ValidarExpresionNatural(texto, expresion);

    }

    public static void ValidarExpresionReal(Texto texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        Pattern r = Pattern.compile(expresion.real);
        Matcher m = r.matcher(texto.texto1);
        while (m.find()) {

            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() + "      |" + " real");
            contador++;
            E_regular.setCont(contador);
        }

    }

    public static void ValidarExpresionExponencial(Texto texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        Pattern r = Pattern.compile(expresion.exponencial);
        Matcher m = r.matcher(texto.texto1);
        while (m.find()) {

            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() + "      |" + " exponencial");
            contador++;
            E_regular.setCont(contador);
        }

    }

    public static void ValidarExpresionPorcentaje(Texto texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        Pattern r = Pattern.compile(expresion.porcentaje);
        Matcher m = r.matcher(texto.texto1);
        while (m.find()) {

            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() + "      |" + " porcentaje");
            contador++;
            E_regular.setCont(contador);
        }

    }

    public static void ValidarExpresionNatural(Texto texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        Pattern r = Pattern.compile(expresion.natural);
        Matcher m = r.matcher(texto.texto1);
        while (m.find()) {

            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() + "      |" + " natural");
            contador++;
            E_regular.setCont(contador);
        }

    }

}
