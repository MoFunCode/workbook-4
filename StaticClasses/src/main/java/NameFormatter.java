public class NameFormatter {

    private NameFormatter() {
        throw new IllegalStateException("This is a static utility class and cannot be instantiated");
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName,
                                String middleName, String lastName,
                                String suffix) {

        String formattedName = lastName + ", ";

        if (prefix != null && !prefix.trim().isEmpty()) {
            formattedName += prefix + " ";
        }

        formattedName += firstName;

        if (middleName != null && !middleName.trim().isEmpty()) {
            formattedName += " " + middleName;
        }

        if (suffix != null && !suffix.trim().isEmpty()) {
            formattedName += ", " + suffix;
        }

        return formattedName;
    }
}
