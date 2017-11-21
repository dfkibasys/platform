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
set _OVERWRITE_=

shift

goto getopts
:shift_2
shift
:shift_1
shift

:getopts
if "%0"=="-o" set _OVERWRITE_=-Doverwrite
if "%0"=="-o" goto shift_1
if "%0"=="-h" goto help
if "%0"=="--" goto endopts
if "%0"=="" goto endopts

echo %_BATFILE_%: illegal option -- %0
:help
echo pax-clone [-o] [-- mvnOpts ...]
echo @ http://www.ops4j.org/projects/pax/construct/help/clone.html

goto done
:endopts

shift

set _EXTRA_=%PAX_CONSTRUCT_OPTIONS% %_OVERWRITE_% %0 %1 %2 %3 %4 %5 %6 %7 %8 %9

@echo on
mvn  %PAX_PLUGIN%:clone %_EXTRA_%
:done
