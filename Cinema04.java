public class Cinema04 {
    public static void main(String[] args) {
        
        String[][] audience = new String[4][2];

        System.out.println(audience.length);
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
        }

        for (String[] rowAudience : audience) {
            System.out.println("Length of row : " + rowAudience.length);
        }

        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);
    }
}