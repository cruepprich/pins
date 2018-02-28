pipelineRepo = "ttps://github.com/cruepprich/pins.git"
pipelineBranch = "master"
script = "test.groovy"

node () {
    git poll: false, changelog: false, url: pipelineRepo, credentialsId: "git-credentials", branch: pipelineBranch
    load script    
}
