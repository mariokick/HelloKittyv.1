package Maximum;

import java.util.Scanner;
public class use {
public static void main(String[] args) {
int a[] = {3,25,8,4,15};
int n = a.length;
int i = 0 ; 
int h =n-1;
System.out.println(max(a,i,h,n));
}
public static int max(int[] a, int i, int h, int n){
if(n==2){
if(a[i]>a[h]){
return a[i];
}
else{ 
return a[h];
}
}
else{
int m=(h+i)/2; // ���觢ͧ ������ m ��ҡ�ҧ
int max1 = max(a,i,m-1,n/2); // ��ǹ˹�� ��͹m 
int max2 = max(a,m,h,n/2);//��ǹ��ѧ ��ѧm
if(max1>max2){
return max1;
}
else{
return max2;
}
}
}
}