package MusicGame;

public class MusicGame_Model {
	
	// 노래제목
	private String title;
	// 노래경로
	private String path;

	public MusicGame_Model(String title, String path) {
		super();
		this.title = title;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
