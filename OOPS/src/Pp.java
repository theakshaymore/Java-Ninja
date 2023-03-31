
public class Pp {

	public static void main(String[] args) {
		String sentence = "My name is Akshay";
		String[] words = sentence.split(" ");
		String reversedSentence = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            reversedSentence += reversedWord + " ";
        }

        // Print the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence.trim());
	}

}
