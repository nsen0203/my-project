
public class AllNegAndPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,3,8,-4,5,-6,7,-20,30,40};
		int n=arr.length;
		int i=0,j=n-1;
		boolean check=true;
		while(check) {
			while(arr[i]<0 ) {
				i++;
			}
			while(arr[j]>0 ) {
				j--;
			}
			if(i<j) {
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else 
				break;
		}
		for(int s:arr) {
			System.out.print(s+",");
		}

	}

}
