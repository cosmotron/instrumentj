/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package instrumentj.probes;

/**
 * @author Stephen Evanchik (evanchsa@gmail.com)
 *
 */
public interface Probe {

    public static final String WILDCARD = "*";

    /**
     * Returns the filter that matches the class name or names that this
     * {@code Probe} should respond to
     *
     * @return classNameFilter
     */
    public String getClassNameFilter();

    /**
     * Executes this probe
     *
     * @param args
     *            the arguments for this probe
     */
    public void run(Object... args);
}
