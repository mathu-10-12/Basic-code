import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c;
        int i=0,l=0,d=0,sy=0;
        int len=s.length();
        System.out.println(len);
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(Character.isLetter(c)){
                l++;
            }
             else if(Character.isDigit(c)){
                 d++;
             }
              else{
                  sy++;
              }
        }
        System.out.println(l);
        System.out.println(d);
        System.out.println(sy);
    }
}
