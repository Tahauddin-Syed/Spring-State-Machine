package com.tahauddin.syed.domain;

public enum PaymentEvent {
    PRE_AUTHORIZE,
    PRE_AUTHORIZE_APPROVED,
    PRE_AUTHORIZE_DECLINE,
    AUTHORIZE,
    POST_AUTHORIZE_APPROVED,
    POST_AUTHORIZE_DECLINE;
}
