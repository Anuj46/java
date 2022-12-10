class Solution {
public:
    int mostWordsFound(vector<string>& s) {
       int res = INT_MIN;
        
        for(int i=0;i<s.size();i++){
            int c = 1;
            for(int j=0;j<s[i].size();j++){
                if(s[i][j]==' '){
                    c++;
                }
            }
            if(c>res){
                res = c;
            }
        }
        return res;
    }
};