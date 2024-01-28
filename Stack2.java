
package stack2;


class stack {
    
    int stack[] = new int[5];
     int top=0;
      
    public void Push(int data) //to add data
    {
        stack[top]= data;
        top++;
    }
    
    public void Pop() // to remove data
    {
        int data;
        top--;
       data =stack[top] ;
        stack[top]=0;
       
        
        System.out.println("deleted data is "+ data);
        
        
    }
    public void Peek(){
        
        int data;
       data =stack[top-1] ;
 
        System.out.println("youe top data is "+ data);
    }
    public void show()
    {
       for(int n : stack){
           System.out.println(n);
       } 
    }
    
}

public class Stack2 {

    
    public static void main(String[] args)
    {
     stack add= new stack();
     add.Push(12);
     add.Push(45);
     add.Push(47);
      add.Pop();
     add.Peek();
    
     add.show();
    }
    
}
