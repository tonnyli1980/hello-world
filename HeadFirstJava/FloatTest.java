public class FloatTest 
{
	public static void main(String[] args) 
	{
		float af = 5.234556f;
		// 下面将看到af的值已经发生了改变
		System.out.println(af);
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		// 看到float和double的负无穷大是相等的
		System.out.println(c == d);
		// 0.0除0.0将出现非数
		System.out.println(a/a);
		// 两个非数之间是不相等的
		System.out.println(a/a == Float.NaN);
		// 所有的正无穷大都是相等的
		System.out.println(6.0 / 0 == 555.0 / 0);
		// 负数除0.0得到负无穷大
		System.out.println(-8 / a);
		// 下面代码将抛出除以0的异常
		//System.out.println(0 / 0);	//Exception
		System.out.println(6.0 / 0);	//Infinity
		System.out.println(0 / 0.0);	//NaN
		System.out.println(6.0 / 0.0);	//Infinity
	}
}
