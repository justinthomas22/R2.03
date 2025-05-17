import java.util.ArrayList;

class Tavalier extends Piece {

    public Tavalier() {
        super('B', new Position());
    }

    public Tavalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType() {
        return "tavalier";
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> liste = new ArrayList<>();

        // On récupère les déplacements d'une Tour
        Tour tour = new Tour(this.getCouleur(), this.getPosition());
        liste.addAll(tour.getDeplacementPossible(pl));

        // Et ceux d'un Cavalier
        Cavalier cavalier = new Cavalier(this.getCouleur(), this.getPosition());
        liste.addAll(cavalier.getDeplacementPossible(pl));

        return liste;
    }
}