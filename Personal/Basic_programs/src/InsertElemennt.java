
public class InsertElemennt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		int pos=3;
		int element=90;
		for(int i=arr.length-1;i>pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		for(int n:arr) {
			System.out.print(n+",");
		}
		

	}

}
