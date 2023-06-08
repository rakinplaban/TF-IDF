package tfidf;

public class Main {
	public static void main(String[] args) {
		String d1 = "A quick brown fox jumps over the lazy dog. What a fox!";
		
		String d2 = "A quick brown fox jumps over the lazy fox. What a fox!";
		
		TF tf_d1 = new TF(d1,"fox");
		TF tf_d2 = new TF(d2,"fox");
		IDF idf = new IDF(d1,d2,"fox");
		
		
		System.out.println("TF of word fox in d1 is = "+tf_d1.term_frequency());
		System.out.println("TF of word fox in d2 is = "+tf_d2.term_frequency());
		System.out.println("IDF of word fox is = "+idf.inverse_document_frq());
		
		System.out.println("TF-IDF of d1 = "+(tf_d1.term_frequency()*idf.inverse_document_frq()));
		System.out.println("TF-IDF of d2 = "+(tf_d2.term_frequency()*idf.inverse_document_frq()));
	}
}
