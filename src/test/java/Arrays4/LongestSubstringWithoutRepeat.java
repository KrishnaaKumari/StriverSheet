package Arrays4;

import java.util.*;
public class LongestSubstringWithoutRepeat {
	
	public static int lengthOfLongestSubstring(String s)
	{
		int len=0;
		HashSet<Character>set=new HashSet<>();
		int l=0 ;
		for(int r=0 ; r<s.length(); r++)
		{
			if(!set.contains(s.charAt(r)))
			{
				set.add(s.charAt(r));
				len=Math.max(len, r-l+1);
			}
			else
			{
				while(set.contains(s.charAt(r)))
				{
					set.remove(s.charAt(l));
					l++ ;
				}
				
				set.add(s.charAt(r));
			}
		}
		return len ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pwwekw";
		System.out.println("length Of Longest Substring: "+lengthOfLongestSubstring(str));

	}

}
