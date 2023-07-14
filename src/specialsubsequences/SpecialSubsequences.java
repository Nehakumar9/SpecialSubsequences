package specialsubsequences;

import java.util.Scanner;

public class SpecialSubsequences {
	
	public static int specialSubsequences(String str) {
		char[] s = str.toCharArray();
		int count = 0;
		int result =0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='A')
            {
                count++;
            }
            else if(s[i]=='G')
            {
                result += count;
            }
        }
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int value = specialSubsequences(str);
		System.out.println(value);
	}

}
