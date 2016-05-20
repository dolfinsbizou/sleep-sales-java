
import java.util.ArrayList;
import java.util.List;

public class Manutentionnaire {

    public String name;
    public int nbBouteille;

    public Salle positionCourante;
    public int penalite;
    public int pointGagne;
    public int score;
    public List tourList;
    public List<Action> actionTour;

    public Manutentionnaire(String name) {
        this.name = name;
        this.nbBouteille = 10;

        this.penalite = 0;
        this.pointGagne = 0;
        this.score = 0;
        this.tourList = new ArrayList();
        actionTour = new ArrayList();
        positionCourante = Cave.getSalle(0, 0);

    }

    public int majScore(int pointGagne, int penalite) {

        score = pointGagne - penalite;
        return score;
    }

    public void incrementX() {
        positionCourante = Cave.getSalle(positionCourante.getX() + 1, positionCourante.getY());

    }

    public void decrementX() {
        positionCourante = Cave.getSalle(positionCourante.getX() - 1, positionCourante.getY());

    }

    public void incrementY() {
        positionCourante = Cave.getSalle(positionCourante.getX(), positionCourante.getY() + 1);

    }

    public void decrementY() {
        positionCourante = Cave.getSalle(positionCourante.getX(), positionCourante.getY() - 1);

    }

    public void remplirSac() {
        nbBouteille = 10;

    }

    public void poserBouteille() {
        nbBouteille = nbBouteille - 1;
    }

    public void ajouterAction(Action a) {
        this.actionTour.add(a);
    }

    // ====================ACCESSEURS ===========================
    public void setName(String name) {
        this.name = name;
    }

    public void setNbBouteille(int nbBouteille) {
        this.nbBouteille = nbBouteille;
    }

    public void setPositionCourante(Salle positionCourante) {
        this.positionCourante = positionCourante;
    }

    public void setPenalite(int penalite) {
        this.penalite = penalite;
    }

    public void setPointGagne(int pointGagne) {
        this.pointGagne = pointGagne;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getNbBouteille() {
        return nbBouteille;
    }

    public Salle getPositionCourante() {
        return positionCourante;
    }

    public int getPenalite() {
        return penalite;
    }

    public int getPointGagne() {
        return pointGagne;
    }

    public int getScore() {
        return score;
    }

    public List getTourList() {
        return tourList;
    }

}
