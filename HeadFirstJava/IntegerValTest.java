public class IntegerValTest {
	
	byte a = 56;
	// ��������ֵҪ��L��β
	long bigValue2 = 9223372036854775807L;

	// ��0��ͷ������ֵ�ǰ˽��Ƶ�����
	int octalValue = 013;

	// ��0x��0X��ͷ������ֵ�ǰ˽��Ƶ�����
	int hexValue1 = 0x13;
	int hexValue2 = 0XaF;



    public static void main(String[] args) {

		// IntergerValTest ivt = new IntergerValTest();

		// ��������8λ�Ķ���������
		int binVal1 = 0b11010100;
		byte binVal2 = 0B01101001;

		// ����һ��32λ�Ķ��������������λ�Ƿ���λ
		int binVal3 = 0B10000000000000000000000000000011;
		/*
		����һ��8λ�Ķ���������������ֵĬ��ռ32λ���������һ������
		ֻ��ǿ��ת����byteʱ�����˾ٳ������յ���binVal4�����-23	
		*/
		byte binVal4 = (byte)0b11101001;  //�ο�3.5�ڣ�˵������һλ��1�����������Բ��뷽ʽ��ţ�11101001Ϊ���룬��1�õ�����11101000��ȡ��������λ���䣩�õ�ԭ��10010111����1+2+4+16

        System.out.println(binVal1);
		System.out.println(binVal2);
        System.out.println(binVal3);
        System.out.println(binVal4);

    }
}