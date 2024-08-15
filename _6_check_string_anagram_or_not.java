/*to check two string are anagram or not 
 * anagram - s1=race   |      s3=liv    (rearranging word and making another word)
 *           s2=care   |      s4=evil
 * 
 */

 import java.util.Arrays;
  class anagram {
    public static void main(String[] args) {
       // initializing two Strings
       String inputStr1 = "Heart";
       String inputStr2 = "Earth";
       System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
       // converting their characters to lowercase
       inputStr1 = inputStr1.toLowerCase();
       inputStr2 = inputStr2.toLowerCase();
       // to check both strings are anagram or not
       if(inputStr1.length() == inputStr2.length()) { // checking length
          // converting the given strings into character arrays
          char[] array1 = inputStr1.toCharArray();
          char[] array2 = inputStr2.toCharArray();
          // sorting both arrays
          Arrays.sort(array1);
          Arrays.sort(array2);
          // checking equality and printing the result
          if(Arrays.equals(array1, array2)) {
             System.out.println("Both strings are anagram");
          } else {
             System.out.println("Both strings are not anagram.");
          }
       } else {
          System.out.println("Both strings are not anagram.");
       }
    }
 }




 //second approach

 class anamgram
 {
   public static void main(String[] args) 
   {
      int count=0;
      String str1="care";
      String str2="race";
      if(str1.length()!=str2.length()) 
      {
         System.out.println("String are not anagram");
      }
      else {
         for(int i=0;i<str1.length();i++)
         {
            for(int j=0;j<str2.length();j++)
            {
               if(str1.charAt(i)==str2.charAt(j))
               {
                  count++;
               }
            }
         }
         if(str1.length()==count)
         {
            System.out.println("string is anagram");
         }
         else{
            System.err.println("string is not anagram");
         }



      }

      
   }
 }
