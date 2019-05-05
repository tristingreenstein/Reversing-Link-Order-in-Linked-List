public class FibList3
{
    public static void main(String[] args)
    {
        Int fibList = null;   
        Int temp = null;
      
        fibList = new Int(0);

        temp = new Int(1);
        temp.link(fibList);
        fibList = temp;
        
        for(int count = 3; count <= 15; count++)
        {
            temp = new Int(fibList.num + ((Int) (fibList.getLink())).num);
            temp.link(fibList);
            fibList = temp;
        }    
        
        printList(fibList);
        Link list2 = reverseList(fibList);
        printList((Int) list2);
    }    
    
    public static Link reverseList(Link in)
    {
        Link out = null;//holds final result
 
        Link prev = null; //placeholder 
        Link current = in;//holds linked list 
        Link next = null; //placeholder
        while (current != null)//while linked list id not empty 
        { 
            next = current.getLink(); //puts next position of list into a variable
            current.link(prev);//replaces next position with current position
            prev = current; //swaps location of linked list 
            current = next; //updates linked list
        } 
        out = prev; 
        
        return out;
    }    

    public static void printList(Int list)
    {
        for (Int k = list; k != null; k = (Int) k.getLink())
            System.out.print(k + " ");
        System.out.println();
    }
}  