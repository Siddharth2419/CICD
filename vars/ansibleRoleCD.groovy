def checkout() {
    // Ensure that 'org' is properly defined and accessible here
    def repoUrl = 'https://github.com/Siddharth2419/CICD.git'
    def branch = 'main'
    // Perform git checkout
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}

def gitleaks() {
    org.ansible.Gitleaks()
}

def credScan() {
    org.ansible.CredScan()
}

def ansibleLint(String playbook) {
    org.ansible.AnsibleLint(playbook)
}

def syntaxCheck(String playbook) {
    org.ansible.SyntaxCheck(playbook)
}

def dryRun(String playbook) {
    org.ansible.DryRun(playbook)
}

def deploy(String playbook) {
    org.ansible.Deploy(playbook)
}
