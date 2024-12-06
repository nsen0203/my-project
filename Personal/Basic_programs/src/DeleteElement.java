
public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,15,30,19,21};
		int delete=30;
		for(int i=0;i<a.length;i++) {
			if(delete==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
