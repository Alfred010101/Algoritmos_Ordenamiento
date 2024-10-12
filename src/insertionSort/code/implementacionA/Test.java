package insertionSort.code.implementacionA;

/**
 *
 * @author Alfred
 */
public class Test
{

    public static void main(String[] args)
    {
        int[] arreglo5 =
        {
            -97, -13, -13, -97, 98
        }; // Con repetidos
        int[] arreglo10 =
        {
            -86, -65, 61, -45, -65, 27, -92, 75, 27, -78
        }; // Con repetidos
        int[] arreglo15 =
        {
            -91, -50, -86, 85, -50, 18, -19, 2, 32, -70, -19, -19, -3, 82, 57
        }; // Con repetidos
        int[] arreglo20 =
        {
            -39, -9, 62, 40, 40, 18, -35, 76, -57, -61, -80, 69, 40, -74, 41, 92, -46, 56, 7, -39
        }; // Con repetidos
        int[] arreglo21 =
        {
            0, -37, 10, 43, 20, 27, -14, -73, 83, -49, -13, -18, -85, -36, -89, 53, 79, -66, -24, 97, -50
        }; // Sin repetidos
        int[] arreglo30 =
        {
            28, -43, -13, 96, -67, 100, 41, 74, -1, 89, 67, -58, -58, -93, 9, 61, -47, -10, -48, 13, 20, 41, 35, 48, -99, -51, 46, -86, -4, -53
        }; // Con repetidos

        System.out.println("Formato Lista (permite elementos repetidos)");
        Algoritmo.desplegar(Algoritmo.insertionSortList(null));
        Algoritmo.desplegar(Algoritmo.insertionSortList(new int[]
        {
            7
        }));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo5));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo10));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo15));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo20));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo21));
        Algoritmo.desplegar(Algoritmo.insertionSortList(arreglo30));
        
        System.out.println("\n\nFormato Set (no permite elementos repetidos)");
        Algoritmo.desplegar(Algoritmo.insertionSortSet(null));
        Algoritmo.desplegar(Algoritmo.insertionSortSet(new int[]
        {
            7
        }));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(new int[]
        {
            11, 11
        }));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo5));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo10));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo15));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo20));
         Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo21));
        Algoritmo.desplegar(Algoritmo.insertionSortSet(arreglo30));
    }
}
