//第一周
import java.util.Scanner;
class Fraction{
	
	private int a;
	private int b;
	Fraction(int a,int b){
		int jl=a;
		for(int i=2;i<=jl;i++)
		{
			if(a%i==0)
			{
				if(b%i==0)
				{
					a=a/i;
					b=b/i;
				}
			}
		}
		this.a=a;
		this.b=b;
	}
	double toDouble()
	{
		return ((double)a)/b;
	}
	Fraction plus(Fraction r) {
		int c,d;
		if(r.b==this.b)
		{
			d=this.b;
			c=r.a+this.a;
		}
		else
		{
			int rb=r.b,ra=r.a,tb=this.b,ta=this.a;
			rb=r.b*this.b;
			ra=r.a*this.b;
			
			tb=r.b*this.b;
			ta=r.b*this.a;
			c=ra+ta;
			d=rb;
			int jl=c;
			for(int i=2;i<=jl;i++)
			{
				if(c%i==0)
				{
					if(d%i==0)
					{
						c=c/i;
						d=d/i;
					}
				}
			}
		}
		Fraction fh=new Fraction(c,d);
		return fh;
	}
	Fraction multiply(Fraction r)
	{
		int c,d;
		c=this.a * r.a;
		d=this.b * r.b;
		int jl=c;
		for(int i=2;i<=jl;i++)
		{
			if(c%i==0)
			{
				if(d%i==0)
				{
					c=c/i;
					d=d/i;
				}
			}
		}
		Fraction fh =new Fraction(c,d);
		return fh;
	}
	void print()
	{
		if(this.a==this.b)
		{
			System.out.println("1");
		}
	    else
		System.out.println(a+"/"+b);
	}
}
	




public class Main {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}

}


//第三周
import java.util.ArrayList;
import java.util.Scanner;
class City{
	private int cityNum;
	ArrayList<String> cityName =new ArrayList<String>();
	public void creatCity(String name)
	{
		cityName.add(name);
	}
	public int getNum()
	{
		this.cityNum = cityName.size();
		return this.cityNum;
	}
	public int find(String s)
	{
		int i=0;
		while(!cityName.get(i).equals(s))
		{
			i++;
			if(i>=cityNum)
			{
				return -1;
			}
		}
		return i;
	}
}
public class Main {
	public static void main(String[] args) {
		City inputCity =new City();
		Scanner scan =new Scanner(System.in);
		String input =scan.next();
		while(!input.equals("###"))
		{
			inputCity.creatCity(input);
			input =scan.next();
		}
		int n =inputCity.getNum();
		int n1=(n)*(n);
		int [] jl =new int[n1];
		for(int i=0;i<n1;i++)
		{
			jl[i] = scan.nextInt();
		}
		String city1,city2;
		int num1,num2;
		city1=scan.next();
		city2=scan.next();
		num1=inputCity.find(city1);
		num2=inputCity.find(city2);
		int finalNum;
		if(num1==0)
		{
			finalNum =jl[num2];
		}
		else
		{
			finalNum =jl[(n)*num1+num2];
		}
		System.out.print(finalNum);
	}
}
