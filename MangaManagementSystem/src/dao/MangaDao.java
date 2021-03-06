package dao;

import java.util.List;
import pojo.MangaPojo;

public interface MangaDao {
	//performing the CRUD operation
	
	//read - fetching all Manga
	List<MangaPojo> fetchAllManga();
	//create
	MangaPojo addManga(MangaPojo mangaPojo);
	//update
	MangaPojo updateManga(MangaPojo mangaPojo);
	//delete
	MangaPojo deleteManga(int mangaId);
	//fetch one manga
	MangaPojo fetchAManga(int mangaId);
}
