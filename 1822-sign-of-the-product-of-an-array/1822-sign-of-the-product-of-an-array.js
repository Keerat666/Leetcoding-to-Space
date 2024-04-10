/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
    
    let negative =0;
    
    for(let i in nums)
        {
            if(nums[i]<0)
                negative ++;
            else if(nums[i]===0)
                return 0;
        }
    
        if(negative%2===0)
            return 1;
        else
            return -1;
        
    
};