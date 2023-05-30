pipeline {
    agent { label 'Dotnet' }
    stages{
        stage('vcs')
        {
            steps{
            git branch: master,
            url: 'https://github.com/CAESAR269/dotnetaug2021.git'
        }
    }
       stage('build')
        {
            steps{
                sh 'dotnet build'
            }
        }
    }
}
