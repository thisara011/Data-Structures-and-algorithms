
package liinkedlist;

class Node{
    int data;
    Node next;
}

class LinkedList{
    
    Node head;
    
     public  void InserttoEND(int data)
     {
         
         Node node = new Node();
         node.data=data;
         node.next = null;
      
       
        if( head== null)
        {
           head= node;         
        }
        else
        {
           Node n = head;
           while(n.next !=null)
           {
            n = n.next;   
           }
           n.next= node;
        }
     }  
     public void InsertToStart(int data)
    
     {
       Node node = new Node();
         node.data=data;
         node.next = null;
         node.next = head;
        head= node;
     }
     
     public void InsertAT(int index,int data)
     {
         
         Node node = new Node();
         node.data=data;
         node.next = null;
         
         if(index ==0){
              
           InsertToStart(data);
         }
         else
         {
         Node n = head;
         for(int i=0;i < index-1;i++)
         {
             n = n.next;
           
         }
            node.next = n.next;
             n.next=node;
     }
     }
     
     public void Delete(int index)
     {    Node n = head;
         Node n1;
         if(index ==0)
         {
             head = head.next;
         }
         else
         {
             for(int i=0;i < index-1;i++)
             {
         
             n = n.next;
             }
             n1 = n.next;
             n.next=n1.next;
             
             System.out.println("Deleted values :" +n1.data);
             
             n1 = null;
           
         
         }
     }
     public void show()
     {
         Node node= head;
         
        while(node.next !=null)
        {
            System.out.println(node.data); 
            node= node.next;
        } 
         System.out.println(node.data); 
      
         
     
     }
  
}


public class LIinkedList {

    
    public static void main(String[] args) 
    { LinkedList l1 = new LinkedList();
    l1.InserttoEND(12);
    l1.InserttoEND(23);
    l1.InserttoEND(45);
    l1.InsertToStart(345);
    l1.InsertAT(0, 678);
    
    l1.Delete(3);
  
    l1.show();
    
       
    }
    
}
