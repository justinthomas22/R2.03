import java.util.ArrayList;

public class Favalier extends Piece {

    public Favalier() {
        super('B', new Position());
    }

    public Favalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType() {
        return "favalier";
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> liste = new ArrayList<>();

        // Déplacements du Fou
        Fou fou = new Fou(this.getCouleur(), this.getPosition());
        liste.addAll(fou.getDeplacementPossible(pl));

        // Déplacements du Cavalier
        Cavalier cavalier = new Cavalier(this.getCouleur(), this.getPosition());
        liste.addAll(cavalier.getDeplacementPossible(pl));

        return liste;
    }
}