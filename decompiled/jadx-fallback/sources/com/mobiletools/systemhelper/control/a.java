package com.mobiletools.systemhelper.control;

/* JADX INFO: loaded from: classes.dex */
public class a extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.CallDisconnectCauseListener, android.telephony.TelephonyCallback.PreciseDataConnectionStateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.String f1410b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.String f1411c = "";
    private static final java.util.Map<java.lang.Integer, java.lang.String> d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c.d.a.b.n f1412a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.mobiletools.systemhelper.control.a.d = r0
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NONE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OPERATOR_BARRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NAS_SIGNALLING"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LLC_SNDCP"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INSUFFICIENT_RESOURCES"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MISSING_UNKNOWN_APN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNKNOWN_PDP_ADDRESS_TYPE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "USER_AUTHENTICATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACTIVATION_REJECT_GGSN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACTIVATION_REJECT_UNSPECIFIED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SERVICE_OPTION_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 33
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SERVICE_OPTION_NOT_SUBSCRIBED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SERVICE_OPTION_OUT_OF_ORDER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NSAPI_IN_USE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 36
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "REGULAR_DEACTIVATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 37
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "QOS_NOT_ACCEPTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 38
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NETWORK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UMTS_REACTIVATION_REQ"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FEATURE_NOT_SUPP"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "TFT_SEMANTIC_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 42
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "TFT_SYTAX_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 43
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNKNOWN_PDP_CONTEXT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FILTER_SEMANTIC_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 45
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FILTER_SYTAX_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_WITHOUT_ACTIVE_TFT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACTIVATION_REJECTED_BCM_VIOLATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ONLY_IPV4_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ONLY_IPV6_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ONLY_SINGLE_BEARER_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 53
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_INFO_NOT_RECEIVED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 54
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_CONN_DOES_NOT_EXIST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 55
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 56
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "COLLISION_WITH_NETWORK_INITIATED_REQUEST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 57
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ONLY_IPV4V6_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 58
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ONLY_NON_IP_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 59
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNSUPPORTED_QCI_VALUE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "BEARER_HANDLING_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACTIVE_PDP_CONTEXT_MAX_NUMBER_REACHED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNSUPPORTED_APN_IN_CURRENT_PLMN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 81
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_TRANSACTION_ID"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 95
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MESSAGE_INCORRECT_SEMANTIC"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 96
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_MANDATORY_INFO"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 97
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MESSAGE_TYPE_UNSUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 98
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MSG_TYPE_NONCOMPATIBLE_STATE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 99
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNKNOWN_INFO_ELEMENT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONDITIONAL_IE_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 101(0x65, float:1.42E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PROTOCOL_ERRORS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_TYPE_CONFLICT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 113(0x71, float:1.58E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_PCSCF_ADDR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 114(0x72, float:1.6E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 115(0x73, float:1.61E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_ACCESS_BARRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 116(0x74, float:1.63E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMERGENCY_IFACE_ONLY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 117(0x75, float:1.64E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IFACE_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 118(0x76, float:1.65E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "COMPANION_IFACE_IN_USE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 119(0x77, float:1.67E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IP_ADDRESS_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 120(0x78, float:1.68E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IFACE_AND_POL_FAMILY_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 121(0x79, float:1.7E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_ACCESS_BARRED_INFINITE_RETRY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 122(0x7a, float:1.71E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "AUTH_FAILURE_ON_EMERGENCY_CALL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_DNS_ADDR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 124(0x7c, float:1.74E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_PCSCF_OR_DNS_ADDRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CALL_PREEMPT_BY_EMERGENCY_APN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 128(0x80, float:1.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UE_INITIATED_DETACH_OR_DISCONNECT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_REASON_UNSPECIFIED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2001(0x7d1, float:2.804E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_ADMIN_PROHIBITED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2002(0x7d2, float:2.805E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_INSUFFICIENT_RESOURCES"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2003(0x7d3, float:2.807E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2004(0x7d4, float:2.808E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2005(0x7d5, float:2.81E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_REQUESTED_LIFETIME_TOO_LONG"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2006(0x7d6, float:2.811E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MALFORMED_REQUEST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2007(0x7d7, float:2.812E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MALFORMED_REPLY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2008(0x7d8, float:2.814E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_ENCAPSULATION_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2009(0x7d9, float:2.815E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2010(0x7da, float:2.817E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_REVERSE_TUNNEL_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2011(0x7db, float:2.818E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_REVERSE_TUNNEL_IS_MANDATORY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2012(0x7dc, float:2.82E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2013(0x7dd, float:2.821E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MISSING_NAI"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2014(0x7de, float:2.822E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MISSING_HOME_AGENT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2015(0x7df, float:2.824E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MISSING_HOME_ADDRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2016(0x7e0, float:2.825E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_UNKNOWN_CHALLENGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2017(0x7e1, float:2.826E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_MISSING_CHALLENGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2018(0x7e2, float:2.828E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_FA_STALE_CHALLENGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2019(0x7e3, float:2.829E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_REASON_UNSPECIFIED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2020(0x7e4, float:2.83E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_ADMIN_PROHIBITED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2021(0x7e5, float:2.832E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_INSUFFICIENT_RESOURCES"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2022(0x7e6, float:2.833E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2024(0x7e8, float:2.836E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_REGISTRATION_ID_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2025(0x7e9, float:2.838E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_MALFORMED_REQUEST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2026(0x7ea, float:2.839E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2027(0x7eb, float:2.84E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_REVERSE_TUNNEL_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2028(0x7ec, float:2.842E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_REVERSE_TUNNEL_IS_MANDATORY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2029(0x7ed, float:2.843E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_HA_ENCAPSULATION_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2030(0x7ee, float:2.845E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CLOSE_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2031(0x7ef, float:2.846E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NETWORK_INITIATED_TERMINATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2032(0x7f0, float:2.847E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MODEM_APP_PREEMPTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2033(0x7f1, float:2.849E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_IPV4_CALL_DISALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2034(0x7f2, float:2.85E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_IPV4_CALL_THROTTLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2035(0x7f3, float:2.852E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_IPV6_CALL_DISALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2036(0x7f4, float:2.853E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_IPV6_CALL_THROTTLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2037(0x7f5, float:2.854E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MODEM_RESTART"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2038(0x7f6, float:2.856E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_PPP_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2039(0x7f7, float:2.857E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNPREFERRED_RAT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2040(0x7f8, float:2.859E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PHYSICAL_LINK_CLOSE_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2041(0x7f9, float:2.86E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_PENDING_HANDOVER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2042(0x7fa, float:2.861E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PROFILE_BEARER_INCOMPATIBLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2043(0x7fb, float:2.863E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SIM_CARD_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2044(0x7fc, float:2.864E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LOW_POWER_MODE_OR_POWERING_DOWN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2045(0x7fd, float:2.866E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_DISABLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2046(0x7fe, float:2.867E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAX_PPP_INACTIVITY_TIMER_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2047(0x7ff, float:2.868E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IPV6_ADDRESS_TRANSFER_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "TRAT_SWAP_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2049(0x801, float:2.871E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EHRPD_TO_HRPD_FALLBACK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2050(0x802, float:2.873E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MIP_CONFIG_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2051(0x803, float:2.874E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_INACTIVITY_TIMER_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2052(0x804, float:2.875E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAX_IPV4_CONNECTIONS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2053(0x805, float:2.877E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAX_IPV6_CONNECTIONS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2054(0x806, float:2.878E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2055(0x807, float:2.88E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IP_VERSION_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2056(0x808, float:2.881E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DUN_CALL_DISALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2057(0x809, float:2.882E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INTERNAL_EPC_NONEPC_TRANSITION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2058(0x80a, float:2.884E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INTERFACE_IN_USE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2059(0x80b, float:2.885E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_DISALLOWED_ON_ROAMING"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2060(0x80c, float:2.887E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "APN_PARAMETERS_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2061(0x80d, float:2.888E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NULL_APN_DISALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2062(0x80e, float:2.89E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "THERMAL_MITIGATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2063(0x80f, float:2.891E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DATA_SETTINGS_DISABLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2064(0x810, float:2.892E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DATA_ROAMING_SETTINGS_DISABLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2065(0x811, float:2.894E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DDS_SWITCHED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2066(0x812, float:2.895E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FORBIDDEN_APN_NAME"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2067(0x813, float:2.896E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DDS_SWITCH_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2068(0x814, float:2.898E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CALL_DISALLOWED_IN_ROAMING"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2069(0x815, float:2.899E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NON_IP_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2070(0x816, float:2.9E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_NON_IP_CALL_THROTTLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2071(0x817, float:2.902E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDN_NON_IP_CALL_DISALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2072(0x818, float:2.903E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_LOCK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2073(0x819, float:2.905E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_INTERCEPT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2074(0x81a, float:2.906E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_REORDER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2075(0x81b, float:2.908E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_RELEASE_DUE_TO_SO_REJECTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2076(0x81c, float:2.909E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_INCOMING_CALL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2077(0x81d, float:2.91E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_ALERT_STOP"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2078(0x81e, float:2.912E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CHANNEL_ACQUISITION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2079(0x81f, float:2.913E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAX_ACCESS_PROBE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2080(0x820, float:2.915E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2081(0x821, float:2.916E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_RESPONSE_FROM_BASE_STATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2082(0x822, float:2.918E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "REJECTED_BY_BASE_STATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2083(0x823, float:2.919E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONCURRENT_SERVICES_INCOMPATIBLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2084(0x824, float:2.92E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_CDMA_SERVICE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2085(0x825, float:2.922E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RUIM_NOT_PRESENT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2086(0x826, float:2.923E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CDMA_RETRY_ORDER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2087(0x827, float:2.925E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACCESS_BLOCK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2088(0x828, float:2.926E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACCESS_BLOCK_ALL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2089(0x829, float:2.927E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IS707B_MAX_ACCESS_PROBES"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2090(0x82a, float:2.929E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "THERMAL_EMERGENCY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2091(0x82b, float:2.93E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONCURRENT_SERVICES_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2092(0x82c, float:2.932E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INCOMING_CALL_REJECTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2093(0x82d, float:2.933E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_SERVICE_ON_GATEWAY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2094(0x82e, float:2.934E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_GPRS_CONTEXT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2095(0x82f, float:2.936E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ILLEGAL_MS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2096(0x830, float:2.937E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ILLEGAL_ME"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2097(0x831, float:2.939E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2098(0x832, float:2.94E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "GPRS_SERVICES_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2099(0x833, float:2.941E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2100(0x834, float:2.943E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IMPLICITLY_DETACHED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2101(0x835, float:2.944E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PLMN_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2102(0x836, float:2.946E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LOCATION_AREA_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2103(0x837, float:2.947E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2104(0x838, float:2.948E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_DUPLICATE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2105(0x839, float:2.95E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UE_RAT_CHANGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2106(0x83a, float:2.951E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONGESTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2107(0x83b, float:2.953E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_PDP_CONTEXT_ACTIVATED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2108(0x83c, float:2.954E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACCESS_CLASS_DSAC_REJECTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2109(0x83d, float:2.955E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_ACTIVATE_MAX_RETRY_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2110(0x83e, float:2.957E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RADIO_ACCESS_BEARER_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2111(0x83f, float:2.958E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_UNKNOWN_EPS_BEARER_CONTEXT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2112(0x840, float:2.96E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DRB_RELEASED_BY_RRC"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2113(0x841, float:2.961E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CONNECTION_RELEASED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2114(0x842, float:2.962E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_DETACHED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2115(0x843, float:2.964E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_ATTACH_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2116(0x844, float:2.965E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_ATTACH_STARTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2117(0x845, float:2.967E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LTE_NAS_SERVICE_REQUEST_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2118(0x846, float:2.968E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DUPLICATE_BEARER_ID"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2119(0x847, float:2.97E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_COLLISION_SCENARIOS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2120(0x848, float:2.971E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2121(0x849, float:2.972E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2122(0x84a, float:2.974E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_BAD_OTA_MESSAGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2123(0x84b, float:2.975E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2124(0x84c, float:2.976E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2125(0x84d, float:2.978E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DS_EXPLICIT_DEACTIVATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2126(0x84e, float:2.979E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_LOCAL_CAUSE_NONE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2127(0x84f, float:2.98E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LTE_THROTTLING_NOT_REQUIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2128(0x850, float:2.982E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACCESS_CONTROL_LIST_CHECK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2129(0x851, float:2.983E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SERVICE_NOT_ALLOWED_ON_PLMN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2130(0x852, float:2.985E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_T3417_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2131(0x853, float:2.986E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMM_T3417_EXT_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2132(0x854, float:2.988E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_UPLINK_DATA_TRANSMISSION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2133(0x855, float:2.989E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2134(0x856, float:2.99E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_UPLINK_CONNECTION_RELEASE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2135(0x857, float:2.992E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_UPLINK_RADIO_LINK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2136(0x858, float:2.993E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_UPLINK_ERROR_REQUEST_FROM_NAS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2137(0x859, float:2.995E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ACCESS_STRATUM_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2138(0x85a, float:2.996E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2139(0x85b, float:2.997E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ACCESS_BARRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2140(0x85c, float:2.999E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_CELL_RESELECTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2141(0x85d, float:3.0E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_CONFIG_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2142(0x85e, float:3.002E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_TIMER_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2143(0x85f, float:3.003E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_LINK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2144(0x860, float:3.004E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_CELL_NOT_CAMPED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2145(0x861, float:3.006E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2146(0x862, float:3.007E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_REJECT_BY_NETWORK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2147(0x863, float:3.009E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_NORMAL_RELEASE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2148(0x864, float:3.01E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_RADIO_LINK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2149(0x865, float:3.011E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_REESTABLISHMENT_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2150(0x866, float:3.013E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2151(0x867, float:3.014E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ABORT_REQUEST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2152(0x868, float:3.016E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2153(0x869, float:3.017E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2154(0x86a, float:3.018E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2155(0x86b, float:3.02E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_PROCEDURE_TIME_OUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2156(0x86c, float:3.021E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_CONNECTION_ID"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2157(0x86d, float:3.023E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAXIMIUM_NSAPIS_EXCEEDED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2158(0x86e, float:3.024E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_PRIMARY_NSAPI"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2159(0x86f, float:3.025E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CANNOT_ENCODE_OTA_MESSAGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2160(0x870, float:3.027E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RADIO_ACCESS_BEARER_SETUP_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2161(0x871, float:3.028E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_ESTABLISH_TIMEOUT_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2162(0x872, float:3.03E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_MODIFY_TIMEOUT_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2163(0x873, float:3.031E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_INACTIVE_TIMEOUT_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2164(0x874, float:3.032E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_LOWERLAYER_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2165(0x875, float:3.034E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PDP_MODIFY_COLLISION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2166(0x876, float:3.035E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2167(0x877, float:3.037E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NAS_REQUEST_REJECTED_BY_NETWORK"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2168(0x878, float:3.038E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_INVALID_REQUEST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2169(0x879, float:3.04E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_TRACKING_AREA_ID_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2170(0x87a, float:3.041E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_RF_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2171(0x87b, float:3.042E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2172(0x87c, float:3.044E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2173(0x87d, float:3.045E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ABORTED_AFTER_HANDOVER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2174(0x87e, float:3.046E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2175(0x87f, float:3.048E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2176(0x880, float:3.049E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2177(0x881, float:3.05E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IMEI_NOT_ACCEPTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2178(0x882, float:3.052E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2179(0x883, float:3.053E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EPS_SERVICES_NOT_ALLOWED_IN_PLMN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2180(0x884, float:3.055E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MSC_TEMPORARILY_NOT_REACHABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2181(0x885, float:3.056E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CS_DOMAIN_NOT_AVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2182(0x886, float:3.058E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ESM_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2183(0x887, float:3.059E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MAC_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2184(0x888, float:3.06E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SYNCHRONIZATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2185(0x889, float:3.062E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UE_SECURITY_CAPABILITIES_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2186(0x88a, float:3.063E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SECURITY_MODE_REJECTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2187(0x88b, float:3.065E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNACCEPTABLE_NON_EPS_AUTHENTICATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2188(0x88c, float:3.066E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2189(0x88d, float:3.067E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_EPS_BEARER_CONTEXT_ACTIVATED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2190(0x88e, float:3.069E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_EMM_STATE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2191(0x88f, float:3.07E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NAS_LAYER_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2192(0x890, float:3.072E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MULTIPLE_PDP_CALL_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2193(0x891, float:3.073E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMBMS_NOT_ENABLED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2194(0x892, float:3.074E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IRAT_HANDOVER_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2195(0x893, float:3.076E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMBMS_REGULAR_DEACTIVATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2196(0x894, float:3.077E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "TEST_LOOPBACK_REGULAR_DEACTIVATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2197(0x895, float:3.079E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LOWER_LAYER_REGISTRATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2198(0x896, float:3.08E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DATA_PLAN_EXPIRED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2199(0x897, float:3.081E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UMTS_HANDOVER_TO_IWLAN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2200(0x898, float:3.083E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2201(0x899, float:3.084E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2202(0x89a, float:3.086E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_HDR_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2203(0x89b, float:3.087E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_HDR_EXITED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2204(0x89c, float:3.088E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_HDR_NO_SESSION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2205(0x89d, float:3.09E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2206(0x89e, float:3.091E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EVDO_HDR_CONNECTION_SETUP_TIMEOUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2207(0x89f, float:3.093E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FAILED_TO_ACQUIRE_COLOCATED_HDR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2208(0x8a0, float:3.094E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OTASP_COMMIT_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2209(0x8a1, float:3.095E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_HYBRID_HDR_SERVICE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2210(0x8a2, float:3.097E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "HDR_NO_LOCK_GRANTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2211(0x8a3, float:3.098E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DBM_OR_SMS_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2212(0x8a4, float:3.1E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "HDR_FADE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "HDR_ACCESS_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2214(0x8a6, float:3.102E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNSUPPORTED_1X_PREV"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2215(0x8a7, float:3.104E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LOCAL_END"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2216(0x8a8, float:3.105E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_SERVICE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2217(0x8a9, float:3.107E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "FADE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2218(0x8aa, float:3.108E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NORMAL_RELEASE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2219(0x8ab, float:3.11E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ACCESS_ATTEMPT_ALREADY_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2220(0x8ac, float:3.111E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "REDIRECTION_OR_HANDOFF_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2221(0x8ad, float:3.112E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "EMERGENCY_MODE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2222(0x8ae, float:3.114E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PHONE_IN_USE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2223(0x8af, float:3.115E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_MODE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2224(0x8b0, float:3.116E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "INVALID_SIM_STATE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2225(0x8b1, float:3.118E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_COLLOCATED_HDR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2226(0x8b2, float:3.119E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UE_IS_ENTERING_POWERSAVE_MODE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2227(0x8b3, float:3.12E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DUAL_SWITCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2228(0x8b4, float:3.122E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_TIMEOUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2229(0x8b5, float:3.123E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_AUTH_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2230(0x8b6, float:3.125E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_OPTION_MISMATCH"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2231(0x8b7, float:3.126E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_PAP_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2232(0x8b8, float:3.128E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_CHAP_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2233(0x8b9, float:3.129E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PPP_CLOSE_IN_PROGRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2234(0x8ba, float:3.13E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LIMITED_TO_IPV4"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2235(0x8bb, float:3.132E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LIMITED_TO_IPV6"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2236(0x8bc, float:3.133E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_TIMEOUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2237(0x8bd, float:3.135E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_GEN_ERROR"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2238(0x8be, float:3.136E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_APN_UNATHORIZED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            java.lang.String r2 = "VSNCP_APN_UNAUTHORIZED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2239(0x8bf, float:3.138E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_PDN_LIMIT_EXCEEDED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2240(0x8c0, float:3.139E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_NO_PDN_GATEWAY_ADDRESS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2241(0x8c1, float:3.14E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_PDN_GATEWAY_UNREACHABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2242(0x8c2, float:3.142E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_PDN_GATEWAY_REJECT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2243(0x8c3, float:3.143E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_INSUFFICIENT_PARAMETERS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2244(0x8c4, float:3.145E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_RESOURCE_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2245(0x8c5, float:3.146E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_ADMINISTRATIVELY_PROHIBITED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2246(0x8c6, float:3.147E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_PDN_ID_IN_USE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2247(0x8c7, float:3.149E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_SUBSCRIBER_LIMITATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2248(0x8c8, float:3.15E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_PDN_EXISTS_FOR_THIS_APN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2249(0x8c9, float:3.152E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "VSNCP_RECONNECT_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2250(0x8ca, float:3.153E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IPV6_PREFIX_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2251(0x8cb, float:3.154E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "HANDOFF_PREFERENCE_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2252(0x8cc, float:3.156E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SLICE_REJECTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2253(0x8cd, float:3.157E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MATCH_ALL_RULE_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 2254(0x8ce, float:3.159E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ALL_MATCHING_RULES_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_PDN_CONNECTION_REJECTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8193(0x2001, float:1.1481E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_MAX_CONNECTION_REACHED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8241(0x2031, float:1.1548E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_SEMANTIC_ERROR_IN_THE_TFT_OPERATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8242(0x2032, float:1.155E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_SYNTACTICAL_ERROR_IN_THE_TFT_OPERATION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8244(0x2034, float:1.1552E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_SEMANTIC_ERRORS_IN_PACKET_FILTERS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 8245(0x2035, float:1.1554E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_SYNTACTICAL_ERRORS_IN_PACKET_FILTERS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 9000(0x2328, float:1.2612E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_NON_3GPP_ACCESS_TO_EPC_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 9001(0x2329, float:1.2613E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_USER_UNKNOWN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 9002(0x232a, float:1.2614E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_NO_APN_SUBSCRIPTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 9003(0x232b, float:1.2616E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_AUTHORIZATION_REJECTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 9006(0x232e, float:1.262E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_ILLEGAL_ME"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 10500(0x2904, float:1.4714E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_NETWORK_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 11001(0x2af9, float:1.5416E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_RAT_TYPE_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 11005(0x2afd, float:1.5421E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_IMEI_NOT_ACCEPTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 11011(0x2b03, float:1.543E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_PLMN_NOT_ALLOWED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 11055(0x2b2f, float:1.5491E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_UNAUTHENTICATED_EMERGENCY_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_IKEV2_CONFIG_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16385(0x4001, float:2.296E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_IKEV2_AUTH_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16386(0x4002, float:2.2962E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_IKEV2_MSG_TIMEOUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16387(0x4003, float:2.2963E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_IKEV2_CERT_INVALID"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16388(0x4004, float:2.2964E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_DNS_RESOLUTION_NAME_FAILURE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 16389(0x4005, float:2.2966E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "IWLAN_DNS_RESOLUTION_TIMEOUT"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4097(0x1001, float:5.741E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_1"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4098(0x1002, float:5.743E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_2"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4099(0x1003, float:5.744E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_3"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4100(0x1004, float:5.745E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_4"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4101(0x1005, float:5.747E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_5"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4102(0x1006, float:5.748E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_6"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4103(0x1007, float:5.75E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_7"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4104(0x1008, float:5.751E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_8"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4105(0x1009, float:5.752E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_9"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4106(0x100a, float:5.754E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_10"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4107(0x100b, float:5.755E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_11"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4108(0x100c, float:5.757E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_12"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4109(0x100d, float:5.758E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_13"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4110(0x100e, float:5.76E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_14"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 4111(0x100f, float:5.761E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "OEM_DCFAILCAUSE_15"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "REGISTRATION_FAIL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "GPRS_REGISTRATION_FAIL"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SIGNAL_LOST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PREF_RADIO_TECH_CHANGED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RADIO_POWER_OFF"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = -6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "TETHERED_CALL_ACTIVE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65535(0xffff, float:9.1834E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ERROR_UNSPECIFIED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65536(0x10000, float:9.1835E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNKNOWN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65537(0x10001, float:9.1837E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RADIO_NOT_AVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65538(0x10002, float:9.1838E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "UNACCEPTABLE_NETWORK_PARAMETER"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65540(0x10004, float:9.1841E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "LOST_CONNECTION"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65542(0x10006, float:9.1844E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "HANDOVER_FAILED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65543(0x10007, float:9.1845E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DUPLICATE_CID"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65544(0x10008, float:9.1847E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_DEFAULT_DATA"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65545(0x10009, float:9.1848E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SERVICE_TEMPORARILY_UNAVAILABLE"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65546(0x1000a, float:9.185E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "REQUEST_NOT_SUPPORTED"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.mobiletools.systemhelper.control.a.d
            r1 = 65547(0x1000b, float:9.1851E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "NO_RETRY_FAILURE"
            r0.put(r1, r2)
            return
    }

    public a(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            c.d.a.b.n r1 = new c.d.a.b.n
            r1.<init>()
            r0.f1412a = r1
            java.lang.String r0 = r1.y
            com.mobiletools.systemhelper.control.a.f1410b = r0
            java.lang.String r0 = r1.z
            com.mobiletools.systemhelper.control.a.f1411c = r0
            return
    }

    private java.lang.String a(int r2) {
            r1 = this;
            switch(r2) {
                case 0: goto L102;
                case 1: goto Lff;
                case 2: goto Lfc;
                case 3: goto Lf9;
                case 4: goto Lf6;
                case 5: goto Lf3;
                case 6: goto L3;
                case 7: goto Lf0;
                case 8: goto Led;
                case 9: goto Lea;
                case 10: goto Le7;
                case 11: goto Le4;
                case 12: goto Le1;
                case 13: goto Lde;
                case 14: goto Ldb;
                case 15: goto Ld8;
                case 16: goto Ld5;
                case 17: goto Ld2;
                case 18: goto Lcf;
                case 19: goto Lcc;
                case 20: goto Lc9;
                case 21: goto Lc6;
                case 22: goto Lc3;
                case 23: goto Lc0;
                case 24: goto Lbd;
                case 25: goto Lba;
                case 26: goto Lb7;
                case 27: goto Lb4;
                case 28: goto Lb1;
                case 29: goto Lae;
                case 30: goto Lab;
                case 31: goto La8;
                case 32: goto La5;
                case 33: goto La2;
                case 34: goto L9f;
                case 35: goto L9c;
                case 36: goto L99;
                case 37: goto L96;
                case 38: goto L93;
                case 39: goto L90;
                case 40: goto L8d;
                case 41: goto L8a;
                case 42: goto L87;
                case 43: goto L84;
                case 44: goto L81;
                case 45: goto L7e;
                case 46: goto L7b;
                case 47: goto L78;
                case 48: goto L75;
                case 49: goto L72;
                case 50: goto L6f;
                case 51: goto L6c;
                case 52: goto L69;
                case 53: goto L66;
                case 54: goto L63;
                case 55: goto L60;
                case 56: goto L3;
                case 57: goto L5d;
                case 58: goto L5a;
                case 59: goto L57;
                case 60: goto L54;
                case 61: goto L51;
                case 62: goto L4e;
                case 63: goto L4b;
                case 64: goto L48;
                case 65: goto L45;
                case 66: goto L42;
                case 67: goto L3f;
                case 68: goto L3c;
                case 69: goto L39;
                case 70: goto L36;
                case 71: goto L33;
                case 72: goto L30;
                case 73: goto L2d;
                case 74: goto L2a;
                case 75: goto L27;
                case 76: goto L24;
                case 77: goto L21;
                case 78: goto L1e;
                case 79: goto L1b;
                case 80: goto L18;
                case 81: goto L15;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "INVALID: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L15:
            java.lang.String r1 = "INCOMING_AUTO_REJECTED"
            return r1
        L18:
            java.lang.String r1 = "OUTGOING_EMERGENCY_CALL_PLACED"
            return r1
        L1b:
            java.lang.String r1 = "WFC_SERVICE_NOT_AVAILABLE_IN_THIS_LOCATION"
            return r1
        L1e:
            java.lang.String r1 = "EMERGENCY_CALL_OVER_WFC_NOT_AVAILABLE"
            return r1
        L21:
            java.lang.String r1 = "MEDIA_TIMEOUT"
            return r1
        L24:
            java.lang.String r1 = "OTASP_PROVISIONING_IN_PROCESS"
            return r1
        L27:
            java.lang.String r1 = "TOO_MANY_ONGOING_CALLS"
            return r1
        L2a:
            java.lang.String r1 = "CALLING_DISABLED"
            return r1
        L2d:
            java.lang.String r1 = "CANT_CALL_WHILE_RINGING"
            return r1
        L30:
            java.lang.String r1 = "ALREADY_DIALING"
            return r1
        L33:
            java.lang.String r1 = "IMS_SIP_ALTERNATE_EMERGENCY_CALL"
            return r1
        L36:
            java.lang.String r1 = "DIAL_VIDEO_MODIFIED_TO_DIAL_VIDEO"
            return r1
        L39:
            java.lang.String r1 = "DIAL_VIDEO_MODIFIED_TO_DIAL"
            return r1
        L3c:
            java.lang.String r1 = "DIAL_VIDEO_MODIFIED_TO_USSD"
            return r1
        L3f:
            java.lang.String r1 = "DIAL_VIDEO_MODIFIED_TO_SS"
            return r1
        L42:
            java.lang.String r1 = "DIAL_MODIFIED_TO_DIAL_VIDEO"
            return r1
        L45:
            java.lang.String r1 = "NORMAL_UNSPECIFIED"
            return r1
        L48:
            java.lang.String r1 = "EMERGENCY_PERM_FAILURE"
            return r1
        L4b:
            java.lang.String r1 = "EMERGENCY_TEMP_FAILURE"
            return r1
        L4e:
            java.lang.String r1 = "DIAL_LOW_BATTERY"
            return r1
        L51:
            java.lang.String r1 = "LOW_BATTERY"
            return r1
        L54:
            java.lang.String r1 = "IMS_ACCESS_BLOCKED"
            return r1
        L57:
            java.lang.String r1 = "WIFI_LOST"
            return r1
        L5a:
            java.lang.String r1 = "IMEI_NOT_ACCEPTED"
            return r1
        L5d:
            java.lang.String r1 = "DIALED_CALL_FORWARDING_WHILE_ROAMING"
            return r1
        L60:
            java.lang.String r1 = "DATA_LIMIT_REACHED"
            return r1
        L63:
            java.lang.String r1 = "DATA_DISABLED"
            return r1
        L66:
            java.lang.String r1 = "MAXIMUM_NUMER_OF_CALLS_REACHED"
            return r1
        L69:
            java.lang.String r1 = "ANSWERED_ELSEWHERE"
            return r1
        L6c:
            java.lang.String r1 = "CALL_PULLED"
            return r1
        L6f:
            java.lang.String r1 = "VIDEO_CALL_NOT_ALLOWED_WHILE_TTY_ENABLED"
            return r1
        L72:
            java.lang.String r1 = "CDMA_ALREADY_ACTIVATED"
            return r1
        L75:
            java.lang.String r1 = "DIAL_MODIFIED_TO_DIAL"
            return r1
        L78:
            java.lang.String r1 = "DIAL_MODIFIED_TO_SS"
            return r1
        L7b:
            java.lang.String r1 = "DIAL_MODIFIED_TO_USSD"
            return r1
        L7e:
            java.lang.String r1 = "IMS_MERGED_SUCCESSFULLY"
            return r1
        L81:
            java.lang.String r1 = "OUTGOING_CANCELED"
            return r1
        L84:
            java.lang.String r1 = "OUTGOING_FAILURE"
            return r1
        L87:
            java.lang.String r1 = "EXITED_ECM"
            return r1
        L8a:
            java.lang.String r1 = "CDMA_CALL_LOST"
            return r1
        L8d:
            java.lang.String r1 = "VOICEMAIL_NUMBER_MISSING"
            return r1
        L90:
            java.lang.String r1 = "DIALED_MMI"
            return r1
        L93:
            java.lang.String r1 = "NO_PHONE_NUMBER_SUPPLIED"
            return r1
        L96:
            java.lang.String r1 = "EMERGENCY_ONLY"
            return r1
        L99:
            java.lang.String r1 = "ERROR_UNSPECIFIED"
            return r1
        L9c:
            java.lang.String r1 = "CDMA_ACCESS_BLOCKED"
            return r1
        L9f:
            java.lang.String r1 = "CDMA_NOT_EMERGENCY"
            return r1
        La2:
            java.lang.String r1 = "CDMA_PREEMPTED"
            return r1
        La5:
            java.lang.String r1 = "CDMA_ACCESS_FAILURE"
            return r1
        La8:
            java.lang.String r1 = "CDMA_RETRY_ORDER"
            return r1
        Lab:
            java.lang.String r1 = "CDMA_SO_REJECT"
            return r1
        Lae:
            java.lang.String r1 = "CDMA_REORDER"
            return r1
        Lb1:
            java.lang.String r1 = "CDMA_INTERCEPT"
            return r1
        Lb4:
            java.lang.String r1 = "CDMA_DROP"
            return r1
        Lb7:
            java.lang.String r1 = "CDMA_LOCKED_UNTIL_POWER_CYCLE"
            return r1
        Lba:
            java.lang.String r1 = "UNOBTAINABLE_NUMBER"
            return r1
        Lbd:
            java.lang.String r1 = "CS_RESTRICTED_EMERGENCY"
            return r1
        Lc0:
            java.lang.String r1 = "CS_RESTRICTED_NORMAL"
            return r1
        Lc3:
            java.lang.String r1 = "CS_RESTRICTED"
            return r1
        Lc6:
            java.lang.String r1 = "FDN_BLOCKED"
            return r1
        Lc9:
            java.lang.String r1 = "CALL_BARRED"
            return r1
        Lcc:
            java.lang.String r1 = "ICC_ERROR"
            return r1
        Lcf:
            java.lang.String r1 = "OUT_OF_SERVICE"
            return r1
        Ld2:
            java.lang.String r1 = "POWER_OFF"
            return r1
        Ld5:
            java.lang.String r1 = "INCOMING_REJECTED"
            return r1
        Ld8:
            java.lang.String r1 = "LIMIT_EXCEEDED"
            return r1
        Ldb:
            java.lang.String r1 = "LOST_SIGNAL"
            return r1
        Lde:
            java.lang.String r1 = "TIMED_OUT"
            return r1
        Le1:
            java.lang.String r1 = "SERVER_ERROR"
            return r1
        Le4:
            java.lang.String r1 = "OUT_OF_NETWORK"
            return r1
        Le7:
            java.lang.String r1 = "INVALID_CREDENTIALS"
            return r1
        Lea:
            java.lang.String r1 = "SERVER_UNREACHABLE"
            return r1
        Led:
            java.lang.String r1 = "NUMBER_UNREACHABLE"
            return r1
        Lf0:
            java.lang.String r1 = "INVALID_NUMBER"
            return r1
        Lf3:
            java.lang.String r1 = "CONGESTION"
            return r1
        Lf6:
            java.lang.String r1 = "BUSY"
            return r1
        Lf9:
            java.lang.String r1 = "LOCAL"
            return r1
        Lfc:
            java.lang.String r1 = "NORMAL"
            return r1
        Lff:
            java.lang.String r1 = "INCOMING_MISSED"
            return r1
        L102:
            java.lang.String r1 = "NOT_DISCONNECTED"
            return r1
    }

    @Override // android.telephony.TelephonyCallback.CallDisconnectCauseListener
    public void onCallDisconnectCauseChanged(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCallDisconnectCauseChanged-->disconnectCause:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", preciseDisconnectCause:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "DMTelephonyCallback"
            c.d.a.b.h.b(r0, r4)
            r4 = -1
            if (r3 == r4) goto L37
            c.d.a.b.n r4 = r2.f1412a
            java.lang.String r3 = r2.a(r3)
            r4.y = r3
            c.d.a.b.n r2 = r2.f1412a
            java.lang.String r2 = r2.y
            com.mobiletools.systemhelper.control.a.f1410b = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "default disconnectcause : "
            goto L46
        L37:
            c.d.a.b.n r2 = r2.f1412a
            java.lang.String r3 = ""
            r2.y = r3
            com.mobiletools.systemhelper.control.a.f1410b = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "case 1 disconnectcause : "
        L46:
            r2.append(r3)
            java.lang.String r3 = com.mobiletools.systemhelper.control.a.f1410b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            c.d.a.b.h.a(r0, r2)
            return
    }

    @Override // android.telephony.TelephonyCallback.PreciseDataConnectionStateListener
    public void onPreciseDataConnectionStateChanged(android.telephony.PreciseDataConnectionState r3) {
            r2 = this;
            if (r3 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onPreciseDataConnectionStateChanged-->dataConnectionState:"
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DMTelephonyCallback"
            c.d.a.b.h.b(r1, r0)
            int r3 = r3.getLastCauseCode()
            if (r3 == 0) goto L39
            c.d.a.b.n r0 = r2.f1412a
            java.util.Map<java.lang.Integer, java.lang.String> r1 = com.mobiletools.systemhelper.control.a.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.z = r3
            c.d.a.b.n r2 = r2.f1412a
            java.lang.String r2 = r2.z
            com.mobiletools.systemhelper.control.a.f1411c = r2
            goto L41
        L39:
            c.d.a.b.n r2 = r2.f1412a
            java.lang.String r3 = ""
            r2.z = r3
            com.mobiletools.systemhelper.control.a.f1411c = r3
        L41:
            return
    }
}
