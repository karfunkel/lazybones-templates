package $project_package_name

import static groovyx.javafx.GroovyFX.start

start {
    stage(title: '$project_name', visible: true, centerOnScreen: true) {
        scene(stylesheets: 'css/main.css') {
            hbox(id: 'logo') {
                text(id: 'groovy', text: 'Groovy')
                text(id: 'fx', text: 'FX')
            }
        }
    }
}
