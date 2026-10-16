class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int rowlen = accounts.length;
        int collen = accounts[0].length;
        int max =0 ;

        for(int rowInd =0 ; rowInd<= rowlen-1 ; rowInd++)
        {
            int sum = 0;
            for(int colInd = 0 ; colInd <= collen -1 ; colInd ++ )
            {
               sum  = sum + accounts[rowInd][colInd] ;
            
            }

            if(sum>max)
            max=sum ;

        }
        return max ;

    }
}