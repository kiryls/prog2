package lab08;

public abstract class List {

    public abstract boolean empty();            
    public abstract int size();                 
    public abstract boolean contains(int x);    
    public abstract List insert(int x);         
    public abstract List append(List l);        
    public abstract String toString();  
    
    // NUOVI METODI
    public abstract int sum();                   //ok
    public abstract int get(int i);
    public abstract List succ();
    public abstract List filter_le(int x);
    public abstract List filter_gt(int x);
    public abstract List intersect(List l);        

}
