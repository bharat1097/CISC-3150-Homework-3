
public final class MyString {
	
	private final char[] myStr;
	
	public MyString(char[] chars) {
		this.myStr = chars;
	}
		
	public char charAt(int index) {
		return this.myStr[index];
	}
		
	public int length(){
		return this.myStr.length;	
	}
	
	public MyString substring(int begin, int end) {
		
		char[] temp = new char[end - begin];
		for(int i = begin; i < end; i++)
			temp[i-begin] = this.myStr[i];
		
		return new MyString(temp);
	}
	
	public MyString toLowerCase() {
		
		for(int i = 0; i < this.length(); i++) 
			if (this.myStr[i] >= 65 && this.myStr[i] <= 90) 
                this.myStr[i] = (char)(this.myStr[i] + 32);
		
		return new MyString(this.myStr);
	}
	
	public MyString toUpperCase() {
		
		for(int i = 0; i < this.length(); i++) 
			if (this.myStr[i] >= 97 && this.myStr[i] <= 122) 
                this.myStr[i] = (char)(this.myStr[i] - 32);
		
		return new MyString(this.myStr);
	}
	
	public boolean equals(MyString s) {
		
		if(s.length() != this.length())
			return false;
		for(int i = 0; i < this.length(); i++)
			if(this.myStr[i] != s.myStr[i])
				return false;
		
		return true;
	}
	
	public MyString getMyString() {
		
		char[] temp;
		temp = this.myStr;
		return new MyString(temp);
	}	
	
	public String toString() {
		return new String(this.myStr);
	}
	
	public static MyString valueOf(int i) {
		
		// Math.log10(num) gives the number of digits - 1. Add 1 to get the actual number of digits.
		char[] temp = new char[(int)(Math.log10(i) + 1)];

		for (int j = temp.length - 1; j >= 0; j--) {
		    temp[j] = (char) ('0' + (i % 10));
		    i /= 10;
		}
		return new MyString(temp);
	}
}
