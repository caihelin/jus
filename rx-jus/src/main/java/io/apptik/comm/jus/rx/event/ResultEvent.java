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

package io.apptik.comm.jus.rx.event;


import io.apptik.comm.jus.Request;

/**
 * General event that contains
 * {@link Request} and 2XX (or 304 in case of cache) {@link io.apptik.comm.jus.Response}
 */
public final class ResultEvent<T> extends JusEvent<T> {

    //actual response
    public final T response;

    public ResultEvent(Request request, T response) {
        super(request);
        this.response = response;
    }

    @Override
    public String toString() {
        return "ResultEvent{" +
                "request=" + request +
                ", response=" + response +
                "} ";
    }
}
