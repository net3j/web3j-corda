/*
 * Copyright 2019 Web3 Labs LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.corda.protocol

import javax.ws.rs.ClientErrorException
import org.web3j.corda.model.Error

/**
 * Corda API exception containing error data.
 */
class CordaException internal constructor(
    val status: Int,
    val type: String?,
    message: String?
) : RuntimeException(message) {
    companion object {

        @JvmStatic
        fun of(exception: ClientErrorException): CordaException {
            with(exception.response) {
                // Try to de-serialize the exception error
                val error = if (hasEntity()) {
                    readEntity(Error::class.java)
                } else {
                    null
                }
                return CordaException(status, error?.type, error?.message)
            }
        }
    }
}
