
package tugas4;
public class nomor2_bubblesort {
    public static void bubblesort(int[] A) {
        int i =1, j, n = A.length;
        int temp;
        while (i < n){
            j = n - 1;
            while (j>=i){
                if (A[j-1] > A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        nomor2_bubblesort.tampil(A);
        nomor2_bubblesort.bubblesort(A);
        nomor2_bubblesort.tampil(A);
        
        System.out.println("Tri Hesti Wahyuningsih_20090082");
        System.out.println("2D DIV TEKNIK INFORMATIKA");

    }
}
