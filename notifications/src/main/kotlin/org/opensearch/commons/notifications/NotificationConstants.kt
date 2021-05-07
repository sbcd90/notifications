package org.opensearch.commons.notifications

/**
 * Class containing Internal constants like JSON tags and defaults.
 */
internal object NotificationConstants {
    internal const val CONFIG_ID_TAG = "config_id"
    internal const val CONFIG_ID_LIST_TAG = "config_id_list"
    internal const val NOTIFICATION_ID_TAG = "notification_id"
    internal const val EMAIL_ACCOUNT_ID_TAG = "email_account_id"
    internal const val REFERENCE_ID_TAG = "reference_id"
    internal const val CHANNEL_ID_LIST_TAG = "channel_id_list"
    internal const val CONFIG_NAME_TAG = "config_name"
    internal const val CONFIG_TYPE_TAG = "config_type"
    internal const val NOTIFICATION_CONFIG_TAG = "notification_config"
    internal const val NOTIFICATION_INFO_TAG = "notification_info"
    internal const val FEATURE_TAG = "feature"
    internal const val THREAD_CONTEXT_TAG = "context"
    internal const val CHANNEL_MESSAGE_TAG = "channel_message"
    internal const val TEXT_DESCRIPTION_TAG = "text_description"
    internal const val HTML_DESCRIPTION_TAG = "html_description"
    internal const val ATTACHMENT_TAG = "attachment"
    internal const val RECIPIENT_TAG = "recipient"
    internal const val RECIPIENT_LIST_TAG = "recipient_list"
    internal const val EMAIL_RECIPIENT_STATUS_TAG = "email_recipient_status"
    internal const val EMAIL_GROUP_ID_LIST_TAG = "email_group_id_list"
    internal const val STATUS_CODE_TAG = "status_code"
    internal const val STATUS_TEXT_TAG = "status_text"
    internal const val STATUS_DETAIL_TAG = "delivery_status"
    internal const val NAME_TAG = "name"
    internal const val DESCRIPTION_TAG = "description"
    internal const val IS_ENABLED_TAG = "is_enabled"
    internal const val FEATURE_LIST_TAG = "feature_list"
    internal const val TITLE_TAG = "title"
    internal const val SEVERITY_TAG = "severity"
    internal const val TAGS_TAG = "tags"
    internal const val URL_TAG = "url"
    internal const val HOST_TAG = "host"
    internal const val PORT_TAG = "port"
    internal const val METHOD_TAG = "method"
    internal const val FROM_ADDRESS_TAG = "from_address"
    internal const val UPDATED_TIME_TAG = "last_updated_time_ms"
    internal const val CREATED_TIME_TAG = "created_time_ms"
    internal const val TENANT_TAG = "tenant"
    internal const val NOTIFICATION_CONFIG_LIST_TAG = "notification_config_list"
    internal const val FEATURE_CONFIG_LIST_TAG = "feature_channel_list"
    internal const val DELETE_RESPONSE_LIST_TAG = "delete_response_list"
    internal const val FROM_INDEX_TAG = "from_index"
    internal const val MAX_ITEMS_TAG = "max_items"
    internal const val SORT_FIELD_TAG = "sort_field"
    internal const val SORT_ORDER_TAG = "sort_order"
    internal const val FILTER_PARAM_LIST_TAG = "filter_param_list"
    internal const val STATUS_LIST_TAG = "status_list"
    internal const val START_INDEX_TAG = "start_index"
    internal const val TOTAL_HITS_TAG = "total_hits"
    internal const val TOTAL_HIT_RELATION_TAG = "total_hit_relation"

    internal const val DEFAULT_MAX_ITEMS = 1000
}
