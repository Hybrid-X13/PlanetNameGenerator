import java.util.Random;

/**
 * @author Hybrid
 * 
 * All possible planet name prefixes
 */
public class Prefix {
    private static final String[][] prefixes = {
        { // A
            "Ab",
            "Abth",
            "Adv",
            "Aeg",
            "Aegl",
            "Aet",
            "Aev",
            "Agb",
            "Agr",
            "Akr",
            "Akv",
            "Ald",
            "Alg",
            "Alph",
            "Amph",
            "An",
            "Andr",
            "Angl",
            "Ankt",
            "Ans",
            "Ant",
            "Anthr",
            "Ap",
            "Aph",
            "Aphr",
            "Ar",
            "Arct",
            "Arg",
            "Art",
            "Arth",
            "Arv",
            "Arx",
            "Astr",
            "Ath",
            "Athr", 
            "Atl",
            "Atm",
            "Atr",
            "Audr",
            "Aur",
            "Auv",
            "Av",
            "Ax",
            "Az",
            "Azr",
        },
        { // B
            "B",
            "Bl",
            "Br",
        },
        { // C
            "C",
            "Ch",
            "Chl",
            "Chr",
            "Cr",
            "Cy",
            "Cyg",
            "Cygn",
            "Cyr",
        },
        { // D
            "D",
            "Dr",
        },
        { // E
            "Eb",
            "Ebl",
            "Eck",
            "Ed",
            "Ehw",
            "Ekn",
            "El",
            "Eldr",
            "Elp",
            "Elr",
            "Elv",
            "Emp",
            "Emr",
            "En",
            "End",
            "Ent",
            "Enz",
            "Eos",
            "Eov",
            "Ep",
            "Epr",
            "Eps",
            "Er",
            "Erph",
            "Euch",
            "Eucl",
            "Eur",
            "Euryb",
            "Ex",
            "Ez",
            "Ezr",
        },
        { // F
            "F",
            "Fl",
            "Fr",
            "Fyr",
        },
        { // G
            "G",
            "Gl",
            "Gr",
        },
        { // H
            "H",
            "Hybr",
            "Hyd",
            "Hydr",
            "Hyg",
            "Hyp",
            "Hyr",
            "Hyst",
        },
        { // I
            "Ib",
            "Ibr",
            "Ic",
            "Igr",
            "Ill",
            "Ind",
            "Ingw",
            "Inv",
            "Iob",
            "Ion",
            "Ip",
            "Iph",
            "Ipl",
            "Ips",
            "Ir",
            "Ix",
            "Iz",
        },
        { // J
            "J",
            "Jh",
        },
        { // K
            "K",
            "Kh",
            "Kl",
            "Kr",
            "Krypt",
            "Ky",
            "Kyl",
            "Kys",
        },
        { // L
            "L",
            "Ly",
            "Lyg",
            "Lyr",
        },
        { // M
            "M",
        },
        { // N
            "N",
            "Nyr",
        },
        { // O
            "Ob",
            "Oct",
            "Octh",
            "Od",
            "Ogl",
            "Ohk",
            "Oj",
            "Okr",
            "Olv",
            "Om",
            "Omn",
            "Onc",
            "Oor",
            "Op",
            "Oph",
            "Opt",
            "Or", 
            "Org",
            "Orl",
            "Orn",
            "Orph",
            "Orth",
            "Orv",
            "Os",
            "Ost",
            "Oth",
            "Ov",
            "Oz",
        },
        { // P
            "P",
            "Ph",
            "Phl",
            "Phyb",
            "Phyl",
            "Pl",
            "Plyg",
            "Plyth",
            "Pr",
            "Psy",
            "Pyg",
            "Pyl",
            "Pyr",
            "Pyx",
        },
        { // Q
            "Qu",
        },
        { // R
            "R",
            "Rh",
            "Ryn",
        },
        { // S
            "S",
            "Sc",
            "Sh",
            "Shr",
            "Sk",
            "Sl",
            "Sp",
            "Sph",
            "Spl",
            "St",
            "Str",
            "Syr",
        },
        { // T
            "T",
            "T'k",
            "Th",
            "Thr",
            "Tr",
            "Tyg",
            "Tym",
            "Typh",
            "Typhl",
            "Tyr",
            "Tyth",
        },
        { // U
            "Ub",
            "Ukl",
            "Ukr",
            "Ul",
            "Ulg",
            "Ultr",
            "Ulv",
            "Umbr",
            "Un",
            "Undr",
            "Uobr",
            "Ups",
            "Ur",
            "Urkl",
            "Uv",
            "Uz",
        },
        { // V
            "V",
            "Vl",
            "Vr",
            "Vyk",
        },
        { // W
            "W",
            "Wy",
        },
        { // X
            "X",
            "Xh",
            "Xyl",
            "Xyn",
            "Xynth",
        },
        { // Y
            "Y",
            "Yh",
        },
        { // Z
            "Z",
            "Zh",
            "Zy",
            "Zyg",
            "Zyl",
            "Zynf",
            "Zynt",
            "Zyr",
            "Zyth",
        },
    };

    /**
     * Gets a random prefix from the above array
     * 
     * @return The prefix
     */
    public static String getPrefix() {
        Random rand = new Random();
        String prefix;
        String[] letter;

        letter = prefixes[rand.nextInt(prefixes.length)];
        prefix = letter[rand.nextInt(letter.length)];

        return prefix;
    }

    /**
     * Gets the amount of total prefixes
     * 
     * @return The total number of possible prefixes
     */
    public static int getNumPrefixes() {
        int numPrefixes = 0;

        for (int i = 0; i < prefixes.length; i++) {
            numPrefixes += prefixes[i].length;
        }

        return numPrefixes;
    }
}
