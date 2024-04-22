public class Kho_kho {
    public static void main(String[] args) {
        int a[]={1,2,3,2,2,7,5,8,0,1,2};
        int m=-999;
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i;j<a.length-1;j++){
                if(a[j]!=a[j+1]){
                    c++;
                }
                else{
                    c=0;
                }
                m=Math.max(m,c);
            }
        }
        System.out.println(m);
    }
}
