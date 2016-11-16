import com.exadel.pages.ImageEqualityPageTest;
import com.exadel.pages.HomePageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = org.junit.runners.Suite.class)
@Suite.SuiteClasses(value = {
        HomePageTest.class,
        ImageEqualityPageTest.class
}
)

public class RunAllTests {

}