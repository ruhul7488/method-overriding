
public class Cal {
    public void calsum(int a,int b){
       int c=a+b;
    //    return c;
       System.out.println("sum is:"+c);

    }
    public void calsum(double a,double b, double c){
        double sm=a+b+c;
        System.out.println("sum is:"+sm);

    }

    public void calsum(int ar[]){
           int sum=0;
           int l= ar.length;
           for (int i=0;i<l;i++){
             sum=sum+ar[i];
           }
           System.out.println("sum is:"+sum);

    }


    
}
