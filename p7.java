import java.io.*;
import java.util.*;
class p7{  
public static void main (String[] args) 
{  
int arr[] = {10,20,20,30,30,40,50,50};  
int n = arr.length,m=0,k=0,i;  
if (n==0 || n==1)
{  
m=n;  
}  
int[] temp = new int[n];  
int j = 0;  
for(i=0; i<n-1; i++)
{  
if (arr[i] != arr[i+1]){  
temp[j++] = arr[i];  
}  
}  
temp[j++] = arr[n-1];     
for(i=0; i<j; i++)
{  
arr[i] = temp[i];  
}  
k=j;  

for(i=0; i<n; i++) { 
System.out.print(arr[i]+" ");}  
}  
}  
