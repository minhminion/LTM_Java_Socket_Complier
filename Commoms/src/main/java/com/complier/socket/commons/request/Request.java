package com.complier.socket.commons.request;

import com.complier.socket.commons.enums.Action;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Request implements Serializable {
    @NonNull
    protected Action action;

}
