class Solution {
    public void pattern17(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                char c=(char)(64+j);
                String S=Character.toString(c);
                System.out.print(S);
            }
            for(int j=i-1;j>=1;j--){
                char c=(char)(64+j);
                String S=Character.toString(c);
                System.out.print(S);
            }
            System.out.println();
        }

    }
}