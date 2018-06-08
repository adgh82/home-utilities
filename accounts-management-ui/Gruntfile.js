module.exports = function(grunt){
  grunt.registerTask('default','',function(){
      grunt.log.write('Customized grunt task');
  });  
  grunt.initConfig({
      pkg: grunt.file.readJSON('package.json'),
      cssmin: {
          combine: {
              files: {
                  'script/css/main.css':['script/css/application-view.css']
              }
          }
      }
  });
    
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.registerTask('packcss',['cssmin']);
};