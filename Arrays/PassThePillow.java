package Arrays;

class PassThePillow {
    public int passThePillow(int n, int k) {
        int pos = 0;
        int direction = 1;
        for (int i = 0; i < k; i++) {
            if (direction == 1) {
                if (pos == n - 1) {
                    direction = -1;
                }
                pos += direction;
            } else {
                if (pos == 0) {
                    direction = 1;
                }
                pos += direction;
            }
        }
        return pos + 1;
    }

    public static void main(String[] args) {
        int n = 4, k = 5;
        PassThePillow ptp = new PassThePillow();
        int result = ptp.passThePillow(n, k);
        System.out.println("Pillow is with child: " + result);
    }
}

