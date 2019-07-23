package org.strings;

public class Practice 
{
	public static void main(String [] args) 
	{
		String str1 = "toptoptop";
        System.out.println(removeDuplicateChars(str1));
        String str2 = "hello";
        System.out.println(removeDuplicateChars(str2));
        String str3= "toptop";
        String str4  = str3.replace('t', 'a');
        System.out.println(str4);
        
    }
 
    private static String removeDuplicateChars(String sourceStr) {
        // Store encountered letters in this string.
        char[] chrArray = sourceStr.toCharArray();
        String targetStr = "";
 
        // Loop over each character.
        for (char value : chrArray) {
            // See if character is in the target
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; // Use StringBuilder as shown below
            }
        }
        return targetStr;

    
	}

}
