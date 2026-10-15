    class Solution {
        public void pattern12(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for(int j=n*2-(2*i)+1;j>1;j--){
                    System.out.print(" ");
                    
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                    
                }
                System.out.println();
            }


        }
    }