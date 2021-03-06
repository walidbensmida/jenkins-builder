pipelineJob('pipelineJob'){
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job'){
    definition {
        cpsScm {
           scm{
               git{
                   remote{
                       url 'https://github.com/walidbensmida/spring-boot-jenkins-example'
                   }
                   branch 'master'
               }
           }
        }
    }
}
pipelineJob('theme-park-job-docker-aws'){
    definition {
        cpsScm {
            scm{
                git{
                    remote{
                        url 'https://github.com/walidbensmida/spring-boot-jenkins-example'
                    }
                    branch 'master'
                }
            }
        }
    }
}