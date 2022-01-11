public class Tempss {
    private int heures;
    private int minutes;
    private int secondes;

    public Tempss(int heures, int minutes, int secondes) {
        assert (heures >= 0 && heures < 24);
        assert (minutes >= 0 && minutes < 60);
        assert (secondes >= 0 && secondes < 60);
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public Tempss(int heures, int minutes) {
        this(heures, minutes, 0);
    }

    public Tempss(int heures){
        this(heures, 0, 0);
    }

    public Tempss(){
        this(0, 0, 0);
    }

    public Tempss(Tempss tempss){
        this.heures = tempss.getHeures();
        this.minutes = tempss.getMinutes();
        this.secondes = tempss.getSecondes();
    }

    public void ajouterHeures(int heures){
        this.heures = (this.heures + heures) % 24;
    }

    public void ajouterMinutes(int minutes){
        int nbHeures = (this.minutes + minutes) / 60;
        ajouterHeures(nbHeures);
        this.minutes = (this.minutes + minutes) % 60;
    }

    public void ajouterSecondes(int secondes){
        int nbMinutes = (this.secondes + secondes) / 60;
        ajouterMinutes(nbMinutes);
        this.secondes = (this.secondes + secondes) % 60;
    }

    @Override
    public String toString() {
        return "Tempss{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }
}
