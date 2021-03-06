package sanchez.app;

/**
 * This type was created in VisualAge.
 */

import java.util.Hashtable;
import java.util.Enumeration;

/**
 * This object provides all the global cache related management.
 *
 * @author Vatsala Syed
 * @version 1.0   28th March 1999.
 * @Modifications: 31/08/99 Quansheng Jia
 * Remove SaApi class reference , keep global cache on Hashtable.
 * weblink
 */

public class ScGlobalCacheManager extends sanchez.base.ScObject {
    /**
     * ScGlobalCacheManager constructor comment.
     */
    private static Hashtable i_hGlobalCache = new Hashtable();

    public ScGlobalCacheManager() {
        super();
    }

    /**
     * This method was created in VisualAge.
     *
     * @return : Array of string representing the keys for the objects
     * in the global cache.
     */
//public static  String[] getKeys() {
    public Enumeration getKeys() {
        return i_hGlobalCache.keys();

    }

    /**
     * This method was created in VisualAge.
     *
     * @param a_sName : Key value of the object to be fetched.
     * @return : Object associated with key name a_sName
     */
    public static Object getObject(String a_sName) {
        return i_hGlobalCache.get(a_sName);

    }

    /**
     * This method was created in VisualAge.
     *
     * @return : All objects associated in the global cache.
     */
    public static Object[] getObjects() {
        return null;
    }

    /**
     * This method was created in VisualAge.
     *
     * @param a_sName : Key value associated with the object to be removed.
     * @return : Object to be removed.
     */
    public static Object removeObject(String a_sName) {
        return i_hGlobalCache.remove(a_sName);

    }

    /**
     * This method was created in VisualAge.
     *
     * @param a_sName   : Key value associated with the object to be stored.
     * @param a_oObject : Object to b estored.
     * @return : Object
     */
    public static Object setObject(String a_sName, Object a_oObject) {
        if (a_sName == null) a_sName = "";
        return i_hGlobalCache.put(a_sName, a_oObject);
    }
}