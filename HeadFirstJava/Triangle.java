class Triangle 
{
    double area;
    int height;
    int length;

    public static void main(String[] args) 
    {
        int x = 0;//feed 1

        Triangle [] ta = new Triangle[4];   //feed 2

        while (x < 4){   //feed3
            ta[x] = new Triangle();     //feed 4
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();

            System.out.print("triangle " +x+", area");
            System.out.println(" = " + ta[x].area);

            x=x+1;
        }

        int y = x; //feed 5
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea () {
        area = (height * length) / 2;
    }
}
