def call(String playbook, String creds, String branch) {
    checkout(playbook, creds, branch)
    ansibleLint()
    dryRun(playbook)
    gitleaks()
    credScan()
    syntaxCheck(playbook)
}
