public class Ensemble {
    private boolean[] tab;

    public Ensemble() {
        tab = new boolean[101];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = false;
        }
    }

    public Ensemble(int min, int max) {
        this();
        assert (min >= 0 && max < 101 && min < max);
        for (int i = min; i < max; i++) {
            tab[i] = true;
        }
    }

    public int cardinal() {
        int cpt = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == true) {
                cpt++;
            }
        }
        return cpt;
    }

    public boolean estVide() {
        return cardinal() == 0;
    }

    public boolean contient(int i) {
        if(i>=0 && i<101){
            return tab[i];
        }
        return false;
    }

    public boolean add(int i){
        if(i>=0 && i<101){
            if(!tab[i]==false){ //tab[i]==false
                tab[i]=true;
                return true;
            }
        }
        return false;
    }

    public void affiche(){
        if(cardinal()==0){
            System.out.println("Enseble vide");
        }
        else
            for (int i = 0; i < tab.length; i++) {
                if (tab[i]) {
                    System.out.print(i + "  ");
                }
            }
    }

    public boolean inclus(Ensemble e){
        for (int i = 0; i < tab.length; i++) {
            if(e.contient(i))
                if(this.contient(i)==false){
                    return false;
                }
        }
        return true;
    }

    public Ensemble union(Ensemble e){
        Ensemble res =new Ensemble();
        for (int i = 0; i < tab.length; i++) {
            if(e.contient(i) || this.contient(i))
                res.add(i);
        }
        return res;
    }
}
