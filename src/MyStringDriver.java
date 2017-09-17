
public class MyStringDriver {

	public static void main(String[] args) {
		
		char[] pizza = {'p','i','z','z','a'};
		char[] WALTER = {'W','A','L','T','E','R'};
		
		MyString lowerCaseString = new MyString(pizza);
		MyString upperCaseString = new MyString(WALTER);
		
		System.out.println("pizza.charAt(2): " + lowerCaseString.charAt(2));
        System.out.println("WALTER.length(): " + upperCaseString.length());
        System.out.println("pizza.substring(1,4): " + lowerCaseString.substring(1, 4));
        System.out.println("WALTER.toLowerCase(): " + upperCaseString.toLowerCase());
        System.out.println("pizza.toUpperCase(): " + lowerCaseString.toUpperCase());
        System.out.println("walter.equals(PIZZA)? : " + upperCaseString.equals(lowerCaseString));
        System.out.println("PIZZA.getMyString(): " + lowerCaseString.getMyString());
        System.out.println("walter.toString(): " + upperCaseString.toString());
        System.out.println("MyString.valueOf(747): " + MyString.valueOf(747));
	}
}
