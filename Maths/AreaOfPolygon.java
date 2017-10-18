/*This is a program to calculate area of a polygon be it concave or convex. In this we apply the concept of shifting of origin adn the fact
that the area id negati vein clockwise direction whereas it is positive in counter-clockwise direction.*/
import java.util.Scanner;
class AreaOfPolygon{
	public static double cross_product(Point a,Point b){
		return a.x*b.y - a.y*b.x;
	}
	public static double area(Point[] vertices, int n){
		double sum=0.0;
		int i;
		for(i=0;i<(n-1);i++){
			sum +=cross_product(
				vertices[i],
				vertices[i+1]);
		}
		sum += cross_product(vertices[i],vertices[0]);
		return Math.abs(sum)/2.0;
	}
	public static void main(String args[])throws Exception{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter two numbers of sides of polygon");
		int n=d.nextInt();
		double x,y;
		Point[] obj =new Point[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter x co-ordinate of point "+(i+1));
			x=d.nextDouble();
			System.out.println("Enter y co-ordinate of point "+(i+1));
			y=d.nextDouble();
			obj[i]=new Point(x,y); 
		}
		System.out.println("Area of Polygon: "+area(obj,n));
	}
}
class Point{
	double x;
	double y;
	Point(double a, double b){
		x=a;
		y=b;
	}	
}