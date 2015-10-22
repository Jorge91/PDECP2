package miw.upm.es.apaw.ecp2.rest.business.views;

import java.util.ArrayList;
import java.util.List;

public class TransferTheme {

	private List<String> themeList;
	private String theme;
	private List<String> detailedTheme;


	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public TransferTheme() {
		this.themeList = new ArrayList<String>();
	}

	public List<String> getThemeList() {
		return themeList;
	}

	public void setThemeList(List<String> listaTemas) {
		this.themeList = listaTemas;
	}


	public void setDetailedTheme(List<String> detailedTheme) {
		this.detailedTheme = detailedTheme;		
	}

	public List<String> getDetailedTheme() {
		return detailedTheme;
	}
	
	
	
	
}
