public class ListaEncadeada {
    Node base;
    Node top;
    int size;

    public ListaEncadeada() {
        this.base = null;
        this.base = null;
        this.size = 0;

    }

    public void add(int value) {
        Node node = new Node(value);

        if (base == null) {
            this.base = node;
            this.top = node;
            size ++;
        }else{
            Node anterior = top;
            this.top.next=  node;
            this.top = node;
            size ++;
            

        }

    }
}