
public class LecteurNormal extends LecteurFichier {
	
	private String file;
	
	public LecteurNormal(String file) {
		super();
		this.file = file;
	}

	@Override
	public void initFile() {
		super.initFile(file);
	}

	@Override
	public void readFile() {
		super.readFile();	
	}

}
