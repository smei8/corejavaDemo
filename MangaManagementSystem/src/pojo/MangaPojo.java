package pojo;

public class MangaPojo {
	private int mangaId;
	private String mangaTitle;
	private String mangaCreater;
	private String mangaGenre;
	private int mangaCost;
	private String mangaImageURL;
	
	public MangaPojo() { //constructor 
		//calls the constructor in Object class
		super();
	}
	public MangaPojo(int mangaId, String mangaTitle, String mangaCreater, String mangaGenre, int mangaCost,
			String mangaImageURL)  { //to initialize the instance var
		//Question: why calling super here again?
		//			what does this super do?
		//			are we calling super here to initialize the instance var?
		super();
		
		this.mangaId = mangaId;
		this.mangaTitle = mangaTitle;
		this.mangaCreater = mangaCreater;
		this.mangaGenre = mangaGenre;
		this.mangaCost = mangaCost;
		this.mangaImageURL = mangaImageURL;
				
	}
	
	//question: does the order of defining setter and getter matter?
	public void setMangaId(int mangaId) {
		this.mangaId = mangaId;
	}
	public int getMangaId() {
		return mangaId;
	}
	public void setMangaTitle() {
		this.mangaTitle = mangaTitle;
	}
	public String getMangaTitle(String mangaTitle) {
		return mangaTitle;
	}
	public void setMangaGenre() {
		this.mangaGenre = mangaGenre;
	}
	public String getMangaGenre(String mangaGenre) {
		return mangaGenre;
	}
	public void setMangaCost() {
		this.mangaCost = mangaCost;
	}
	public int getMangaCost(int mangaCost) {
		return mangaCost;
	}
	public void setMangaImageURL() {
		this.mangaImageURL = mangaImageURL;
	}
	public String getMangaImageURL(String mangaImageURL) {
		return mangaImageURL;
	}
	
	@Override
	public String toString() {
		return "MangaPojo [mangaId=" + mangaId + ", mangaTitle=" + mangaTitle + ", mangaCreater=" + mangaCreater
				+ ", mangaGenre=" + mangaGenre + ", mangaCost=" + mangaCost + ", mangaImageURL=" + mangaImageURL + "]";
	}
}
