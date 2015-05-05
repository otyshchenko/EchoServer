package test;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;


public class EchoServerTest {

    public static final String HELLO_SERVER = "Hello Server!";
    public static final String RECEIVED_MESSAGE = "Received message: ";

    @Test
    public void testServer() throws Exception {
        open("/home");
        $("#message").setValue(HELLO_SERVER);
        $("button").click();
        String answer = $("p").innerHtml();
        assertEquals(answer, RECEIVED_MESSAGE + HELLO_SERVER );
    }
}

  
