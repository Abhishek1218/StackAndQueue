public class Stacks{

    int arr[] = new int[5];
    int top = 0;

    // To add elements in stack
    public void push(int data){        
        arr[top] = data;
        top++;
    }

    //To remove elements from stack
    public void pop(){
        top--;        
        int data = arr[top];
        arr[top] = 0;
        System.out.println("The deleted element is: "+data);
        
    }

    //Peeking in stack
    public void peek(){       
        int data = arr[top-1];
        System.out.println("The next element is: "+data);
    }




    // To display the element of the stack
    public void display(){
        System.out.print("Elements present in stack: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


   public static void main(String[] args) {
       
    Stacks nums = new Stacks();
    
    

    nums.display();

    
   }
}