package CsvToList.Ctl;

/**
 * A class that allows you to work with the fields of an entity-a person
 * 
 */
public class Person {

    private String id;
    private String name;
    private String gender;
    private String salary;
    private String BirthDate;
    private Subdivision subdivision;


 /**
  * Gives to all the object's fields their parameteres
  */
public Person(String _id, String _name, String _gender, String _birthdate, String _title, int _iddiv, String _salary)
    {
        id = _id;
        name = _name;
        gender = _gender;
        salary = _salary;
        BirthDate = _birthdate;
        subdivision = new Subdivision(_title, _iddiv);
    }

    /**
     * Standard with no variables constructor
     */
    public Person(){}

    /**
     *
     * @return id
     */
   public String getId()
   {
       return id;
   }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     *
     * @return Date of birth
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     *
     * @return the title of subdivision
     */
    public String getSubdTitle() {
        return subdivision.getTitle();
    }

    /**
     *
     * @return the id of subdivision
     */
    public int getSubdId()
    {
        return subdivision.getId();
    }

}
