import java.util.*;
class vowels
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("elements are");
char ch = s.next(".").charAt(0);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
{
 System.out.println(ch + " is vowel");
}
  else
{
  System.out.println(ch + " is consonant");

}
}
}
