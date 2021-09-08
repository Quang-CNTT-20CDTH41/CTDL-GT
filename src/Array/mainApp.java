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
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] <= arr[i + 1]) {
				kt = true;
			}else {
				kt = false;
				break;
			}
		}
		return kt;
	}
	public static void main(String[] args) {
		// Khởi tạo số lượng mảng
		int n;
		do {
			System.out.print("Nhập số lượng mảng: ");
			n = sc.nextInt();
		}while(n <= 0);
		// Nhập dữ liệu cho mảng
		int[] arr = new int[n];
		inputArr(n, arr);
		// Hiển thị
		System.out.println("Hiển thị danh sách mảng: ");
		printArr(arr);
		// phần tử chẵn
		System.out.println("Số phần tử chẵn trong mảng: " + evenArr(arr));
		// chẵn và chia hết cho 3
		System.out.println("Các phần tử chẵn và không chia hết cho 3 trong mảng: ");
		evenDivisible(arr);
		// tìm kiếm
		System.out.println("Nhập số bạn muốn tìm kiếm: ");
		int x = sc.nextInt();
		System.out.printf("%d có trong mảng hay không: " + findArr(arr, x) + "\n", x);
		// sắp xếp tăng dần ko
		System.out.printf("Mảng có sắp xếp tăng dần hay không :" + ascendingArr(arr));
	}

}
