package insertionSort.code.implementacionB;

/**
 *
 * @author Alfred
 */
public class Algoritmo
{

    public static int[] insertionSortList(int[] arr)
    {
        if (arr != null)
        {
            for (int i = 1; i < arr.length; i++)
            {
                int tmp = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > tmp)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = tmp;
            }
            return arr;
        }
        return null;
    }

    public static int[] insertionSortSet(int[] arr)
    {
        if (arr != null)
        {
            int[] tmp = new int[arr.length];
            int indice = 0;
            for (int i = 0; i < arr.length; i++)
            {
                boolean repetido = false;
                for (int j = 0; j < indice; j++)
                {
                    if (arr[i] == tmp[j])
                    {
                        repetido = !repetido;
                        break;
                    }
                }
                if (!repetido)
                {
                    tmp[indice++] = arr[i];
                }
            }
            arr = new int[indice];
            System.arraycopy(tmp, 0, arr, 0, indice);
            System.out.println("Dimencion : " + arr.length + " : " + indice);
            return insertionSortList(arr);
        }
        return null;
    }
}
