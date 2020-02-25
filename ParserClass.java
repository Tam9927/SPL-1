package SPL;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ParserClass {

    private String XML;
    private ArrayList<String> Array = new ArrayList<String>();
    private ArrayList<String>Array2= new ArrayList<String>();




    public ParserClass(String text) {
        this.XML = text;
    }

    public void seperateTag(String xml) {
        // System.out.println(xml);
        int iter = 0, flag = 0,count=0;
        int flag2 = 0;
        int length = xml.length();
        String temp = null;
        String temp2="";
        String temp3="";
        for (iter = 0; iter < length; iter++) {
            if (xml.charAt(iter) == '<') {
                //System.out.println(xml.charAt(iter));
                flag = 1;
                temp += xml.charAt(iter);
                Array.add(temp2);
                temp2="";
                //System.out.println(temp);
            }
            else if (flag == 1 && xml.charAt(iter) != '>') {
                temp += xml.charAt(iter);

                // System.out.println(temp);
            }
            else if (xml.charAt(iter) == '>') {
                temp += xml.charAt(iter);
                this.Array.add(temp);
                //System.out.println(temp);
                temp = "";
                flag = 0;
            }

            else{

                if(xml.charAt(iter) >='a'){
                    if(xml.charAt(iter)<='z')
                    {
                        temp2+=xml.charAt(iter);
                    }
                }



            }
            /*else if (xml.charAt(iter) != '<') {
                flag2 = 1;
                temp += ": ";
                temp += xml.charAt(iter);

            }
            else if (flag2 == 1 && xml.charAt(iter) != '<' && xml.charAt(iter + 1) != '/') {
                temp += xml.charAt(iter);

            }
            else if (xml.charAt(iter) == '/' && xml.charAt(iter + 1) == '>') {
                temp += ';';
                this.Array.add(temp);
                temp = "";

                flag2 = 0;

                iter=count+2;
            }
            count=0;*/}

        for (iter = 1; iter < Array.size(); iter++)
        {
                String temp4 = Array.get(iter);

                if(temp4.charAt(0)=='<')
                {
                    if(temp4.charAt(1)=='/')
                    {
                        Array2.add(" ;");
                    }

                    else
                    {
                        Array2.add(temp4);
                    }
                }

                else{

                    Array2.add(temp4);
                }

            //System.out.println(Array.get(0));
            System.out.println(Array2.get(iter-1));



        }


        }


        public void storeInfo()
        {
           int iter=0;
           String temp = "";

//           for(iter=0;iter< this.Array.size();iter++)
//           {
//               temp = "";
//
//
//
//               //for(iter=0;iter<Array2.size();iter++)
//               //{
//                 //  System.out.println(Array2.get(iter));
//               //}
//
//
//           }

        }
}

