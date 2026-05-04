
package model;

public class Colors {

	private String RED = "\u001B[31m";
    private String RESET = "\u001B[0m";
    private String YELLOW = "\u001B[33m";
    private String WHITE = "\u001B[37m";
    private String GREEN = "\u001B[32m";
    
    public Colors() {
    	
    }
    public Colors(String RED, String RESET, String YELLOW, String WHITE, String GREEN) {
    	this.RED = RED;
    	this.RESET = RESET;
    	this.YELLOW = YELLOW;
    	this.WHITE = WHITE;
    	this.GREEN = GREEN;
    	
    }
    
    public String getRed() { return RED; }
    public String getReset() { return RESET; }
    public String getYellow() { return YELLOW;}
    public String getWhite() { return WHITE;}
    public String getGreen() {return GREEN;}
    	
    
    
}
