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

package io.apptik.comm.jus.rx.queue;

import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.RequestQueue;
import io.apptik.comm.jus.error.JusError;
import io.apptik.comm.jus.rx.BaseSubscription;
import io.apptik.comm.jus.rx.event.ErrorEvent;
import io.apptik.comm.jus.toolbox.Utils;
import rx.Observable;
import rx.Subscriber;

public class QRequestErrorOnSubscribe<T> implements Observable.OnSubscribe<ErrorEvent> {
    private final RequestQueue.RequestFilter filter;
    private final RequestQueue queue;

    public QRequestErrorOnSubscribe(RequestQueue queue, RequestQueue.RequestFilter filter) {
        Utils.checkNotNull(queue, "queue==null");
        this.queue = queue;
        this.filter = filter;
    }

    @Override
    public void call(final Subscriber<? super ErrorEvent> subscriber) {

        final RequestQueue.QListenerFactory qListenerFactory =
                new RequestQueue.SimpleFilteredQListenerFactory(filter) {
                    @Override
                    public RequestQueue.QErrorListener getFilteredErrorListener(Request request) {
                        return new RequestQueue.QErrorListener(request) {
                            @Override
                            public void onError(JusError error) {
                                if (!subscriber.isUnsubscribed()) {
                                    subscriber.onNext(new ErrorEvent(request, error));
                                }
                            }
                        };
                    }
                };

        queue.addQListenerFactory(qListenerFactory);

        subscriber.add(new BaseSubscription() {
            @Override
            protected void doUnsubscribe() {
                queue.removeQListenerFactory(qListenerFactory);
            }
        });
    }

}