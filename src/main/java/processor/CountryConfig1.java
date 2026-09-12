package processor;

// Country-specific configuration for YZ-1
public class CountryConfig1 {
    public static final String COUNTRY_CODE = "YZ-1";

    public boolean requiresExtraValidation() {
        return true;
    }
}
