import java.util.ArrayList;


public class CompactDisc {
  private static ArrayList<CompactDisc> instances = new ArrayList<CompactDisc>();

  private String mTitle;
  private String mArtist;

  public CompactDisc(String title) {
    mTitle = title;
    mArtist = "";
    instances.add(this);
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
}
