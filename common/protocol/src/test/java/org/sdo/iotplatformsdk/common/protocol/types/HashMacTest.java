/*******************************************************************************
 * Copyright 2020 Intel Corporation
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
 *******************************************************************************/

package org.sdo.iotplatformsdk.common.protocol.types;

import java.io.IOException;
import java.nio.ByteBuffer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sdo.iotplatformsdk.common.protocol.types.HashMac;
import org.sdo.iotplatformsdk.common.protocol.types.MacType;

class HashMacTest {

  HashMac hashMac;
  HashMac hashMac1;

  @BeforeEach
  void beforeEach() throws IOException {

    hashMac = new HashMac();
    hashMac1 = new HashMac(MacType.HMAC_SHA256, ByteBuffer.wrap("test".getBytes()));
  }

  @Test
  void test_Bean() {

    hashMac.getHash();
    hashMac.getType();
    hashMac.hashCode();
    hashMac.toString();

    hashMac.equals(null);
    hashMac.equals(hashMac);
    hashMac.equals(hashMac1);
  }

}
