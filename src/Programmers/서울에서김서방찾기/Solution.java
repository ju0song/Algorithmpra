package src.Programmers.서울에서김서방찾기;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int num=0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                num=i;
                break;
            }
        }
        return answer="김서방은 "+num+"에 있다";
    }
}