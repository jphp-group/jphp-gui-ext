<?php

use packager\Event;

/**
 * @jppm-task hub:publish
 */
function task_hubPublish(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        Tasks::copy("./package.hub.yml", "./$module", true);

        Tasks::runExternal("./$module", 'hub:publish', [], ...$event->flags());
    }
}

/**
 * @jppm-task doc:build
 */
function task_docBuild(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        Tasks::runExternal("./$module", 'doc:build');
    }
}

/**
 * @jppm-task publish
 */
function task_publish(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        Tasks::runExternal("./$module", 'publish', [], ...$event->flags());
    }
}

/**
 * @jppm-task unpublish
 */
function task_unpublish(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        Tasks::runExternal("./$module", 'unpublish', [], ...$event->flags());
    }
}
