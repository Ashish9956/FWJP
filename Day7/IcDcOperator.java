package Day7;

public class IcDcOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		int res=(++a)+(++b)+(a++)+(b++);
		System.out.println(a+" "+b+" "+res);
		a=1;b=1;
		int rs=(++a)+(++b)+(a--)+(++a)+(--b);
		System.out.println(a+" "+b+" "+rs);
		a=1;b=1;
		int s=(a--)+(b--)+(a++)+(--b)+(a--)+(b++);
		System.out.println(a+" "+b+" "+s);
	    int x=001,y=010,z=100;
	   
	    System.out.println(x+" "+y+" "+z);
	    char ch='A';
//	    System.out.println(ch++);
	    System.out.println(++ch);
	    
		

	}

}
