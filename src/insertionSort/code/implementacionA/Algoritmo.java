/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertionSort.code.implementacionA;

/**
 *
 * @author Alfred
 */
public class Algoritmo
{
    /**
     * Ordena usando un enfoque Insertion Sort.
     * Tambien implementa Arreglos dinamicos nativos de Java
     * NOTA: Se asimila mas a trabajar insersiones en una Lista
     *       pero carece de eficiencia de usar nodos
     * @param arreglo a ordenar
     * @return arreglo ordenado
     */
    public static int[] insertionSortList(int[] arreglo)
    {
        if (arreglo != null)
        {
            int[] tmp = new int[1];
            tmp[0] = arreglo[0];

            for (int i = 1; i < arreglo.length; i++)
            {
                for (int j = tmp.length - 1; j >= 0; j--)
                {
                    if (arreglo[i] > tmp[j])
                    {
                            tmp = insertar(tmp, arreglo[i], j + 1);
                        break;
                    } else if (j == 0)
                    {
                        tmp = insertar(tmp, arreglo[i], j);
                        break;
                    }
                }
            }
            return tmp;
        }
        return null;
    }
    
    /**
     * Elimina los elementos duplicados antes de ordenar
     * @param arreglo a ordenar
     * @return arreglo ordenado sin elementos repetidos
     */
    public static int[] insertionSortSet(int[] arreglo)
    {
        if (arreglo != null)
        {
            int[] tmp = new int[1];
            tmp[0] = arreglo[0];
            for (int i = 1; i < arreglo.length; i++)
            {
                boolean repetido = false;
                for (int j = 0; j < tmp.length; j++)
                {
                    if (arreglo[i] == tmp[j])
                    {
                        repetido = true;
                        break;
                    }
                }
                if (!repetido)
                {
                    tmp = insertar(tmp, arreglo[i], tmp.length);
                }
            }
            System.out.println("Dimencion : " + tmp.length);
            return insertionSortList(tmp);
        }
        return null;
    }

    /**
     * Copia los datos del arreglo resivido en dos partes:
     * Del inicio hasta la posicion - 1 donde se va a insertar el nuevo dato.
     * Y de la poscion donde se inserto + 1 hasta el final
     * @param tmp arreglo actual, al cual se le debe insertar un nuevo datos
     * en una posicion definida para mantener el arreglo ordenado
     * @param dato dato a insertar
     * @param pos posicion donde se insertara el dato
     * @return arreglo con el dato insertado donde corresponde
     */
    private static int[] insertar(int[] tmp, int dato, int pos)
    {
        int[] aux = new int[tmp.length + 1];
        System.arraycopy(tmp, 0, aux, 0, pos);
        aux[pos] = dato;
        System.arraycopy(tmp, pos, aux, pos + 1, tmp.length - pos);
        return aux;
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
