package library;

public class IntNode
{
   private int sequenceNumber;
   private int data;
   private IntNode link;   

   
   // Precondition:
   // Postcondition: All instance variables of the IntNode class are initialized in order.
   public IntNode(int initialsequenceNumber, int initialdata, IntNode initialLink)
   {
        sequenceNumber = initialsequenceNumber;
        data = initialdata;
        link = initialLink;
   }

   
   // Precondition: This instance of the IntNode class exists.
   // In other words, the object whose method is activated exists as a node in the linked list. 
   // Postcondition: A new node with attributes item and data is created. Item serves as sequenceNumber.
   // The new node is added to the linked list at a position that comes immediately after the node whose method is activated.
   public void addNodeAfter(int item, int data)   
   {
	    link = new IntNode(item, data, link);
      
   }
   
   
   // Precondition: This instance of the IntNode class exists.
   // In other words, the object whose method is activated exists as a node in the linked list. 
   // Postcondition: The specific node, which comes immediately after the node whose method is activated, 
   // is removed from the linked list.
   public void removeNodeAfter( )   
   {
	    if(link != null){
          link = link.link;
      }
   }
   
   
   // Precondition: This instance of the IntNode class exists.
   // Postcondition: The sequenceNumber of this node is returned.
   public int getsequenceNumber( )   
   {
	    return sequenceNumber;
   }
   
  
   // Precondition: This instance of the IntNode class exists.
   // Postcondition: The link of this node is returned.
   public IntNode getLink( )
   {
	    return link;                                          
   } 
    
   
   // Precondition: The linked list contains at least one element.
   // Postcondition: The (sequence number, data) pairs of each node in the linked list, starting with the head,
   // are displayed on the monitor. 
   public void displayNodeData(IntNode head)
   {
      IntNode current = head;
      System.out.print("The (sequence number, data) pairs in the linked list are: ");
      while(current != null){
       System.out.print("(" + current.sequenceNumber + " ," + current.data + ") ");
        current = current.link;
        
      }
     
     System.out.println("");
     System.out.println("");
   }
   
   
   // Precondition: The head of the linked list is different than null, and its sequenceNumber is different than target.
   // Postcondition: The link to the specific node, which comes before the node whose sequenceNumber is equal to target, 
   // is returned. If the linked list does not contain a node with sequenceNumber equal to target, then null is returned.   
  public IntNode findPrevious(IntNode head, int target)
   {
	    IntNode current = head;
      while(current.link != null){
        if(current.link.sequenceNumber == target){
          return current;
        }
          current = current.link;	
        
      }
     return null;
   }
   

   
   // Precondition: The head of the linked list is different than null, and its sequenceNumber is smaller than target.
   // Postcondition: The link to the specific node, which comes before the node that is the first in the linked list 
   // to have a sequenceNumber greater than target, is returned. 
   // If no such node is found, the link to the last node in the linked list is returned. 
   public IntNode locatePredecessor(IntNode head, int target)
   {
	    IntNode current = head;
      while(current.link != null){
        if(current.link.sequenceNumber > target){
          return current;
        }
        current = current.link;
        
      }
     return current;
   
   }
  
}
           
