class Solution 
{
    public int[] shuffle(int[] nums, int n)
    {
        		        int p = nums.length;
		        
		        int[] t = new int[p];
		        int j =0 ;
		        for (int i=0;i<p;i+=2){
		            t[i]=nums[j];
		            j++;
		        }
		        
		        
		        for (int i=1;i<p;i+=2){
		            t[i] = nums[n];
		            n++;
		        }

		        return t;
		    
    }

    
}
