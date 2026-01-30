package chromeDevTools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v144.fetch.Fetch;
import org.openqa.selenium.devtools.v144.fetch.model.AuthChallengeResponse;

import java.util.List;
import java.util.Optional;

public class BasicAuthentication {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Enable Fetch with auth handling
        devTools.send(Fetch.enable(Optional.empty(), Optional.of(true)));

        // Listen for auth challenge
        devTools.addListener(Fetch.authRequired(), auth -> {

            devTools.send(
                Fetch.continueWithAuth(
                    auth.getRequestId(),
                    new AuthChallengeResponse(
                        AuthChallengeResponse.Response.PROVIDECREDENTIALS,
                        Optional.of("admin"),     // username
                        Optional.of("password")   // password
                    )
                )
            );
        });

        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
}