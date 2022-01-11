public class Tableau {
    private int[] tab;

    public Tableau(int[] tab) {
        this.tab = tab;
    }

    public int recherche(int i){
        for (int j = 0; j < tab.length; j++) {
            if (tab[j]==i) {
                return j;
            }
        }
        return -1;
    }
    // Elle réalise n operation


    public void tri(){
        int min,tmp;
        for (int i = 0; i < tab.length ; i++) {
            min=i;
            for (int j = i+1; j < tab.length; j++) {
                if(tab[j]<tab[min])
                    min=j;
            }
            tmp=tab[min];
            tab[min]=tab[i];
            tab[i]=tmp;
        }
    }

    public int rechercheTri(int i){
        int g=0;
        int d = tab.length-1;
        int milieu;
        while(g<=d){
            milieu=(g+d)/2;
            if(tab[milieu]==i){
                return milieu;
            }
            if(i<tab[milieu]){
                d=milieu-1;
            }
            else g=milieu+1;
        }
        return -1;
    }

    //Pour 1 seule recherche, c'est mieux de utilisé cherche
    //Pour plusieurs recherche, c'est mieux tri et rechercheTri


}
