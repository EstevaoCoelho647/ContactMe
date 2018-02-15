package com.estevaocoelho.contactme;

/**
 * Created by estevaocoelho on 15/02/18.
 */

enum SocialMediaType {
    FACEBOOK(R.drawable.ic_facebook),
    TWITTER(R.drawable.ic_twitter),
    LINKEDIN(R.drawable.ic_linkedin),
    TUMBLR(R.drawable.ic_tumblr),
    INSTAGRAM(R.drawable.ic_instagram);

    private int icon;

    SocialMediaType(int icon) {
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }
}
