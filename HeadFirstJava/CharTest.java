public class CharTest
{

	public static void main (String[] args)
	{
		// 直接指定单个字符作为字符值
		char aChar = 'a';
		// 使用转义字符来作为字符值
		char enterChar = '\r';
		// 使用Unicode编码值来指定字符值
		char ch = '\u9999';
		// 将输出一个'香'字
		System.out.println(ch);
		char zhong = '疯';
		// 直接将一个char变量当成int类型变量使用
		int zhongValue = zhong;
		System.out.println(zhong+"的数值是"+zhongValue);
		// 直接把一个0~65535范围内的int整数赋给一个char变量
		char c = 97;
		System.out.println(c);

		// s变量一个引用类型的变量，是字符串实例的引用
		//String s = "沧海月明珠有泪，蓝田玉暖日生烟";

		String str = true + "";
		System.out.println(str);

	}
}