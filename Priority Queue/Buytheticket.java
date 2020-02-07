import java.util.*;
public class Solution {

    public static int buyTicket(int input[], int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue <Integer> q=new LinkedList<>();

        for(int i:input){
            q.add(i);
            pq.add(i);
        }
        int count=0;
        while(!pq.isEmpty()){
            if(pq.peek().equals(q.peek())){
                if(k==0){
                    return count+1;
                }else{
                    q.poll();
                    pq.poll();
                    count++;
                    k--;
                }
            }
            else{
                q.add(q.peek());
                q.poll();
                if(k==0){
                    k=q.size()-1;
                }else{
                    k--;
                }
            }
        }
        return count;
    }
}
