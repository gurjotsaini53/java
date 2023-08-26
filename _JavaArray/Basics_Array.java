package _JavaArray;

public class Basics_Array {

    public static void main(String[] args)
    {

        // All arrays in java are dynamically allocated
        /*

        1. arrays are stored in contiguous memory location
        2. Since arrays are objects in java, we can find length by object length property
        3. A java array variable can also be declared like other variables with [] after the data type
        4. java array can also be used as a static field, a local variable or a method parameter
        5. the direct super class of an array type is object.

         */
        // declation in array
        int[] array;
        int array1[];


        // initialization in array

        int [] array2 = new int[10]; // all elements are zero
        int [] array3 =  new int[] {1,2,4,5,6,66};

        // accessing elements

//        System.out.println(array2[0]);
//        System.out.println(array2[1]);
//        System.out.println(array2[2]);
//        System.out.println(array2[3]);
//        System.out.println(array2[4]);


        for (int i=0;i<array3.length;i++)
        {
            System.out.println(array3[i]);
        }

    }
}
