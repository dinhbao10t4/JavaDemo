package collection;

public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	@Override
	public int hashCode() {
		return this.title.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		Song song = (Song)arg0;
		return this.title.equals(song.getTitle());
	}

	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Song o) {
		return this.getTitle().compareTo(o.getTitle());
	}
}
