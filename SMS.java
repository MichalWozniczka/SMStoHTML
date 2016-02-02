import java.util.Date;

public class SMS
{
  static String date;
  static String message;
  static int sender;
  static int senderType;
  
  static long timestamp;
  static long timestampLast = 0;
  
  static Date d;
  static int oldDate;
  
  public SMS(String line, int sT, int od)
  {
    date = getDate(line);
	message = getMessage(line);
	sender = getSender(line);
	senderType = sT;
	oldDate = od;
  }
  
  public String getDate(String s)
  {
    String[] s1 = s.split(" ");
	timestamp = Long.parseLong((String)(s1[5].substring(6, s1[5].length()-1)));
	d = new Date(timestamp);
	
	/*int dayInt = d.getDay();
	String dayString = "";
	if(dayInt == 0)
	  dayString = "Sunday";
    if(dayInt == 1)
	  dayString = "Monday";
    if(dayInt == 2)
	  dayString = "Tuesday";
    if(dayInt == 3)
	  dayString = "Wednesday";
    if(dayInt == 4)
	  dayString = "Thursday";
    if(dayInt == 5)
	  dayString = "Friday";
    if(dayInt == 6)
	  dayString = "Saturday";
  
    int monthInt = d.getMonth();
	String monthString = "";
	if(monthInt == 0)
	  monthString = "January";
	if(monthInt == 1)
	  monthString = "February";
	if(monthInt == 2)
	  monthString = "March";
	if(monthInt == 3)
	  monthString = "April";
	if(monthInt == 4)
	  monthString = "May";
	if(monthInt == 5)
	  monthString = "June";
	if(monthInt == 6)
	  monthString = "July";
	if(monthInt == 7)
	  monthString = "August";
	if(monthInt == 8)
	  monthString = "September";
	if(monthInt == 9)
	  monthString = "October";
	if(monthInt == 10)
	  monthString = "November";
	if(monthInt == 11)
	  monthString = "December";*/
  
    int month = d.getMonth() + 1;
	int date = d.getDate();
  
    int hours = d.getHours() + 1;
	String ampm = "";
	if(hours/12 == 1) {
	  ampm = "PM";
	  hours = hours - 12;
	}
    else if(hours/12 == 0)
	  ampm = "AM";
    else if(hours/12 == 2) {
	  ampm = "AM";
	  hours = 12;
	}
	if(hours == 0) {
	  ampm = "AM";
	  hours = 12;
	}
	int minutes = d.getMinutes();
	String minutesString;
	if(minutes < 10)
	  minutesString = "0" + minutes;
	else
	  minutesString = "" + minutes;
	
	int years = d.getYear() - 100;
	
	return (month + "/" + date + "/" + years + "  " + hours + ":" + minutesString + " " + ampm);
  }
  
  public static long getTimestamp()
  {
	return timestamp;
  }
  
  public String getMessage(String s)
  {
	String[] s1 = s.split(" ");
	int i = 8;
	String message = "";
	while(s1[i].length() <= 4 || s1[i].substring(0, 4).equals("toa=") == false)
	{
	  message += s1[i] + " ";
	  i++;
	}
	return message.substring(6, message.length()-2);
  }
  
  public static int getSender(String s)
  {
	String[] s1 = s.split(" ");
	int type = Integer.parseInt(s1[6].substring(6, 7));
	return type;
  }
  
  public static int getType()
  {
	return sender;
  }
  
  public String toString()
  {
	String toReturn = "";
	d = new Date(timestamp);
	int newDate = d.getDate();
	boolean switchDate = false;
	if(oldDate != newDate)
		switchDate = true;
	if(d.getMonth() == 0 && switchDate == true) {
      oldDate = newDate;
	  toReturn += "<A NAME=\"january" + d.getDate() + "\">";
	}
	if(d.getMonth() == 1 && switchDate == true) {
      oldDate = newDate;
	  toReturn += "<A NAME=\"february" + d.getDate() + "\">";
	}
	if(d.getMonth() == 2 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"march" + d.getDate() + "\">";
	}
	if(d.getMonth() == 3 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"april" + d.getDate() + "\">";
	}
	if(d.getMonth() == 4 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"may" + d.getDate() + "\">";
	}
	if(d.getMonth() == 5 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"june" + d.getDate() + "\">";
	}
	if(d.getMonth() == 6 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"july" + d.getDate() + "\">";
	}
	if(d.getMonth() == 7 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"august" + d.getDate() + "\">";
	}
	if(d.getMonth() == 8 && switchDate == true) {
	  oldDate = newDate;
	  toReturn += "<A NAME=\"september" + d.getDate() + "\">";
	}
	if(d.getMonth() == 9 && switchDate == true) {
      oldDate = newDate;
	  toReturn += "<A NAME=\"october" + d.getDate() + "\">";
	}
	if(d.getMonth() == 10 && switchDate == true) {
      oldDate = newDate;
	  toReturn += "<A NAME=\"november" + d.getDate() + "\">";
	}
	if(d.getMonth() == 11 && switchDate == true) {
      oldDate = newDate;
	  toReturn += "<A NAME=\"december" + d.getDate() + "\">";
	}
	if(timestamp - timestampLast > 7200000) {
	  toReturn += "<div class=\"wrapper\"><div class=\"time\"><p><font face=\"helvetica\" color=#999999 size=\"2\">" + date + "</font></p></div></div>";
	  timestampLast = timestamp;
	}
	if(sender == 1) {
	  if(senderType == 2)
        toReturn += "<div class=\"wrapper\" style=\"margin-top:8px;\"><div class=\"sender2\"><p><font face=\"helvetica\" color=\"black\" size=\"4\">" + message + "</font></p></div></div>";
	  else
		toReturn += "<div class=\"wrapper\"><div class=\"sender2\"><p><font face=\"helvetica\" color=\"black\" size=\"4\">" + message + "</font></p></div></div>";
	}
    else {
	  if(senderType == 1)
        toReturn += "<div class=\"wrapper\" style=\"margin-top:8px;\"><div class=\"sender1\"><p><font face=\"helvetica\" color=\"white\" size=\"4\">" + message + "</font></p></div></div>";
	  else
		toReturn += "<div class=\"wrapper\"><div class=\"sender1\"><p><font face=\"helvetica\" color=\"white\" size=\"4\">" + message + "</font></p></div></div>";
	}
	
	return toReturn;
  }
  
  public static int getOldDate()
  {
	return oldDate;
  }
}