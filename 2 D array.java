public class MatrixAddMul{  
public static void main(String args[]){  

int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};       
int c[][]=new int[3][3];   
int j;  
 System.out.println("the Addition of array is :");
for(int i=0;i<3;i++){    
for( j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];      

System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
System.out.println("the multiplication of array is:");  
for(int i=0;i<3;i++){    
for(j=0;j<3;j++)
c[i][j]=0;
for(int k=0;k<3 ;k++)
{    
c[i][j]= c[i][j]+a[i][k]*b[k][j];        
}    System.out.print(c[i][j]+" ");}
System.out.println();//new line    

}}
