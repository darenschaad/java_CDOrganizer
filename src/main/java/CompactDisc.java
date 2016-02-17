import java.util.ArrayList;


public class CompactDisc {
  private static ArrayList<CompactDisc> instances = new ArrayList<CompactDisc>();

  private String mTitle;
  private String mArtist;
  private int mId;

  public CompactDisc(String title) {
    mTitle = title;
    mArtist = "";
    instances.add(this);
    mId = instances.size();
  }

  public String getTitle(){
    return mTitle;
  }

  public String getArtist(){
    return mArtist;
  }

  public void setArtist(String artist) {
    mArtist = artist;
  }

  public static ArrayList<CompactDisc> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }
  public static CompactDisc find(int id) {
    try {
      return instances.get(id -1);
    }
    catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
