
package prog_boletin_23;

import java.util.LinkedList;

public class PROG_Boletin_23 {


    public static void main(String[] args) {
        int personas = 0;
        do {
            try {
                personas = Metodos.pedirPersonas();
            } catch (FueraDeRangoException e) {
                System.out.println(e.getMessage());
            }
        } while (personas < 1);

        int[] edades = Metodos.randomIntsArray(personas, 5, 60);
        LinkedList<Integer> entradas = new LinkedList<>();

        float caja = 0;
        for (int i = 0; i < edades.length; i++) {
            entradas.add(edades[i]);
            if (entradas.get(i) >= 5 && entradas.get(i) <= 10) {
                caja += 1f;
            } else if (entradas.get(i) <= 17) {
                caja += 2.5f;
            } else if (entradas.get(i) > 17) {
                caja += 3.5f;
            }
        }
        System.out.printf("%.2f € dinero en caja", caja);

    }
}

    

