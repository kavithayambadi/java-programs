import java.util.Scanner;

public class SubStringWithoutInbuilt {

   public static void main(String args[]){
    String s;
    String ss;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string :");
    s=sc.nextLine();
    System.out.println("Enter the word to be searched");
    ss=sc.nextLine();
    boolean result=false;
    for(int i=0;i<s.length();i++){
        for(int j=0;j<ss.length();j++){
            if(ss.charAt(j)==s.charAt(i)){
                if(j!=ss.length()-1&&i!=s.length()-1){
                    if(ss.charAt(j+1)==s.charAt(i+1)){
                        result=true;
                    }
                }
            }
        }
    }
    if(result==true){
        System.out.println("word  found");
    }
    else {
        System.out.println("word  not found");
    }
}
}