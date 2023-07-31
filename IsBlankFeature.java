public class IsBlankFeature {

    // Returns true if the string is empty or contains only white space(s) otherwise false.
    private boolean validatePhrase(String phrase) {
        return phrase.isBlank();
    }

    public static void main(String[] args) {
        
        IsBlankFeature blankFeature = new IsBlankFeature();

        String emptyPhrase = ""; //true
        String blankPhrase = " "; //true
        String phrase = "Lorem ipsum"; //false
        String phraseWithSpaces = "   Lorem ipsum   "; //false

        System.out.println("Is blank an empty phrase? : " 
            + blankFeature.validatePhrase(emptyPhrase));
        
        System.out.println("Is blank a phrase only with white space(s)? : " 
            + blankFeature.validatePhrase(blankPhrase));
        
        System.out.println("Is blank the phrase " + phrase + "? : "
            + blankFeature.validatePhrase(phrase));
        
        System.out.println("Is blank a phrase with white spaces? : " 
            + blankFeature.validatePhrase(phraseWithSpaces));    
        
    }
}
