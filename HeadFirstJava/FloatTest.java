public class FloatTest 
{
	public static void main(String[] args) 
	{
		float af = 5.234556f;
		// ���潫����af��ֵ�Ѿ������˸ı�
		System.out.println(af);
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		// ����float��double�ĸ����������ȵ�
		System.out.println(c == d);
		// 0.0��0.0�����ַ���
		System.out.println(a/a);
		// ��������֮���ǲ���ȵ�
		System.out.println(a/a == Float.NaN);
		// ���е������������ȵ�
		System.out.println(6.0 / 0 == 555.0 / 0);
		// ������0.0�õ��������
		System.out.println(-8 / a);
		// ������뽫�׳�����0���쳣
		//System.out.println(0 / 0);	//Exception
		System.out.println(6.0 / 0);	//Infinity
		System.out.println(0 / 0.0);	//NaN
		System.out.println(6.0 / 0.0);	//Infinity
	}
}
