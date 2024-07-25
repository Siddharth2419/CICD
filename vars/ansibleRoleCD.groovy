def checkout(String url, String creds, String branch) {
    org.ansible.Checkout(url, creds, branch)
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
