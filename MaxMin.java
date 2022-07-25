import java.util.*;
class MaxMin
  {
public static void main(String args[])
  {
  int x,k,min,max;
  Scanner d=new Scanner(System.in);
  System.out.println("Enter no of elements");
   x=d.nextInt();
  int arr[]=new int[x];
  System.out.println("Enter array elements");
  for(k=0;k<x;k++)
    arr[k]=d.nextInt();
  min=max=arr[0];
  for(k=1;k<x;k++)
    {
      if(min>=arr[k])
        min=arr[k];
      if(max<=arr[k])
        max=arr[k];
    }
  System.out.println(+max);
  System.out.println(+min);     
    }
}

  