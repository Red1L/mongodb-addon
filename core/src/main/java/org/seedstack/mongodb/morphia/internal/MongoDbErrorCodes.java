/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.mongodb.morphia.internal;

import org.seedstack.seed.ErrorCode;

public enum MongoDbErrorCodes implements ErrorCode {
    MISSING_URI,
    UNABLE_TO_PARSE_SERVER_ADDRESS,
    UNSUPPORTED_AUTHENTICATION_MECHANISM,
    UNKNOWN_CLIENT_SPECIFIED,
    DUPLICATE_DATABASE_NAME,
    UNABLE_TO_INSTANTIATE_CLASS,
    UNKNOWN_CLIENT_OPTION,
    UNKNOWN_CLIENT_SETTING,
    MISSING_HOSTS_CONFIGURATION,
    INVALID_CREDENTIAL_SYNTAX
}
