class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        char[] res=t.toCharArray();
        Arrays.sort(res);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=res[i]) return false;
        }
        return true;
    }
}
