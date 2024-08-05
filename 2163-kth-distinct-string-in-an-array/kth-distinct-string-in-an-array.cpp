class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
         unordered_map<string, int> countMap;
         vector<string> distinctStrings;
        for (string& s:arr) {
            countMap[s]++;
        }
        for (string& s :arr) {
            if (countMap[s]==1) {
              distinctStrings.push_back(s);
            }
        }
        if (k >= 1 && k <= distinctStrings.size()) {
            return distinctStrings[k - 1];
        } else {
            return "";
        }
    }
};
