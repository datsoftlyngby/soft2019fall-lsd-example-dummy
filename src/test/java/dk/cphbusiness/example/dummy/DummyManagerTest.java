package dk.cphbusiness.example.dummy;

import dk.cphbusiness.example.contract.Holder;
import org.junit.jupiter.api.BeforeAll;


@SelectClasses
public class DummyManagerTest {
  
  @BeforeAll
  public static void setupClass() {
    Holder.manager = new PersonManagerDummy();
    }
  
  public DummyManagerTest() {
  }
  
}
