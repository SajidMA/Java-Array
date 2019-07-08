// Sajid Ahmed
// Final Lab - Array
// Array.java: A method to compute and return the value of max - min where max is the largest element of
// an int array and min is the smallest element of an int array.

package array;

public class Array 
{
    public static void main(String[] args) 
    {
        int[] MyArray = {27, 24, 39, 87, 45};
        //Calls the method to test it
        System.out.println("The difference between the smallest and largest "
                + "element in MyArray is: " + MaxMin(MyArray, 5));
    }
    
    //The method is passed the int array and an int value that denotes the number of elements in the array
    public static int MaxMin(int [] A, int a)
    {
        a = A.length; //set a as the number of elements in the array
        int max = A[0]; //initialize the max to the first element
        int min = A[0]; //initialize the min to the first element
        for (int count = 1; count < a; count++) //loops through the array to find the max and min element
        {
            if (max < A[count])
                max = A[count];
            if (min > A[count])
                min = A[count];
        }
            return max - min; //returns the answer of max minus min
    }
}