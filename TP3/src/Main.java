import com.btssio.Animal;
import com.btssio.Menagerie;

public class Main {
    public static void main(String[] args) {
        //Declaration et instanciation d'objets de la classe Animal
        Animal nemo = new Animal("Nemo", "Poisson rouge");
        Animal felix = new Animal("Felix", "Chat");
        Animal pistache = new Animal("Pistache", "Perruche");

        //La vie de Nemo se résume ainsi...

        nemo.sePresenter();
        nemo.parler("Gloup");
        nemo.manger();
        nemo.dormir();

        //La vie de Felix se résume ainsi...

        felix.sePresenter();
        felix.parler("Miaou");
        felix.manger();
        felix.dormir();

        //La vie de Pistache se résume ainsi...

        pistache.sePresenter();
        pistache.parler("Cui");
        pistache.manger();
        pistache.dormir();

        //création d'une ménagerie...
        Menagerie zoo = new Menagerie();

//... et enregistrement des animaux qui arrivent dans la ménagerie
        zoo.arriver(nemo);
        zoo.arriver(felix);
        zoo.arriver(pistache);
    
        // Présentation de la ménagerie ainsi constituée
        System.out.println("\nLe zoo comporte " + zoo.getNombreAnimaux() + " animaux.");
        zoo.presenter();

        //Enregistrement du départ de Félix...
        System.out.println("\n=> Félix s'en va ...\n");
        zoo.partir(felix);

        //et re-présentation de la ménagerie ainsi constituée
        System.out.println("\nLe zoo comporte maintenant " + zoo.getNombreAnimaux() + " animaux.");
        zoo.presenter();

        //Changement du nom de baptême d'un résident
        System.out.println("\n=> Le poisson Némo est rebaptisé 'Maurice' ...\n");
        nemo.setNom("Maurice");

        //et re-présentation de la ménagerie
        zoo.presenter();
    }
}