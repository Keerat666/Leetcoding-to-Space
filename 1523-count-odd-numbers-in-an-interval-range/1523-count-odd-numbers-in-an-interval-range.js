/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countOdds = function(low, high) {

        let adjustment = 0;
        if(low%2!=0)
        {
            low=low+1;
            adjustment =1;

        }
        
        if(high%2 != 0)
        {
            high = high+1;
        }

        let ans = ((high-low)/2)+adjustment;

        return ans;
    
};