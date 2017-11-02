class node
{
	int data=0;
	node next=null;
}
interface ADT_stack
{
	void push(int x);
	int pop();
	int top();
}
class stack implements ADT_stack
{ node head=null,temp;
	public void push(int x)
	{temp=new node();
	 temp.data=x;
	  temp.next=head;
	 head=temp;
	}
	public int pop()
	{if(isempty()==false)
	 {temp=head;
	 head=temp.next;
	 return (temp.data);}
	 else
	 	System.out.print("stack is empty ");
	 return (-1);
	}
	public int top()
	{if(isempty()==false)
	 return (head.data);
	 else
	 	System.out.print("stack is empty ");
	 return (-1);

	}
	boolean isempty()
	{
		if (head==null)
			return (true);
		return (false);
	}

}
public class Stack
{
	public static void main(String[] args) {
		stack s=new stack();
		s.push(5);
		//s.push(9);
		s.push(10);
		s.push(-8);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
