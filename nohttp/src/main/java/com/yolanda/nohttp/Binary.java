/*
 * Copyright © YOLANDA. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yolanda.nohttp;

import java.io.OutputStream;

import com.yolanda.nohttp.able.Cancelable;

/**
 * File interface</br>
 * All the methods are called in Son thread.</br>
 * </br>
 * Created in Oct 12, 2015 4:44:07 PM
 *
 * @author YOLANDA
 */
public interface Binary extends Cancelable {

    /**
     * Length of byteArray
     */
    long getLength();

    /**
     * Write your Binary data through flow out
     */
    void onWriteBinary(OutputStream outputStream);

    /**
     * Return the fileName, Can be null
     */
    String getFileName();

    /**
     * Return mimeType of binary
     */
    String getMimeType();
}
