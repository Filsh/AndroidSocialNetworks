package com.androidsocialnetworks.lib.listener;

import com.androidsocialnetworks.lib.listener.base.SocialNetworkListener;

/**
 * Created by imaliy on 20.05.14.
 */
public interface OnRequestAccessTokenCompleteListener extends SocialNetworkListener {
    public void onRequestAccessTokenSuccess(int socialNetworkID, String accessToken);
}
