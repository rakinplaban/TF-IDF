package tfidf;

public class TF {
	private String d;
	private String word;
	
	public TF(String d,String word) {
		this.d = d;
		this.word = word;
	}
	
	
	
	public double term_frequency() {
		String fd = d.replaceAll("\\p{Punct}","");
        String[] words = fd.toLowerCase().split("\\s+");
        int count = 0;
        
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        
        return (double) count/words.length;
    }
	
}
