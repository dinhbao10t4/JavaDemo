package collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Jukebox3 {
	List<Song> songList = new ArrayList<Song>();
	
	/*class ArtistCompare implements Comparator<Song>{
		@Override
		public int compare(Song songA, Song songB) {
			return songA.getArtist().compareTo(songB.getArtist());
		}
	}*/
	

	public static void main(String[] args) {
		new Jukebox3().go();
	}

	public void go() {
		getSongs();
		System.out.println(songList);
		
		System.out.println("Sort by Title");	
		Collections.sort(songList);
		for (Song s : songList) {
			System.out.println("Title: " + s.getTitle() + ", Artist: " + s.getArtist());
		}
		
		System.out.println("\n----------------\n");
		System.out.println("Sort by Artist");
		//ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, new Comparator<Song>(){
			@Override
			public int compare(Song o1, Song o2) {
				return o1.getArtist().compareTo(o2.getArtist());
			}
		});
		for (Song s : songList) {
			System.out.println("Title: " + s.getTitle() + ", Artist: " + s.getArtist());
		}
		
		System.out.println("\n --------- \n HASHSET : \n");
		Set<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		for (Song s : songSet) {
			System.out.println("Title: " + s.getTitle() + ", Artist: " + s.getArtist());
		}
		
		System.out.println("\n --------- \n TREESET : \n");
		Set<Song> songTreeSet = new TreeSet<Song>();
		songTreeSet.addAll(songList);
		for (Song s : songTreeSet) {
			System.out.println("Title: " + s.getTitle() + ", Artist: " + s.getArtist());
		}
	}

	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
