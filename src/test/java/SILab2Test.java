import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void multipleConditions(){
        RuntimeException ex;
        List<User> userList = new ArrayList<>();
        userList.add(new User("test1", "Password123!", "test1@example.com"));
        userList.add(new User("test2", "Password123!", "test2@example.com"));
        userList.add(new User("test3", "Password123!", "test3@example.com"));
        userList.add(new User("test4", "Password123!", "test4@example.com"));
        User test=new User("Name","Pass","email");//FFF
        boolean rezultat=SILab2.function(test,userList);
        Assertions.assertFalse(rezultat);
        ex=assertThrows(RuntimeException.class,()-> SILab2.function(new User(null,"null",null),userList));//TXX
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        ex=assertThrows(RuntimeException.class,()-> SILab2.function(new User("kiril",null,null),userList));//FTX
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        ex=assertThrows(RuntimeException.class,()-> SILab2.function(new User("kiril","null",null),userList));//FFT
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void EveryBranch(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("test1", "Password123!", "test1@example.com"));
        userList.add(new User("test2", "Password123!", "test2@example.com"));
        userList.add(new User("test3", "Password123!", "test3@example.com"));
        userList.add(new User("test4", "Password123!", "test4@example.com"));
        RuntimeException ex;
        //user==null || user.getPassword()==null || user.getEmail()==null
        ex=assertThrows(RuntimeException.class,()-> SILab2.function(new User("test",null,"test"),userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //username="test" password="Password123"(nema spec karakter) email=test@email.com
        assertEquals(false,SILab2.function(new User("test","Password123","test@email.com"),userList));
        //username=null password="Password123!" email=testemail.com(nema @ ili .)
        assertEquals(false,SILab2.function(new User(null,"Password123!","testemail.com"),userList));
        //username=veke postoi password="123"(pomal od 8 karakteri) email=veke postoi
        assertEquals(false,SILab2.function(new User("test1","123","test1@example.com"),userList));
        //username="test" password="Password 123!"(ima prazno mesto) email="test@email.com"
        assertEquals(false,SILab2.function(new User("test","Password 123!","test@email.com"),userList));
    }
}