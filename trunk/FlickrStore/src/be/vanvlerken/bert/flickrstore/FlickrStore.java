/**
 * @author wItspirit
 * 8-okt-2005
 * FlickrStore.java
 */

package be.vanvlerken.bert.flickrstore;

import be.vanvlerken.bert.flickrstore.gui.GUI;

/**
 * This is the main entry point of the program.
 */
public class FlickrStore implements Runnable
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        FlickrStore flickrStore = new FlickrStore();
        flickrStore.run();
    }

    public void run()
    {
        // FlickrFactory flickrFactory = FlickrFactory.getInstance();
        // TextUI textUi = new TextUI(flickrFactory);
        // textUi.run();
        GUI graphUi = new GUI();
        graphUi.run();
    }

}
