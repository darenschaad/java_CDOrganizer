public class CompactDisc {
  private String mTitle;
  private String mArtist;

  public CompactDisc(String title) {
    mTitle = title;
    mArtist = "";
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

}
