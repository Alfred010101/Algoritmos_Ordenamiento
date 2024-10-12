package insertionSort.code;

import java.util.Random;

/**
 *
 * @author Alfred
 */
public class Arreglos
{
    public static int[] arregloNull = null;
    
    public static int[] arreglo1 =
    {
        9
    }; // Con repetidos

    public static int[] arreglo2 =
    {
        -1, -1
    }; // Con repetidos
    
    public static int[] arreglo5 =
    {
        -97, -13, -13, -97, 98
    }; // Con repetidos
    
    public static int[] arreglo10 =
    {
        -86, -65, 61, -45, -65, 27, -92, 75, 27, -78
    }; // Con repetidos
    
    public static int[] arreglo15 =
    {
        -91, -50, -86, 85, -50, 18, -19, 2, 32, -70, -19, -19, -3, 82, 57
    }; // Con repetidos
    
    public static int[] arreglo20 =
    {
        -39, -9, 62, 40, 40, 18, -35, 76, -57, -61, -80, 69, 40, -74, 41, 92, -46, 56, 7, -39
    }; // Con repetidos
    
    public static int[] arreglo21 =
    {
        0, -37, 10, 43, 20, 27, -14, -73, 83, -49, -13, -18, -85, -36, -89, 53, 79, -66, -24, 97, -50
    }; // Sin repetidos
    
    public static int[] arreglo30 =
    {
        28, -43, -13, 96, -67, 100, 41, 74, -1, 89, 67, -58, -58, -93, 9, 61, -47, -10, -48, 13, 20, 41, 35, 48, -99, -51, 46, -86, -4, -53
    }; // Con repetidos
    
    /**
     * Genera un arreglo de N numeros aleatorios
     * @param n
     * @param max
     * @return 
     */
    public static int[] array(int n, int max)
    {
        if (n > 0 && max > 0)
        {
            int[] array = new int[n];
            Random random = new Random();
            for (int i = 0; i < n; i++)
            {
                array[i] = random.nextInt(max);
            }
            return array;
        }
        return null;
    }
    
    /**
     * Desplica el arreglo para ser mostrado en consola
     * @param arreglo arreglo a ser desplegado
     */
    public static void desplegar(int[] arreglo)
    {
        if (arreglo != null)
        {
            System.out.print("{\n   ");
            for (int num : arreglo)
            {
                System.out.print(num + " ");
            }
            System.out.println("\n}");
        }
    }
}
