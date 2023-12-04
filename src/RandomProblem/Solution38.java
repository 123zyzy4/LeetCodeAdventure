package RandomProblem;

public class Solution38 {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String previousResult = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        Character target = null;
        int count = 0;

        int index = 0;

        while(index<previousResult.length()){
            count = 0;
            target = previousResult.charAt(index);
            while(index<previousResult.length()&&previousResult.charAt(index)==target){
                index++;
                count++;
            }
            sb.append(count).append(target);

        }
        return sb.toString();
    }
}
