public class CharTest 
{

    public static void main (String[] args) 
	{
		// ֱ��ָ�������ַ���Ϊ�ַ�ֵ
        	char aChar = 'a';
		// ʹ��ת���ַ�����Ϊ�ַ�ֵ
		char enterChar = '\r';
		// ʹ��Unicode����ֵ��ָ���ַ�ֵ
		char ch = '\u9999';
		// �����һ��'��'��
		System.out.println(ch);
		char zhong = '��';
		// ֱ�ӽ�һ��char��������int���ͱ���ʹ��
		int zhongValue = zhong;
		System.out.println(zhong+"����ֵ��"+zhongValue);
		// ֱ�Ӱ�һ��0~65535��Χ�ڵ�int��������һ��char����
		char c = 97;
		System.out.println(c);

		// s����һ���������͵ı��������ַ���ʵ��������
		//String s = "�׺����������ᣬ������ů������";

		String str = true + "";
		System.out.println(str);

    }
}
