public class NoMatchExcp extends Exception {
    public NoMatchExcp(int lineNumber, String inputString) {
        super("Error at line " + lineNumber + ": String \"" + inputString + "\" does not match \"India\"");
    }
}
