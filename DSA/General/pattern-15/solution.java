class Solution {
    public void pattern15(int n) {
        for(int i=n;i>=1;i--){
            int g=1;
            for(int j=i;j>=1;j--){

                char c=(char)(64+g);
                g++;
                String S=Character.toString(c);
                System.out.print(S);
            }
            System.out.println();
        }

    }
}