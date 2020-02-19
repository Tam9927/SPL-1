package SPL;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ParserClass {

    private String XML;
    private ArrayList <String> Array=new ArrayList <String>();


    public ParserClass(String text)
    {
        this.XML=text;
    }

    public void seperateTag(String xml)
    {
       // System.out.println(xml);
        int iter=0,flag=0;
        int length = xml.length();
        String temp="";
        for(iter=0;iter<length;iter++)
        {
            if(xml.charAt(iter)=='<')
            {
                //System.out.println(xml.charAt(iter));
                flag=1;
                temp+=xml.charAt(iter);
                //System.out.println(temp);
            }
            else if(flag == 1&&xml.charAt(iter)!='>')
            {
                temp+=xml.charAt(iter);
               // System.out.println(temp);
            }
            else if(xml.charAt(iter)=='>')
            {
                temp+=xml.charAt(iter);
                this.Array.add(temp);
                System.out.println(temp);
                temp="";
                flag=0;
            }

        }

        for (iter=0;iter<Array.size();iter++) {
            System.out.println(Array.get(iter));
        }




    }






}
