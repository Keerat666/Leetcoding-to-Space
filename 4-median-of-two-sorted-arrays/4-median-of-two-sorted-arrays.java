class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int mergedArr[]=new int[nums1.length+nums2.length];
        
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=nums1.length+nums2.length;
        
        int arr1_counter=0;
        int arr2_counter=0;
        double ans=0.0;
        int index=0;
        
        while(true)
        {
            
            if(arr1_counter == n1)
            {
                for(int i=arr2_counter;i<n2;i++)
                {
                     mergedArr[index]=nums2[i];
                    index++;
                }
                break;
            }
            
            else if(arr2_counter == n2)
            {
                for(int i=arr1_counter;i<n1;i++)
                {
                     mergedArr[index]=nums1[i];
                    index++;
                }
                break;
            }
            else if(nums1[arr1_counter]<nums2[arr2_counter])
            {
                mergedArr[index]=nums1[arr1_counter];
                arr1_counter++;
            }
            else
            {
                mergedArr[index]=nums2[arr2_counter];
                arr2_counter++;
            }
            
            index++;
            
            if(index == n3)
                break;
        }
        
        if(n3%2!=0)
            ans=mergedArr[n3/2];
        else
        {
            double sum=mergedArr[n3/2]+mergedArr[(n3/2)-1];
            ans=sum/2;
        }
        
        return ans;
            
    }
}