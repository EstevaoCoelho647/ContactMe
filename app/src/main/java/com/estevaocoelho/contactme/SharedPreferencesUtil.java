package com.estevaocoelho.contactme;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class SharedPreferencesUtil {
    private static final String CONSTANT_USER_INFO_SHARED_PREFS = "USER_INFO";

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(SharedPreferencesUtil.CONSTANT_USER_INFO_SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public static User getUserInfoFromSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        String userName = sharedPreferences.getString("USER_NAME", "");
        String userImageUrl = sharedPreferences.getString("USER_IMAGE_URL", "");
        return new User(userName, userImageUrl);
    }

    public static void saveUserInfoInSharedPreferences(Context context, Editable userName, Editable userImageURL) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString("USER_NAME", userName.toString());
        editor.putString("USER_IMAGE_URL", userImageURL.toString());
        editor.apply();
    }

    public static boolean hasUserInSharedPreferences(Context context) {
        User user = getUserInfoFromSharedPreferences(context);
        return user.getPhotoURL().equals("") && user.getUserName().equals("");
    }
}
