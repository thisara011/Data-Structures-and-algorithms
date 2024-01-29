
class Queue_01
{
    int[] arr = new int[5];
    int rear;
    int front;
    int size;

    public void enQueue(int data)
    {
        arr[rear]=data;
        rear = (rear++)% arr.length;
        size++;

    }
    public void dQueue()
    {  int data;
       data= arr[front];
        front=(front++)% arr.length;
        size--;

        System.out.println("removed elements is " +data);

        for(int x : arr)
        {
            System.out.println(x + " ");
        }
    }

    public void Show()
    {
        for(int i=0; i<size ;i++)
        {
            System.out.println(arr[(front + i)%arr.length]);
        }
    }
}


public class Main
{
    public static void main(String[] args)

    {
        Queue_01 q = new Queue_01();
        q.enQueue(12);
        q.enQueue(32);
        q.enQueue(445);
        q.enQueue(345);

        q.dQueue();
        q.dQueue();

        q.enQueue(5);
        q.enQueue(45);

        q.enQueue(35);
        q.enQueue(446575);
        q.Show();
    }
}