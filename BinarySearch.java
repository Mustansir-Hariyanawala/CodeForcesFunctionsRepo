import java.util.*;

public class BinarySearch {
    public static int binarySearch(long arr[], long target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    } 

    public static long binarySearchUpperBound(long start, long end, long target){
        while(start <= end){
            long mid = start + (end - start + 1) / 2;
            if(mid > target) end = mid - 1;
            else start = mid;
        }
        return end;
    }

    public static long binarySearchUpperBound(long start, long end){
        long target = end;
        while(start <= end){
            long mid = start + (end - start + 1) / 2;
            if(mid > target) end = mid - 1;
            else{
                target = mid;
                start = mid;
            }
        }
        return target;
    }

    public static long binarySearchUpperBound(long arr[]){
        int start = 0, end = arr.length - 1;
        int target = end;
        while(start <= end){
            int mid = start + (end - start + 1) / 2;
            if(mid > target) end = mid - 1;
            else{
                target = mid;
                start = mid;
            }
        }
        return target;
    }

    public static long binarySearchLowerBound(long start, long end, long target){
        while(start <= end){
            long mid = start + (end - start  + 1) / 2;
            if(mid >= target) end = mid;
            else start = mid + 1;
        }
        return start;
    } 

    public static long binarySearchLowerBound(long start, long end){
        long target = start;
        while(start <= end){
            long mid = start + (end - start  + 1) / 2;
            if(mid >= target) end = mid;
            else start = mid + 1;
        }
        return target;
    } 

    public static long binarySearchLowerBound(long arr[]){
        int start = 0, end = arr.length - 1;
        int target = start;
        while(start <= end){
            int mid = start + (end - start  + 1) / 2;
            if(mid >= target) end = mid;
            else start = mid + 1;
        }
        return target;
    } 
}
