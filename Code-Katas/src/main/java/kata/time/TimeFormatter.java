package kata.time;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
    	if(seconds == 0) {
    		return "now";
    	} else {
    		int years = seconds / 31536000;
			int daysRemain = seconds % 31536000;
			int days = daysRemain / 86400;
			int hoursRemain = daysRemain % 86400;
			int hours = hoursRemain / 3600;
			int minsRemain = hoursRemain % 3600;
			int mins = minsRemain / 60;
			int secs = minsRemain % 60;
			boolean and = false;
			boolean comma = false;
			StringBuilder builder = new StringBuilder();
			if(secs > 0) {
				builder.append(secs == 1 ? "1 second" : String.format("%d seconds", secs));
				and = true;
			}
			if(mins > 0) {
				if(and) {
					builder.insert(0, " and ");
					comma = true;
				} else {
					and = true;
				}
				builder.insert(0, mins == 1 ? "1 minute" : String.format("%d minutes", mins));
			}
			if(hours > 0) {
				if(comma) {
					builder.insert(0, ", ");
				} else if(and) {
					builder.insert(0, " and ");
					comma = true;
				} else {
					and = true;
				}
				builder.insert(0, hours == 1 ? "1 hour" : String.format("%d hours", hours));
			}
			if(days > 0) {
				if(comma) {
					builder.insert(0, ", ");
				} else if(and) {
					builder.insert(0, " and ");
					comma = true;
				} else {
					and = true;
				}
				builder.insert(0, days == 1 ? "1 day" : String.format("%d days", days));
			}
			if(years > 0) {
				if(comma) {
					builder.insert(0, ", ");
				} else if(and) {
					builder.insert(0, " and ");
				}
				builder.insert(0, years == 1 ? "1 year" : String.format("%d years", years));
				and = true;
			}
			return builder.toString();
    	}
    }
    
}