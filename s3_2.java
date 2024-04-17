import java.util.*;
classs MyLinkedList{
public static void main(String args[])
{
LinkedList list = new LinkedList();
list.add("abc");
list.add("efg");
list.add("hij");
list.add("lmn");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
list.addLast("xyz");
System.out.println("list:"+list);
list.removeFirst();
System.out.println("list"+list);
itr=list.descendingIterator();
while(itr.hasNext())
System.out.println(Itr.next());
}
}
