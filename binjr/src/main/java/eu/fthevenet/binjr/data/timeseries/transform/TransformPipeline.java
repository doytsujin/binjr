/*
 *    Copyright 2017 Frederic Thevenet
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package eu.fthevenet.binjr.data.timeseries.transform;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.List;

//FIXME not use at the moment
public class TransformPipeline<T extends Number> {
    private final List<TimeSeriesTransform<T>> transforms = new LinkedList<>();

    public TransformPipeline(){
        throw new NotImplementedException();
    }

    public List<TimeSeriesTransform<T>> getTransforms() {
        return transforms;
    }
}
