package DSA;

public class queue {
    private int arr[] ;
    private int front ;
    private int size ;

    public queue(){
        arr= new int[5] ;
        front = 0 ;
        size= 0 ;
    }

    public queue(int n){
        arr= new int[n] ;
        front = 0 ;
        size= 0 ;
    }

    public boolean isEmpty(){
        return size== 0 ;
    }

    public boolean isFull(){
        return size== arr.length ;
    }

    public int size(){
        return size ;
    }

    public void Enqueue(int item)throws Exception{
        if(isFull()){
            throw new Exception("Queue full h");
        }
        int idx = (front +size )%arr.length;
        arr[idx] = item ;
        size++ ;
    }

    public int Dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue empty h");
        }
        int rv= arr[front] ;
        front++ ;
        size-- ;
        return rv ;
    }
    public int getFront(){
        int rev = arr[front];
        return rev;
    }
    public void display(){
        for(int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }

}
