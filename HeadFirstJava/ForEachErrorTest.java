public class ForEachErrorTest
{
	public static void main(String[] args){

		String[] books = {"������Java EE��ҵӦ��ʵս",
			"���Java����",
			"���Android����"
		};

		for (String book : books)
		{
			book  = "���Ajax����";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}