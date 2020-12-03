@Library('caas-piper@master') _

def appName = "domain-commons"

//def gitUrl = scm.repositories[0].uris[0].toString()
def gitUrl = "ssh://git@github.wdf.sap.corp/CaaS20/${appName}.git"
def pipelineBranch = 'master'
def pipelineUrl = 'ssh://git@github.wdf.sap.corp/CaaS20/caas-pipeline.git'

node {
    ws('pipelineDir'){
    	utils.gitCheckout(url: pipelineUrl, branch: pipelineBranch)
    	println "Loading pipeline script from uri='${pipelineUrl}', branch='${pipelineBranch}', script='pipelines/GradleTemplate.groovy'"
    	pipeline  = load "pipelines/GradleBaseTemplate.groovy"
        utilsExtender = load 'pipelines/UtilsExtender.groovy'
    }

}

pipeline.execute appName: appName, gitUrl: gitUrl, utilsExtender: utilsExtender
