
package arraymimax;
import java.util.Scanner;
public class arraymin {
    /**
     * tim so nho nhat trong day so
     * @param a day so nguyen
     * @param n so nguyen
     * @return so nho nhat
     */
    public static int findArraymin(int[] a , int n ){
        int min = a[0];
        for(int i=0; i<n; i++){
            if(min > a[i])
                min = a[i];}
        return min;
        
            
    }
    
    public static void main(String[] args) {
        int n;
        int a;
        float array[] = new float[100];
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap so phan tu cua day: ");
        n = nhap.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("nhap phan tu thu: " +i+ "cua mang: ");
            array[i] = nhap.nextFloat();
                 
        }
       
    }
    
}
