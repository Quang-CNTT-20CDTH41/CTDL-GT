package Array;
import java.util.Scanner;
public class mainApp {
	static Scanner sc = new Scanner(System.in);
	public static void inputArr(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap Array[%d]: ", i);
			arr[i] = sc.nextInt();
		}
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Array[%d] = %d\n",i, arr[i]);
		}
	}
	public static int evenArr(int[] arr) {
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				s++;
			}
		}
		return s;
	}
	public static void evenDivisible(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && arr[i] % 3 != 0) {
				System.out.printf("Array[%d] = %d\n",i, arr[i]);
			}
		}
	}
	public static boolean findArr(int[] arr, int x) {
		boolean kt = true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				kt = true;
				break;
			}else {
				kt = false;
			}
		}
		return kt;
	}
	public static boolean ascendingArr(int[] arr) {
		boolean kt = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length - 1; j++) {
				if(arr[i] <= arr[j]) {
					kt = true;
				}else {
					kt = false;
					break;
				}
			}
		}
		return kt;
	}
	public static void main(String[] args) {
		System.out.print("Nhập số lượng mảng: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		inputArr(n, arr);
		System.out.println("Hiển thị danh sách mảng: ");
		printArr(arr);
		System.out.println("Số phần tử chẵn trong mảng: " + evenArr(arr));
		System.out.println("Các phần tử chẵn và không chia hết cho 3 trong mảng: ");
		evenDivisible(arr);
		System.out.println("Nhập số bạn muốn tìm kiếm: ");
		int x = sc.nextInt();
		System.out.printf("%d có trong mảng hay không: " + findArr(arr, x) + "\n", x);
		System.out.printf("Mảng có sắp xếp tăng dần hay không :" + ascendingArr(arr));
	}

}
