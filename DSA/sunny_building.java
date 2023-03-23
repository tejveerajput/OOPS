package DSA;
import java.util.*;

public class sunny_building {
    public static void main(String[] args) {
        int b[]={3,6,1,4,18,7,5,11};
        SB(b);

    }
    public static void SB(int b[]){
        int[] ans=new int[b.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<b.length;i++){
            while(!st.isEmpty() && b[i]>=b[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println("ANSWER..");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
