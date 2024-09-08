package Arrays;

import java.util.Scanner;

public class CubeSuum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter elements:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	sum+=Math.pow(arr[i], 3);
        }
        System.out.print("Sum of cube is "+sum);
	}

}
