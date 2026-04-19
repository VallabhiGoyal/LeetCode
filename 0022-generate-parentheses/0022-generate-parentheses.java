class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        generate(n, 0, 0, sb , list);

        return list;
    }

    private void generate(int n, int open, int close, StringBuilder s, List<String> list){
        if(s.length() == 2*n){
            list.add(s.toString());
            return;
        }

        if(open < n){
            s.append("(");
            generate(n, open+1, close, s, list);
            s.deleteCharAt(s.length()-1);
        }

        if(close < open &&  close < n){
            s.append(")");
            generate(n, open, close+1, s, list);
            s.deleteCharAt(s.length()-1);
        }
    }
}