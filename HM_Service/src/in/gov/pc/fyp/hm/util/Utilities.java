package in.gov.pc.fyp.hm.util;

// standard Java and J2EE API imports

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * General use utilities Max, RHT, 9/29/2005
 */
public class Utilities
{
	// returns the date in yyyy-MM-dd format
	public static String getOutputDate(String year, String month, String day)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Integer.parseInt(month) - 1);
		calendar.set(Calendar.YEAR, Integer.parseInt(year));
		calendar.set(Calendar.DATE, Integer.parseInt(day));
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	// returns number of weeks between two dates as Calendar objects
	public static int getNumbOfWeeks(Calendar one, Calendar two)
	{
		double weeks = ((double) (java.lang.Math.abs(one.getTimeInMillis() - two.getTimeInMillis()))) / 604800000.0; // 1000
		                                                                                                             // *
		                                                                                                             // 60
		                                                                                                             // *
		                                                                                                             // 60
		                                                                                                             // *
		                                                                                                             // 24
		                                                                                                             // *
		                                                                                                             // 7
		                                                                                                             // =
		                                                                                                             // 604800000
		return (int) Math.round(weeks);
	}

	// returns number of days between two dates as Calendar objects, Max, RHT,
	// 2/8/2006
	public static int getNumbOfDays(Calendar one, Calendar two)
	{
		double days = ((double) (java.lang.Math.abs(one.getTimeInMillis() - two.getTimeInMillis()))) / 86400000.0; // 1000
		                                                                                                           // *
		                                                                                                           // 60
		                                                                                                           // *
		                                                                                                           // 60
		                                                                                                           // *
		                                                                                                           // 24
		                                                                                                           // =
		                                                                                                           // 86400000
		return (int) Math.round(days);
	}

	// today's date in format
	public static String getTodaysDate(String format)
	{
		return new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
	}

	// today's date, Max, RHT, 2/8/2006
	public static Calendar getTodaysDateAsCal()
	{
		Calendar calendar = Calendar.getInstance();
		return calendar;
	}

	public static Calendar getTodaysDateAsCalWithOutTime()
	{
		Calendar calendar = Calendar.getInstance();
		String todaysDate = getStringDate(calendar, "MM-dd-yyyy");
		calendar = getDateAsCal(todaysDate, "MM-dd-yyyy");
		return calendar;
	}

	public static Calendar getDateAsCalWithOutTime(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String todaysDate = getStringDate(calendar, "MM-dd-yyyy");
		calendar = getDateAsCal(todaysDate, "MM-dd-yyyy");
		return calendar;
	}

	// yesterday date, Max, RHT, 1/13/2006
	public static String getYesterdaysDate(String format)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		return new SimpleDateFormat(format).format(calendar.getTime());
	}

	// yesterday date, Max, RHT, 2/8/2006
	public static Calendar getYesterdaysDateAsCal()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		return calendar;
	}

	// week ago date, Max, RHT, 1/27/2006
	public static String getWeekAgoDate(String format)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		return new SimpleDateFormat(format).format(calendar.getTime());
	}

	// week ago date, Max, RHT, 2/8/2006
	public static Calendar getWeekAgoDateAsCal()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		return calendar;
	}

	// returns date as a calendar object using a format string, Max, RHT,
	// 2/8/2006
	public static Calendar getDateAsCal(String date, String format)
	{
		Calendar calendar = Calendar.getInstance();
		/*
		 * added null check to avoid null pointer exception - 10/19/2006 Padma
		 */
		if (date != null && date.length() != 0 && format != null && format.length() != 0)
		{
			calendar.setTime(new SimpleDateFormat(format).parse(date, new ParsePosition(0)));

			return calendar;
		}
		else
		{
			return null;
		}
		/* end of null check */
	}

	// converts date from one format to another, Max, RHT, 2/23/2006
	public static String convertDate(String date, String inpFormat, String outFormat)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new SimpleDateFormat(inpFormat).parse(date, new ParsePosition(0)));
		return new SimpleDateFormat(outFormat).format(calendar.getTime());
	}

	// Max, RHT, 2/23/2006
	public static String getStringDate(Calendar calendar, String format)
	{
		// use a local version of the object in order not to modify
		// the incoming object itself, Max, 1/30/3007
		Calendar localCalendar = (Calendar) calendar.clone();

		// fix for SDR # 39661 - incorrect date, 12/8/2006
		int offset = SimpleTimeZone.getDefault().getRawOffset();
		localCalendar.set(Calendar.ZONE_OFFSET, offset);
		// end of fix for SDR # 39661 - incorrect date, 12/8/2006
		return new SimpleDateFormat(format).format(localCalendar.getTime());
	}

	public static String convertDateToString(Date date, String format)
	{
		String result = null;
		try
		{
			// use a local version of the object in order not to modify
			Calendar localCalendar = Calendar.getInstance();
			localCalendar.setTime(date);

			int offset = SimpleTimeZone.getDefault().getRawOffset();
			localCalendar.set(Calendar.ZONE_OFFSET, offset);
			result = new SimpleDateFormat(format).format(localCalendar.getTime());
		}
		catch (Exception e)
		{
			System.out.println("Null value input found");
		}
		return result;
	}

	
	/**
	 * Used for setting missing issuance date for credentials, etc.
	 * 
	 * @return current date - one year
	 * @author Max, 10/25/2006
	 */
	public static Calendar getCurrDateMinusOneYear()
	{
		GregorianCalendar grCalendar = new GregorianCalendar();
		grCalendar.add(Calendar.YEAR, -1);
		return grCalendar;
	}

	/**
	 * Used for setting missing expiry date for credentials, etc.
	 * 
	 * @return current date + one year
	 * @author Max, 10/25/2006
	 */
	public static Calendar getCurrDatePlusOneYear()
	{
		GregorianCalendar grCalendar = new GregorianCalendar();
		grCalendar.add(Calendar.YEAR, 1);
		return grCalendar;
	}

	// Tomorrows date , mpate@cctc.com 4/9/2007
	public static Calendar getTomorrowsDateAsCal()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, +1);
		return calendar;
	}

	/**
	 * ngunjal 19/02/2009 for SDR 10099 This method Converts the String to
	 * Calendar
	 * 
	 * @param strFormatDate
	 *            , currentFormat
	 * @return
	 */
	public static Calendar convertStringToCalender(String strFormatDate, String currentFormat)
	{
		if (strFormatDate == null || "".equals(strFormatDate.trim()))
			return null;

		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat(currentFormat);
		Date date = null;
		Calendar objCalendar = Calendar.getInstance();
		try
		{
			date = objSimpleDateFormat.parse(strFormatDate);
			objCalendar.setTime(date);
		}
		catch (ParseException e)
		{
			//logger.fatal(e);
			objCalendar = null;
		}
		return objCalendar;
	}

	/**
	 * @param String
	 * @return String
	 * @description This method checks whether sting is numeric and return
	 *              boolean value
	 */
	public static boolean getNumericValidated(String validStr)
	{
		boolean result = false;
		Pattern p = null;
		Matcher m = null;

		try
		{
			if (validStr != null)
			{
				p = Pattern.compile("^\\d+$");
				m = p.matcher(validStr);
				result = m.find();
			}
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
			result = false;
		}
		return result;
	}

	/**
	 * @param String
	 * @return String
	 * @description This method checks whether sting has only alphabets or not
	 */
	public static boolean getTextValidated(String validStr)
	{
		boolean result = false;
		Pattern p = null;
		Matcher m = null;

		try
		{
			if (validStr != null)
			{
				p = Pattern.compile("^[a-zA-Z\\s]+$");
				m = p.matcher(validStr);
				result = m.find();
			}
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
			result = false;
		}
		return result;
	}

	public static int convertStringToInteger(String input)
	{
		int result = 0;
		if (input == null || "".equals(input.trim()))
		{

		}
		else
		{
			if (Utilities.getNumericValidated(input))
			{
				result = Integer.parseInt(input);
			}
		}
		return result;
	}

	public static String getValidatedValue(Object tempObj)
	{
		String temp = (String) tempObj;
		temp = temp == null ? null : temp.trim();
		if (temp != null && "".equals(temp))
		{
			temp = null;
		}
		return temp;
	}

	public static Date getValidatedDate(String temp)
	{
		Date result = null;
		Calendar tempCal = Utilities.convertStringToCalender(temp, "yyyy-MM-dd");
		Calendar cutOffDate = Utilities.getDateAsCal("01/01/1905", "MM/dd/yyyy");
		if (tempCal != null)
		{
			if (tempCal.equals(cutOffDate) || tempCal.before(cutOffDate))
			{
				tempCal = null;
			}
			result = tempCal == null ? null : tempCal.getTime();
		}
		return result;
	}
	
	public static Date getValidatedDateUSFormat(String temp)
	{
		Date result = null;
		Calendar tempCal = Utilities.convertStringToCalender(temp, "MM/dd/yyyy");
		result = tempCal == null ? null : tempCal.getTime();
		return result;
	}

	public static Date getValidatedDateTime(String temp)
	{
		Date result = null;
		Calendar tempCal = Utilities.convertStringToCalender(temp, "yyyy-MM-dd HH:mm:ss");
		Calendar cutOffDate = Utilities.getDateAsCal("01/01/1905", "MM/dd/yyyy");
		if (tempCal != null)
		{
			if (tempCal.equals(cutOffDate) || tempCal.before(cutOffDate))
			{
				tempCal = null;
			}
		}
		result = tempCal == null ? null : tempCal.getTime();
		return result;
	}

	public static Date getValidatedDateTimeWOSeconds(String temp)
	{
		Date result = null;
		Calendar tempCal = Utilities.convertStringToCalender(temp, "yyyy-MM-dd HH:mm");
		Calendar cutOffDate = Utilities.getDateAsCal("01/01/1905", "MM/dd/yyyy");
		if (tempCal != null)
		{
			if (tempCal.equals(cutOffDate) || tempCal.before(cutOffDate))
			{
				tempCal = null;
			}
		}
		result = tempCal == null ? null : tempCal.getTime();
		return result;
	}

	/**
	 * Converts a Delimited String into a String [].
	 * 
	 * @param delimitedString
	 * @param delimiter
	 * @return String[]
	 */
	public static String[] convertDelimitedStringToArray(String delimitedString, String delimiter)
	{
		if (delimiter == null)
		{
			delimiter = ",";
		}

		if (delimitedString == null)
		{
			delimitedString = "";
		}

		StringTokenizer stk = new StringTokenizer(delimitedString, delimiter);

		String[] returnArray = new String[stk.countTokens()];
		int i = 0;

		while (stk.hasMoreTokens())
		{
			String temp = stk.nextToken();
			if (temp != null)
			{
				returnArray[i++] = temp.trim();
			}
		}
		return returnArray;
	}

	public static Set getSetDifference(Set setA, Set setB)
	{
		Set tmp = setA;
		tmp.removeAll(setB);
		return tmp;
	}
	
	public static ArrayList createStringChunks(String strToBreak , int chunkSize)
	{
		ArrayList chunks = new ArrayList(); 
		int fieldSize = chunkSize;
		int textLength = strToBreak.length();
		int startRange = 0;
		int endRange = 0;
		
		while(startRange < textLength)
		{
			endRange = startRange + fieldSize > textLength ? textLength : startRange + fieldSize;
			chunks.add(strToBreak.substring(startRange,endRange));
			startRange = startRange + fieldSize;
		}
		return chunks;
	}
	
	// replaces all substrings replaceFrom to replaceTo in inputString
	public static String replaceAll(String inputString, String replaceFrom, String replaceTo)
	{
		if (inputString == null || replaceFrom == null)
		{
			return inputString;
		}

		if (replaceTo == null)
		{
			replaceTo = "";
		}

		StringBuffer outputString = new StringBuffer();

		int patternLen = replaceFrom.length();
		int index = 0, patternPos;

		while (index < inputString.length())
		{
			if ((patternPos = inputString.indexOf(replaceFrom, index)) != -1)
			{
				outputString.append(inputString.substring(index, patternPos) + replaceTo);
				index = patternPos + patternLen;
			}
			else
			{
				outputString.append(inputString.substring(index));
				break;
			}
		}

		return outputString.toString();
	}
	
	/**
	 * Converts a given String Array into a Dleimited string
	 * @param stringArray
	 * @param delimiter
	 * @return String
	 */
	public static String convertArrayToDelimitedString(
		String[] stringArray,
		String delimiter)
	{
		String returnStr = "";
		if (delimiter == null)
		{
			delimiter = ",";
		}

		if (stringArray == null)
		{
			return returnStr;
		}

		int arrLength = stringArray.length;
		for (int i = 0; i < arrLength; i++)
		{
			if (stringArray[i] == null || stringArray[i].trim().equals(""))
			{
				continue;
			}
			if (i != (arrLength - 1))
			{
				returnStr += stringArray[i] + ",";
			}
			else
			{
				returnStr += stringArray[i];
			}
		}
		return returnStr;

	}
}
