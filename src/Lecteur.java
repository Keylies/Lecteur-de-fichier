import java.io.IOException;


public class Lecteur {

	public static void main(String[] args) throws IOException {

		String file = "D:/Documents/java/lecteur/data.txt";
		
		LecteurNormal ln = new LecteurNormal(file);
		ln.initFile();
		ln.readFile();
		
		LecteurReverse lr = new LecteurReverse(file);
		lr.initFile();
		lr.readFile();
		
		LecteurReverseLine lrl = new LecteurReverseLine(file);	
		lrl.initFile();
		lrl.readFile();
	}

}
