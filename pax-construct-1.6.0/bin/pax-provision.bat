@echo off
SETLOCAL
set _SCRIPTDIR_=%~dp0

@REM --------------------------------------------------------------------------
@REM Copyright 2007-2008 Stuart McCulloch.
@REM 
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM 
@REM     http://www.apache.org/licenses/LICENSE-2.0
@REM 
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
@REM implied.
@REM 
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM --------------------------------------------------------------------------

if ""=="%PAX_CONSTRUCT_VERSION%" set PAX_CONSTRUCT_VERSION=1.6.0
set PAX_PLUGIN=org.ops4j:maven-pax-plugin:%PAX_CONSTRUCT_VERSION%

set _BATFILE_=%0
set _FRAMEWORK_=
set _PROFILES_=
set _DEPLOYURLS_=
set _OVERWRITE_=

shift

goto getopts
:shift_2
shift
:shift_1
shift

:getopts
if "%0"=="-f" set _FRAMEWORK_=%1
if "%0"=="-f" goto shift_2
if "%0"=="-p" set _PROFILES_=%1
if "%0"=="-p" goto shift_2
if "%0"=="-u" set _DEPLOYURLS_=%1
if "%0"=="-u" goto shift_2
if "%0"=="-o" set _OVERWRITE_=-Doverwrite
if "%0"=="-o" goto shift_1
if "%0"=="-h" goto help
if "%0"=="--" goto endopts
if "%0"=="" goto endopts

echo %_BATFILE_%: illegal option -- %0
:help
echo pax-provision [-f felix|equinox|kf|concierge] [-p log,war,spring,...] [-u url,...] [-o] [-- mvnOpts ...]
echo @ http://www.ops4j.org/projects/pax/construct/help/provision.html

goto done
:endopts

shift

set _EXTRA_=%PAX_CONSTRUCT_OPTIONS% %_OVERWRITE_% %0 %1 %2 %3 %4 %5 %6 %7 %8 %9

if ""=="%PAX_PROMPT%" goto skip_input
  echo.
  echo pax-provision [-f felix|equinox|kf|concierge] [-p log,war,spring,...] [-u url,...] [-o] [-- mvnOpts ...]
  echo.

  set _INPUT_=
  set /p _INPUT_="framework (%_FRAMEWORK_%) ? "
  if not ""=="%_INPUT_%" set _FRAMEWORK_=%_INPUT_%

  set _INPUT_=
  set /p _INPUT_="profiles (%_PROFILES_%) ? "
  if not ""=="%_INPUT_%" set _PROFILES_=%_INPUT_%

  set _INPUT_=
  set /p _INPUT_="deployURLs (%_DEPLOYURLS_%) ? "
  if not ""=="%_INPUT_%" set _DEPLOYURLS_=%_INPUT_%

  echo.
:skip_input

@echo on
mvn  %PAX_PLUGIN%:provision -Dframework=%_FRAMEWORK_% -Dprofiles=%_PROFILES_% -DdeployURLs=%_DEPLOYURLS_% %_EXTRA_%
:done
