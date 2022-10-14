public class Main {



    public static void main(String[] args) {
        System.out.println("Hello Aglaia!");

        int x = 2;
        int y = x + 5;
        System.out.println(y);
        double a = 5.5;
        double b = 22222.99999;

        System.out.println(a + b);

        char f = 'a';
        char g = 'h';
        System.out.println(f + g);

        boolean tr = true;
        boolean fl = false;
        System.out.println(tr);
        System.out.println(fl);

        int mark = 89;

        if (mark > 90) {
            System.out.println("Your are the best");
        } else {
            System.out.println("You need to study");


        }

        mark = 55;

        if (mark > 90) {
            System.out.println("Your are the best");
        } else if (mark > 80) {
            System.out.println("You need to study");
        } else {
            System.out.println("You need to study MORE");
        }

        int num_first = 10;
        { System.out.println("Number  " + num_first);}
        {System.out.println("Number Next  " + (num_first + 1));}
        {System.out.println("Number  Previous   " + (num_first - 1));}











        int age = 12;
                if (age<0)
                {System.out.println("wrong age" );}
                else if (age<18)
                {System.out.println("teenager" );}
                else
                {System.out.println("adult" );}


        int salary =4000;
        int work=2;
            if (work<3)
            {System.out.println("New salary   " + (salary +salary *0.1));}
            else
            {System.out.println(salary +salary *0.2);}

        int newSalary = 6000;
            if (newSalary<4000)
            {System.out.println("Real salary   " + ((newSalary + 1000)));  }
            else
            {System.out.println("Real salary   " + ((newSalary + 500)));  }


            int a1=1;
            int an =50;
            int n = 50;
            {System.out.println((a1+an)*n/2);}

















    }

}