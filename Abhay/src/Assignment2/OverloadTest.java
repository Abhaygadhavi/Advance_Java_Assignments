/*
 * Author: Abhay Gadhvi
 * Creation Date:08/06/2021
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package Assignment2;

class MathEngine{
	
	int multiply(int n1,int n2) {
		return n1*n2;
	}
	void multiply(int n1,int n2,int n3) {
		System.out.println("overload 2:"+n1*n2*n3);
	} 
	float multiply(float n1,int n2) {
		return n1*n2;
	}
	float multiply(int n1,float n2) {
		return n1*n2;
	}
	
}

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathEngine m1 = new MathEngine();
		int mul1 = m1.multiply(2,3);
		System.out.println("overload 1:"+mul1);
		m1.multiply(2,3,4);
		float mul3 = m1.multiply(1.1f, 5);
		System.out.println("overload 3:"+mul3);
		float mul4 = m1.multiply(6, 1.1F);
		System.out.println("overload 4:"+mul4);

	}

}
