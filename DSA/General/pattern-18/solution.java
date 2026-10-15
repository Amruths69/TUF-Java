class Solution {
    public void pattern18(int n) {
        int c1=0;
        for(int i=1;i<=n;i++){
            
            c1=n-i+1;
            int iu=0;
            for(int j=1;j<=i;j++){
                
                char c=(char)(64+c1);
                String S=Character.toString(c);
                System.out.print(S+" ");
                c1++;
                
            }
            System.out.println();
        }

    }
}