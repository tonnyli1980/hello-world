public class IntegerValTest {
	
	byte a = 56;
	// 长整形数值要用L结尾
	long bigValue2 = 9223372036854775807L;

	// 以0开头的整数值是八进制的整数
	int octalValue = 013;

	// 以0x或0X开头的整数值是八进制的整数
	int hexValue1 = 0x13;
	int hexValue2 = 0XaF;



    public static void main(String[] args) {

		// IntergerValTest ivt = new IntergerValTest();

		// 定义两个8位的二进制整数
		int binVal1 = 0b11010100;
		byte binVal2 = 0B01101001;

		// 定义一个32位的二进制整数，最高位是符号位
		int binVal3 = 0B10000000000000000000000000000011;
		/*
		定义一个8位的二进制整数，该数值默认占32位，因此它是一个正数
		只是强制转换成byte时产生了举出，最终导致binVal4变成了-23	
		*/
		byte binVal4 = (byte)0b11101001;  //参考3.5节，说明：第一位是1，代表负数，以补码方式存放，11101001为补码，减1得到反码11101000，取反（符号位不变）得到原码10010111，即1+2+4+16

        System.out.println(binVal1);
		System.out.println(binVal2);
        System.out.println(binVal3);
        System.out.println(binVal4);

    }
}