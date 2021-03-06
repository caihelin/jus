/*
 * Copyright (C) 2015 AppTik Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apptik.comm.jus.request;


import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.apptik.comm.jus.NetworkRequest;
import io.apptik.comm.jus.converter.GsonRequestConverter;
import io.apptik.comm.jus.converter.GsonResponseConverter;
import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.http.HttpUrl;

public class GsonRequest<T> extends Request<T> {

    public GsonRequest(String method, HttpUrl url, TypeAdapter<T> typeAdapter) {
        super(method, url, new GsonResponseConverter<>(typeAdapter));
        setNetworkRequest(NetworkRequest.Builder.from(getNetworkRequest())
                .setHeader("Accept", "application/json")
                .build());
    }

    public GsonRequest(String method, HttpUrl url, Class<T> tClass, Gson gson) {
        this(method, url, gson.getAdapter(tClass));
    }

    public GsonRequest(String method, HttpUrl url, Class<T> tClass) {
        this(method, url, tClass, new Gson());
    }

    public GsonRequest(String method, String url, TypeAdapter<T> typeAdapter) {
        super(method, url, new GsonResponseConverter<>(typeAdapter));
        setNetworkRequest(NetworkRequest.Builder.from(getNetworkRequest())
                .setHeader("Accept", "application/json")
                .build());
    }

    public GsonRequest(String method, String url, Class<T> tClass, Gson gson) {
        this(method, url, gson.getAdapter(tClass));
    }

    public GsonRequest(String method, String url, Class<T> tClass) {
        this(method, url, tClass, new Gson());
    }

    public <R> GsonRequest<T> setRequestData(R requestData, Gson gson, TypeAdapter adapter) {
        try {
            super.setRequestData(requestData, new GsonRequestConverter<>(gson, adapter));
        } catch (IOException e) {
            throw new RuntimeException("Unable to convert " + requestData + " to NetworkRequest", e);
        }
        setNetworkRequest(NetworkRequest.Builder.from(getNetworkRequest())
                .setHeader("Accept", "application/json")
                .build());
        return this;
    }

    public <R> GsonRequest<T> setRequestData(R requestData, Gson gson) {
        TypeAdapter<?> adapter;
        if(requestData==null) {
            adapter = gson.getAdapter(Object.class);
        } else {
             adapter = gson.getAdapter(TypeToken.get(requestData.getClass()));
        }
        return setRequestData(requestData, gson, adapter);
    }

    public <R> GsonRequest<T> setRequestData(R requestData) {
        return setRequestData(requestData, new Gson());
    }

}
