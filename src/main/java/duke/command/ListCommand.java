package duke.command;

import duke.ui.Ui;

import duke.task.TaskList;

import duke.storage.Storage;

public class ListCommand extends Command {

    /**
     * Get the TaskList object to list out all the tasks in the list.
     *
     * @param taskList TaskList object containing the current tasks list.
     * @param ui The Ui object we are currently using.
     * @param storage The Storage object we are currently using.
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) {
        assert ui != null :
                "Ui object cannot be null";

        return ui.printTasks(taskList.getTasks());
    }
}
