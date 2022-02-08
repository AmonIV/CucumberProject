Feature: Creation and modification of actors


  Scenario: Create a new project
    Given User opens project creation screen
    When User enters a project name
    And clicks the create button
    Then Sees a success message
    
  Scenario: Attempt to create new project with a name that is taken
    Given User opens project creation screen
    When User enters a project name that is taken
    And clicks the create button
    Then Sees a error message
    
  Scenario: Create a new developer
    Given User opens the developer registration screen
    When User enters the developer name
    And User selects the developer's role
    And clicks the register button
    Then Sees a successful registration message
    
  Scenario: Create a new task without assigning a developer
    Given User opens the task creation screen
    When User enters the task name
    And User selects a project
    And User selects no developer
    And Adds a description
    And clicks the create task button
    Then Sees a successful task creation message
    
  Scenario: Assign a developer to a task and change status to active
    Given User opens the task modification screen
    When User selects the task name
    And User selects a developer
    And clicks the activate task button
    Then Sees a successful task activation message
