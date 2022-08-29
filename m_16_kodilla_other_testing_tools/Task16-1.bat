::======================================================================================================================
:: This batch file is in Module_16 and does the following:
:: 1). calls gradle build to build the module and generate *.jar file,
:: 2). deletes the generated *.jar file,
:: 3). calls gradle build (again) to build the module and generate *.jar file,
:: 4). copies the generated *.jar file from subdirectory build/libs to the directory PROJECT, created on the C:\ drive,
:: 5). if there is no *.jar file to be copied, the program shows message about it ('compilation error').
:: 6). PAUSE - stops the Command Prompt from immediate shut-down after execution of this batch file.
::======================================================================================================================
cd ./
call gradle build
PAUSE
cd ./
cd build/libs/
echo %cd%
del *.jar echo jar file deleted successfully

cd ../../

echo %cd%
PAUSE
call gradle build

PAUSE

cd ./build/libs/
echo %cd%
PAUSE
COPY m_16_kodilla_other_testing_tools-1.0-SNAPSHOT.jar C:\Users\lenovo\PROJECT

PAUSE