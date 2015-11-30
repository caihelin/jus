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

package io.apptik.comm.jus.error;

import io.apptik.comm.jus.NetworkResponse;

/**
 * Indicates that there was a network error when performing a Jus request.
 */
@SuppressWarnings("serial")
public class NetworkError extends JusError {

    public NetworkError(Throwable cause) {
        super(cause);
    }

    public NetworkError(String exceptionMessage, Throwable reason, NetworkResponse networkResponse) {
        super(exceptionMessage, reason, networkResponse);
    }

    public NetworkError(String exceptionMessage) {
        super(exceptionMessage);
    }

    public NetworkError() {
        super();
    }

    public NetworkError(NetworkResponse response) {
        super(response);
    }

    public NetworkError(String exceptionMessage, NetworkResponse response) {
        super(exceptionMessage, response);
    }
}
