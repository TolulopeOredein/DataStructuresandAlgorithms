import java.util.regex.*;
public class KnuthMorrisPrattStringMatcher{
    void kmpSearch(String path, String txt){
        int m = path.length();
        int n = txt.length();

        // create lps[] that will hold the longest
        // prefix suffix values for pattern

        int [] lps = new int[m];
        int i = 0; // index for txt
        int j = 0; // index for path

        computelpsArray(path,m,lps);

        while (i<n){
            if(path.charAt(j)== txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("There is a pattern "
                        + "at index " + (i - j));
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < n && path.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }

    }

    void computelpsArray(String path, int m, int [] lps){

        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < m) {
            if (path.charAt(i) == path.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else // (pat[i] != pat[len])
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0) {
                    len = lps[len - 1];

                    // Also, note that we do not increment
                    // i here
                }
                else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
                }
    }

    public static void main(String args[])
    {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        new KnuthMorrisPrattStringMatcher().kmpSearch(pat, txt);
    }
}



