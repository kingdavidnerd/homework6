public class Television {
	// Declare constants
    /**
     * The brand name of the television.
     */
	private final String MANUFACTURER;
	
	/**
     * The screen size of the television.
     */
    private final int SCREEN_SIZE;
    
 // Declare instance variables
    /**
     * The power state of the television. True if the TV is on, false if off.
     */
    private boolean powerOn;
    
    /**
     * The channel the television is set to.
     */
    private int channel;
    
    /**
     * The volume level of the television.
     */
    private int volume;
    
    /**
     * Constructor that initializes the manufacturer and screen size.
     * It also sets default values for powerOn (false), channel (2), and volume (20).
     *
     * @param brand the manufacturer of the TV
     * @param size the size of the TV's screen
     */
    public Television(String brand, int size)
    {
    	this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        this.powerOn = false; // TV is off by default
        this.channel = 2; // Default channel is 2
        this.volume = 20; // Default volume level is 20
    }
    
    /**
     * Returns the current volume of the television.
     * 
     * @return the volume level of the TV
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Returns the current channel of the television.
     * 
     * @return the channel the TV is tuned to
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Returns the manufacturer of the television.
     * 
     * @return the brand name of the TV
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * Returns the screen size of the television.
     * 
     * @return the size of the TV screen
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the TV to the specified channel.
     * 
     * @param station the channel to set the TV to
     */
    public void setChannel(int station) {
        channel = station;
    }

    /**
     * Toggles the power state of the television.
     * If the TV is on, it will turn it off. If the TV is off, it will turn it on.
     */
    public void power() {
        powerOn = !powerOn;  // Toggle the power state
    }

    /**
     * Increases the volume by 1, if it is less than the maximum limit (100).
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * Decreases the volume by 1, if it is greater than the minimum limit (0).
     */
    public void decreaseVolume() {
        volume--;
    }
}