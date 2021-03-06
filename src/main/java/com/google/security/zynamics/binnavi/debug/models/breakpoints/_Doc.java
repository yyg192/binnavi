// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.debug.models.breakpoints;

/**
 * This package contains all classes that are needed to support breakpoints during debugging
 * sessions. There is a breakpoint manager that keeps track of all breakpoints which are set and
 * there are the individual breakpoints.
 *
 *  Breakpoints are divided into different classes. Each breakpoint class exhibits different
 * behavior when they are set or hit. The following breakpoint classes exist.
 *
 *  1. Regular breakpoints (behave like the breakpoints in other debuggers) 2. Step breakpoints
 * (used to simulate Step Over / Step to Next Block) 3. Echo breakpoints (used in trace mode)
 *
 *  For more information about breakpoints and their behavior, please see the documentation inside
 * the BreakpointType, BreakpointStatus, and CBreakpoint files.
 */
