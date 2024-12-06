
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "one";
		char[] a=str.toCharArray();
        String[] arrOfStr = str.split("", 1);
  
        for (String ar : arrOfStr)
            System.out.println(ar);

	}

}
