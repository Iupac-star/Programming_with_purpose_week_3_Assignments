public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] tm = {"0", "1"};
        tm[0] = "0";
        tm[1] = "1";
        for (int k = 1; k <= n; k++) {
            String t = tm[0];
            String m = tm[1];
            tm[0] += m;
            tm[1] += t;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tm[0].charAt(i) == tm[0].charAt(j))
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }
}