package data7.project;

/*-
 * #%L
 * Data7
 * %%
 * Copyright (C) 2018 Matthieu Jimenez
 * %%
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
 * #L%
 */

import java.util.TreeMap;

import static data7.project.CProjects.*;

public class ProjectFactory {



    public static Project retrieveProjectInfo(String name) {
        switch (name) {
            case "linux_kernel":
                return LINUX_KERNEL;
            case "openssl":
                return OPEN_SSL;
            case "wireshark":
                return WIRESHARK;
            case "systemd":
                return SYSTEMD;
            default:
                return null;
        }
    }


    public static TreeMap<Long, String> retrieveProjectRelease(String name) {
        switch (name) {
            case "linux_kernel":
                return LINUX_VERSIONS();
            case "openssl":
                return OPENSSL_VERSION();
            case "wireshark":
                return WIRESHARK_VERSION();
            case "systemd":
                return SYSTEMD_VERSION();
            default:
                return null;
        }
    }
}