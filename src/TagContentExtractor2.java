import java.util.regex.*;
public class TagContentExtractor2 {
    public static void main(String[] args) {
        String[] tags = {"<h1>Nayeem loves counseling</h1>","<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>","<Amee>safat codes like a ninja</amee>","<SA premium>Imtiaz has a secret crush</SA premium>"};
        /*
         * This regex pattern is split into 2 groups:
         * group 1: (.+) - this just gets and saves the tag name that is inbetween the <> symbols.
         * group 2: ([^<]+) - this gets everything between the opening tag and closing tag.
         * The last regex pattern: </\\1> this checks that the content after the / is the same as group 1
         * if the content isn't the same, the regex doesn't return a match so the case is skipped.
         * made in reference to this: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions/Cheatsheet
         */ 
        Pattern htmlRegex = Pattern.compile("<(.+)>([^<]+)</\\1>");
        for(String tag:tags){
            Matcher results = htmlRegex.matcher(tag);
            // find the next match in the sequence
            // look at docs: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html#find()
            int count = 0;
            while(results.find()){
                System.out.println(results.group(2));
                count++;
            }
            if(count==0){
                System.out.println("None");
            }
        }
    }
}
