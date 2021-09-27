public class PrimitiveAndString
{
	public static void main(String[] args) 
	{
		//错误代码示例：
		//String str1 = 5;
		//一个基本类型的值和字符串进行连接运算时，基本类型的值自动转换为字符串
		String str2 = 3.5f + "";
		System.out.println(str2);
		//下面语句输出7Hello!
		System.out.println(3 + 4 + "Hello!");
		//换个顺序对比一下
		System.out.println("Hello!" + 3 + 4);
	}
}
