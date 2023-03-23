package DSA;

public class stack_client {
    public static void main(String[] args) throws Exception {
        stack st=new stack();
        st.push(5);
        st.push(4);
        st.push(0);
        st.push(11);
        st.push(12);
        st.display();
        st.push(15);
        
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();




    }
    
}
