package question_1;

import java.util.List;
import java.util.ArrayList;

class ErrorLog implements Comparable<ErrorLog> {
	String date;
	String time;
	String status;
	String message;
	
	public ErrorLog(String date, String time, String status, String message) {
		this.date = date;
		this.time = time;
		this.status = status;
		this.message = message;
	}
	
	private boolean dateCheck(String date1, String date2) {
		int d1 = Integer.parseInt(date1.substring(0, 2));
		int m1 = Integer.parseInt(date1.substring(3, 5));
		int y1 = Integer.parseInt(date1.substring(6));
		
		int d2 = Integer.parseInt(date2.substring(0, 2));
		int m2 = Integer.parseInt(date2.substring(3, 5));
		int y2 = Integer.parseInt(date2.substring(6));
		
		if(y1 != y2)
			return (y1 > y2);
		else if(m1 != m2)
			return (m1 > m2);
		return (d1 > d2);
	}
	
	private boolean timeCheck(String time1, String time2) {
		int hours1 = Integer.parseInt(time1.substring(0, 2));
		int minutes1 = Integer.parseInt(time1.substring(3));
		
		int hours2 = Integer.parseInt(time2.substring(0, 2));
		int minutes2 = Integer.parseInt(time2.substring(3));
		
		if(hours1 != hours2)
			return (hours1 > hours2);
		return (minutes1 > minutes2);
	}
	
	@Override
	public int compareTo(ErrorLog other) {
		if (!this.date.equals(other.date)) {
	        return dateCheck(this.date, other.date) ? 1 : -1;
	    }

	    if (!this.time.equals(other.time)) {
	        return timeCheck(this.time, other.time) ? 1 : -1;
	    }

	    return 0;
	}
}

public class ErrorLogs {
	public List<List<String>> extractLogs(List<List<String>> logs) {
		List<List<String>> ans = new ArrayList<>();
		List<ErrorLog> list = new ArrayList<>();
		
		int n = logs.size();
		
		for(int i = 0; i<n; i++) {
			String status = logs.get(i).get(2);
			if(status.equals("ERROR") || status.equals("CRITICAL")) {
				list.add(new ErrorLog(
						logs.get(i).get(0),
						logs.get(i).get(1),
						status,
						logs.get(i).get(3)
				));
			}
		}
		
		list.sort(null);
		
		for(ErrorLog it : list) {
			List<String> log = new ArrayList<>();
			log.add(it.date);
            log.add(it.time);
            log.add(it.status);
            log.add(it.message);
            
            ans.add(log);
		}
		
		return ans;
	}
}
