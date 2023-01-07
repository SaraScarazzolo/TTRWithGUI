package TTRWithGUI;

public class Tabellone extends Sprite {

    private Stazione[] stazioni;        //NStazione = 38;
    private Tratta[] tratte;        //NTratte = 83;

    public enum Citta {
        VANCOUVER("Vancouver"),
        SEATTLE("Seattle"),
        PORTLAND("Portland"),
        SAN_FRANCISCO("San Francisco"),
        LOS_ANGELES("Los Angeles"),
        LAS_VEGAS("Las Vegas"),
        SALT_LAKE_CITY("Salt Lake City"),
        PHOENIX("Poenix"),
        CALGARY("Calgary"),
        HELENA("Helena"),
        DENVER("Denver"),
        SANTA_FE("Santa Fe"),
        EL_PASO("El Paso"),
        OKLAHOMA_CITY("Oklahoma City"),
        KANSAS_CITY("Kansas City"),
        OMAHA("Omaha"),
        DULUTH("Duluth"),
        WINNIPEG("Winnipeg"),
        DALLAS("Dallas"),
        HOUSTON("Houston"),
        LITTLE_ROCK("Little Rock"),
        SAINT_LOUIS("Saint Louis"),
        CHICAGO("Chicago"),
        SAULT_ST_MARIE("Sault Saint Marie"),
        NEW_ORLEANS("New Orleans"),
        NASHVILLE("Nashville"),
        PITTSBURGH("Pittsburgh"),
        TORONTO("Toronto"),
        MONTREAL("Montréal"),
        BOSTON("Boston"),
        NEW_YORK("New York"),
        WASHINGTON("Washington"),
        RALEIGH("Raleigh"),
        ATLANTA("Atlanta"),
        CHARLESTON("Charleston"),
        MIAMI("Miami");

        public final String label;

        private Citta(String label) {
            this.label = label;
        }
    }

