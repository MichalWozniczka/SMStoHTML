import java.util.*;
import java.io.*;

public class CleanXML
{
  public static void main(String[] args) throws IOException
  {
    cleanEmojiList();
    
    
    BufferedReader scan = new BufferedReader(new InputStreamReader(new FileInputStream("sms.txt"), "UTF-8"));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.html"), "UTF-8"));
    String line = "";
    line = scan.readLine();line = scan.readLine();line = scan.readLine();line = scan.readLine();line = scan.readLine();
	String check = line.substring(3);
	int type = 1;
	int oldDate = -1;
	long timestampLast = 1;
	w.write(
	"<!DOCTYPE html>" +
	"<html>" +
	"  <head>" +
	"    <style>" +
	"      <!--" +
	"        A{text-decoration:none}" +
	"      -->" +
	"      body {" +
	"        background-color: white;" +
	"      }" +
	"      div.wrapper{" +
	"        background-color: white;" +
	"        width: 100%;" +
	"        position: relative;" +
	"        overflow: hidden;" +
	"        }" +
	"      div.sender1 {" +
	"        background-color: #00CF00;" +
	"        width: min-content;" +
	"        border-radius: 25px;" +
	"        max-width: 70%;" +
	"        padding-left: 12px;" +
	"        padding-right: 12px;" +
	"        padding-top: 0px;" +
	"        padding-bottom: 0px;" +
	"        margin-left: 7px;" +
	"        margin-right: 7px;" +
	"        margin-top: 2px;" +
	"        margin-bottom: 2px;" +
	"        position: relative;" +
	"        text-align: left;" +
	"        float: right;" +
	"        word-wrap: break-word;" +
	"      }" +
	"      div.sender2 {" +
	"        background-color: #E6E6E6;" +
	"        width: min-content;" +
	"        border-radius: 25px;" +
	"        max-width: 70%;" +
	"        padding-left: 12px;" +
	"        padding-right: 12px;" +
	"        padding-top: 0px;" +
	"        padding-bottom: 0px;" +
	"        margin-left: 7px;" +
	"        margin-right: 7px;" +
	"        margin-top: 2px;" +
	"        margin-bottom: 2px;" +
	"        position: relative;" +
	"        text-align: left;" +
	"        float: left;" +
	"        word-wrap: break-word;" +
	"      }" +
	"      div.time {" +
	"        background-color: white;" +
	"        width: 100%;" +
	"        margin: 5px;" +
	"        text-align: center;" +
	"      }" +
	"      div.links {" +
	"        background-color: #B2B2B2;" +
	"        border-radius: 70px;" +
	"        padding: 20px;" +
	"        margin: 20px;" +
	"        width = 100%;" +
	"        text-align: center;" +
	"        text-color: gray;" +
	"      }" +
	"      div.dates {" +
	"        background-color: #B2B2B2;" +
	"        padding: 0px;" +
	"        margin: 0px;" +
	"        width: 14%;" +
	"        text-align: center;" +
	"        float: left;" +
	"        position: relative;" +
	"      }" +
	"      a:link {" +
	"        color: white;" +
	"      }" +
	"      a:visited {" +
	"        color: white;" +
	"      }" +
	"      a:hover {" +
	"        color: #D1D1D1;" +
	"      }" +
	"      a:active {" +
	"        color: #D1D1D1;" +
	"      }" +
	"    </style>" +
	"    <meta charset=\"UTF-8\">" +
	"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">" +
	"	 <title>" +
	"	   SMS viewer" +
	"	 </title>" +
	"  </head>" +
	"  <body>" +
	//"    <div class=\"wrapper\"><font face=\"helvetica\" size=\"5\" color=\"#B2B2B2\"><strong>
	"    <div class=\"wrapper\"><div class=\"links\"><p><p><font face=\"helvetica\" size=\"7\"><A HREF=\"#january1\">January</A></p>");
		   for(int i = 0; i < 4; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#march" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 7; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#february1\">February</A></p>");
		   for(int i = 0; i < 0; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 28; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#february" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 7; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#march1\">March</A></p>");
		   for(int i = 0; i < 0; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#march" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 11; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#april1\">April</A></p>");
		   for(int i = 0; i < 3; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 30; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#april" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 9; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#may1\">May</A></p>");
		   for(int i = 0; i < 5; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#may" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 13; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#june1\">June</A></p>");
		   for(int i = 0; i < 1; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 30; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#june" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 11; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#july1\">July</A></p>");
		   for(int i = 0; i < 3; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#july" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 8; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#august1\">August</A></p>");
		   for(int i = 0; i < 6; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#august" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 12; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#september1\">September</A></p>");
		   for(int i = 0; i < 2; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 30; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#september" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 10; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#october1\">October</A></p>");
		   for(int i = 0; i < 4; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#october" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 7; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#november1\">November</A></p>");
		   for(int i = 0; i < 0; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 30; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#november" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 12; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("    <p><br><A HREF=\"#december1\">December</A></p>");
		   for(int i = 0; i < 2; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	       for(int i = 0; i < 31; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\"><A HREF=\"#december" + (i+1) + "\">" + (i+1) + "</A></font><br></div>");
		   }
		   for(int i = 0; i < 9; i++) {
			   w.write("<div class=\"dates\"><font face=\"helvetica\" size=\"4\" color=\"white\">" + " " + "</font><br></div>");
		   }
	w.write("</font><font color=\"B2B2B2\">_________________________________</font></p></div></div>");
    do
    {
      String[] s = line.split(" ");
	  check = s[2];
	  if(check.charAt(1) == 's')
	  {
        SMS sms = new SMS(replaceEmoji(line), type, oldDate);
		type = sms.getType();
	    w.write(sms.toString());
        w.write(System.getProperty("line.separator"));
		oldDate = sms.getOldDate();
	  }
    } while((check.charAt(1) == 's') && (line = scan.readLine()) != null);
	w.write(
	"    </font>" +
	"  </body>" +
	"</html>");
    w.close();
    
    
    
  }
  
  public static void cleanEmojiList() throws UnsupportedEncodingException, FileNotFoundException, IOException
  { 
    Scanner scan2 = new Scanner(new File("emojilist.txt"), "UTF-8"); 
    Writer w = new OutputStreamWriter(new FileOutputStream("cleanemojilist.txt"), "UTF-8");
    
    String a = "";
    String b = "";
    while(scan2.hasNext())
    {
      a = "";
      String s = scan2.nextLine();
      String[] s1 = s.split(" ");
      boolean print = false;
      for(int i = 0; i < s1.length-1; i++)
      {
        if(s1[i].length() >= 1 && s1[i].charAt(0) >= '1' && s1[i].charAt(0) <= '9')
        {
          if(s1[i+1].length() >= 1 && !(s1[i+1].charAt(0) >= 0 && s1[i+1].charAt(0) <= 127))
            print = true; 
            a += (s1[i] + " " + s1[i+1]);
        }
      }
      if(print) {
        w.write(a);
        w.write(System.getProperty("line.separator"));
      }
    }
    w.close();
  }
  
  public static String replaceEmoji(String in)
  {
      in = in.replaceAll("&#55356;&#57124;", "🌤");
      in = in.replaceAll("&#55356;&#57125;", "🌥");
      in = in.replaceAll("&#55356;&#57126;", "🌦");
      in = in.replaceAll("&#55356;&#57127;", "🌧");
      in = in.replaceAll("&#55356;&#57128;", "🌨");
      in = in.replaceAll("&#55356;&#57129;", "🌩");
      in = in.replaceAll("&#55356;&#57130;", "🌪");
      in = in.replaceAll("&#55356;&#57131;", "🌫");
      in = in.replaceAll("&#55356;&#57089;", "🌁");
      in = in.replaceAll("&#55356;&#57132;", "🌬");
      in = in.replaceAll("&#55356;&#57133;", "🌭");
      in = in.replaceAll("&#55356;&#57134;", "🌮");
      in = in.replaceAll("&#55356;&#57135;", "🌯");
      in = in.replaceAll("&#55356;&#57136;", "🌰");
      in = in.replaceAll("&#55356;&#57137;", "🌱");
      in = in.replaceAll("&#55356;&#57138;", "🌲");
      in = in.replaceAll("&#55356;&#57310;", "🏞");
      in = in.replaceAll("&#55356;&#57139;", "🌳");
      in = in.replaceAll("&#55356;&#57140;", "🌴");
      in = in.replaceAll("&#55356;&#57309;", "🏝");
      in = in.replaceAll("&#55356;&#57141;", "🌵");
      in = in.replaceAll("&#55356;&#57308;", "🏜");
      in = in.replaceAll("&#55356;&#57142;", "🌶");
      in = in.replaceAll("&#55356;&#57143;", "🌷");
      in = in.replaceAll("&#55356;&#57144;", "🌸");
      in = in.replaceAll("&#55356;&#57145;", "🌹");
      in = in.replaceAll("&#55356;&#57146;", "🌺");
      in = in.replaceAll("&#55356;&#57147;", "🌻");
      in = in.replaceAll("&#55356;&#57148;", "🌼");
      in = in.replaceAll("&#55356;&#57149;", "🌽");
      in = in.replaceAll("&#55356;&#57150;", "🌾");
      in = in.replaceAll("&#55356;&#57151;", "🌿");
      in = in.replaceAll("&#55356;&#57152;", "🍀");
      in = in.replaceAll("&#55356;&#57153;", "🍁");
      in = in.replaceAll("&#55356;&#57154;", "🍂");
      in = in.replaceAll("&#55356;&#57155;", "🍃");
      in = in.replaceAll("&#55356;&#57156;", "🍄");
      in = in.replaceAll("&#55356;&#57157;", "🍅");
      in = in.replaceAll("&#55356;&#57158;", "🍆");
      in = in.replaceAll("&#55356;&#57159;", "🍇");
      in = in.replaceAll("&#55356;&#57160;", "🍈");
      in = in.replaceAll("&#55356;&#57161;", "🍉");
      in = in.replaceAll("&#55356;&#57162;", "🍊");
      in = in.replaceAll("&#55356;&#57088;", "🌀");
      in = in.replaceAll("&#55356;&#57089;", "🌁");
      in = in.replaceAll("&#55356;&#57131;", "🌫");
      in = in.replaceAll("&#55356;&#57090;", "🌂");
      in = in.replaceAll("&#55356;&#57091;", "🌃");
      in = in.replaceAll("&#55356;&#57092;", "🌄");
      in = in.replaceAll("&#55356;&#57093;", "🌅");
      in = in.replaceAll("&#55356;&#57094;", "🌆");
      in = in.replaceAll("&#55356;&#57305;", "🏙");
      in = in.replaceAll("&#55356;&#57095;", "🌇");
      in = in.replaceAll("&#55356;&#57096;", "🌈");
      in = in.replaceAll("&#55356;&#57097;", "🌉");
      in = in.replaceAll("&#55356;&#57098;", "🌊");
      in = in.replaceAll("&#55356;&#57099;", "🌋");
      in = in.replaceAll("&#55356;&#57100;", "🌌");
      in = in.replaceAll("&#55356;&#57101;", "🌍");
      in = in.replaceAll("&#55356;&#57102;", "🌎");
      in = in.replaceAll("&#55356;&#57103;", "🌏");
      in = in.replaceAll("&#55356;&#57104;", "🌐");
      in = in.replaceAll("&#55356;&#57105;", "🌑");
      in = in.replaceAll("&#55356;&#57106;", "🌒");
      in = in.replaceAll("&#55356;&#57107;", "🌓");
      in = in.replaceAll("&#55356;&#57108;", "🌔");
      in = in.replaceAll("&#55356;&#57109;", "🌕");
      in = in.replaceAll("&#55356;&#57110;", "🌖");
      in = in.replaceAll("&#55356;&#57111;", "🌗");
      in = in.replaceAll("&#55356;&#57112;", "🌘");
      in = in.replaceAll("&#55356;&#57113;", "🌙");
      in = in.replaceAll("&#55356;&#57114;", "🌚");
      in = in.replaceAll("&#55356;&#57115;", "🌛");
      in = in.replaceAll("&#55356;&#57116;", "🌜");
      in = in.replaceAll("&#55356;&#57117;", "🌝");
      in = in.replaceAll("&#55356;&#57118;", "🌞");
      in = in.replaceAll("&#55356;&#57119;", "🌟");
      in = in.replaceAll("&#55356;&#57120;", "🌠");
      in = in.replaceAll("&#55356;&#57121;", "🌡");
      in = in.replaceAll("&#55356;&#57122;", "🌢");
      in = in.replaceAll("&#55357;&#56487;", "💧");
      in = in.replaceAll("&#55356;&#57123;", "🌣");
      in = in.replaceAll("&#55356;&#57208;", "🍸");
      in = in.replaceAll("&#55357;&#57035;", "🛋");
      in = in.replaceAll("&#55356;&#57209;", "🍹");
      in = in.replaceAll("&#55356;&#57210;", "🍺");
      in = in.replaceAll("&#55356;&#57211;", "🍻");
      in = in.replaceAll("&#55356;&#57212;", "🍼");
      in = in.replaceAll("&#55356;&#57213;", "🍽");
      in = in.replaceAll("&#55356;&#57204;", "🍴");
      in = in.replaceAll("&#55356;&#57214;", "🍾");
      in = in.replaceAll("&#55356;&#57215;", "🍿");
      in = in.replaceAll("&#55356;&#57216;", "🎀");
      in = in.replaceAll("&#55356;&#57217;", "🎁");
      in = in.replaceAll("&#55357;&#56550;", "📦");
      in = in.replaceAll("&#55356;&#57218;", "🎂");
      in = in.replaceAll("&#55356;&#57219;", "🎃");
      in = in.replaceAll("&#55356;&#57220;", "🎄");
      in = in.replaceAll("&#55356;&#57221;", "🎅");
      in = in.replaceAll("&#55356;&#57222;", "🎆");
      in = in.replaceAll("&#55356;&#57223;", "🎇");
      in = in.replaceAll("&#55356;&#57224;", "🎈");
      in = in.replaceAll("&#55356;&#57225;", "🎉");
      in = in.replaceAll("&#55356;&#57226;", "🎊");
      in = in.replaceAll("&#55356;&#57227;", "🎋");
      in = in.replaceAll("&#55356;&#57228;", "🎌");
      in = in.replaceAll("&#55356;&#57229;", "🎍");
      in = in.replaceAll("&#55356;&#57230;", "🎎");
      in = in.replaceAll("&#55356;&#57231;", "🎏");
      in = in.replaceAll("&#55356;&#57232;", "🎐");
      in = in.replaceAll("&#55356;&#57233;", "🎑");
      in = in.replaceAll("&#55356;&#57234;", "🎒");
      in = in.replaceAll("&#55356;&#57235;", "🎓");
      in = in.replaceAll("&#55356;&#57236;", "🎔");
      in = in.replaceAll("&#55356;&#57237;", "🎕");
      in = in.replaceAll("&#55357;&#56464;", "💐");
      in = in.replaceAll("&#55356;&#57238;", "🎖");
      in = in.replaceAll("&#55356;&#57239;", "🎗");
      in = in.replaceAll("&#55356;&#57163;", "🍋");
      in = in.replaceAll("&#55356;&#57164;", "🍌");
      in = in.replaceAll("&#55356;&#57165;", "🍍");
      in = in.replaceAll("&#55356;&#57166;", "🍎");
      in = in.replaceAll("&#55356;&#57167;", "🍏");
      in = in.replaceAll("&#55356;&#57168;", "🍐");
      in = in.replaceAll("&#55356;&#57169;", "🍑");
      in = in.replaceAll("&#55356;&#57170;", "🍒");
      in = in.replaceAll("&#55356;&#57171;", "🍓");
      in = in.replaceAll("&#55356;&#57172;", "🍔");
      in = in.replaceAll("&#55356;&#57173;", "🍕");
      in = in.replaceAll("&#55356;&#57174;", "🍖");
      in = in.replaceAll("&#55356;&#57175;", "🍗");
      in = in.replaceAll("&#55356;&#57176;", "🍘");
      in = in.replaceAll("&#55356;&#57177;", "🍙");
      in = in.replaceAll("&#55356;&#57178;", "🍚");
      in = in.replaceAll("&#55356;&#57179;", "🍛");
      in = in.replaceAll("&#55356;&#57180;", "🍜");
      in = in.replaceAll("&#55356;&#57181;", "🍝");
      in = in.replaceAll("&#55356;&#57182;", "🍞");
      in = in.replaceAll("&#55356;&#57183;", "🍟");
      in = in.replaceAll("&#55356;&#57184;", "🍠");
      in = in.replaceAll("&#55356;&#57185;", "🍡");
      in = in.replaceAll("&#55356;&#57186;", "🍢");
      in = in.replaceAll("&#55356;&#57187;", "🍣");
      in = in.replaceAll("&#55356;&#57188;", "🍤");
      in = in.replaceAll("&#55356;&#57189;", "🍥");
      in = in.replaceAll("&#55356;&#57190;", "🍦");
      in = in.replaceAll("&#55356;&#57191;", "🍧");
      in = in.replaceAll("&#55356;&#57192;", "🍨");
      in = in.replaceAll("&#55356;&#57193;", "🍩");
      in = in.replaceAll("&#55356;&#57194;", "🍪");
      in = in.replaceAll("&#55356;&#57195;", "🍫");
      in = in.replaceAll("&#55356;&#57196;", "🍬");
      in = in.replaceAll("&#55356;&#57197;", "🍭");
      in = in.replaceAll("&#55356;&#57198;", "🍮");
      in = in.replaceAll("&#55356;&#57199;", "🍯");
      in = in.replaceAll("&#55356;&#57200;", "🍰");
      in = in.replaceAll("&#55356;&#57201;", "🍱");
      in = in.replaceAll("&#55356;&#57202;", "🍲");
      in = in.replaceAll("&#55356;&#57203;", "🍳");
      in = in.replaceAll("&#55356;&#57204;", "🍴");
      in = in.replaceAll("&#55356;&#57213;", "🍽");
      in = in.replaceAll("&#55356;&#57205;", "🍵");
      in = in.replaceAll("&#55356;&#57206;", "🍶");
      in = in.replaceAll("&#55356;&#57207;", "🍷");
      in = in.replaceAll("&#55356;&#57264;", "🎰");
      in = in.replaceAll("&#55356;&#57265;", "🎱");
      in = in.replaceAll("&#55356;&#57266;", "🎲");
      in = in.replaceAll("&#55356;&#57267;", "🎳");
      in = in.replaceAll("&#55356;&#57268;", "🎴");
      in = in.replaceAll("&#55356;&#57269;", "🎵");
      in = in.replaceAll("&#55356;&#57270;", "🎶");
      in = in.replaceAll("&#55356;&#57271;", "🎷");
      in = in.replaceAll("&#55356;&#57272;", "🎸");
      in = in.replaceAll("&#55356;&#57273;", "🎹");
      in = in.replaceAll("&#55356;&#57240;", "🎘");
      in = in.replaceAll("&#55356;&#57274;", "🎺");
      in = in.replaceAll("&#55356;&#57275;", "🎻");
      in = in.replaceAll("&#55356;&#57276;", "🎼");
      in = in.replaceAll("&#55348;&#56606;", "𝄞");
      in = in.replaceAll("&#55356;&#57277;", "🎽");
      in = in.replaceAll("&#55356;&#57278;", "🎾");
      in = in.replaceAll("&#55356;&#57279;", "🎿");
      in = in.replaceAll("&#55356;&#57280;", "🏀");
      in = in.replaceAll("&#55356;&#57281;", "🏁");
      in = in.replaceAll("&#55356;&#57282;", "🏂");
      in = in.replaceAll("&#55356;&#57283;", "🏃");
      in = in.replaceAll("&#55356;&#57284;", "🏄");
      in = in.replaceAll("&#55356;&#57285;", "🏅");
      in = in.replaceAll("&#55356;&#57286;", "🏆");
      in = in.replaceAll("&#55356;&#57287;", "🏇");
      in = in.replaceAll("&#55356;&#57288;", "🏈");
      in = in.replaceAll("&#55356;&#57289;", "🏉");
      in = in.replaceAll("&#55356;&#57290;", "🏊");
      in = in.replaceAll("&#55356;&#57291;", "🏋");
      in = in.replaceAll("&#55356;&#57292;", "🏌");
      in = in.replaceAll("&#55356;&#57293;", "🏍");
      in = in.replaceAll("&#55356;&#57294;", "🏎");
      in = in.replaceAll("&#55356;&#57295;", "🏏");
      in = in.replaceAll("&#55356;&#57296;", "🏐");
      in = in.replaceAll("&#55356;&#57297;", "🏑");
      in = in.replaceAll("&#55356;&#57298;", "🏒");
      in = in.replaceAll("&#55356;&#57299;", "🏓");
      in = in.replaceAll("&#55356;&#57300;", "🏔");
      in = in.replaceAll("&#55356;&#57240;", "🎘");
      in = in.replaceAll("&#55356;&#57273;", "🎹");
      in = in.replaceAll("&#55356;&#57241;", "🎙");
      in = in.replaceAll("&#55356;&#57252;", "🎤");
      in = in.replaceAll("&#55356;&#57242;", "🎚");
      in = in.replaceAll("&#55356;&#57243;", "🎛");
      in = in.replaceAll("&#55356;&#57244;", "🎜");
      in = in.replaceAll("&#55356;&#57245;", "🎝");
      in = in.replaceAll("&#55356;&#57246;", "🎞");
      in = in.replaceAll("&#55356;&#57253;", "🎥");
      in = in.replaceAll("&#55356;&#57247;", "🎟");
      in = in.replaceAll("&#55356;&#57259;", "🎫");
      in = in.replaceAll("&#55356;&#57248;", "🎠");
      in = in.replaceAll("&#55356;&#57249;", "🎡");
      in = in.replaceAll("&#55356;&#57250;", "🎢");
      in = in.replaceAll("&#55356;&#57251;", "🎣");
      in = in.replaceAll("&#55356;&#57252;", "🎤");
      in = in.replaceAll("&#55356;&#57241;", "🎙");
      in = in.replaceAll("&#55356;&#57253;", "🎥");
      in = in.replaceAll("&#55356;&#57246;", "🎞");
      in = in.replaceAll("&#55356;&#57254;", "🎦");
      in = in.replaceAll("&#55357;&#56573;", "📽");
      in = in.replaceAll("&#55356;&#57255;", "🎧");
      in = in.replaceAll("&#55356;&#57256;", "🎨");
      in = in.replaceAll("&#55356;&#57257;", "🎩");
      in = in.replaceAll("&#55356;&#57258;", "🎪");
      in = in.replaceAll("&#55356;&#57259;", "🎫");
      in = in.replaceAll("&#55356;&#57247;", "🎟");
      in = in.replaceAll("&#55356;&#57260;", "🎬");
      in = in.replaceAll("&#55356;&#57261;", "🎭");
      in = in.replaceAll("&#55356;&#57262;", "🎮");
      in = in.replaceAll("&#55356;&#57263;", "🎯");
      in = in.replaceAll("&#55356;&#57329;", "🏱");
      in = in.replaceAll("&#55357;&#57001;", "🚩");
      in = in.replaceAll("&#55356;&#57330;", "🏲");
      in = in.replaceAll("&#55356;&#57331;", "🏳");
      in = in.replaceAll("&#55356;&#57332;", "🏴");
      in = in.replaceAll("&#55356;&#57333;", "🏵");
      in = in.replaceAll("&#55356;&#57334;", "🏶");
      in = in.replaceAll("&#55356;&#57335;", "🏷");
      in = in.replaceAll("&#55357;&#56598;", "🔖");
      in = in.replaceAll("&#55356;&#57336;", "🏸");
      in = in.replaceAll("&#55356;&#57337;", "🏹");
      in = in.replaceAll("&#55356;&#57338;", "🏺");
      in = in.replaceAll("&#55357;&#56320;", "🐀");
      in = in.replaceAll("&#55357;&#56321;", "🐁");
      in = in.replaceAll("&#55357;&#56322;", "🐂");
      in = in.replaceAll("&#55357;&#56323;", "🐃");
      in = in.replaceAll("&#55357;&#56324;", "🐄");
      in = in.replaceAll("&#55357;&#56325;", "🐅");
      in = in.replaceAll("&#55357;&#56326;", "🐆");
      in = in.replaceAll("&#55357;&#56327;", "🐇");
      in = in.replaceAll("&#55357;&#56328;", "🐈");
      in = in.replaceAll("&#55357;&#56329;", "🐉");
      in = in.replaceAll("&#55356;&#57301;", "🏕");
      in = in.replaceAll("&#55356;&#57302;", "🏖");
      in = in.replaceAll("&#55356;&#57303;", "🏗");
      in = in.replaceAll("&#55357;&#56999;", "🚧");
      in = in.replaceAll("&#55356;&#57304;", "🏘");
      in = in.replaceAll("&#55356;&#57313;", "🏡");
      in = in.replaceAll("&#55356;&#57305;", "🏙");
      in = in.replaceAll("&#55356;&#57094;", "🌆");
      in = in.replaceAll("&#55356;&#57306;", "🏚");
      in = in.replaceAll("&#55356;&#57307;", "🏛");
      in = in.replaceAll("&#55356;&#57308;", "🏜");
      in = in.replaceAll("&#55356;&#57141;", "🌵");
      in = in.replaceAll("&#55356;&#57309;", "🏝");
      in = in.replaceAll("&#55356;&#57140;", "🌴");
      in = in.replaceAll("&#55356;&#57310;", "🏞");
      in = in.replaceAll("&#55356;&#57138;", "🌲");
      in = in.replaceAll("&#55356;&#57311;", "🏟");
      in = in.replaceAll("&#55356;&#57312;", "🏠");
      in = in.replaceAll("&#55356;&#57313;", "🏡");
      in = in.replaceAll("&#55356;&#57304;", "🏘");
      in = in.replaceAll("&#55356;&#57314;", "🏢");
      in = in.replaceAll("&#55356;&#57315;", "🏣");
      in = in.replaceAll("&#55356;&#57316;", "🏤");
      in = in.replaceAll("&#55356;&#57317;", "🏥");
      in = in.replaceAll("&#55356;&#57318;", "🏦");
      in = in.replaceAll("&#55356;&#56625;", "🄱");
      in = in.replaceAll("&#55356;&#57319;", "🏧");
      in = in.replaceAll("&#55356;&#57320;", "🏨");
      in = in.replaceAll("&#55356;&#56663;", "🅗");
      in = in.replaceAll("&#55357;&#57036;", "🛌");
      in = in.replaceAll("&#55356;&#57321;", "🏩");
      in = in.replaceAll("&#55356;&#57322;", "🏪");
      in = in.replaceAll("&#55356;&#57323;", "🏫");
      in = in.replaceAll("&#55356;&#57324;", "🏬");
      in = in.replaceAll("&#55356;&#57325;", "🏭");
      in = in.replaceAll("&#55356;&#57326;", "🏮");
      in = in.replaceAll("&#55356;&#57327;", "🏯");
      in = in.replaceAll("&#55356;&#57328;", "🏰");
      in = in.replaceAll("&#55357;&#56363;", "🐫");
      in = in.replaceAll("&#55357;&#56364;", "🐬");
      in = in.replaceAll("&#55357;&#56365;", "🐭");
      in = in.replaceAll("&#55357;&#56366;", "🐮");
      in = in.replaceAll("&#55357;&#56367;", "🐯");
      in = in.replaceAll("&#55357;&#56368;", "🐰");
      in = in.replaceAll("&#55357;&#56369;", "🐱");
      in = in.replaceAll("&#55357;&#56890;", "😺");
      in = in.replaceAll("&#55357;&#56370;", "🐲");
      in = in.replaceAll("&#55357;&#56371;", "🐳");
      in = in.replaceAll("&#55357;&#56372;", "🐴");
      in = in.replaceAll("&#55357;&#56373;", "🐵");
      in = in.replaceAll("&#55357;&#56374;", "🐶");
      in = in.replaceAll("&#55357;&#56375;", "🐷");
      in = in.replaceAll("&#55357;&#56376;", "🐸");
      in = in.replaceAll("&#55357;&#56377;", "🐹");
      in = in.replaceAll("&#55357;&#56378;", "🐺");
      in = in.replaceAll("&#55357;&#56379;", "🐻");
      in = in.replaceAll("&#55357;&#56380;", "🐼");
      in = in.replaceAll("&#55357;&#56381;", "🐽");
      in = in.replaceAll("&#55357;&#56382;", "🐾");
      in = in.replaceAll("&#55357;&#56419;", "👣");
      in = in.replaceAll("&#55357;&#56383;", "🐿");
      in = in.replaceAll("&#55357;&#56384;", "👀");
      in = in.replaceAll("&#55357;&#56385;", "👁");
      in = in.replaceAll("&#55357;&#56386;", "👂");
      in = in.replaceAll("&#55357;&#56387;", "👃");
      in = in.replaceAll("&#55357;&#56388;", "👄");
      in = in.replaceAll("&#55357;&#56389;", "👅");
      in = in.replaceAll("&#55357;&#56390;", "👆");
      in = in.replaceAll("&#55357;&#56738;", "🖢");
      in = in.replaceAll("&#55357;&#56391;", "👇");
      in = in.replaceAll("&#55357;&#56727;", "🖗");
      in = in.replaceAll("&#55357;&#56739;", "🖣");
      in = in.replaceAll("&#55357;&#56392;", "👈");
      in = in.replaceAll("&#55357;&#56732;", "🖜");
      in = in.replaceAll("&#55357;&#56393;", "👉");
      in = in.replaceAll("&#55357;&#56733;", "🖝");
      in = in.replaceAll("&#55357;&#56394;", "👊");
      in = in.replaceAll("&#55357;&#56395;", "👋");
      in = in.replaceAll("&#55357;&#56396;", "👌");
      in = in.replaceAll("&#55357;&#56719;", "🖏");
      in = in.replaceAll("&#55357;&#56397;", "👍");
      in = in.replaceAll("&#55357;&#56722;", "🖒");
      in = in.replaceAll("&#55357;&#56330;", "🐊");
      in = in.replaceAll("&#55357;&#56331;", "🐋");
      in = in.replaceAll("&#55357;&#56332;", "🐌");
      in = in.replaceAll("&#55357;&#56333;", "🐍");
      in = in.replaceAll("&#55357;&#56334;", "🐎");
      in = in.replaceAll("&#55357;&#56335;", "🐏");
      in = in.replaceAll("&#55357;&#56336;", "🐐");
      in = in.replaceAll("&#55357;&#56337;", "🐑");
      in = in.replaceAll("&#55357;&#56338;", "🐒");
      in = in.replaceAll("&#55357;&#56339;", "🐓");
      in = in.replaceAll("&#55357;&#56340;", "🐔");
      in = in.replaceAll("&#55357;&#56341;", "🐕");
      in = in.replaceAll("&#55357;&#56342;", "🐖");
      in = in.replaceAll("&#55357;&#56343;", "🐗");
      in = in.replaceAll("&#55357;&#56344;", "🐘");
      in = in.replaceAll("&#55357;&#56345;", "🐙");
      in = in.replaceAll("&#55357;&#56346;", "🐚");
      in = in.replaceAll("&#55357;&#56347;", "🐛");
      in = in.replaceAll("&#55357;&#56348;", "🐜");
      in = in.replaceAll("&#55357;&#56349;", "🐝");
      in = in.replaceAll("&#55357;&#56350;", "🐞");
      in = in.replaceAll("&#55357;&#56351;", "🐟");
      in = in.replaceAll("&#55357;&#56352;", "🐠");
      in = in.replaceAll("&#55357;&#56353;", "🐡");
      in = in.replaceAll("&#55357;&#56354;", "🐢");
      in = in.replaceAll("&#55357;&#56355;", "🐣");
      in = in.replaceAll("&#55357;&#56356;", "🐤");
      in = in.replaceAll("&#55357;&#56357;", "🐥");
      in = in.replaceAll("&#55357;&#56358;", "🐦");
      in = in.replaceAll("&#55357;&#56359;", "🐧");
      in = in.replaceAll("&#55357;&#56360;", "🐨");
      in = in.replaceAll("&#55357;&#56361;", "🐩");
      in = in.replaceAll("&#55357;&#56362;", "🐪");
      in = in.replaceAll("&#55357;&#56443;", "👻");
      in = in.replaceAll("&#55357;&#56444;", "👼");
      in = in.replaceAll("&#55357;&#56445;", "👽");
      in = in.replaceAll("&#55357;&#56446;", "👾");
      in = in.replaceAll("&#55358;&#56598;", "🤖");
      in = in.replaceAll("&#55357;&#56447;", "👿");
      in = in.replaceAll("&#55357;&#56840;", "😈");
      in = in.replaceAll("&#55357;&#56448;", "💀");
      in = in.replaceAll("&#55357;&#56449;", "💁");
      in = in.replaceAll("&#55357;&#56450;", "💂");
      in = in.replaceAll("&#55357;&#56451;", "💃");
      in = in.replaceAll("&#55357;&#56452;", "💄");
      in = in.replaceAll("&#55357;&#56453;", "💅");
      in = in.replaceAll("&#55357;&#56454;", "💆");
      in = in.replaceAll("&#55357;&#56455;", "💇");
      in = in.replaceAll("&#55357;&#56456;", "💈");
      in = in.replaceAll("&#55357;&#56457;", "💉");
      in = in.replaceAll("&#55357;&#56458;", "💊");
      in = in.replaceAll("&#55357;&#56459;", "💋");
      in = in.replaceAll("&#55357;&#56802;", "🗢");
      in = in.replaceAll("&#55357;&#56460;", "💌");
      in = in.replaceAll("&#55357;&#56461;", "💍");
      in = in.replaceAll("&#55357;&#56462;", "💎");
      in = in.replaceAll("&#55357;&#56463;", "💏");
      in = in.replaceAll("&#55357;&#56464;", "💐");
      in = in.replaceAll("&#55356;&#57237;", "🎕");
      in = in.replaceAll("&#55357;&#56465;", "💑");
      in = in.replaceAll("&#55357;&#56466;", "💒");
      in = in.replaceAll("&#55357;&#56467;", "💓");
      in = in.replaceAll("&#55357;&#56468;", "💔");
      in = in.replaceAll("&#55357;&#56469;", "💕");
      in = in.replaceAll("&#55357;&#56470;", "💖");
      in = in.replaceAll("&#55357;&#56471;", "💗");
      in = in.replaceAll("&#55357;&#56472;", "💘");
      in = in.replaceAll("&#55357;&#56473;", "💙");
      in = in.replaceAll("&#55357;&#56474;", "💚");
      in = in.replaceAll("&#55357;&#56475;", "💛");
      in = in.replaceAll("&#55357;&#56476;", "💜");
      in = in.replaceAll("&#55357;&#56477;", "💝");
      in = in.replaceAll("&#55357;&#56478;", "💞");
      in = in.replaceAll("&#55357;&#56479;", "💟");
      in = in.replaceAll("&#55357;&#56398;", "👎");
      in = in.replaceAll("&#55357;&#56723;", "🖓");
      in = in.replaceAll("&#55357;&#56399;", "👏");
      in = in.replaceAll("&#55357;&#56400;", "👐");
      in = in.replaceAll("&#55357;&#56401;", "👑");
      in = in.replaceAll("&#55357;&#56402;", "👒");
      in = in.replaceAll("&#55357;&#56403;", "👓");
      in = in.replaceAll("&#55357;&#56404;", "👔");
      in = in.replaceAll("&#55357;&#56405;", "👕");
      in = in.replaceAll("&#55357;&#56406;", "👖");
      in = in.replaceAll("&#55357;&#56407;", "👗");
      in = in.replaceAll("&#55357;&#56408;", "👘");
      in = in.replaceAll("&#55357;&#56409;", "👙");
      in = in.replaceAll("&#55357;&#56410;", "👚");
      in = in.replaceAll("&#55357;&#56411;", "👛");
      in = in.replaceAll("&#55357;&#56412;", "👜");
      in = in.replaceAll("&#55357;&#56413;", "👝");
      in = in.replaceAll("&#55357;&#56414;", "👞");
      in = in.replaceAll("&#55357;&#56415;", "👟");
      in = in.replaceAll("&#55357;&#56416;", "👠");
      in = in.replaceAll("&#55357;&#56417;", "👡");
      in = in.replaceAll("&#55357;&#56418;", "👢");
      in = in.replaceAll("&#55357;&#56419;", "👣");
      in = in.replaceAll("&#55357;&#56382;", "🐾");
      in = in.replaceAll("&#55357;&#56420;", "👤");
      in = in.replaceAll("&#55357;&#56421;", "👥");
      in = in.replaceAll("&#55357;&#56422;", "👦");
      in = in.replaceAll("&#55357;&#56423;", "👧");
      in = in.replaceAll("&#55357;&#56424;", "👨");
      in = in.replaceAll("&#55357;&#56425;", "👩");
      in = in.replaceAll("&#55357;&#56426;", "👪");
      in = in.replaceAll("&#55357;&#56427;", "👫");
      in = in.replaceAll("&#55357;&#57019;", "🚻");
      in = in.replaceAll("&#55357;&#56428;", "👬");
      in = in.replaceAll("&#55357;&#56429;", "👭");
      in = in.replaceAll("&#55357;&#56430;", "👮");
      in = in.replaceAll("&#55357;&#56431;", "👯");
      in = in.replaceAll("&#55357;&#56432;", "👰");
      in = in.replaceAll("&#55357;&#56433;", "👱");
      in = in.replaceAll("&#55357;&#56434;", "👲");
      in = in.replaceAll("&#55357;&#56435;", "👳");
      in = in.replaceAll("&#55357;&#56436;", "👴");
      in = in.replaceAll("&#55357;&#56437;", "👵");
      in = in.replaceAll("&#55357;&#56438;", "👶");
      in = in.replaceAll("&#55357;&#56439;", "👷");
      in = in.replaceAll("&#55357;&#56440;", "👸");
      in = in.replaceAll("&#55357;&#56441;", "👹");
      in = in.replaceAll("&#55357;&#56442;", "👺");
      in = in.replaceAll("&#55357;&#56510;", "💾");
      in = in.replaceAll("&#55357;&#56746;", "🖪");
      in = in.replaceAll("&#55357;&#56511;", "💿");
      in = in.replaceAll("&#55357;&#56760;", "🖸");
      in = in.replaceAll("&#55357;&#56512;", "📀");
      in = in.replaceAll("&#55357;&#56513;", "📁");
      in = in.replaceAll("&#55357;&#56768;", "🗀");
      in = in.replaceAll("&#55357;&#56514;", "📂");
      in = in.replaceAll("&#55357;&#56769;", "🗁");
      in = in.replaceAll("&#55357;&#56515;", "📃");
      in = in.replaceAll("&#55357;&#56783;", "🗏");
      in = in.replaceAll("&#55357;&#56516;", "📄");
      in = in.replaceAll("&#55357;&#56782;", "🗎");
      in = in.replaceAll("&#55357;&#56517;", "📅");
      in = in.replaceAll("&#55357;&#56786;", "🗒");
      in = in.replaceAll("&#55357;&#56518;", "📆");
      in = in.replaceAll("&#55357;&#56787;", "🗓");
      in = in.replaceAll("&#55357;&#56519;", "📇");
      in = in.replaceAll("&#55357;&#56770;", "🗂");
      in = in.replaceAll("&#55357;&#56520;", "📈");
      in = in.replaceAll("&#55357;&#56800;", "🗠");
      in = in.replaceAll("&#55357;&#56521;", "📉");
      in = in.replaceAll("&#55357;&#56522;", "📊");
      in = in.replaceAll("&#55357;&#56523;", "📋");
      in = in.replaceAll("&#55357;&#56524;", "📌");
      in = in.replaceAll("&#55357;&#56712;", "🖈");
      in = in.replaceAll("&#55357;&#56525;", "📍");
      in = in.replaceAll("&#55357;&#56526;", "📎");
      in = in.replaceAll("&#55357;&#56711;", "🖇");
      in = in.replaceAll("&#55357;&#56527;", "📏");
      in = in.replaceAll("&#55357;&#56528;", "📐");
      in = in.replaceAll("&#55357;&#56529;", "📑");
      in = in.replaceAll("&#55357;&#56530;", "📒");
      in = in.replaceAll("&#55357;&#56531;", "📓");
      in = in.replaceAll("&#55357;&#56532;", "📔");
      in = in.replaceAll("&#55357;&#56533;", "📕");
      in = in.replaceAll("&#55357;&#56534;", "📖");
      in = in.replaceAll("&#55357;&#56686;", "🕮");
      in = in.replaceAll("&#55357;&#56535;", "📗");
      in = in.replaceAll("&#55357;&#56536;", "📘");
      in = in.replaceAll("&#55357;&#56537;", "📙");
      in = in.replaceAll("&#55357;&#56538;", "📚");
      in = in.replaceAll("&#55357;&#56539;", "📛");
      in = in.replaceAll("&#55357;&#56540;", "📜");
      in = in.replaceAll("&#55357;&#56541;", "📝");
      in = in.replaceAll("&#55357;&#56542;", "📞");
      in = in.replaceAll("&#55357;&#56699;", "🕻");
      in = in.replaceAll("&#55357;&#56701;", "🕽");
      in = in.replaceAll("&#55357;&#56543;", "📟");
      in = in.replaceAll("&#55357;&#56480;", "💠");
      in = in.replaceAll("&#55357;&#56481;", "💡");
      in = in.replaceAll("&#55357;&#56482;", "💢");
      in = in.replaceAll("&#55357;&#56483;", "💣");
      in = in.replaceAll("&#55357;&#56484;", "💤");
      in = in.replaceAll("&#55357;&#56485;", "💥");
      in = in.replaceAll("&#55357;&#56816;", "🗰");
      in = in.replaceAll("&#55357;&#56486;", "💦");
      in = in.replaceAll("&#55357;&#56487;", "💧");
      in = in.replaceAll("&#55356;&#57122;", "🌢");
      in = in.replaceAll("&#55357;&#56488;", "💨");
      in = in.replaceAll("&#55357;&#56489;", "💩");
      in = in.replaceAll("&#55357;&#56490;", "💪");
      in = in.replaceAll("&#55357;&#56491;", "💫");
      in = in.replaceAll("&#55357;&#56492;", "💬");
      in = in.replaceAll("&#55357;&#56493;", "💭");
      in = in.replaceAll("&#55357;&#56813;", "🗭");
      in = in.replaceAll("&#55357;&#56494;", "💮");
      in = in.replaceAll("&#55357;&#56495;", "💯");
      in = in.replaceAll("&#55357;&#56496;", "💰");
      in = in.replaceAll("&#55357;&#56497;", "💱");
      in = in.replaceAll("&#55357;&#56498;", "💲");
      in = in.replaceAll("&#55357;&#56499;", "💳");
      in = in.replaceAll("&#55357;&#56500;", "💴");
      in = in.replaceAll("&#55357;&#56501;", "💵");
      in = in.replaceAll("&#55357;&#56502;", "💶");
      in = in.replaceAll("&#55357;&#56503;", "💷");
      in = in.replaceAll("&#55357;&#56504;", "💸");
      in = in.replaceAll("&#55357;&#56505;", "💹");
      in = in.replaceAll("&#55357;&#56506;", "💺");
      in = in.replaceAll("&#55357;&#56507;", "💻");
      in = in.replaceAll("&#55357;&#56755;", "🖳");
      in = in.replaceAll("&#55357;&#56508;", "💼");
      in = in.replaceAll("&#55357;&#56509;", "💽");
      in = in.replaceAll("&#55357;&#56577;", "🔁");
      in = in.replaceAll("&#55357;&#56578;", "🔂");
      in = in.replaceAll("&#55357;&#56579;", "🔃");
      in = in.replaceAll("&#55357;&#56792;", "🗘");
      in = in.replaceAll("&#55357;&#56580;", "🔄");
      in = in.replaceAll("&#55357;&#56581;", "🔅");
      in = in.replaceAll("&#55357;&#56582;", "🔆");
      in = in.replaceAll("&#55357;&#56583;", "🔇");
      in = in.replaceAll("&#55357;&#56584;", "🔈");
      in = in.replaceAll("&#55357;&#56680;", "🕨");
      in = in.replaceAll("&#55357;&#56683;", "🕫");
      in = in.replaceAll("&#55357;&#56585;", "🔉");
      in = in.replaceAll("&#55357;&#56586;", "🔊");
      in = in.replaceAll("&#55357;&#56587;", "🔋");
      in = in.replaceAll("&#55357;&#56588;", "🔌");
      in = in.replaceAll("&#55357;&#56589;", "🔍");
      in = in.replaceAll("&#55357;&#56684;", "🕬");
      in = in.replaceAll("&#55357;&#56590;", "🔎");
      in = in.replaceAll("&#55357;&#56591;", "🔏");
      in = in.replaceAll("&#55357;&#56592;", "🔐");
      in = in.replaceAll("&#55357;&#56593;", "🔑");
      in = in.replaceAll("&#55357;&#56797;", "🗝");
      in = in.replaceAll("&#55357;&#56594;", "🔒");
      in = in.replaceAll("&#55357;&#56595;", "🔓");
      in = in.replaceAll("&#55357;&#56596;", "🔔");
      in = in.replaceAll("&#55357;&#56685;", "🕭");
      in = in.replaceAll("&#55357;&#56597;", "🔕");
      in = in.replaceAll("&#55357;&#56598;", "🔖");
      in = in.replaceAll("&#55356;&#57335;", "🏷");
      in = in.replaceAll("&#55357;&#56599;", "🔗");
      in = in.replaceAll("&#55357;&#56600;", "🔘");
      in = in.replaceAll("&#55357;&#56601;", "🔙");
      in = in.replaceAll("&#55357;&#56602;", "🔚");
      in = in.replaceAll("&#55357;&#56544;", "📠");
      in = in.replaceAll("&#55357;&#56700;", "🕼");
      in = in.replaceAll("&#55357;&#56744;", "🖨");
      in = in.replaceAll("&#55357;&#56759;", "🖷");
      in = in.replaceAll("&#55357;&#56545;", "📡");
      in = in.replaceAll("&#55357;&#56546;", "📢");
      in = in.replaceAll("&#55357;&#56547;", "📣");
      in = in.replaceAll("&#55357;&#56684;", "🕬");
      in = in.replaceAll("&#55357;&#56548;", "📤");
      in = in.replaceAll("&#55357;&#56549;", "📥");
      in = in.replaceAll("&#55357;&#56550;", "📦");
      in = in.replaceAll("&#55356;&#57217;", "🎁");
      in = in.replaceAll("&#55357;&#56551;", "📧");
      in = in.replaceAll("&#55357;&#56708;", "🖄");
      in = in.replaceAll("&#55357;&#56552;", "📨");
      in = in.replaceAll("&#55357;&#56553;", "📩");
      in = in.replaceAll("&#55357;&#56709;", "🖅");
      in = in.replaceAll("&#55357;&#56554;", "📪");
      in = in.replaceAll("&#55357;&#56555;", "📫");
      in = in.replaceAll("&#55357;&#56556;", "📬");
      in = in.replaceAll("&#55357;&#56557;", "📭");
      in = in.replaceAll("&#55357;&#56558;", "📮");
      in = in.replaceAll("&#55357;&#56559;", "📯");
      in = in.replaceAll("&#55357;&#56560;", "📰");
      in = in.replaceAll("&#55357;&#56798;", "🗞");
      in = in.replaceAll("&#55357;&#56561;", "📱");
      in = in.replaceAll("&#55357;&#56705;", "🖁");
      in = in.replaceAll("&#55357;&#56562;", "📲");
      in = in.replaceAll("&#55357;&#56563;", "📳");
      in = in.replaceAll("&#55357;&#56564;", "📴");
      in = in.replaceAll("&#55357;&#56565;", "📵");
      in = in.replaceAll("&#55357;&#56566;", "📶");
      in = in.replaceAll("&#55357;&#56567;", "📷");
      in = in.replaceAll("&#55357;&#56568;", "📸");
      in = in.replaceAll("&#55357;&#56569;", "📹");
      in = in.replaceAll("&#55357;&#56570;", "📺");
      in = in.replaceAll("&#55357;&#56571;", "📻");
      in = in.replaceAll("&#55357;&#56572;", "📼");
      in = in.replaceAll("&#55357;&#56573;", "📽");
      in = in.replaceAll("&#55356;&#57254;", "🎦");
      in = in.replaceAll("&#55357;&#56574;", "📾");
      in = in.replaceAll("&#55357;&#56575;", "📿");
      in = in.replaceAll("&#55357;&#56576;", "🔀");
      in = in.replaceAll("&#55357;&#56638;", "🔾");
      in = in.replaceAll("&#55357;&#56639;", "🔿");
      in = in.replaceAll("&#55357;&#56640;", "🕀");
      in = in.replaceAll("&#55357;&#56641;", "🕁");
      in = in.replaceAll("&#55357;&#56642;", "🕂");
      in = in.replaceAll("&#55357;&#56643;", "🕃");
      in = in.replaceAll("&#55357;&#56644;", "🕄");
      in = in.replaceAll("&#55357;&#56645;", "🕅");
      in = in.replaceAll("&#55357;&#56646;", "🕆");
      in = in.replaceAll("&#55357;&#56647;", "🕇");
      in = in.replaceAll("&#55357;&#56648;", "🕈");
      in = in.replaceAll("&#55357;&#56649;", "🕉");
      in = in.replaceAll("&#55357;&#56650;", "🕊");
      in = in.replaceAll("&#55357;&#56651;", "🕋");
      in = in.replaceAll("&#55357;&#56652;", "🕌");
      in = in.replaceAll("&#55357;&#56653;", "🕍");
      in = in.replaceAll("&#55357;&#56654;", "🕎");
      in = in.replaceAll("&#55357;&#56655;", "🕏");
      in = in.replaceAll("&#55357;&#56656;", "🕐");
      in = in.replaceAll("&#55357;&#56657;", "🕑");
      in = in.replaceAll("&#55357;&#56658;", "🕒");
      in = in.replaceAll("&#55357;&#56659;", "🕓");
      in = in.replaceAll("&#55357;&#56660;", "🕔");
      in = in.replaceAll("&#55357;&#56661;", "🕕");
      in = in.replaceAll("&#55357;&#56662;", "🕖");
      in = in.replaceAll("&#55357;&#56663;", "🕗");
      in = in.replaceAll("&#55357;&#56664;", "🕘");
      in = in.replaceAll("&#55357;&#56665;", "🕙");
      in = in.replaceAll("&#55357;&#56666;", "🕚");
      in = in.replaceAll("&#55357;&#56667;", "🕛");
      in = in.replaceAll("&#55357;&#56668;", "🕜");
      in = in.replaceAll("&#55357;&#56669;", "🕝");
      in = in.replaceAll("&#55357;&#56670;", "🕞");
      in = in.replaceAll("&#55357;&#56671;", "🕟");
      in = in.replaceAll("&#55357;&#56672;", "🕠");
      in = in.replaceAll("&#55357;&#56673;", "🕡");
      in = in.replaceAll("&#55357;&#56674;", "🕢");
      in = in.replaceAll("&#55357;&#56603;", "🔛");
      in = in.replaceAll("&#55357;&#56604;", "🔜");
      in = in.replaceAll("&#55357;&#56605;", "🔝");
      in = in.replaceAll("&#55357;&#56606;", "🔞");
      in = in.replaceAll("&#55357;&#56607;", "🔟");
      in = in.replaceAll("&#55357;&#56608;", "🔠");
      in = in.replaceAll("&#55357;&#56609;", "🔡");
      in = in.replaceAll("&#55357;&#56610;", "🔢");
      in = in.replaceAll("&#55357;&#56611;", "🔣");
      in = in.replaceAll("&#55357;&#56612;", "🔤");
      in = in.replaceAll("&#55357;&#56613;", "🔥");
      in = in.replaceAll("&#55357;&#56614;", "🔦");
      in = in.replaceAll("&#55357;&#56615;", "🔧");
      in = in.replaceAll("&#55357;&#56616;", "🔨");
      in = in.replaceAll("&#55357;&#56617;", "🔩");
      in = in.replaceAll("&#55357;&#56618;", "🔪");
      in = in.replaceAll("&#55357;&#56801;", "🗡");
      in = in.replaceAll("&#55357;&#56619;", "🔫");
      in = in.replaceAll("&#55357;&#56620;", "🔬");
      in = in.replaceAll("&#55357;&#56621;", "🔭");
      in = in.replaceAll("&#55357;&#56622;", "🔮");
      in = in.replaceAll("&#55357;&#56623;", "🔯");
      in = in.replaceAll("&#55357;&#56624;", "🔰");
      in = in.replaceAll("&#55357;&#56625;", "🔱");
      in = in.replaceAll("&#55357;&#56626;", "🔲");
      in = in.replaceAll("&#55357;&#56627;", "🔳");
      in = in.replaceAll("&#55357;&#56628;", "🔴");
      in = in.replaceAll("&#55357;&#56629;", "🔵");
      in = in.replaceAll("&#55357;&#56630;", "🔶");
      in = in.replaceAll("&#55357;&#56631;", "🔷");
      in = in.replaceAll("&#55357;&#56632;", "🔸");
      in = in.replaceAll("&#55357;&#56633;", "🔹");
      in = in.replaceAll("&#55357;&#56634;", "🔺");
      in = in.replaceAll("&#55357;&#56635;", "🔻");
      in = in.replaceAll("&#55357;&#56636;", "🔼");
      in = in.replaceAll("&#55357;&#56637;", "🔽");
      in = in.replaceAll("&#55357;&#56706;", "🖂");
      in = in.replaceAll("&#55357;&#56707;", "🖃");
      in = in.replaceAll("&#55357;&#56708;", "🖄");
      in = in.replaceAll("&#55357;&#56551;", "📧");
      in = in.replaceAll("&#55357;&#56709;", "🖅");
      in = in.replaceAll("&#55357;&#56553;", "📩");
      in = in.replaceAll("&#55357;&#56710;", "🖆");
      in = in.replaceAll("&#55357;&#56711;", "🖇");
      in = in.replaceAll("&#55357;&#56526;", "📎");
      in = in.replaceAll("&#55357;&#56712;", "🖈");
      in = in.replaceAll("&#55357;&#56524;", "📌");
      in = in.replaceAll("&#55357;&#56713;", "🖉");
      in = in.replaceAll("&#55357;&#56714;", "🖊");
      in = in.replaceAll("&#55357;&#56715;", "🖋");
      in = in.replaceAll("&#55357;&#56716;", "🖌");
      in = in.replaceAll("&#55357;&#56717;", "🖍");
      in = in.replaceAll("&#55357;&#56718;", "🖎");
      in = in.replaceAll("&#55357;&#56719;", "🖏");
      in = in.replaceAll("&#55357;&#56396;", "👌");
      in = in.replaceAll("&#55357;&#56720;", "🖐");
      in = in.replaceAll("&#55357;&#56721;", "🖑");
      in = in.replaceAll("&#55357;&#56722;", "🖒");
      in = in.replaceAll("&#55357;&#56397;", "👍");
      in = in.replaceAll("&#55357;&#56723;", "🖓");
      in = in.replaceAll("&#55357;&#56398;", "👎");
      in = in.replaceAll("&#55357;&#56724;", "🖔");
      in = in.replaceAll("&#55357;&#56725;", "🖕");
      in = in.replaceAll("&#55357;&#56726;", "🖖");
      in = in.replaceAll("&#55357;&#56727;", "🖗");
      in = in.replaceAll("&#55357;&#56391;", "👇");
      in = in.replaceAll("&#55357;&#56728;", "🖘");
      in = in.replaceAll("&#55357;&#56729;", "🖙");
      in = in.replaceAll("&#55357;&#56730;", "🖚");
      in = in.replaceAll("&#55357;&#56731;", "🖛");
      in = in.replaceAll("&#55357;&#56732;", "🖜");
      in = in.replaceAll("&#55357;&#56392;", "👈");
      in = in.replaceAll("&#55357;&#56675;", "🕣");
      in = in.replaceAll("&#55357;&#56676;", "🕤");
      in = in.replaceAll("&#55357;&#56677;", "🕥");
      in = in.replaceAll("&#55357;&#56678;", "🕦");
      in = in.replaceAll("&#55357;&#56679;", "🕧");
      in = in.replaceAll("&#55357;&#56680;", "🕨");
      in = in.replaceAll("&#55357;&#56584;", "🔈");
      in = in.replaceAll("&#55357;&#56681;", "🕩");
      in = in.replaceAll("&#55357;&#56682;", "🕪");
      in = in.replaceAll("&#55357;&#56683;", "🕫");
      in = in.replaceAll("&#55357;&#56584;", "🔈");
      in = in.replaceAll("&#55357;&#56684;", "🕬");
      in = in.replaceAll("&#55357;&#56547;", "📣");
      in = in.replaceAll("&#55357;&#56586;", "🔊");
      in = in.replaceAll("&#55357;&#56685;", "🕭");
      in = in.replaceAll("&#55357;&#56596;", "🔔");
      in = in.replaceAll("&#55357;&#56686;", "🕮");
      in = in.replaceAll("&#55357;&#56534;", "📖");
      in = in.replaceAll("&#55357;&#56687;", "🕯");
      in = in.replaceAll("&#55357;&#56688;", "🕰");
      in = in.replaceAll("&#55357;&#56689;", "🕱");
      in = in.replaceAll("&#55357;&#56690;", "🕲");
      in = in.replaceAll("&#55357;&#56691;", "🕳");
      in = in.replaceAll("&#55357;&#56692;", "🕴");
      in = in.replaceAll("&#55357;&#56693;", "🕵");
      in = in.replaceAll("&#55357;&#56694;", "🕶");
      in = in.replaceAll("&#55357;&#56695;", "🕷");
      in = in.replaceAll("&#55357;&#56696;", "🕸");
      in = in.replaceAll("&#55357;&#56697;", "🕹");
      in = in.replaceAll("&#55357;&#56699;", "🕻");
      in = in.replaceAll("&#55357;&#56542;", "📞");
      in = in.replaceAll("&#55357;&#56700;", "🕼");
      in = in.replaceAll("&#55357;&#56544;", "📠");
      in = in.replaceAll("&#55357;&#56701;", "🕽");
      in = in.replaceAll("&#55357;&#56702;", "℡");
      in = in.replaceAll("&#55357;&#56703;", "🕿");
      in = in.replaceAll("&#55357;&#56704;", "🖀");
      in = in.replaceAll("&#55357;&#56705;", "🖁");
      in = in.replaceAll("&#55357;&#56561;", "📱");
      in = in.replaceAll("&#55357;&#56766;", "🖾");
      in = in.replaceAll("&#55357;&#56767;", "🖿");
      in = in.replaceAll("&#55357;&#56768;", "🗀");
      in = in.replaceAll("&#55357;&#56513;", "📁");
      in = in.replaceAll("&#55357;&#56769;", "🗁");
      in = in.replaceAll("&#55357;&#56514;", "📂");
      in = in.replaceAll("&#55357;&#56770;", "🗂");
      in = in.replaceAll("&#55357;&#56519;", "📇");
      in = in.replaceAll("&#55357;&#56771;", "🗃");
      in = in.replaceAll("&#55357;&#56772;", "🗄");
      in = in.replaceAll("&#55357;&#56773;", "🗅");
      in = in.replaceAll("&#55357;&#56774;", "🗆");
      in = in.replaceAll("&#55357;&#56775;", "🗇");
      in = in.replaceAll("&#55357;&#56776;", "🗈");
      in = in.replaceAll("&#55357;&#56777;", "🗉");
      in = in.replaceAll("&#55357;&#56778;", "🗊");
      in = in.replaceAll("&#55357;&#56779;", "🗋");
      in = in.replaceAll("&#55357;&#56780;", "🗌");
      in = in.replaceAll("&#55357;&#56781;", "🗍");
      in = in.replaceAll("&#55357;&#56782;", "🗎");
      in = in.replaceAll("&#55357;&#56516;", "📄");
      in = in.replaceAll("&#55357;&#56783;", "🗏");
      in = in.replaceAll("&#55357;&#56515;", "📃");
      in = in.replaceAll("&#55357;&#56784;", "🗐");
      in = in.replaceAll("&#55357;&#56785;", "🗑");
      in = in.replaceAll("&#55357;&#56786;", "🗒");
      in = in.replaceAll("&#55357;&#56517;", "📅");
      in = in.replaceAll("&#55357;&#56787;", "🗓");
      in = in.replaceAll("&#55357;&#56518;", "📆");
      in = in.replaceAll("&#55357;&#56788;", "🗔");
      in = in.replaceAll("&#55357;&#56789;", "🗕");
      in = in.replaceAll("&#55357;&#56790;", "🗖");
      in = in.replaceAll("&#55357;&#56791;", "🗗");
      in = in.replaceAll("&#55357;&#56792;", "🗘");
      in = in.replaceAll("&#55357;&#56579;", "🔃");
      in = in.replaceAll("&#55357;&#56793;", "🗙");
      in = in.replaceAll("&#55357;&#56794;", "🗚");
      in = in.replaceAll("&#55357;&#56795;", "🗛");
      in = in.replaceAll("&#55357;&#56796;", "🗜");
      in = in.replaceAll("&#55357;&#56797;", "🗝");
      in = in.replaceAll("&#55357;&#56593;", "🔑");
      in = in.replaceAll("&#55357;&#56798;", "🗞");
      in = in.replaceAll("&#55357;&#56560;", "📰");
      in = in.replaceAll("&#55357;&#56799;", "🗟");
      in = in.replaceAll("&#55357;&#56733;", "🖝");
      in = in.replaceAll("&#55357;&#56393;", "👉");
      in = in.replaceAll("&#55357;&#56734;", "🖞");
      in = in.replaceAll("&#55357;&#56735;", "🖟");
      in = in.replaceAll("&#55357;&#56736;", "🖠");
      in = in.replaceAll("&#55357;&#56737;", "🖡");
      in = in.replaceAll("&#55357;&#56738;", "🖢");
      in = in.replaceAll("&#55357;&#56390;", "👆");
      in = in.replaceAll("&#55357;&#56739;", "🖣");
      in = in.replaceAll("&#55357;&#56391;", "👇");
      in = in.replaceAll("&#55357;&#56741;", "🖥");
      in = in.replaceAll("&#55357;&#56742;", "🖦");
      in = in.replaceAll("&#55357;&#56743;", "🖧");
      in = in.replaceAll("&#55357;&#56744;", "🖨");
      in = in.replaceAll("&#55357;&#56544;", "📠");
      in = in.replaceAll("&#55357;&#56745;", "🖩");
      in = in.replaceAll("&#55357;&#56746;", "🖪");
      in = in.replaceAll("&#55357;&#56510;", "💾");
      in = in.replaceAll("&#55357;&#56747;", "🖫");
      in = in.replaceAll("&#55357;&#56748;", "🖬");
      in = in.replaceAll("&#55357;&#56749;", "🖭");
      in = in.replaceAll("&#55357;&#56750;", "🖮");
      in = in.replaceAll("&#55357;&#56751;", "🖯");
      in = in.replaceAll("&#55357;&#56752;", "🖰");
      in = in.replaceAll("&#55357;&#56753;", "🖱");
      in = in.replaceAll("&#55357;&#56754;", "🖲");
      in = in.replaceAll("&#55357;&#56755;", "🖳");
      in = in.replaceAll("&#55357;&#56507;", "💻");
      in = in.replaceAll("&#55357;&#56756;", "🖴");
      in = in.replaceAll("&#55357;&#56757;", "🖵");
      in = in.replaceAll("&#55357;&#56758;", "🖶");
      in = in.replaceAll("&#55357;&#56744;", "🖨");
      in = in.replaceAll("&#55357;&#56759;", "🖷");
      in = in.replaceAll("&#55357;&#56544;", "📠");
      in = in.replaceAll("&#55357;&#56760;", "🖸");
      in = in.replaceAll("&#55357;&#56511;", "💿");
      in = in.replaceAll("&#55357;&#56761;", "🖹");
      in = in.replaceAll("&#55357;&#56762;", "🖺");
      in = in.replaceAll("&#55357;&#56763;", "🖻");
      in = in.replaceAll("&#55357;&#56764;", "🖼");
      in = in.replaceAll("&#55357;&#56765;", "🖽");
      in = in.replaceAll("&#55357;&#56826;", "🗺");
      in = in.replaceAll("&#55357;&#56827;", "🗻");
      in = in.replaceAll("&#55357;&#56828;", "🗼");
      in = in.replaceAll("&#55357;&#56829;", "🗽");
      in = in.replaceAll("&#55357;&#56830;", "🗾");
      in = in.replaceAll("&#55357;&#56831;", "🗿");
      in = in.replaceAll("&#55357;&#56800;", "🗠");
      in = in.replaceAll("&#55357;&#56520;", "📈");
      in = in.replaceAll("&#55357;&#56801;", "🗡");
      in = in.replaceAll("&#55357;&#56618;", "🔪");
      in = in.replaceAll("&#55357;&#56802;", "🗢");
      in = in.replaceAll("&#55357;&#56459;", "💋");
      in = in.replaceAll("&#55357;&#56803;", "🗣");
      in = in.replaceAll("&#55357;&#56804;", "🗤");
      in = in.replaceAll("&#55357;&#56805;", "🗥");
      in = in.replaceAll("&#55357;&#56806;", "🗦");
      in = in.replaceAll("&#55357;&#56807;", "🗧");
      in = in.replaceAll("&#55357;&#56808;", "🗨");
      in = in.replaceAll("&#55357;&#56809;", "🗩");
      in = in.replaceAll("&#55357;&#56810;", "🗪");
      in = in.replaceAll("&#55357;&#56811;", "🗫");
      in = in.replaceAll("&#55357;&#56812;", "🗬");
      in = in.replaceAll("&#55357;&#56813;", "🗭");
      in = in.replaceAll("&#55357;&#56493;", "💭");
      in = in.replaceAll("&#55357;&#56814;", "🗮");
      in = in.replaceAll("&#55357;&#56815;", "🗯");
      in = in.replaceAll("&#55357;&#56816;", "🗰");
      in = in.replaceAll("&#55357;&#56485;", "💥");
      in = in.replaceAll("&#55357;&#56817;", "🗱");
      in = in.replaceAll("&#55357;&#56818;", "🗲");
      in = in.replaceAll("&#55357;&#56819;", "🗳");
      in = in.replaceAll("&#55357;&#56820;", "🗴");
      in = in.replaceAll("&#55357;&#56821;", "🗵");
      in = in.replaceAll("&#55357;&#56822;", "🗶");
      in = in.replaceAll("&#55357;&#56823;", "🗷");
      in = in.replaceAll("&#55357;&#56824;", "🗸");
      in = in.replaceAll("&#55357;&#56825;", "🗹");
      in = in.replaceAll("&#55357;&#56873;", "😩");
      in = in.replaceAll("&#55357;&#56874;", "😪");
      in = in.replaceAll("&#55357;&#56875;", "😫");
      in = in.replaceAll("&#55357;&#56876;", "😬");
      in = in.replaceAll("&#55357;&#56877;", "😭");
      in = in.replaceAll("&#55357;&#56878;", "😮");
      in = in.replaceAll("&#55357;&#56879;", "😯");
      in = in.replaceAll("&#55357;&#56880;", "😰");
      in = in.replaceAll("&#55357;&#56881;", "😱");
      in = in.replaceAll("&#55357;&#56882;", "😲");
      in = in.replaceAll("&#55357;&#56883;", "😳");
      in = in.replaceAll("&#55357;&#56884;", "😴");
      in = in.replaceAll("&#55357;&#56885;", "😵");
      in = in.replaceAll("&#55357;&#56886;", "😶");
      in = in.replaceAll("&#55357;&#56887;", "😷");
      in = in.replaceAll("&#55357;&#56888;", "😸");
      in = in.replaceAll("&#55357;&#56889;", "😹");
      in = in.replaceAll("&#55357;&#56890;", "😺");
      in = in.replaceAll("&#55357;&#56891;", "😻");
      in = in.replaceAll("&#55357;&#56892;", "😼");
      in = in.replaceAll("&#55357;&#56893;", "😽");
      in = in.replaceAll("&#55357;&#56894;", "😾");
      in = in.replaceAll("&#55357;&#56895;", "😿");
      in = in.replaceAll("&#55357;&#56896;", "🙀");
      in = in.replaceAll("&#55357;&#56897;", "🙁");
      in = in.replaceAll("&#55357;&#56898;", "🙂");
      in = in.replaceAll("&#55357;&#56899;", "🙃");
      in = in.replaceAll("&#55357;&#56900;", "🙄");
      in = in.replaceAll("&#55357;&#56901;", "🙅");
      in = in.replaceAll("&#55357;&#56902;", "🙆");
      in = in.replaceAll("&#55357;&#56903;", "🙇");
      in = in.replaceAll("&#55357;&#56904;", "🙈");
      in = in.replaceAll("&#55357;&#56905;", "🙉");
      in = in.replaceAll("&#55357;&#56906;", "🙊");
      in = in.replaceAll("&#55357;&#56907;", "🙋");
      in = in.replaceAll("&#55357;&#56908;", "🙌");
      in = in.replaceAll("&#55357;&#56909;", "🙍");
      in = in.replaceAll("&#55357;&#56910;", "🙎");
      in = in.replaceAll("&#55357;&#56832;", "😀");
      in = in.replaceAll("&#55357;&#56833;", "😁");
      in = in.replaceAll("&#55357;&#56834;", "😂");
      in = in.replaceAll("&#55357;&#56835;", "😃");
      in = in.replaceAll("&#55357;&#56836;", "😄");
      in = in.replaceAll("&#55357;&#56837;", "😅");
      in = in.replaceAll("&#55357;&#56838;", "😆");
      in = in.replaceAll("&#55357;&#56839;", "😇");
      in = in.replaceAll("&#55357;&#56840;", "😈");
      in = in.replaceAll("&#55357;&#56841;", "😉");
      in = in.replaceAll("&#55357;&#56842;", "😊");
      in = in.replaceAll("&#55357;&#56843;", "😋");
      in = in.replaceAll("&#55357;&#56844;", "😌");
      in = in.replaceAll("&#55357;&#56845;", "😍");
      in = in.replaceAll("&#55357;&#56846;", "😎");
      in = in.replaceAll("&#55357;&#56847;", "😏");
      in = in.replaceAll("&#55357;&#56848;", "😐");
      in = in.replaceAll("&#55357;&#56849;", "😑");
      in = in.replaceAll("&#55357;&#56850;", "😒");
      in = in.replaceAll("&#55357;&#56851;", "😓");
      in = in.replaceAll("&#55357;&#56852;", "😔");
      in = in.replaceAll("&#55357;&#56853;", "😕");
      in = in.replaceAll("&#55357;&#56854;", "😖");
      in = in.replaceAll("&#55357;&#56855;", "😗");
      in = in.replaceAll("&#55357;&#56856;", "😘");
      in = in.replaceAll("&#55357;&#56857;", "😙");
      in = in.replaceAll("&#55357;&#56858;", "😚");
      in = in.replaceAll("&#55357;&#56859;", "😛");
      in = in.replaceAll("&#55357;&#56860;", "😜");
      in = in.replaceAll("&#55357;&#56861;", "😝");
      in = in.replaceAll("&#55357;&#56862;", "😞");
      in = in.replaceAll("&#55357;&#56863;", "😟");
      in = in.replaceAll("&#55357;&#56864;", "😠");
      in = in.replaceAll("&#55357;&#56865;", "😡");
      in = in.replaceAll("&#55357;&#56866;", "😢");
      in = in.replaceAll("&#55357;&#56867;", "😣");
      in = in.replaceAll("&#55357;&#56868;", "😤");
      in = in.replaceAll("&#55357;&#56869;", "😥");
      in = in.replaceAll("&#55357;&#56870;", "😦");
      in = in.replaceAll("&#55357;&#56871;", "😧");
      in = in.replaceAll("&#55357;&#56872;", "😨");
      in = in.replaceAll("&#55357;&#56911;", "🙏");




      
      return in;
  }

}
    
                               