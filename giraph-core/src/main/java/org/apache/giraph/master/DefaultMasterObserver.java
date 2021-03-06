/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.giraph.master;

import org.apache.giraph.conf.ImmutableClassesGiraphConfiguration;
import org.apache.giraph.metrics.AggregatedMetrics;
import org.apache.giraph.partition.PartitionStats;

import java.util.List;

/**
 * A no-op implementation of MasterObserver to make it easier for users.
 */
public class DefaultMasterObserver implements MasterObserver {
  /** Configuration to use */
  private ImmutableClassesGiraphConfiguration conf;

  @Override
  public void setConf(ImmutableClassesGiraphConfiguration configuration) {
    this.conf = configuration;
  }

  @Override
  public ImmutableClassesGiraphConfiguration getConf() {
    return conf;
  }

  @Override
  public void preApplication() { }

  @Override
  public void postApplication() { }

  @Override
  public void applicationFailed(Exception e) { }

  @Override
  public void preSuperstep(long superstep) { }

  @Override
  public void postSuperstep(long superstep) { }

  @Override
  public void superstepMetricsUpdate(long superstep,
      AggregatedMetrics aggregatedMetrics,
      List<PartitionStats> partitionStatsList) { }
}
