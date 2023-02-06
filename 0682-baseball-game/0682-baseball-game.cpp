class Solution {
public:
    int calPoints(vector<string>& v) {
        vector<int> ans;
        int n = v.size();
        for (int i=0;i<n;i++) {
            if (v[i] == "C")
                ans.pop_back();
            else if (v[i] == "D")
                ans.push_back(ans.back() * 2);
            else if (v[i] == "+")
                ans.push_back(ans.back() + ans[ans.size() - 2]);
            else
                ans.push_back(stoi(v[i]));
        }
        
        int m = ans.size();
        int sum = 0;
        
        for(int i=0;i<m;i++){
            sum+=ans[i];
        }
        return sum;
    }
};