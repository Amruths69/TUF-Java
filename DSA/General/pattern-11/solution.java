class Solution {
    public void pattern11(int n) {
       
        for(int i=1;i<=n;i++){
            int c=0;
            if(i%2!=0){ c=1;}
            else{
                 c=0;
            }
            for(int j=1;j<=i;j++){
                
                
                if(c%2!=0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
                c++;
            }
            System.out.println();
            }

    }
}