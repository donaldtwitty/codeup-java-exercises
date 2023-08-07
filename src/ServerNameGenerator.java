import java.util.Random;

public class ServerNameGenerator {
    private static final String[] ADJECTIVES = {"dedicated", "fierce", "gracious", "hungry", "jovial", "magnificent", "mighty", "powerful", "serious", "victorious"};
    private static final String[] NOUNS = {"photon", "galaxy", "nebula", "pulsar", "quasar", "supernova", "universe", "cosmos", "blackhole", "asteroid"};

    public static void main(String[] args) {
        String serverName = generateServerName();
        System.out.println("Here is your server name: \n" + serverName);
    }

    public static String generateServerName(){
        Random random = new Random(); //selects a random adjective and a random noun//
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[random.nextInt(NOUNS.length)];
        return adjective + "-" + noun; //concatenates the selected adjective and selected noun with hyphen//
    }
}
