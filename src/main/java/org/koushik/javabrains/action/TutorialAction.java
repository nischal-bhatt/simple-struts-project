package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction extends ActionSupport{

	private String bestTutorialSite = null;
	
	 public String execute()
	 {
		 TutorialFinderService svc = new TutorialFinderService();
		 
		 bestTutorialSite = svc.getBestTutorialSite();
		//setBestTutorialSite(svc.getBestTutorialSite());
		 
		 return SUCCESS;
	 }

	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	
	 
	 
}
