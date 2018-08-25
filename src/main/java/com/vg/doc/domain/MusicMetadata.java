package com.vg.doc.domain;

public class MusicMetadata extends ObjectMetadata {

	private String artist;
	private String album;
	private String title;

	public MusicMetadata(String createBy, String createDate, String modifyDate,
			String artist, String album, String title) {
		super(createBy, createDate, modifyDate);
		this.artist = artist;
		this.album = album;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return super.toString() + " MusicMetadata [artist=" + artist + ", album=" + album + ", title=" + title + "]";
	}

	public static void main(String[] args) {
		MusicMetadata musics = new MusicMetadata("a", "1", "2", "c", "d", "e");
		System.out.println(musics.toString());
	}
}
