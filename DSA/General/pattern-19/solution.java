class Solution {
    public void pattern19(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j!=1){
                System.out.print(" ");
            }}
            for(int j=n;j>=i;j--){
                System.out.print("*");
                
            }
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}