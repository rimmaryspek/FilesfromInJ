package class23;

public class WebDriveTester {
    public static void main(String[] args) {
        WedDrive[] arr = {new ChromeDriver(), new FirefoxDriver()};
    for(WedDrive obj : arr){
        obj.findElement();
        obj.closeBrowser();
        obj.openBrowser();
        obj.maximizeWindow();
        // WedDrive wedDrive =new ChromeDriver(); ////// second way
        //wedDrive.openBrowser();
        //  wedDrive.findElement();
        //wedDrive.closeBrowser();
        //wedDrive.findElement();

    }


    }
}
