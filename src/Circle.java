import java.util.Scanner;

public class Circle {

	private static double radiusExcircle;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("This‬‬ ‫‪program‬‬ ‫‪calculates‬‬ ‫‪the‬‬ ‫‪areas‬‬ ‫and‬‬ ‫‪the‬‬ ‫‪perimeters‬‬ ‫‪of‬‬ ‫‪the‬‬ ‫‪excircle‬‬ ‫‪and‬‬ ‫‪the‬‬ ‫‪incircle‬‬ ‫of‬‬ ‫‪a‬‬ ‫‪given‬‬ ‫‪rectangle‬‬");
		System.out.print("Please‬‬ ‫‪enter‬‬ ‫‪the‬‬ ‫‪two‬‬ ‫‪coordinates‬‬ ‫‪of‬‬ ‫‪the‬‬ ‫left-upper‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle");
		int leftUpX = scan.nextInt();
		int leftUpY = scan.nextInt();
		System.out.print("Please‬‬ ‫‪enter‬‬ ‫‪the‬‬ ‫‪two‬‬ ‫‪coordinates‬‬ ‫‪of‬‬ ‫‪the‬‬ right-lower‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle");
		int rightDownX = scan.nextInt();
		int rightDownY = scan.nextInt();
		
		while (rightDownX >= leftUpX) {
			System.out.print("Please‬‬ ‫‪re-enter‬‬ ‫‪the‬‬ ‫coordinate X ‫‪of‬‬ ‫‪the‬‬ right-lower‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle: it cannot be larger than the coordinate X of‬‬ ‫‪the‬‬ ‫left-upper‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle");
			rightDownX = scan.nextInt();			
		}
		
		while (rightDownY <= leftUpY) {
			System.out.print("Please‬‬ ‫‪re-enter‬‬ ‫‪the‬‬ ‫ ‫‪coordinate Y ‫‪of‬‬ ‫‪the‬‬ right-lower‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle:  it cannot be smaller than the coordinate Y of‬‬ ‫‪the‬‬ ‫left-upper‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle");
			rightDownY = scan.nextInt();			
		}
		
		while (leftUpX - rightDownX > rightDownY - leftUpY) {
			System.out.print("Please ‬re-‫‪enter‬‬ ‫‪the‬‬ ‫‪two‬‬ ‫‪coordinates‬‬ ‫‪of‬‬ ‫‪the‬‬ right-lower‬‬ ‫‪point‬‬ ‫‪of‬‬ ‫‪the‬‬ rectangle");
			rightDownX = scan.nextInt();
			rightDownY = scan.nextInt();
		}
		
//		converting variables to double type
		double dLeftUpX = leftUpX;
		double dLeftUpY = leftUpY;
		double dRightDownX = rightDownX;
		double dRightDownY = rightDownY;
		
//		calculating radius of the inscribed circle
		double radiusIncircle = (dLeftUpX - dRightDownX)/2;
		System.out.println("The radius of the incircle is " + radiusIncircle);
		
//		calculating area of the inscribed circle
		double areaIncircle= Math.PI * Math.pow(radiusIncircle, 2);
		System.out.println("The area of the incircle is " + areaIncircle);
		
//		calculating circumference of the inscribed circle
		double perimeterIncircle = 2 * Math.PI * radiusIncircle;
		System.out.println("The perimeter of the incircle is " + perimeterIncircle);
		
//		calculating radius of the circumsribed circle
		double rectangleDiagonal = Math.sqrt(Math.pow(dLeftUpX - dRightDownX, 2) + Math.pow(dRightDownY - dLeftUpY, 2));
		double radiusExcircle = rectangleDiagonal/2;
		System.out.println("The radius of the excircle is " + radiusExcircle);
		
//		calculating area of the circumscribed circle
		double areaExcircle = Math.PI * Math.pow(radiusExcircle, 2);
		System.out.println("The area of the excircle is " + areaExcircle);
		
//		calculating circumference of the circumscribed circle
		double perimeterExcircle = 2 * Math.PI * radiusExcircle;
		System.out.println("The perimeter of the excircle is " + perimeterExcircle);
				
	}

}
