package CsvToList.Ctl;

/**
 * Class that allows you to work with entity fields - subdivision
 * 
 */
public class Subdivision {
   
	private int id;
    private String title;
   
    public Subdivision(String _title, int _id )
    {
        title = _title;
        id = _id;
    }
    /**
    *
    * @return the title of subdivision
    */
    public String getTitle()
    {
        return this.title;
    }
    /**
    *
    * @return the id of subdivision
    */
    public int getId()
    {
        return id;
    }
}