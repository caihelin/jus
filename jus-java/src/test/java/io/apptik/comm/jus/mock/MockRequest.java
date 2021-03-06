/*
 * Copyright (C) 2015 Apptik Project
 * Copyright (C) 2014 Kalin Maldzhanski
 * Copyright (C) 2011 The Android Open Source Project
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

package io.apptik.comm.jus.mock;

import java.io.IOException;

import io.apptik.comm.jus.Converter;
import io.apptik.comm.jus.RequestListener.ErrorListener;
import io.apptik.comm.jus.NetworkResponse;
import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.Response;
import io.apptik.comm.jus.error.JusError;
import io.apptik.comm.jus.utils.CacheTestUtils;

public class MockRequest extends Request<byte[]> {
    public MockRequest() {
        this("http://foo.com", null);
    }

    public MockRequest(String url, ErrorListener listener) {
        super(Method.GET, url, new Converter<NetworkResponse, byte[]>() {
            @Override
            public byte[] convert(NetworkResponse value) throws IOException {
                if (value.data != null) {
                    return value.data;
                } else {
                    return new byte[0];
                }
            }
        });
        if(listener!=null) {
            addErrorListener(listener);
        }

    }
    public byte[] deliveredResponse;
    private String mCacheKey = super.getCacheKey();

    public void setCacheKey(String cacheKey) {
        mCacheKey = cacheKey;
    }

    @Override
    public String getCacheKey() {
        return mCacheKey;
    }

    public boolean deliverResponse_called = false;
    public boolean parseResponse_called = false;

    @Override
    protected void deliverResponse(byte[] response) {
        deliverResponse_called = true;
        deliveredResponse = response;
        super.deliverResponse(response);
    }

    public boolean deliverError_called = false;

    @Override
    public void deliverError(JusError error) {
        super.deliverError(error);
        deliverError_called = true;
    }

    public boolean cancel_called = false;

    @Override
    public void cancel() {
        cancel_called = true;
        super.cancel();
    }

    private Priority mPriority = super.getPriority();

    public Request<byte[]> setPriority(Priority priority) {
        mPriority = priority;
        return this;
    }

    @Override
    public Priority getPriority() {
        return mPriority;
    }

    @Override
    protected Response<byte[]> parseNetworkResponse(NetworkResponse response) {
        parseResponse_called = true;
        return Response.success(response.data, CacheTestUtils.makeRandomCacheEntry(response.data));
    }

}
