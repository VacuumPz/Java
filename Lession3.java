/**
 * Java 1. Homework 3
 *
 * @author Gleb
 * @version 13.10.2021
 */
import java.util.Arrays;
 
class Lession3 {
    public static void main(String[] args) {
        arraySwitch();
        arrayEmpty();
        arrayLesser();
        arraySquare();
        arrayRequest(10, 2);

    }

    static void arraySwitch() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }		
    }
	
	static void arrayEmpty() {
		int [] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
    }
    
    static void arrayLesser() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i]; 
        }
    }
    
    static void arraySquare() {
        int[][] arr = new int[5][5];
        int dia = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = i == j || i == 4 - j ? dia : 0;
            }
        }        
    }
    
    static void arrayRequest(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
    }
    
}
