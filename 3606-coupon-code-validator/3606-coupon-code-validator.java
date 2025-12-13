class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        Map<String,Integer> priority = new HashMap<>();
        priority.put("electronics",0);
        priority.put("grocery",1);
        priority.put("pharmacy",2);
        priority.put("restaurant",3);

        List<int[]> valid = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for(int i = 0; i<code.length; i++){
            if(!isActive[i]) continue;

            String bl = businessLine[i].trim();
            String c = code[i];

            if(!priority.containsKey(bl)) continue;
            if(c.isEmpty()) continue;
            if(!c.matches("[a-zA-Z0-9_]+")) continue;

            valid.add(new int[]{i});
        }

        valid.sort((a,b) -> {
            int p1 = priority.get(businessLine[a[0]].trim());
            int p2 = priority.get(businessLine[b[0]].trim());

            if(p1 != p2){
                return p1-p2;
            }

            return code[a[0]].compareTo(code[b[0]]);
        });

        for (int[] idx : valid) {
            result.add(code[idx[0]]);
        }

        return result;

    }
}