
public class GreatCircle {

	public static void main(String[] args) {
		
		double x1 = Math.toRadians(Double.parseDouble(args[0])); 
		double x2 = Math.toRadians(Double.parseDouble(args[1])); 
		double y1 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));
		
		double r = 6371.0;
		double distance;
		
		
//		(Math.sqrt())
//		((Math.sin(x2 - x1)/(2)   sin2(x2−x12)+ Math.cos(x1) * Math.cos(x2)* Math.sin ((y2−y1)/2)
//		
//		Math.toRadians()
		double ttt = y2 - y1;
		double distance2 = Math.sqrt((y2-y1)/2);
		
		//distance = (2*r) * (Math.sin((Math.sqrt(x2-x1)/2) * ((Math.cos(x2)*Math.cos(x1)* Math.sqrt(Math.sin((y2-y1)/2))))));
				//(Math.sin(x2 - x1)/(2) * (Math.cos(x2)) * (Math.sin ((y2−y1)/2)))))));
		System.out.println("Result is : " + ttt + " " +  distance2);
		
	}	

}
