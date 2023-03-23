package DSA;

import java.util.Stack;
public class next_greater {
    public static void main(String[] args) {
        int a[] = {2, 1, 3, 9, 8, 1, 2, 3, 4, 6, 7} ;
        
        NGE(a);
    }
    public static void NGE(int a[]) {
        int ans[] = new int[a.length] ;
        Stack<Integer> st  = new Stack<>() ;
        for(int i=0; i<a.length; i++){
            while (!st.isEmpty() && a[i] > a[st.peek()]) {
                ans[st.pop()] =a[i] ;
            }
            st.push(i) ;
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1 ;
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(a[i] + " " + ans[i]);
        }
    }       
}
