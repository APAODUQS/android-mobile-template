# DID Automation Project

Need install ***adb***, ***sdkmanager***, ***avdmanager*** and ***emulator***.

### Devices
To know which Google Devices can be installed execute:
```
<PATH_ANDROID>/avdmanager list device
```
**\<PATH_ANDROID>** is the path where the sdkmanager and avdmanager are located.

To know which Google Devices are installed execute:
```
<PATH_EMULATOR>/emulator -list-avds
```
**\<PATH_EMULATOR>** is the path where the emulator is located

To know which Genymotion Devices are installed execute:
```
VBoxManage list vms
``` 

### Install Devices
To install each Google Device:
```
 <PATH_ANDROID>/sdkmanager --install "system-images;android-<IMAGE>;google_apis;x86"
 echo "no" | <PATH_ANDROID>/avdmanager --verbose create avd --force --name "<NAME_DEVICE>" --package "system-images;android-<IMAGE>;google_apis;x86" --tag "google_apis" --abi "x86"
```
**\<IMAGE>** is the number of the image and **<NAME_DEVICE>** is any name for identifying a device.
For more information about that: https://gist.github.com/mrk-han/66ac1a724456cadf1c93f4218c6060ae

### Execute Devices
To execute each Google Device:
```
<PATH_EMULATOR>/emulator-headless -avd <NAME_DEVICE> -port <PORT_DEVICE> &
```
**\<PORT_DEVICE>** is the port where the device will be executed.
It is advisable that the port will be pair number and the range will be between **5554-5584** for better device tracking.
For more information about that: https://developer.android.com/studio/run/emulator-commandline?hl=es

With the command `emulator-headless`, the devices run without UI. 
With the command `emulator`, the devices run with the UI up.

To execute each Genymotion Devices in non-headless mode:
```
~/.genymotion/player --vm-name "<NAME_DEVICE>"
```
or 
```
~/.genymotion/player --vm-name <VM-UUID>
```
**\<VM-UUID>** is the ID of the device.


To know which devices are up, execute:
```
adb devices
```

To know the information about each device:
```
db -s <EMULATOR> shell getprop
```
**\<EMULATOR>** is the name assigned by adb in the before list

### Execute Acceptance Tests
To execute the acceptance tests in all devices:
```
 ./gradlew connectedCheck
```

### Generate Cucumber Reports
To generate Cucumber Reports in all devices, the devices must be running and must execute the following command sequence:
```
 ./gradlew grantPermissions
 ./gradlew connectedCheck
 ./gradlew exportCucumberReports

```
The reports are stored into the project directory: `app/build/reports/cucumber/`, in the JSON, JUNIT and HTML format, are included into a folder with the name of each emulator, into a folder with the execution date. 