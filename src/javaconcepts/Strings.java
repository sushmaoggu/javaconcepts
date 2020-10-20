package javaconcepts;
//
//public class Strings {
//	public static void printWord(String s)
//	{
//		for (String word: s.split(" "))
//		{
//		System.out.println(word);
//		}
//		
//	}
//	public static void main(String[] args) {
//		String txt = "Hello Everybody";
//		
//		printWord(txt);
//	}
//
//}
//class Strings { 
//  
//    // Function to convert float value to String value 
//    public static String convertFloatToString(float floatValue) 
//    { 
//  
//        // Convert float value to String value 
//        // using + operator method 
//        String stringValue = "" + floatValue; 
//  
//        return (stringValue); 
//    } 
//  
//    // Driver code 
//    public static void main(String[] args) 
//    { 
//  
//        // The float value 
//        float floatValue = 1; 
//  
//        // The expected string value 
//        String stringValue; 
//  
//        // Convert float to string 
//        stringValue = convertFloatToString(floatValue); 
//  
//        // Print the expected string value 
//        System.out.println( 
//            floatValue 
//            + " after converting into string = "
//            + stringValue); 
//    } 
//} 


class Strings{ 
  
    // Function to convert String to Byte 
    public static byte convertStringToByte(String str) 
    { 
  
        // Convert string to byte 
        // using parseByte() method 
        return Byte.parseByte(str); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
    	String s1= new String("apple");
    	String s2= new String("apple");
    	String s3= new String("apple");

    	System.out.println("s1==s2"+s1==s2);

    	System.out.println(s3.equals(s2));
    	
        // The string value 
//        String stringValue = "1"; 
//  
//        // The expected byte value 
//        byte byteValue; 
//  
//        // Convert string to byte 
//        byteValue = convertStringToByte(stringValue); 
//  
//        // Print the expected byte value 
//        System.out.println( 
//            stringValue 
//            + " after converting into byte = "
//            + byteValue); 
//        System.out.println(2+0+1+6+"GeeksforGeeks"); 
//        System.out.println("GeeksforGeeks"+2+0+1+6); 
//        System.out.println(2+0+1+5+"GeeksforGeeks"+2+0+1+6); 
//        System.out.println(2+0+1+5+"GeeksforGeeks"+(2+0+1+6)); 
    } 
} 