package algorithms.Regex;/**
 * Created by Ahmed Samir on 5/9/17.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLlinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            Pattern pattern = Pattern.compile("<a href=(.*?)>(.*?)</a");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group(1).replace("\"", "").
                        split("\\s")[0].trim() + "," +
                        matcher.group(2).replaceAll("(<.*?>)", "").
                                replaceAll("</.*?>", "").trim());
            }
        }
    }

}


/**
 * <div class="portal" role="navigation" id='p-navigation'>
 * <h3>Navigation</h3>
 * <div class="body">
 * <ul>
 * <li id="n-mainpage-description"><a href="/wiki/Main_Page" title="Visit the main page [z]" accesskey="z">Main page</a></li>
 * <li id="n-contents"><a href="/wiki/Portal:Contents" title="Guides to browsing Wikipedia">Contents</a></li>
 * <li id="n-featuredcontent"><a href="/wiki/Portal:Featured_content" title="Featured content  the best of Wikipedia">Featured content</a></li>
 * <li id="n-currentevents"><a href="/wiki/Portal:Current_events" title="Find background information on current events">Current events</a></li>
 * <li id="n-randompage"><a href="/wiki/Special:Random" title="Load a random article [x]" accesskey="x">Random article</a></li>
 * <li id="n-sitesupport"><a href="//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&amp;utm_medium=sidebar&amp;utm_campaign=C13_en.wikipedia.org&amp;uselang=en" title="Support us">Donate to Wikipedia</a></li>
 * </ul>
 * </div>
 * </div>
 */