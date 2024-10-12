package insertionSort.code.implementacionA;

import insertionSort.code.Arreglos;

/**
 *
 * @author Alfred
 */
public class Test
{

    public static void main(String[] args)
    {

        System.out.println("Formato Lista (permite elementos repetidos)");
        Arreglos.desplegar(Algoritmo.insertionSortList(null));
        Arreglos.desplegar(Algoritmo.insertionSortList(new int[]
        {
            7
        }));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo5));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo10));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo15));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo20));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo21));
        Arreglos.desplegar(Algoritmo.insertionSortList(Arreglos.arreglo30));

        System.out.println("\n\nFormato Set (no permite elementos repetidos)");
        Arreglos.desplegar(Algoritmo.insertionSortSet(null));
        Arreglos.desplegar(Algoritmo.insertionSortSet(new int[]
        {
            7
        }));
        Arreglos.desplegar(Algoritmo.insertionSortSet(new int[]
        {
            11, 11
        }));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo5));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo10));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo15));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo20));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo21));
        Arreglos.desplegar(Algoritmo.insertionSortSet(Arreglos.arreglo30));
    }
}
