package tests;

import org.junit.jupiter.api.Test;
import steps.ApiSteps;

import java.net.http.HttpResponse;

public class Test1 {



    @Test
    public void test1() {

        HttpResponse<String> response = ApiSteps.get().getOneCounter("themes,photos,members,presents");

        ApiSteps.get().assertResponseStatusCode(response, 200);
        ApiSteps.get().assertThemesCountEqualsExpected(response, 1899);

        System.out.println(response.body());
    }
}
