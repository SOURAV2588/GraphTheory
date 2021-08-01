package com.sourav.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	
	Queue<String> queue;
	private List<String> discoveredWebsites;
	private static Pattern pattern;
	
	static {
		pattern = getPattern();
	}
	
	public WebCrawler() {
		this.queue = new LinkedList<String>();
		this.discoveredWebsites = new ArrayList<String>();
	}
	
	public void discoverWeb(String root) {
		
		this.queue.add(root);
		this.discoveredWebsites.add(root);
		
		while(!queue.isEmpty()) {
			String v = this.queue.remove();
			String rawHtml = readURL(v);
			Matcher matcher = pattern.matcher(rawHtml);
			while(matcher.find()) {
				String actualUrl = matcher.group();
				if(!discoveredWebsites.contains(actualUrl)) {
					discoveredWebsites.add(actualUrl);
					System.out.println("Website has been found : "+ actualUrl);
				}
			}
		}
	}

	private String readURL(String v) {
		System.out.println("Base URL : "+v);
		StringBuilder rawHtml = new StringBuilder();
		
		try {
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine = "";
			
			while( (inputLine = in.readLine()) != null) {
				rawHtml.append(inputLine);
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rawHtml.toString();
	}
	
	private static Pattern getPattern() {
		String regexp = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
		return Pattern.compile(regexp);
	}
	
}
