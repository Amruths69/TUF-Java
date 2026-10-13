class Solution {
    public void pattern9(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }


    }
}