    public Tabellone(int x, int y) {

        super(x, y);

        // to commit
        Stazione stazioni[] = new Stazione[36];
        System.out.println("Prova");

        //stazioni[0] = new Stazione(Citta.VANCOUVER.name(), 10, 10);
        stazioni[0] = new Stazione(Citta.VANCOUVER.name(), 10, 10);
        stazioni[1] = new Stazione(Citta.SEATTLE.name(), 10, 10);
        stazioni[2] = new Stazione(Citta.PORTLAND.name(), 10, 10);
        stazioni[3] = new Stazione(Citta.SAN_FRANCISCO.name(), 10, 10);
        stazioni[4] = new Stazione(Citta.LOS_ANGELES.name(), 10, 10);
        stazioni[5] = new Stazione(Citta.LAS_VEGAS.name(), 10, 10);
        stazioni[6] = new Stazione(Citta.SALT_LAKE_CITY.name(), 10, 10);
        stazioni[7] = new Stazione(Citta.PHOENIX.name(), 10, 10);
        stazioni[8] = new Stazione(Citta.CALGARY.name(), 10, 10);
        stazioni[9] = new Stazione(Citta.HELENA.name(), 10, 10);
        stazioni[10] = new Stazione(Citta.DENVER.name(), 10, 10);
        stazioni[11] = new Stazione(Citta.SANTA_FE.name(), 10, 10);
        stazioni[12] = new Stazione(Citta.EL_PASO.name(), 10, 10);
        stazioni[13] = new Stazione(Citta.OKLAHOMA_CITY.name(), 10, 10);
        stazioni[14] = new Stazione(Citta.KANSAS_CITY.name(), 10, 10);
        stazioni[15] = new Stazione(Citta.OMAHA.name(), 10, 10);
        stazioni[16] = new Stazione(Citta.DULUTH.name(), 10, 10);
        stazioni[17] = new Stazione(Citta.WINNIPEG.name(), 10, 10);
        stazioni[18] = new Stazione(Citta.DALLAS.name(), 10, 10);
        stazioni[19] = new Stazione(Citta.HOUSTON.name(), 10, 10);
        stazioni[20] = new Stazione(Citta.LITTLE_ROCK.name(), 10, 10);
        stazioni[21] = new Stazione(Citta.SAINT_LOUIS.name(), 10, 10);
        stazioni[22] = new Stazione(Citta.CHICAGO.name(), 10, 10);
        stazioni[23] = new Stazione(Citta.SAULT_ST_MARIE.name(), 10, 10);
        stazioni[24] = new Stazione(Citta.NEW_ORLEANS.name(), 10, 10);
        stazioni[25] = new Stazione(Citta.NASHVILLE.name(), 10, 10);
        stazioni[26] = new Stazione(Citta.PITTSBURGH.name(), 10, 10);
        stazioni[27] = new Stazione(Citta.TORONTO.name(), 10, 10);
        stazioni[28] = new Stazione(Citta.MONTREAL.name(), 10, 10);
        stazioni[29] = new Stazione(Citta.BOSTON.name(), 10, 10);
        stazioni[30] = new Stazione(Citta.NEW_YORK.name(), 10, 10);
        stazioni[31] = new Stazione(Citta.WASHINGTON.name(), 10, 10);
        stazioni[32] = new Stazione(Citta.RALEIGH.name(), 10, 10);
        stazioni[33] = new Stazione(Citta.ATLANTA.name(), 10, 10);
        stazioni[34] = new Stazione(Citta.CHARLESTON.name(), 10, 10);
        stazioni[35] = new Stazione(Citta.MIAMI.name(), 10, 10);

        Tratta tratte[] = new Tratta[83];

        InizializzazioneTratte(tratte, 0, 3, "Vancouver", "Calgary", "grigio"); // grigia
        InizializzazioneTratte(tratte, 1, 2, "Vancouver", "Seattle", "grigio"); // doppia, grgigia
        InizializzazioneTratte(tratte, 2, 2, "Vancouver", "Seattle", "grigio");
        InizializzazioneTratte(tratte, 3, 4, "Seattle", "Calgary", "grigio"); // grigia
        InizializzazioneTratte(tratte, 4, 6, "Calgary", "Winnipeg", "bianco");// bianca
        InizializzazioneTratte(tratte, 5, 4, "Calgary", "Helena", "grigio");//grigia
        InizializzazioneTratte(tratte, 6, 6, "Seattle", "Helena", "giallo");//gialla
        InizializzazioneTratte(tratte, 7, 5, "Sault St.Marie", "Montreal", "nero");//nera
        InizializzazioneTratte(tratte, 8, 2, "Montreal", "Boston", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 9, 2, "Montreal", "Boston", "grigio");
        InizializzazioneTratte(tratte, 10, 3, "Montreal", "New York", "blu");//blu
        InizializzazioneTratte(tratte, 11, 3, "Montreal", "Toronto", "grigio");//grigia
        InizializzazioneTratte(tratte, 12, 2, "Sault St.Marie", "Toronto", "grigio");//grigia
        InizializzazioneTratte(tratte, 13, 3, "Sault St.Marie", "Duluth", "grigio");//grigia
        InizializzazioneTratte(tratte, 14, 4, "Winnipegh", "Duluth", "nero");//nera
        InizializzazioneTratte(tratte, 15, 4, "Helena", "Winnipeg", "blu");//blu
        InizializzazioneTratte(tratte, 16, 6, "Winnipeg", "Sault St.Marie", "grigio");//grigia
        InizializzazioneTratte(tratte, 17, 6, "Toronto", "Duluth", "rosa");//rosa
        InizializzazioneTratte(tratte, 18, 2, "Boston", "New York", "giallo");//doppia, gialla, rossa
        InizializzazioneTratte(tratte, 19, 2, "Boston", "New York", "rosso");//doppia, gialla, rossa
        InizializzazioneTratte(tratte, 20, 2, "New York", "Pittsburg", "bianco");//doppia, bianca, verde
        InizializzazioneTratte(tratte, 21, 2, "New York", "Pittsburg", "verde");//doppia, bianca, verde
        InizializzazioneTratte(tratte, 22, 2, "Toronto", "Pittsburg", "grigio");//grigia
        InizializzazioneTratte(tratte, 23, 4, "Toronto", "Chicago", "bianco");//bianca
        InizializzazioneTratte(tratte, 24, 3, "Chicago", "Duluth", "rossa");//rossa
        InizializzazioneTratte(tratte, 25, 3, "Pittsburg", "Chicago", "arancione");//doppia, rancione, nero
        InizializzazioneTratte(tratte, 26, 3, "Pittsburg", "Chicago", "nero");//doppia, rancione, nero
        InizializzazioneTratte(tratte, 27, 4, "Chicago", "Omaha", "blu ");//blu
        InizializzazioneTratte(tratte, 28, 2, "Duluth", "Omaha", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 29, 2, "Duluth", "Omaha", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 30, 5, "Omaha", "Helena", "rosso");//rossa
        InizializzazioneTratte(tratte, 31, 4, "Denver", "Helena", "verde");//verde
        InizializzazioneTratte(tratte, 32, 3, "Helena", "Salt Lake City", "rosa");//rosa
        InizializzazioneTratte(tratte, 33, 6, "Portland", "Salt Lake City", "blu");//blu
        InizializzazioneTratte(tratte, 34, 2, "Portland", "Seattle", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 35, 2, "Portland", "Seattle", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 36, 5, "Portland", "San Francisco", "verde");//doppia, verdem rosa
        InizializzazioneTratte(tratte, 37, 5, "Portland", "San Francisco", "rosa");//doppia, verdem rosa
        InizializzazioneTratte(tratte, 38, 5, "San Francisco", "Salt lake City", "arancione");//doppia, arancione, bianco
        InizializzazioneTratte(tratte, 39, 5, "San Francisco", "Salt lake City", "bianco");//doppia, arancione, bianco
        InizializzazioneTratte(tratte, 40, 3, "Salt Lake City", "Denver", "rosso");//doppia, rossa, giallo
        InizializzazioneTratte(tratte, 41, 3, "Salt Lake City", "Denver", "giallo");//doppia, rossa, giallo
        InizializzazioneTratte(tratte, 42, 4, "Denver", "Omaha", "rosa");//rosa
        InizializzazioneTratte(tratte, 43, 3, "San Francisco", "Los Angeles", "rosa");//doppia, rosa. gialla
        InizializzazioneTratte(tratte, 44, 3, "San Francisco", "Los Angeles", "giallo");//doppia, rosa. gialla
        InizializzazioneTratte(tratte, 45, 2, "Las Vegas", "Los Angeles", "grigio");//grigia
        InizializzazioneTratte(tratte, 46, 3, "Salt Lake City", "Las vegas", "arancione");//arancione
        InizializzazioneTratte(tratte, 47, 3, "Los Angeles", "Phoenix", "grigio");//grigia
        InizializzazioneTratte(tratte, 48, 5, "Phoenix", "Denver", "bianco");//bianca
        InizializzazioneTratte(tratte, 49, 2, "Denver", "Santa Fe", "grigio");//grigia
        InizializzazioneTratte(tratte, 50, 3, "Phoenix", "Santa Fe", "grigio");//grigia
        InizializzazioneTratte(tratte, 51, 6, "Los Angeles", "El Paso", "nero");//nera
        InizializzazioneTratte(tratte, 52, 3, "Phoenix", "El Paso", "grigio");//grigia
        InizializzazioneTratte(tratte, 53, 2, "El Paso", "Santa Fe", "grigio");//grigia
        InizializzazioneTratte(tratte, 54, 6, "El Paso", "Houston", "verde");//verde
        InizializzazioneTratte(tratte, 55, 4, "El Paso", "Dallas", "rosso");//rossa
        InizializzazioneTratte(tratte, 56, 4, "Denver", "Oklahoma City", "rosso");//rossa
        InizializzazioneTratte(tratte, 57, 1, "Omaha", "Kansas City", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 58, 1, "Omaha", "Kansas City", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 59, 4, "Denver", "Kansas City", "nero");//doppia, nera, arancione
        InizializzazioneTratte(tratte, 60, 4, "Denver", "Kansas City", "arancione");//doppia, nera, arancione
        InizializzazioneTratte(tratte, 61, 3, "Santa Fe", "Oklahoma City", "blu");  //blu
        InizializzazioneTratte(tratte, 62, 5, "El Paso", "Oklahoma City", "giallo");//gialla
        InizializzazioneTratte(tratte, 63, 2, "Kansas City", "Oklahoma City", "grigio");//grigia
        InizializzazioneTratte(tratte, 64, 2, "Kansas City", "Oklahoma City", "grigio");//grigia 
        InizializzazioneTratte(tratte, 65, 2, "Kansas City", "Saint Louis", "blu");//doppia, blu, rosa
        InizializzazioneTratte(tratte, 66, 2, "Kansas City", "Saint Louis", "rosa");//doppia, blu, rosa
        InizializzazioneTratte(tratte, 67, 2, "Saint Louis", "Nashville", "grigio");//grigis
        InizializzazioneTratte(tratte, 68, 2, "Oklahoma City", "Dallas", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 69, 2, "Oklahoma City", "Dallas", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 70, 1, "Dallas", "Houston", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 71, 1, "Dallas", "Houston", "grigio");//doppia grigia
        InizializzazioneTratte(tratte, 72, 2, "Oklahoma City", "Little Rock", "grigio");//grigia
        InizializzazioneTratte(tratte, 73, 2, "Dallas", "Little Rock", "grigio");//grigia
        InizializzazioneTratte(tratte, 74, 2, "Saint Louis", "Little Rock", "grigio");//grigia
        InizializzazioneTratte(tratte, 75, 2, "Houston", "New Orleans", "grigio");//grigia
        InizializzazioneTratte(tratte, 76, 6, "New Orleans", "Miami", "rosso");//rossa
        InizializzazioneTratte(tratte, 77, 4, "New Orleans", "Atlanta", "giallo");//doppia, gialla, arancione
        InizializzazioneTratte(tratte, 78, 4, "New Orleans", "Atlanta", "arancione");//doppia, gialla, arancione
        InizializzazioneTratte(tratte, 79, 3, "New Orleans", "Little Rock", "verde");//verde
        InizializzazioneTratte(tratte, 80, 5, "Miami", "Atlanta", "blu");//blu
        InizializzazioneTratte(tratte, 81, 4, "Miami", "Charlenston", "rosa");//rosa
        InizializzazioneTratte(tratte, 82, 2, "Charlentston", "Atlanta", "grigio");//grigia
        InizializzazioneTratte(tratte, 83, 2, "Charleston", "Raleigh", "grigio");//grigia
        InizializzazioneTratte(tratte, 84, 1, "Nashville", "Atlanta", "grigio");//grigia
        InizializzazioneTratte(tratte, 85, 3, "Little Rock", "Nashville", "bianco");//bianca
        InizializzazioneTratte(tratte, 86, 2, "Chicago", "Saint Louis", "verde");//doppia, verde, bianca
        InizializzazioneTratte(tratte, 87, 2, "Chicago", "Saint Louis", "bianco");//doppia, verde, bianca
        InizializzazioneTratte(tratte, 88, 2, "Atlanta", "Raleigh", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 89, 2, "Atlanta", "Raleigh", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 90, 5, "Saint Louis", "Pittsburgh", "verde");//verde
        InizializzazioneTratte(tratte, 91, 2, "Pittsburgh", "Washingston", "grigio");//grigia
        InizializzazioneTratte(tratte, 92, 2, "New York", "Washingston", "arancione");//doppia, arancione, nera
        InizializzazioneTratte(tratte, 93, 2, "New York", "Washingston", "nero");//doppia, arancione, nera
        InizializzazioneTratte(tratte, 94, 4, "Nashville", "Pittsburgh", "giallo");//gialla
        InizializzazioneTratte(tratte, 95, 2, "Pittsburgh", "Raleigh", "grigio");//grigia
        InizializzazioneTratte(tratte, 96, 2, "Washington", "Raleigh", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 97, 2, "Washington", "Raleigh", "grigio");//doppia, grigia
        InizializzazioneTratte(tratte, 98, 3, "Nashville", "Raleigh", "nero");//nera
        InizializzazioneTratte(tratte, 99, 6, "Helena", "Duluth", "arancione");//arancione
    }

    public static void InizializzazioneTratte(Tratta tratte[], int i, int lunghezza, String inizio, String fine, String colore) {

        tratte[i] = new Tratta(lunghezza, inizio, fine, colore);

    }
}
