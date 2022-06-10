public class TagContentExtractor {
    public static void main(String[] args) {
        String[] tags = {"<h1>Nayeem loves counseling</h1>","<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>","<Amee>safat codes like a ninja</amee>","<SA premium>Imtiaz has a secret crush</SA premium>"};
        String[] output = new String[tags.length];
        int count = 0;
        for(String tag: tags){
                output[count] = extractContent(tag);
                count++;
        }

        for(String content:output){
            System.out.println(content);
        }
    }

    /**
     * Extract the content out of a HTML tag
     * @param tag the bare HTML tag + content
     * @return the content stripped of html tags
     */
    public static String extractContent(String tag){
        return tag.replaceAll("<[^>]*>", "");
    }
}
