import java.util.Random;

/**
 * @author Hybrid
 * 
 * All possible middle portions of planet names
 */
public class MiddlePart {
    private static final String[] middlePart = {
        "ab",
        "acl",
        "achn",
        "act",
        "ad",
        "adl",
        "adm",
        "adn",
        "adr",
        "aed",
        "af",
        "ag",
        "agd",
        "agl",
        "agm",
        "agn",
        "agv",
        "ah",
        "aij",
        "aj",
        "ak",
        "akr",
        "aks",
        "akth",
        "akn",
        "al",
        "alb",
        "ald",
        "alg",
        "algr", 
        "all",
        "aln",
        "altr",
        "alv",
        "alyps",
        "alz",
        "am",
        "ambd",
        "amn",
        "amp",
        "an",
        "and",
        "andr",
        "angl",
        "ant",
        "anth",
        "anthl",
        "antr",
        "any",
        "anym",
        "ap",
        "aph",
        "aphr",
        "apr",
        "ar",
        "ard",
        "arg",
        "ark",
        "arm",
        "arn",
        "arp",
        "ars",
        "arth",
        "arv",
        "arz",
        "as",
        "asm",
        "ast",
        "astr",
        "at", 
        "ath",
        "atk",
        "atl",
        "atr",
        "aud",
        "aur",
        "aut",
        "av",
        "avn",
        "avr",
        "avl",
        "ax",
        "axvl",
        "ay",
        "ayl",
        "az",
        "azm",
        "eb",
        "ebr",
        "ec",
        "ecd",
        "ecr",
        "ect",
        "ed",
        "edr",
        "eev",
        "eg",
        "eh",
        "eid",
        "eim",
        "eit",
        "ek",
        "ekn",
        "ekr",
        "ekt",
        "el",
        "elcr",
        "eld",
        "eldr",
        "elg",
        "elkr",
        "elm",
        "eln",
        "elph",
        "elt",
        "elv",
        "elz",
        "em",
        "emn",
        "en",
        "end",
        "engl",
        "enj",
        "enl",
        "enm",
        "enn",
        "enr",
        "ent",
        "entr",
        "env",
        "enz",
        "eop",
        "eov",
        "eph",
        "ephl",
        "epl",
        "eps",
        "ept",
        "equ",
        "er",
        "erb",
        "erc",
        "erm",
        "ern",
        "erp",
        "ers",
        "erv",
        "es",
        "esb",
        "escr",
        "esl",
        "esk",
        "esm",
        "esp",
        "ess",
        "et",
        "eth",
        "ethr",
        "etn",
        "etr",
        "ev",
        "evl",
        "evn",
        "evr",
        "ex",
        "exk",
        "eyt",
        "ez",
        "iant",
        "ib",
        "ibl",
        "ibr",
        "ic",
        "icl",
        "icr",
        "id",
        "ig",
        "igl",
        "igm",
        "igr",
        "ih",
        "ij",
        "ik",
        "ikr",
        "ikt",
        "il",
        "ill",
        "ilv",
        "im",
        "imb",
        "imph",
        "imr",
        "in",
        "ind",
        "indr",
        "inl",
        "inr",
        "inth",
        "inthr",
        "iol",
        "iopl",
        "iph",
        "ipl",
        "ir",
        "irg",
        "is",
        "isc",
        "ist",
        "it",
        "ith",
        "itr",
        "iuch",
        "iur",
        "iv",
        "iw",
        "ix",
        "iz",
        "obr",
        "ocl",
        "ocr",
        "ob",
        "od",
        "og",
        "ogm",
        "ogr",
        "oht",
        "oj",
        "ok",
        "ol",
        "oldr",
        "olk",
        "olm",
        "olsc",
        "olt",
        "om",
        "on",
        "ond",
        "ondr",
        "onf",
        "ong",
        "onr",
        "ont",
        "onth",
        "ontr",
        "onv",
        "op",
        "oph",
        "ophl",
        "opl",
        "opt",
        "oq",
        "oqu",
        "or",
        "orb",
        "orc",
        "ord",
        "org",
        "orl",
        "orm",
        "orn",
        "orp",
        "orph",
        "ort",
        "orv",
        "os",
        "osl",
        "osm",
        "ot",
        "othl",
        "othr",
        "otr",
        "oug",
        "ouv",
        "ov",
        "ovn",
        "ow",
        "ox",
        "oz",
        "ub",
        "uch",
        "ucl",
        "ud",
        "udr",
        "ug",
        "uin",
        "ukr",
        "ul",
        "ulb",
        "ulc",
        "uldr",
        "ulg",
        "uln",
        "ulp",
        "ult",
        "ulv",
        "ulw",
        "ulz",
        "uk",
        "uky",
        "um",
        "umpt",
        "un",
        "und",
        "undr",
        "unv",
        "up",
        "uphr",
        "ur",
        "urg",
        "url",
        "urk",
        "us",
        "usl",
        "ut",
        "uth",
        "utr",
        "uv",
        "uw",
        "ux",
        "uxl",
        "uz",
        "uzg",
    };

    /**
     * Gets a string from the above array
     * 
     * @return The middle string
     */
    public static String getMiddlePart() {
        Random rand = new Random();
        String middle = middlePart[rand.nextInt(middlePart.length)];

        return middle;
    }

    /**
     * Gets the amount of middle part strings
     * 
     * @return The total number of possible middle strings
     */
    public static int getNumMiddleParts() {
        return middlePart.length;
    }
}
