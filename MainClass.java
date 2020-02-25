package SPL;

import javax.swing.*;

public class MainClass {

    public static void main(String[] args) {

String XML;

        XML= JOptionPane.showInputDialog("Enter XML");



ParserClass P1=new ParserClass(XML);

P1.seperateTag(XML);
P1.storeInfo();
    }

}
