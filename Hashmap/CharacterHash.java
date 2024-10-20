package Hashmap;

class CharacterHash {
    public int[] characterHash(String string) {
        int[] counts = new int[52];

        for (char ch : string.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                counts[ch - 'A' + 26]++;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        CharacterHash soln = new CharacterHash();
        String string = "AbcdACd";
        int[] result = soln.characterHash(string);

        System.out.print("Character count: ");
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}

