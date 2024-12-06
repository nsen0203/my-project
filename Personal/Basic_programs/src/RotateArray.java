class RotateArray {
   
    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3};
        rotate.solution(arr, 3);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
    }
    void solution(int[]arr, int k) {
    	for(int i=0;i<=k;i++) {
    		swapElements(arr);
    	}
    }
    void swapElements(int[]arr) {
    	int temp=arr[0];
    	for(int i=0;i<arr.length-1;i++) {
    		arr[i]=arr[i+1];
    	}
    	arr[arr.length-1]=temp;
    }
}
 