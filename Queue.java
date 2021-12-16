public class Queue {

    int arr[] = new int[5];
    int front,rear,size = 0;
    
    // To add the element in queue
    public void enqueue(int data){
        if(!isFull()){
        arr[rear] = data;
        rear = (rear+1)%5;
        size++;
        }
        else{
            System.out.print("Alert! Queue is Full");
        }
    }

    //To remove element in queue
    public void dequeue(){
        int data = arr[front];
        if(!isEmpty()){
        
        front=(front+1)%5;
        size--;
        System.out.print("Removed element: "+data);
        }
        else{
            System.out.print("Alert! Queue is empty");
        }
        System.out.println();
    }

    //To check queue is empty or full
    public boolean isEmpty(){
        return (getsize() == 0);
    }

    public boolean isFull(){
        return getsize() == 5;
    }
    

    //To print elements of queue
    public void show(){
        System.out.print("Elements in the queue: ");
        for(int i =0; i<size; i++){
            System.out.print(arr[(front+i)%5]+" ");
        }
        System.out.println();
    }

    //size of queue
    public int getsize(){
        return size;
    }


    public static void main(String[] args) {
        
        Queue que = new Queue();

        que.enqueue(36);
        que.enqueue(12);
        que.enqueue(74);



        que.show();

        que.dequeue();
        
        que.enqueue(44);
        que.enqueue(34);
        que.show();
        que.dequeue();

        que.show();
        System.out.print("Size of queue: "+que.getsize());
    }
}
