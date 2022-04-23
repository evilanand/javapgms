public class Main{  
public static void main(String args[])
{  
int a[][]={{1,3,4},
           {2,4,3},
           {3,4,5}};
           
int b[][]={{1,3,4},
           {2,4,3},
           {1,2,4}};
           
int c[][]=new int[3][3]; 
int d[][]=new int[3][3];

//line 16 to 24 code is for sum 
System.out.println("sum of two matrix"); 
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
c[i][j]=a[i][j]+b[i][j];     
System.out.print(c[i][j]+" ");
}    
}  

//line 27 to 35 code is for sum
System.out.println("\nmultiplication of two matrix"); 
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
d[i][j]=a[i][j]*b[i][j];     
System.out.print(d[i][j]+" ");    
}    
}    
}
}  
