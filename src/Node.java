public class Node
{
    private int value = 0;
    private Node next = null;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }

    public int getValue()
    {
        return value;
    }

    public Node getNext()
    {
        return next;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
