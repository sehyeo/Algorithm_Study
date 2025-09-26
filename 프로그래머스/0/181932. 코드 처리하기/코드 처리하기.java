class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) == '1') {
                    mode = 1;
                } else {
                    if (idx % 2 == 0) {
                        ret += code.charAt(idx);
                    }
                }
            } else if (mode == 1) {
                if (code.charAt(idx) == '1') {
                    mode = 0;
                } else {
                    if (idx % 2 == 1) {
                        ret += code.charAt(idx);
                    }
                }
            }
        }
        
        if (ret.equals("")) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}