import java.util.Collections;

public class LecteurReverseLine extends LecteurFichier {

	private String file;
	
	public LecteurReverseLine(String file) {
		super();
		this.file = file;
	}

	@Override
	public void initFile() {
		super.initFile(file);
	}

	@Override
	public void readFile() {
		Collections.reverse(lignes);
		super.readFile();
	}
	
}
