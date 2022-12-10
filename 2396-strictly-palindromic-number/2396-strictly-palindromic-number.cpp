class Solution {
public:
string convert_number_to_base(int n, int base) {
        string str = "";
        
        while(n) {
            str += to_string(n % base);
            n /= base;
        }
        return str;
    }
    
    bool check_palindrom(string str) {
        int str_len = str.length();
        
        for(int i = 0; i < str_len / 2; i++) {
            if(str[i] != str[str_len - i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    bool isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++) {
            string base_str = convert_number_to_base(n, i);
            bool is_palindrom = check_palindrom(base_str);
            
            if (!is_palindrom) {
                return false;
            }
        }
        return true;
    }
};