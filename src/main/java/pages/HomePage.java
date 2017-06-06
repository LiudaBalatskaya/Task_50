package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final By HOME_PAGE = By.cssSelector("#name");
    private static final By LINK = By.cssSelector("link");
    private static final By INPUT = By.cssSelector("input");
    private static final By ELEMENTS = By.cssSelector("div");
    private static final By NEAR_NAME_ELEMENTS = By.cssSelector("#currentUserWidgetContent div");
    private static final By LIST_OFFICES = By.cssSelector("#officeWidgetContent");
    public static final By LINK051 = By.cssSelector("#officeWidgetContent ol li:nth-child(2) a");
    public static final By LINK424 = By.cssSelector("#officeWidgetContent li:nth-last-child(2) a");
    public static final By LINK118 = By.cssSelector("#officeWidgetContent li:nth-child(5) a");
    public static final By LINKS_STEP5 = By.cssSelector("#officeWidgetContent li:nth-child(5n+8)");
    public static final By LINKS_CLASSES = By.cssSelector("body>*[class] *[class]");
    public static final By LINKS_CLASSES_AFTER_WIDGET = By.cssSelector("div[class^=\"widget\"] *[class]");
    public static final By LINKS_ALL_ID_AFTER_WRAPPER = By.cssSelector("*[class$=\"Wrapper\"] *[id]");
    public static final By DATA_OFFICEID = By.cssSelector("*[data-officeid*=\"b\"]");

    private static final By LINKXPATH = By.xpath("//link");
    private static final By INPUTXPATH = By.xpath("//input");
    private static final By ELEMENTSXPATH = By.xpath("//div");
    private static final By NEAR_NAME_ELEMENTS_XPATH = By.xpath(".//*[@id=\"currentUserWidgetContent\"]//div");
    public static final By LINK051XPATH = By.xpath(".//*[@id='officeWidgetContent']//li[2]/a");
    public static final By LINK424XPATH = By.xpath(".//*[@id='officeWidgetContent']//li[last()-2]/a");
    public static final By LINK118XPATH = By.xpath(".//*[@id='officeWidgetContent']//li[5]/a");
    public static final By LINKS_STEP5XPATH = By.xpath(".//ol[@class='officeShortInfo zebraStyle']/li[position()>1 and position()<6]");
    public static final By MANAGEMENT_BELARUS = By.xpath(".//*[text()=\"Management Belarus\"]");
    public static final By TO_COMPANY = By.xpath(".//a[@id=\"companyMenu\"]");


    private static final By CUSTOM_LINK = By.cssSelector("link[href$=\"custom.css\"]");
    private static final By MASTER_LINK = By.cssSelector("link[href$=\"Master.css\"]");
    private static final By SITE_LINK = By.cssSelector("link[href$=\"Site.css\"]");
    private static final By FEEDBACK_LINK = By.cssSelector("link[href$=\"Feedback.css\"]");
    private static final By FORM_POPUP_LINK = By.cssSelector("link[href$=\"FormPopup.css\"]");
    private static final By DROPDOWN_LIST_LINK = By.cssSelector("link[href$=\"FormPopup.css\"]");
    private static final By SPINNER_LINK = By.cssSelector("link[href$=\"Spinner.css\"]");
    private static final By SELECTOR_CONTROL_LINK = By.cssSelector("link[href$=\"SelectorControl.css\"]");
    private static final By DATE_PICKER_LINK = By.cssSelector("link[href$=\"datepicker.css\"]");

    private static final By SELECT_BOX_LINK = By.cssSelector("link[href$=\"selectbox.css\"]");
    private static final By TOOLTIP_LINK = By.cssSelector("link[href$=\"Tooltip.css\"]");
    private static final By MULTI_SELECT_LINK = By.cssSelector("link[href$=\"multiselect.css\"]");

    private static final By PAGE_HEADER_LINK = By.cssSelector("link[href$=\"PageHeader.css\"]");
    private static final By GLOBAL_SEARCH_LINK = By.cssSelector("link[href$=\"GlobalSearch.css\"]");

    private static final By METRO_STYLE_PANEL_LINK = By.cssSelector("link[href$=\"MetroStylePanel.css\"]");
    private static final By METRO_STYLE_WIDGETS_LINK = By.cssSelector("link[href$=\"MetroStyleWidgets.css\"]");

    public static void findAllLinks(WebDriver driver) {
        Waiter.waitFluentWaitALLElement(driver, LINK);
        Waiter.waitFluentWaitALLElement(driver, LINKXPATH);
    }
    public static void findAllInputs(WebDriver driver) {
        Waiter.waitFluentWaitALLElement(driver, INPUT);
        Waiter.waitFluentWaitALLElement(driver, INPUTXPATH);
    }

    public static void findAllElements(WebDriver driver) {
        Waiter.waitFluentWaitALLElement(driver, ELEMENTS);
        Waiter.waitFluentWaitALLElement(driver, ELEMENTSXPATH);
    }

    public static void findNearNameAllElements(WebDriver driver) {
        Waiter.waitFluentWaitALLElement(driver, NEAR_NAME_ELEMENTS);
        Waiter.waitFluentWaitALLElement(driver, NEAR_NAME_ELEMENTS_XPATH);
    }
    public static void findListElement(WebDriver driver, By element) {  Waiter.waitFluentWaitALLElement(driver, element); }

}
