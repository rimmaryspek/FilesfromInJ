package class23;

public interface WedDrive {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

     */
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();

}
class ChromeDriver implements WedDrive{

    @Override
    public void openBrowser() {
        System.out.println("opening Chrome ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browers");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("miximizing browser");
    }

    @Override
    public void findElement() {
        System.out.println("find the element");
    }
}
class FirefoxDriver implements WedDrive{

    @Override
    public void openBrowser() {
        System.out.println("open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Max");
    }

    @Override
    public void findElement() {
        System.out.println("find");
    }
}