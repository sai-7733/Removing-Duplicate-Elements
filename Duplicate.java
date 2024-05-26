import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        ArrayList a1=new ArrayList();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c<=1){
                a1.add(a[i]);
            }
        }
        for(Object s:a1){
            System.out.println(s);
        }
    }
}