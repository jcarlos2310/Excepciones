import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

/**
 * Created by Alumnos on 12/10/2017.
 */
public class EjemploExcepciones {
    public static void main(String[]args) throws FileNotFoundException
    {
        try {
            File archivo=new File("entrada.txt");
            Scanner teclado = new Scanner(System.in);
            System.out.println("dame el primer numero:");
            int num1 = teclado.nextInt();
            System.out.println("dame el segundo numero:");
            int num2 = teclado.nextInt();
            System.out.println("la division es:" + num1 / num2);
        }
        catch(ArithmeticException excepcionAritmetica){
            System.out.println("Division por cero");
        }
        catch(InputMismatchException excepcionEntrada){
            System.out.println("Entrada incorrecta");
        }
      /*  catch(FileNotFoundException excepcionEntrada){
            System.out.println("No existe el archivo");
        }*/
    }
}
