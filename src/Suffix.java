import java.util.Random;

/**
 * @author Hybrid
 * 
 * All possible planet name suffixes
 */
public class Suffix {
    private static final String[] suffixes = {
        "a",
        "ach",
        "adys",
        "ag",
        "ah",
        "ahl",
        "ai",
        "aia",
        "ak",
        "al",
        "alb",
        "alyx",
        "am",
        "an",
        "ang",
        "anth",
        "ao",
        "aos", 
        "aph",
        "ar",
        "ark",
        "arr",
        "ars",
        "arse",
        "arv",
        "awa",
        "ax",
        "az", 
        "ea",
        "eb",
        "eed",
        "een",
        "eer",
        "ek",
        "elm",
        "elp",
        "elph",
        "en",
        "enth",
        "eol",
        "eom",
        "eon",
        "eone",
        "eph",
        "er", 
        "erg",
        "erth",
        "es",
        "esp",
        "et",
        "eum",
        "eus",
        "ev",
        "ex", 
        "i",
        "ia",
        "iac",
        "ial",
        "ian",
        "iax",
        "id",
        "iem",
        "ies",
        "iex",
        "ii",
        "ik",
        "il",
        "im",
        "in",
        "inx",
        "io",
        "ion", 
        "ior",
        "ios",
        "ip",
        "iph",
        "ir",
        "is",
        "ite",
        "ith",
        "ium",
        "ius",
        "iv",
        "ix",
        "iz", 
        "o",
        "oa",
        "ob",
        "obe",
        "ode",
        "of",
        "og",
        "oh",
        "ok",
        "ol",
        "olch",
        "om",
        "ome",
        "on",
        "one",
        "op",
        "ope",
        "oph",
        "or",
        "orb", 
        "orm",
        "orn",
        "os",
        "osh",
        "oss",
        "ot",
        "oth",
        "ou",
        "ov",
        "ox",
        "u",
        "ua",
        "ub",
        "uk",
        "um",
        "un",
        "une",
        "urn",
        "ury",
        "us",
        "usk",
        "uth",
        "uul",
        "ux",
    };

    /**
     * Gets a random suffix from the above array
     * 
     * @return The suffix
     */
    public static String getSuffix() {
        Random rand = new Random();
        String suffix = suffixes[rand.nextInt(suffixes.length)];

        return suffix;
    }

    /**
     * Gets the amount of total suffixes
     * 
     * @return The total number of possible suffixes
     */
    public static int getNumSuffixes() {
        return suffixes.length;
    }
}
