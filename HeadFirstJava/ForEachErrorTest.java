public class ForEachErrorTest
{
	public static void main(String[] args){

		String[] books = {"轻量级Java EE企业应用实战",
			"疯狂Java讲义",
			"疯狂Android讲义"
		};

		for (String book : books)
		{
			book  = "疯狂Ajax讲义";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}