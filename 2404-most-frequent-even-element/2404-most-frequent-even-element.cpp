class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {   
        sort(nums.begin(), nums.end());
        int ans = -1;
        int n = nums.size();
        int cout = 0;
        int max=0;
        int val= 0;
        for(int i=0; i<n;i++){ 
             if(nums[i]%2==0){ 
                cout= 0;
                val = nums[i];
                while(i<n && nums[i]==val){ 
                    cout++;
                    i++;
                }
                i--;
                if(cout>max){ 
                    max = cout;
                    ans = val;
                }
             }
        } 
        return ans;
        
    }
};