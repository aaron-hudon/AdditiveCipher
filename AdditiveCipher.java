public class AdditiveCipher {
    public static void main(String[] args) {
        String guess = "";
        String cipherText = "UOISCXEWLOBDOX";
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
                          'P','Q','R','S','T','U','V','W','X','Y','Z'};

        for (int key = 0; key < 26; key++) {
            for (int i = 0; i < cipherText.length(); i++) {
                char c = cipherText.charAt(i);
                if (Character.isLetter(c)) {
                    char decryptedChar = decryptChar(c, key, alphabet);
                    guess += decryptedChar;
                } else {
                    guess += c;
                }
            }
            System.out.println("Key " + key + ": " + guess); // Display each guess
            guess = "";
        }
    }

    public static char decryptChar(char c, int key, char[] alphabet) {
        int index = (c - 'A' - key + 26) % 26;
        return alphabet[index];
    }
}





