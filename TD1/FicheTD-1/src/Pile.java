public class Pile {
    private int[]p;
    private int taille;

    public Pile(int n) {
        p = new int[n];
        this.taille = 0;
    }

    public boolean push(int i){
        if(taille==p.length){
            return false;
        }
        p[taille]=i;
        taille++;
        return true;
    }

    public int pop(){
        taille--;
        return p[taille];
    }

    public boolean empty(){
        if(taille==0){
            return true;
        }
        else {
            return false;
        }
    }

    public int size(){
        return taille;
    }
}
