package builder;

import java.sql.Date;
import java.util.Map;
import transfer.Title;

public class TitlesBuilder {
	//Class attributes
	
	private final Title title = new Title();
	
	/**
	 * Constructor for the transfer object
	 * @param map
	 */
	public TitlesBuilder(Map<String, String> map) {
		this.setEmpNo(map);
		this.setTitle(map);
		this.setFromDate(map);
		this.setToDate(map);
	}
	/**
	 * Setter method for the transfer object
	 * @param map
	 */
	public void setEmpNo(Map<String, String> map){
		title.setEmpNo(Integer.valueOf(map.get(Title.COL_EMP_NO)));
	}
	
	public void setTitle(Map<String, String> map){
		title.setTitle(map.get(Title.COL_TITLE));
	}
	
	public void setFromDate(Map<String, String> map){
		title.setFromDate(Date.valueOf(map.get(Title.COL_FROM_DATE)));
	}
	
	public void setToDate(Map<String, String> map){
		title.setToDate(Date.valueOf(map.get(Title.COL_TO_DATE)));
	}
	/**
	 * Getter method for the transfer object
	 * @return {@link Title} object
	 */
	public Title get() {
		return title;
	}
}
