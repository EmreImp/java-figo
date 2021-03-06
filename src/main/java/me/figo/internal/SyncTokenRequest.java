package me.figo.internal;

import java.util.List;

import com.google.gson.annotations.Expose;

/**
 * Helper type for the call to /rest/sync
 */
public class SyncTokenRequest {
    
	/**
     * State to return when coming back to the calling application after the synchronization finished
     */
    @Expose
    public String state;

    /**
     * URL to redirect to when the synchronization finished
     */
    @Expose
    public String redirect_uri;
    
    /**
     * Indicates whether notifications should be sent to your application
     */
    @Expose
    public boolean disable_notifications;
    
    /**
     * Sync accounts only which have not been synchronized within the specified number of minutes
     */
    @Expose
    public int if_not_synced_since;
    
    /**
     * Should the sync process continue on errors without asking for response 
     */
    @Expose
    public boolean auto_continue;
    
    /**
     * Tasks to sync
     */
    @Expose
    public List<String> sync_tasks;
    
    /**
     * Accounts to sync
     */
    @Expose
    public List<String> account_ids;

    /**
     * optional flag to save pin for auto sync
     */
    @Expose
    public boolean save_pin;
    
    
    /**
     * 
     * @param state
     * @param redirect_uri
     */
    public SyncTokenRequest(String state, String redirect_uri) {
        this.state = state;
        this.redirect_uri = redirect_uri;
    }
    
    /**
     * 
     * @param state
     * @param redirect_uri
     * @param sync_tasks
     */
    public SyncTokenRequest(String state, String redirect_uri, List<String> sync_tasks) {
        this.state = state;
        this.redirect_uri = redirect_uri;
        this.sync_tasks = sync_tasks;
    }
    
    /**
     * 
     * @param state
     * @param redirect_uri
     * @param sync_tasks
     * @param account_ids
     */
    public SyncTokenRequest(String state, String redirect_uri, List<String> sync_tasks, List<String> account_ids) {
        this.state = state;
        this.redirect_uri = redirect_uri;
        this.sync_tasks = sync_tasks;
        this.account_ids = account_ids;
    }

    /**
     * 
     * @param state
     * @param redirect_uri
     * @param sync_tasks
     * @param account_ids
     * @param disable_notifications
     * @param if_not_synced_since
     * @param auto_continue
     */
	public SyncTokenRequest(String state, String redirect_uri,
			List<String> sync_tasks, List<String> account_ids, 
			boolean disable_notifications,  int if_not_synced_since, 
			boolean auto_continue) {
		this.state = state;
		this.redirect_uri = redirect_uri;
		this.disable_notifications = disable_notifications;
		this.if_not_synced_since = if_not_synced_since;
		this.auto_continue = auto_continue;
		this.sync_tasks = sync_tasks;
		this.account_ids = account_ids;
	}

    public SyncTokenRequest(String state, String redirect_uri, List<String> sync_tasks,
                            List<String> account_ids, boolean disable_notifications,
                            int if_not_synced_since, boolean auto_continue, boolean save_pin) {
        this.state = state;
        this.redirect_uri = redirect_uri;
        this.disable_notifications = disable_notifications;
        this.if_not_synced_since = if_not_synced_since;
        this.auto_continue = auto_continue;
        this.sync_tasks = sync_tasks;
        this.account_ids = account_ids;
        this.save_pin = save_pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRedirectUri() {
        return redirect_uri;
    }

    public void setRedirectUri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public boolean isDisableNotifications() {
        return disable_notifications;
    }

    public void setDisableNotifications(boolean disable_notifications) {
        this.disable_notifications = disable_notifications;
    }

    public int getIfNotSyncedSince() {
        return if_not_synced_since;
    }

    public void setIfNotSyncedSince(int if_not_synced_since) {
        this.if_not_synced_since = if_not_synced_since;
    }

    public boolean isAutoContinue() {
        return auto_continue;
    }

    public void setAutoContinue(boolean auto_continue) {
        this.auto_continue = auto_continue;
    }

    public List<String> getSyncTasks() {
        return sync_tasks;
    }

    public void setSyncTasks(List<String> sync_tasks) {
        this.sync_tasks = sync_tasks;
    }

    public List<String> getAccountIds() {
        return account_ids;
    }

    public void setAccountIds(List<String> account_ids) {
        this.account_ids = account_ids;
    }

    public boolean isSavePin() {
        return save_pin;
    }

    public void setSavePin(boolean save_pin) {
        this.save_pin = save_pin;
    }
}
