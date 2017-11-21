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
set _PACKAGE_=
set _BUNDLENAME_=
set _BUNDLEGROUPID_=
set _VERSION_=
set _OVERWRITE_=

shift

goto getopts
:shift_2
shift
:shift_1
shift

:getopts
if "%0"=="-p" set _PACKAGE_=%1
if "%0"=="-p" goto shift_2
if "%0"=="-n" set _BUNDLENAME_=%1
if "%0"=="-n" goto shift_2
if "%0"=="-g" set _BUNDLEGROUPID_=%1
if "%0"=="-g" goto shift_2
if "%0"=="-v" set _VERSION_=%1
if "%0"=="-v" goto shift_2
if "%0"=="-o" set _OVERWRITE_=-Doverwrite
if "%0"=="-o" goto shift_1
if "%0"=="-h" goto help
if "%0"=="--" goto endopts
if "%0"=="" goto endopts

echo %_BATFILE_%: illegal option -- %0
:help
echo pax-create-bundle -p package [-n bundleName] [-g bundleGroupId] [-v version] [-o] [-- mvnOpts ...]
echo @ http://www.ops4j.org/projects/pax/construct/help/create-bundle.html

goto done
:endopts

shift

set _EXTRA_=%PAX_CONSTRUCT_OPTIONS% %_OVERWRITE_% %0 %1 %2 %3 %4 %5 %6 %7 %8 %9

if ""=="%_PACKAGE_%" set PAX_PROMPT=true

if ""=="%_PACKAGE_%" set _PACKAGE_=org.example.pkg
if ""=="%_VERSION_%" set _VERSION_=1.0-SNAPSHOT

if ""=="%PAX_PROMPT%" goto skip_input
  echo.
  echo pax-create-bundle -p package [-n bundleName] [-g bundleGroupId] [-v version] [-o] [-- mvnOpts ...]
  echo.

  set _INPUT_=
  set /p _INPUT_="package (%_PACKAGE_%) ? "
  if not ""=="%_INPUT_%" set _PACKAGE_=%_INPUT_%

  set _INPUT_=
  set /p _INPUT_="bundleName (%_BUNDLENAME_%) ? "
  if not ""=="%_INPUT_%" set _BUNDLENAME_=%_INPUT_%

  set _INPUT_=
  set /p _INPUT_="bundleGroupId (%_BUNDLEGROUPID_%) ? "
  if not ""=="%_INPUT_%" set _BUNDLEGROUPID_=%_INPUT_%

  set _INPUT_=
  set /p _INPUT_="version (%_VERSION_%) ? "
  if not ""=="%_INPUT_%" set _VERSION_=%_INPUT_%

  echo.
:skip_input

@echo on
mvn -N %PAX_PLUGIN%:create-bundle -Dpackage=%_PACKAGE_% -DbundleName=%_BUNDLENAME_% -DbundleGroupId=%_BUNDLEGROUPID_% -Dversion=%_VERSION_% %_EXTRA_%
:done
