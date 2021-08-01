package com.sourav.webcrawler;

public class App {

	public static void main(String[] args) {
		WebCrawler crawler = new WebCrawler();
		String rootUrl = "https://bbc.com";
		crawler.discoverWeb(rootUrl);
	}

}
