package DSA;

import java.util.*;

public class Reversestack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(300);
        st.push(40);
        st.push(50);
        System.out.println(st);
        revest(st);
        System.out.println(st);

    }
    public static void revest( Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int item=st.pop();
        revest(st);
        Insert_down(st,item); 

    }
    public static void Insert_down(Stack<Integer>st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int item=st.pop();
        Insert_down(st,ele);
        st.push(item);
    }
    
}
