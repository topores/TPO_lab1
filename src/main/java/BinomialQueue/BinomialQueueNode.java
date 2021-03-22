package BinomialQueue;

public class BinomialQueueNode {

    int key, degree;
    BinomialQueueNode parent;
    BinomialQueueNode sibling;
    BinomialQueueNode child;

    /* Constructor */
    public BinomialQueueNode(int k)
    {
        key = k;
        degree = 0;
        parent = null;
        sibling = null;
        child = null;
    }
    /* Function reverse */
    public BinomialQueueNode reverse(BinomialQueueNode sibl)
    {
        BinomialQueueNode ret;
        if (sibling != null)
            ret = sibling.reverse(this);
        else
            ret = this;
        sibling = sibl;
        return ret;
    }

    /* Function to find min node */
    public BinomialQueueNode findMinNode()
    {
        BinomialQueueNode x = this, y = this;
        int min = x.key;

        while (x != null) {
            if (x.key < min) {
                y = x;
                min = x.key;
            }
            x = x.sibling;
        }

        return y;
    }
    /* Function to find node with key value */
    public BinomialQueueNode findANodeWithKey(int value)
    {
        BinomialQueueNode temp = this, node = null;

        while (temp != null)
        {
            if (temp.key == value)
            {
                node = temp;
                break;
            }
            if (temp.child == null)
                temp = temp.sibling;
            else
            {
                node = temp.child.findANodeWithKey(value);
                if (node == null)
                    temp = temp.sibling;
                else
                    break;
            }
        }

        return node;
    }
    /* Function to get size */
    public int getSize()
    {
        return (1 + ((child == null) ? 0 : child.getSize()) + ((sibling == null) ? 0 : sibling.getSize()));
    }

    @Override
    public String toString() {
        System.out.println(key);
        return "BinomialQueueNode{" +
                "key=" + Integer.toString(key) +
                ", degree=" + Integer.toString(degree) +
                ", sibling=" + ((sibling!=null) ? sibling.toString():"null") +
                ", child=" + ((child!=null) ? child.toString():"null") +
                '}';
    }
}
