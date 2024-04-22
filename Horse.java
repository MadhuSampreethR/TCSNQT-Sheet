public class Horse {
    public static void main(String[] args) {
        int a[]={100,90,80,20,90,60,40,60,70,75};
        int i=0,j=1,sum=a[0],c=1,m=0;
        while(j<a.length){
            sum+=a[j];
            while(sum>100 && i<j){
                sum-=a[i];
                i++;
                c--;
            }
            if(sum<=100){
                c++;
            }
            m=Math.max(c,m);
            j++;
        }
        System.out.println(c);
    }
}
