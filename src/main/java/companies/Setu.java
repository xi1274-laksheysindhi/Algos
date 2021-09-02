package companies;

public class Setu {

    public static void main(String[] args) {
        int[] magic = {2,4,5,2};
        int[] dist = {4,3,1,3};
        System.out.println(getStartPoint(magic, dist));
    }

    public static boolean verify(int[] magic, int[] dist, int count, int currentMagic, int currentPosition) {
        currentMagic = currentMagic + magic[currentPosition];
        if (currentMagic < dist[currentPosition] && count < dist.length) {
            return false;
        }
        if (count == dist.length) {
            return true;
        }
        currentMagic = currentMagic - dist[currentPosition];
        count++;
        currentPosition = (currentPosition + 1) % dist.length;
        return verify(magic, dist, count, currentMagic, currentPosition);
    }

    private static int getStartPoint(int[] magic, int[] dist) {

        for (int i = 0; i < magic.length; i++) {
            if (verify(magic, dist, -1, 0, i)) {
                return i;
            }
        }
        return -1;
    }
}
