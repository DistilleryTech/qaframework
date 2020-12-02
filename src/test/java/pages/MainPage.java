package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private final String HOME_PAGE_LABEL = "xpath://h1[@class='jumbotron-home__header']";
    private final String LEARN_ABOUT_US_BUTTON = "id:focus-features-btn";
    private final String BLOG_MENU_ITEM = "link_text:Blog";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get("https://distillery.com/");
    }

    public String getPageTitle() {
        WebElement element = waitForElementPresent(HOME_PAGE_LABEL, "Cannot get home page label!", 10);
        return element.getText();
    }

    public WebElement getLearnAboutUsButton() {
        return waitForElementPresent(LEARN_ABOUT_US_BUTTON, "Cannot locate 'Learn About Us' button!", 10);
    }

    public BlogPage clickBlogMenuItem() {
        waitForElementAndClick(BLOG_MENU_ITEM, "Cannot click on the blog menu item!", 5);
        return new BlogPage(driver);
    }
}
