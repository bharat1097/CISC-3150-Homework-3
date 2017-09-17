
public class MyStringDriver {

	public static void main(String[] args) {
		
		char[] pizza = {'p','i','z','z','a'};
		char[] WALTER = {'W','A','L','T','E','R'};
		
		MyString lowerCaseString = new MyString(pizza);
		MyString upperCaseString = new MyString(WALTER);
		
		System.out.println("pizza.charAt(2): " + lowerCaseString.charAt(2));
        System.out.println("WALTER.length(): " + upperCaseString.length());
        System.out.println("pizza.substring(2,4): " + lowerCaseString.substring(0, 4));
        System.out.println("WALTER.toLowerCase(): " + upperCaseString.toLowerCase());
        System.out.println("pizza.toUpperCase(): " + lowerCaseString.toUpperCase());
        System.out.println("WALTER.equals(pizza)? : " + upperCaseString.equals(lowerCaseString));
        System.out.println("pizza.getMyString(): " + lowerCaseString.getMyString());
        System.out.println("WALTER.toString(): " + upperCaseString.toString());
        System.out.println("MyString.valueOf(666): " + MyString.valueOf(666));
	}
}
