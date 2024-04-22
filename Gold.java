public class Gold {
    public static void main(String[] args) {
        int a[]={10,3,5,7,5,4,5,8,1,0};
        int i=0,j=1,sum=a[0];
        while(j<a.length){
            sum+=a[j];
            while(sum>15 && i<j){
                sum-=a[i];
                i++;
            }
            if(sum==15){
                System.out.println(i+1+","+(j+1));
                return;
            }
            j++;
        }
        
    }
}
