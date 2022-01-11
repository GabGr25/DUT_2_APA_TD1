public class EnsembleEntier {
    private int[] tab;

    public EnsembleEntier() {
        tab = new int[101];
        tab[0]=-1;
    }

    public EnsembleEntier(int min, int max){
        this();
        assert(min>=0 && max<101 && max>min);
        int j=0;
        for (int i = min; i < max; i++) {
            tab[j]=i;
            j++;
        }
        tab[j]= -1;
    }

    public int cardinal(){
        int cpt=0;
        while(cpt<tab.length && tab[cpt]=1){
            cpt++;
        }
        return cpt;
    }
}
