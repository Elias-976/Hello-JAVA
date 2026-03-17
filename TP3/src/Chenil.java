import com.btssio.Menagerie;
import com.btssio.Chien;

public class Chenil {

    public static void main(String[] args) {

        // Les chiens prennent vie ...
        Chien medor = new Chien("M dor", "B tard", 19);
        Chien saucisse = new Chien("Saucisse", "Teckel", 9);
        Chien pongo = new Chien("Pongo", "Dalmatien", 70);
        Chien perdita = new Chien("Perdita", "dalmatien", 50);

        // Les chiens aboient quand ...
        System.out.println("La caravanne passe....");
        medor.aboyer();
        saucisse.aboyer();
        System.out.println("Quelle est la taille de Saucisse ? " + saucisse.getTaille() + " cm\n");
        pongo.aboyer();
        perdita.aboyer();

        saucisse.setTaille(45);
        saucisse.setNom("Merguez");

        // Les chiens vont en pension au chenil
        Menagerie leChenil = new Menagerie();
        leChenil.arriver(medor);
        leChenil.arriver(saucisse);
        leChenil.arriver(pongo);
        leChenil.arriver(perdita);

        // Le chenil présente ses pensionnaires
        leChenil.presenter();
    }
}