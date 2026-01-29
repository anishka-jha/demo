import java.util.*;
public class vowelcheck {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    System.out.println("enter a character");
    char ch=in.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='U')
    System.out.println("vowel");
    else if(ch>=97&&ch<=122|| ch>=65&&ch<=90)
    System.out.println("consonent");
    else
    System.out.println("not a character");
    }
    
}