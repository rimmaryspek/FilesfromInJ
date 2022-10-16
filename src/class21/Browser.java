package class21;

public class Browser {

    void openBrowser(){
        System.out.println("opening a browser");

    }
void navigate(){
    System.out.println("opening the url");
}
void test(){
    System.out.println("test the web page");
}
void closeBROWSER(){
    System.out.println("closing the browser");
}

}
class Chrome extends Browser{
@Override
    void openBrowser(){
        System.out.println("opening the browser in less then one second");
    }

}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("opening the browser in less then two second");
    }
}
class Browsertester{
    public static void main(String[] args) {
        Chrome chrome =new Chrome();
        chrome.openBrowser();
        chrome.closeBROWSER();
    }
}