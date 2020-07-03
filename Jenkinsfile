pipeline {
    agent { label 'iOS' }
	triggers {
      gitlab(
        triggerOnPush: true,
        triggerOnMergeRequest: false,
        branchFilterType: "NameBasedFilter",
        includeBranchesSpec: '${GIT_BRANCH}')
    }
    stages {

        stage('Clear gradle cache') {
                steps {
                    sh 'rm -rf ${MAIN_DIR}/.gradle/caches/modules-2/files-2.1/com.cyxtera.did.sdk/'
                }
            }

        stage('Build') {
          steps {
            sh 'chmod 755 gradlew'
            echo 'Building project'
            sh './gradlew clean'
            echo 'Run Devices'
             sh '''
             ${MAIN_DIR}/Library/Android/sdk/emulator/emulator-headless -avd pixel_8.0 -port 5554 &
             ${MAIN_DIR}/Library/Android/sdk/emulator/emulator-headless -avd pixel_6.0 -port 5556 &
             sleep 10
             /usr/local/bin/adb devices'''
          }
        }

        stage('Testing') {
            steps {
             echo 'Proceeding to grant permissions'
             sh './gradlew grantPermissions'
             echo 'Proceeding to execute instrumentation tests with cucumber'
             sh './gradlew connectedCheck'
            }
        }

    }

    post {
        always {
             echo 'Export Cucumber Reports'
             sh './gradlew exportCucumberReports'
             cucumber buildStatus: 'UNSTABLE',
                                     fileIncludePattern: '*cucumber.json',
                                     jsonReportDirectory: 'app/build/reports/cucumber/'
        }
    }

}