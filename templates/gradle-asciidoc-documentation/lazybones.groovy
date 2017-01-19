import uk.co.cacoethes.util.NameType

String username = System.properties['user.name']
Map props = [:]
props.project_name = transformText(projectDir.name, from: NameType.CAMEL_CASE, to: NameType.HYPHENATED)
props.project_group = ask("Define value for 'group' [org.example]: ", 'org.example', 'group')
props.project_version = ask("Define value for 'version' [0.1.0-SNAPSHOT]: ", '0.1.0-SNAPSHOT', 'version')
processTemplates '**/gradle.properties', props
processTemplates '**/Main.adoc', props

