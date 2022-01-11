public class File {
    private int[] f;
    private int premier;
    private int dernier;

    public File(int n) {
        f = new int[n];
        premier = dernier = 0;
    }

    public boolean empty(){
        return premier==dernier;
    }

    public boolean full(){
        return premier == (dernier+1)% f.length;
    }

    public boolean enquete(int i){
       if( full())
           return false;
       f[dernier]=i;
       dernier=(dernier+1)%f.length;
       return true;
    }

    public int dequeue(){
        assert(!empty());
        int val = f[premier];
        premier = (premier+1)%f.length;
        return val;
    }

    public int size(){
        return f.length;
    }
}
