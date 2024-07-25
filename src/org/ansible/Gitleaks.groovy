package org.ansible

def call() {
    sh 'gitleaks detect -v --report-path=gitleaks-report.json'
}
