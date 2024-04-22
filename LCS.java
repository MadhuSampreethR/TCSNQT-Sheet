public class LCS{
    public static void main(String[] args) {
        String s="aggtab",t="gxtxayb";
        int x=f(s.length()-1,t.length()-1,s,t);
        System.out.println(x);
    }
    static int f(int i,int j,String s,String t){
        if(i<0  ||  j<0){
            return 0;
        }
        if(s.charAt(i)==t.charAt(j)){
            return 1+f(i-1,j-1,s,t);
        }
        return Math.max(f(i-1,j,s,t),f(i,j-1,s,t));
    }
}
