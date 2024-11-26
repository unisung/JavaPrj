package ch09;

public class WrapperExample {
	public static void main(String[] args) {
		Object[] arr = new Object[10];
		arr[0] = new Byte((byte)127);//int->byte
		arr[1] = new Short((short)32767);//
		arr[2] = new Integer(2147483647);
		arr[3] = new Long(213648483482L);
		arr[4] = new Float(3.5);
		arr[5] = new Double(3.7);
		arr[6] = new Boolean(true);
		arr[7] = new Character('J');
		arr[8] = new String("hello Java");
		arr[9] = new java.util.Date();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
