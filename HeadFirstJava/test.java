public class test {
    public static void main (String[] args) {
		int x=0,y=0;
		int which2run=4;
		while(x < 5)
		{
			if ( which2run == 0 )
			{
				y = x - y;
			}
			

			if ( which2run == 1 ) 
			{
				y = y + x;
			}

			if ( which2run == 2 ) 
			{
				y = y + 2;
				if (y > 4)
				{
					y = y-1;
				}
			}

			if ( which2run == 3 ) 
			{
				x = x + 1;
				y = y + x;
			}

			if ( which2run == 4 ) 
			{
				if ( y < 5 )
				{
					x = x + 1;
					if (y < 3)
					{
						x = x - 1;
					}
				}
				y = y + 2;
			}
						
			System.out.println(x+""+y+"");
			x = x+1;
		}

        //char c = 'x';
        //System.out.println("C = "+c);
    }
}