import java.util.Arrays;
import java.util.Scanner;

public class Buble_sort_arr {

    public static void main(String args[]){

                // Program info

        System.out.println("Необходимо написать программу для сортировки данных массива по возрастанию.\n" +
                "Использовать пузырьковый метод сортировки.");

                // Var

        boolean success_flag = true;
        int arr_bound = 0;
        int counter_i, counter_j, to_print_counter = 0;
        double temp;

                // Input array parameters

        while (success_flag) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите желаемую размерность массива: ");
                arr_bound = in.nextInt();
                success_flag = !success_flag;

            }
            catch (java.util.InputMismatchException e) {

                System.out.println("Ошибочный ввод: введите натуральное число");

            }

        }

                //Input data in array

        double array [] = new double[arr_bound];

        for (counter_i = 0; counter_i < arr_bound; counter_i++){

            success_flag = true;

            while (success_flag) {

                try {

                    Scanner in = new Scanner(System.in);
                    to_print_counter = counter_i + 1;
                    System.out.print("Введите ( " + to_print_counter + ") элемент массива: ");
                    array[counter_i] = in.nextDouble();
                    success_flag = !success_flag;

                } catch (java.util.InputMismatchException e) {

                    System.out.println("Ошибочный ввод: введите действительное число формата n,m");

                }

            }


        }

                //Data processing

        for (counter_i = 0; counter_i < arr_bound - 1; counter_i++){

            for (counter_j = counter_i + 1; counter_j < arr_bound; counter_j++){

                if (array[counter_i] > array[counter_j]){

                    temp = array[counter_j];
                    array[counter_j] = array[counter_i];
                    array[counter_i] = temp;

                }

            }

        }

                // Output data

        System.out.println("Отсортированный массиы: " + Arrays.toString(array));

    }
}
