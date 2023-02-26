package book_objects;

import book.TV;

public class TestTV {
    public static void main(String[] args) {
        // Create a TV
        TV tv1 = new TV();
        // Turn on
        tv1.turnOn();
        // Set channel
        tv1.setChannel(30);
        // Set volume
        tv1.setVolume(3);

        // Create another TV
        TV tv2 = new TV();
        // Turn on
        tv2.turnOn();
        // Increase channel
        tv2.channelUp();
        tv2.channelUp();
        // Increase volume
        tv2.volumeUp();


        // Display state
        System.out.println("tv1's channel is " + tv1.getChannel()
                 + " and volume level is " + tv1.getVolumeLevel());
        System.out.println("tv2's channel is " + tv2.getChannel()
                + " and volume level is " + tv2.getVolumeLevel());
    }
}
