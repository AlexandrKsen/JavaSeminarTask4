//Реализовать алгоритм быстрой сортировки

package Seminar4;

public class Task4 {
    public static void quickSort(int[] sortArr, int first, int last) {
        //если массив пуст или уже нечего делить, то завершаем операцию
        if (sortArr.length == 0 || first >= last) return;

        //делим массив напополам и выбираем опорный элемент
        int middle = first + (last - first) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = first, j = last;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (first < j) quickSort(sortArr, first, j);
        if (last > i) quickSort(sortArr, i, last);
    }

    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 20, 5, 13, 35, 50, 7, 1, 3, 25};
        quickSort(sortArr, 0, sortArr.length - 1);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "  ");
        }
    }
}
