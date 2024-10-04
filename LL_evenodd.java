
public class LL_evenodd {
     static class Node{
        int data;
        LL_evenodd.Node next;
         Node(int x){
            data=x;
            next=null;
        }

    }

     static Node sortevenodd(Node head){
        Node Es=null, El=null,Os=null,Ol=null;

        for(Node curr =head ;curr !=null;curr=curr.next){
            int x=curr.data;
            if (x%2==0) {
                if(Es==null){
                    Es=curr;
                    El=Es;
                }
                else{
                    El.next=curr;
                    El=El.next;
                }
        }
        else {
                if(Os==null){
                    Os=curr;
                    Ol=Os;
                }
                else{
                    Ol.next=curr;
                    Ol=Ol.next;
                }
            }
            
        }
        if(Os==null||Es==null)
            return head;
        El.next=Os;
        Ol.next=null;
        return Es;
        
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }

    public static void main(String args[]) 
    { 
        Node head=new Node(17);
    	head.next=new Node(15);
    	head.next.next=new Node(8);
    	head.next.next.next=new Node(12);
    	head.next.next.next.next=new Node(10);
    	head.next.next.next.next.next=new Node(5);
    	head.next.next.next.next.next.next=new Node(4);
    	printlist(head);
    	head=sortevenodd(head);
    	printlist(head);
    	
    } 
}



// (Node head){
//     Node eS=null,eE=null,oS=null,oE=null;
//         for(Node curr=head;curr!=null;curr=curr.next){
//             int x=curr.data;
//             if(x%2==0){
//                 if(eS==null){
//                     eS=curr;
//                     eE=eS;
//                 }else{
//                     eE.next=curr;
//                     eE=eE.next;
//                 }
//             }else{
//                 if(oS==null){
//                     oS=curr;
//                     oE=oS;
//                 }else{
//                     oE.next=curr;
//                     oE=oE.next;
//                 }
//             }
//         }
//         if(oS==null||eS==null)
//             return head;
//         eE.next=oS;
//         oE.next=null;
//         return eS;
//     }