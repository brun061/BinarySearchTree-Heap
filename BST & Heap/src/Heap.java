import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
	
	private ArrayList<E> alist ;
	
	
	public Heap()
	{
		alist = new ArrayList<E>();
	}
	
	public Heap(E[] object)
	{
		alist = new ArrayList<E>();
		
		for(int i = 0 ; i < object.length ; i++)
		{
			add(object[i]);
		}
		
	}
	
	public void add(E newObject)
	{
		if(getSize() == 0)
			
			alist.add(newObject);
		
		else 
		{
			int x = getSize();
			alist.add(newObject);
			
			while(newObject.compareTo(alist.get((x-1)/2)) == 1 && alist.indexOf(newObject) != 0 )
			{
				alist.set(x,alist.get((x-1)/2));			
				alist.set((x-1)/2, newObject);
				x = (x-1)/2;
			}
		}
	}
	
	public E remove()
	{
		int x = 0;
		if(getSize() > 1)
		{
			E root = alist.get(0);
			E newroot = alist.get(getSize()-1);
			
			
			alist.set(x, newroot);
			alist.remove(getSize()-1);
			
			while(2*x+1 < getSize())
			{
				if(2*x+2 < getSize())
				{
					if(alist.get(2*x+2).compareTo(alist.get(2*x+1)) == 1)
					{
						if(newroot.compareTo(alist.get(2*x+2)) == -1)
						{
							alist.set(x, alist.get(2*x+2));
							alist.set(2*x+2, newroot);
							x = 2*x+2;
						}
					}
					else
					{
						if(newroot.compareTo(alist.get(2*x+1)) == -1)
						{
							alist.set(x, alist.get(2*x+1));
							alist.set(2*x+1, newroot);
							x = 2*x+1;
						}	
					}	
				}
				else
				{
					if(newroot.compareTo(alist.get(2*x+1)) == -1 )
					{
						alist.set(x, alist.get(2*x+1));
						alist.set(2*x+1, newroot);
						x = 2*x+1;
					}
					else
						break;
				}
			}
			return root;
		}
		return alist.get(0);
			
		
	}
		
	public int getSize()
	{
		return alist.size();
	}
	public void yazdirHeap()
	{
		System.out.println(alist);
		
	}
	public  void sort(E[] list)
	{
		for(int i = 0 ; i< list.length ; i++)
		{
			add(list[i]);
		}
		Object n[] = new Object[list.length];
		for(int i = n.length-1 ; i >= 0 ; i--)
		{
			n[i] = remove();
		}
		
		for(int i = 0 ; i < n.length ; i++)
		{
			System.out.print(n[i]+" ");
		}
	}
	
	
}
