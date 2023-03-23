package DSA;

public class stack {
    private int [] arr;
    int tos;
    public stack(){
        arr=new int [5];
        tos=-1;

    }
    //constructor
    public stack(int n){
        arr=new int [n];
        tos=-1;
    }
    public boolean isempty(){
        return tos==-1;
    }
    public boolean isfull(){
        return tos==arr.length-1;

    }
    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("Extra go gya bro");
        }
        tos++;
        arr[tos]=item;

    }
    public int size(){
        return tos+1;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("Stack khali hai bro");

        }
        int x=arr[tos];
        tos--;
        return x;
    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("Stack khali hai bro");

        }
        int s=arr[tos];
        return s;
    }
    public void display(){
        for(int i=0;i<=tos;i++){
            System.out.println(arr[i]+"->");
        }
        System.out.println(".");
    }
    
}
