
public class Main {
	
	public static void main(String[] args) {
		
		/** byte range  -0x80(-128) to 0x7f(127) **/
		
        byte bitmask = 0x0F;			// 0000 1111
        byte val = 0x10;				// 0001 0000
        System.out.println(val|bitmask);// 0001 1111
        
        bitmask = 0x7f;					// 0111 1111
        val = 0x08;						// 0000 1000
        System.out.println(val&bitmask);// 0000 1000
        
        
        bitmask = 0x05;					// 0000 0101
        System.out.println(bitmask>>1);	// 0000 0010
        System.out.println(bitmask>>2);	// 0000 0001
        
        
        byte uno = 0x01;				// 0000 0001
        byte dos = 0x02;				// 0000 0010
        val = 0x00;						// 0000 0000
        System.out.println(val|uno|dos);// 0000 0011
        
        
        //Flags with bits
        int i=0;
        int a = powerOfTwo(i++);
        int b = powerOfTwo(i++);
        int c = powerOfTwo(i++);
        int d = powerOfTwo(i++);
        
        int top = powerOfTwo(i)-1;
        
        int result = a|b|c|d;
        
        boolean assertion = top==result;
        
        System.out.println(assertion);
        
    }
	
	public static int powerOfTwo(int exp){
		
		return (int)Math.pow(2, exp);
	}

}
