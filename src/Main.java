import java.io.*;
import static java.lang.System.*;


class Main {

    public static void main(String[] args) throws IOException {
        var input = new BufferedReader(new InputStreamReader(System.in));  // Get reader
        var line1 = input.readLine();
        var line2 = input.readLine();
        out.print(line1 + line2);
        exit(0);
    }
}