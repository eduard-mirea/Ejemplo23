import java.util.Scanner;
public class Ejemplo23 {
    public static void main(String[] args) {

        float notas;
        int cantidadNotas = 0;
        int sumaNotas = 0;
        boolean hayUnDiez = false;

        Scanner inputValue = new Scanner(System.in);

        do {
            System.out.println("Introduce notas:(para terminar ponga -1) ");
            notas = inputValue.nextFloat();
            if (notas != -1){
                sumaNotas += notas;
                cantidadNotas++;
                if (10 == notas){
                    hayUnDiez = true;
                }
            }
        }while (notas != -1);
        inputValue.close();

        System.out.println("La nota media es: " + (sumaNotas/cantidadNotas));

        if(hayUnDiez){
            System.out.println("Habia un 10 en alguna de las notas");
        }
    }
}