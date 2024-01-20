import java.util.Scanner;

public class Stringaaa2 {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);
        int N = sobj.nextInt();
        int Q = sobj.nextInt();

        sobj.nextLine();

        String stringinput = sobj.nextLine();

        for (int i = 0; i < Q; i++) {
            int L = sobj.nextInt();
            int R = sobj.nextInt();

            String resultSubstring = stringinput.substring(L, R);

            String str = "";
            int count = 0;

            for (int k = 0; k < resultSubstring.length(); k++) {
                boolean isDuplicate = false;

                for (int j = 0; j < resultSubstring.length(); j++) {
                    if (k != j && resultSubstring.charAt(k) == resultSubstring.charAt(j)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    str = str + resultSubstring.charAt(k);
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
