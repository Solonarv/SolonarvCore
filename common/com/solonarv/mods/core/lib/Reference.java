package com.solonarv.mods.core.lib;


/**
 * GolemWorld
 * 
 * <br>
 * Reference
 * 
 * Holds a few constants used throughout my mod, so I don't need to go through
 * all of my code when something here changes. Also, in the case of numbers, it
 * makes it easier to see what these numbers actually mean; e.g. why is there a
 * random "-256" in {@link ItemGolemWorldUniversal}'s constructor?
 * 
 * @author solonarv
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Reference {
    public final static String MOD_NAME     = "Solonarv Core";
    public final static String MOD_ID       = "solonarvcore";
    public final static String CHANNEL_NAME = MOD_ID;
    public final static String VERSION      = "@VERSION@";
    public final static int    MAX_TPS      = 20;
    public final static int    ITEMID_SHIFT = 256;
    
    public final static String CLIENT_PROXY = "com.solonarv.mods.core.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.solonarv.mods.core.proxy.ServerProxy";
}
