package org.wesley.sms.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Date convert(String source) {
		if(source!=null || !(source.trim().equals(""))) {
			Date date = null;
			try {
				date = sdf.parse(source);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return date;
		}else {
			return null;
		}
	}

}
