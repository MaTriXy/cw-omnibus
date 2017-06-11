/***
 Copyright (c) 2017 CommonsWare, LLC
 Licensed under the Apache License, Version 2.0 (the "License"); you may not
 use this file except in compliance with the License. You may obtain a copy
 of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 by applicable law or agreed to in writing, software distributed under the
 License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 OF ANY KIND, either express or implied. See the License for the specific
 language governing permissions and limitations under the License.

 Covered in detail in the book _The Busy Coder's Guide to Android Development_
 https://commonsware.com/Android
 */

package com.commonsware.android.sawmonitor;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class PollingService extends JobService {
  @Override
  public boolean onStartJob(JobParameters jobParameters) {
android.util.Log.e("20170512", "onStartJob");
    SAWDetector.seeSAW(this);

    return(false);
  }

  @Override
  public boolean onStopJob(JobParameters jobParameters) {
    return(false);
  }
}
