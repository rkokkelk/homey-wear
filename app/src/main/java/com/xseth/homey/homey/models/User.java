package com.xseth.homey.homey.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class User {

    // First name of user
    @SerializedName("firstname")
    private String firstname;

    // Last name of user
    @SerializedName("lastname")
    private String lastname;

    // List of Homeys currently in control by user
    @SerializedName("homeys")
    private List<Homey> homeys;

    // List of properties of user, mainly favorites list
    @SerializedName("properties")
    private Map<String, List<String>> properties;

    /**
     * Get First name
     * @return First name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Get Last name
     * @return Last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Get first homey object of user
     * @return Homey object of user by index 0
     */
    public Homey getFirstHomey(){
        return homeys.get(0);
    }

    /**
     * Get a list of favorite devices from User
     * @return list of device ids of favorite devices
     */
    public List<String> getDeviceFavorites() { return this.properties.get("favoriteDevices"); }
}
