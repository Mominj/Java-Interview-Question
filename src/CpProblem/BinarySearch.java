package CpProblem;

public class BinarySearch {


    public int BinarySearchSolution(int[] arr, int s, int e, int target) {

      while (s <= e) {
          int mid = (s+e)/2;
          if(arr[mid]==target) {
              System.out.println(mid);
              return 1;
          }
          if(arr[mid]< target) s = mid+1;
          else e = mid-1;
      }
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        BinarySearch binarySearch = new BinarySearch();
        int r = binarySearch.BinarySearchSolution(arr,0,4,13);
        System.out.println(r);
    }
}
