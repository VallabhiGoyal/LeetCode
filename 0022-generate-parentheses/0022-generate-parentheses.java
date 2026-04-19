class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        generate(n, 0, 0,"", list);

        return list;
    }

    private void generate(int n, int open, int close, String s, List<String> list){
        if(s.length() == 2*n){
            list.add(s);
            return;
        }

        if(open < n){
            generate(n, open+1, close, s + "(", list);
        }

        if(close < open &&  close < n){
            generate(n, open, close+1, s+")", list);
        }
    }
}