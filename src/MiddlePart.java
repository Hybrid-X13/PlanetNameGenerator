import java.util.ArrayList;
import java.util.Random;

/**
 * @author Hybrid
 * 
 * All possible middle portions of planet names
 */
public class MiddlePart {
    private static final String[] middlePart = {
        "ab",
        "ac",
        "acl",
        "achn",
        "acr",
        "act",
        "ad",
        "adl",
        "adm",
        "adn",
        "adr",
        "adv",
        "aed",
        "aest",
        "aeth",
        "af",
        "afr",
        "ag",
        "agd",
        "agl",
        "agm",
        "agn",
        "agr",
        "agv",
        "ah",
        "aij",
        "aj",
        "ak",
        "akl",
        "akr",
        "aks",
        "akt",
        "akth",
        "akn",
        "akv",
        "al",
        "alb",
        "ald",
        "alg",
        "algr", 
        "alk",
        "all",
        "alm",
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
        "anc",
        "and",
        "andr",
        "ang",
        "angl",
        "anm",
        "ant",
        "anth",
        "anthl",
        "antr",
        "any",
        "anym",
        "anz",
        "ap",
        "aph",
        "aphr",
        "apl",
        "apr",
        "apt",
        "aqu",
        "ar",
        "arb",
        "ard",
        "arg",
        "ark",
        "arm",
        "arn",
        "arp",
        "ars",
        "arth",
        "arv",
        "arx",
        "arz",
        "as",
        "ash",
        "asm",
        "aspr",
        "ast",
        "astr",
        "at", 
        "ath",
        "athl",
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
        "aw",
        "ax",
        "axvl",
        "ay",
        "ayl",
        "az",
        "azgr",
        "azm",
        "azr",
        "eb",
        "ebr",
        "ec",
        "ecd",
        "ecr",
        "ect",
        "ed",
        "edr",
        "eg",
        "egr",
        "eh",
        "eid",
        "eim",
        "eit",
        "ek",
        "ekn",
        "ekr",
        "eks",
        "ekt",
        "el",
        "elb",
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
        "emps",
        "en",
        "end",
        "endr",
        "engl",
        "enj",
        "enl",
        "enm",
        "enn",
        "enr",
        "ens",
        "ent",
        "entr",
        "env",
        "enz",
        "eop",
        "eov",
        "ep",
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
        "esph",
        "ess",
        "est",
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
        "ezl",
        "ezr",
        "iant",
        "ib",
        "ibl",
        "ibr",
        "ibz",
        "ic",
        "ich",
        "icl",
        "icr",
        "id",
        "idr",
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
        "int",
        "inth",
        "inthr",
        "inz",
        "iol",
        "iop",
        "iopl",
        "ip",
        "iph",
        "ipl",
        "ips",
        "ir",
        "irc",
        "irg",
        "is",
        "isc",
        "isp",
        "ist",
        "it",
        "ith",
        "itr",
        "iuch",
        "iur",
        "iv",
        "iw",
        "ix",
        "ixc",
        "iz",
        "ob",
        "obr",
        "ocl",
        "ocr",
        "oct",
        "od",
        "odr",
        "of",
        "og",
        "ogl",
        "ogm",
        "ogr",
        "oht",
        "oj",
        "ok",
        "okv",
        "ol",
        "oldr",
        "olf",
        "olgr",
        "olk",
        "oll",
        "olm",
        "olsc",
        "olt",
        "olth",
        "om",
        "on",
        "ond",
        "ondr",
        "onf",
        "ong",
        "onk",
        "onr",
        "ont",
        "onth",
        "ontr",
        "onv",
        "op",
        "oph",
        "ophl",
        "ophr",
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
        "ors",
        "ort",
        "orv",
        "orz",
        "os",
        "osl",
        "osm",
        "osph",
        "ot",
        "othl",
        "othr",
        "otr",
        "oug",
        "ouk",
        "ouv",
        "ov",
        "ovn",
        "ow",
        "ox",
        "oxph",
        "oz",
        "ub",
        "uc",
        "uch",
        "ucl",
        "ud",
        "udr",
        "ug",
        "uh",
        "uif",
        "uin",
        "ukr",
        "ul",
        "ulb",
        "ulc",
        "uldr",
        "ulg",
        "ulk",
        "ulm",
        "uln",
        "ulp",
        "uls",
        "ult",
        "ulv",
        "ulw",
        "ulz",
        "uk",
        "uky",
        "um",
        "umb",
        "umpt",
        "un",
        "und",
        "undr",
        "ung",
        "unv",
        "up",
        "uphr",
        "ur",
        "urg",
        "url",
        "urk",
        "urn",
        "us",
        "usc",
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
     * Gets a string from the above array that is only 2 characters in length
     * 
     * @return The middle string
     */
    public static String getMiddlePart2() {
        Random rand = new Random();
        ArrayList<String> middlePart2 = new ArrayList<String>();

        for (int i = 0; i < middlePart.length; i++) {
            if (middlePart[i].length() == 2) {
                middlePart2.add(middlePart[i]);
            }
        }
        
        return middlePart2.get(rand.nextInt(middlePart2.size()));
    }

    /**
     * Gets the amount of middle part strings
     * 
     * @return The total number of possible middle strings
     */
    public static int getNumMiddleParts() {
        return middlePart.length;
    }

    /**
     * Gets the amount of middle part strings that are 2 characters in length
     * 
     * @return The total number of possible strings
     */
    public static int getNumMiddleParts2() {
        ArrayList<String> middlePart2 = new ArrayList<String>();

        for (int i = 0; i < middlePart.length; i++) {
            if (middlePart[i].length() == 2) {
                middlePart2.add(middlePart[i]);
            }
        }

        return middlePart2.size();
    }
}
