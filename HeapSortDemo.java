//http://bubkoo.com/2014/01/14/sort-algorithm/heap-sort/
public class HeapSortDemo {
    public void sort(int arr[]){
        int n = arr.length;
        //build heap
        for(int i= n/2-1 ; i>=-0 ; i--){
            heapify(arr, n, i);
        }

        //one by one extract an element from heap
        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //call max heapify on the reduce heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n , int i){
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;
        //if left child is larger than root
        if(l <n && arr[l] > arr[largest]){
            largest = l;
        }
        //if right child is larger than root
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }
        
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            //recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        HeapSortDemo demo = new HeapSortDemo();
        demo.sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }

}
