import org.junit.*;
import static org.junit.Assert.*;

public class CompactDiscTest {

  @Test
  public void CompactDisc_checkThatCDInstantiatesCorrectly_true() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals(true, testCD instanceof CompactDisc);
  }

  @Test
  public void CompactDisc_getTitle() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals("IV", testCD.getTitle());
  }

  @Test
  public void CompactDisc_getArtist() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals("", testCD.getArtist());
  }


  @Test
  public void CompactDisc_setArtist() {
    CompactDisc testCD = new CompactDisc("IV");
    testCD.setArtist("Led Zeppelin");
    assertEquals("Led Zeppelin", testCD.getArtist());
  }




  //Tests go here

}
