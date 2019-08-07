Feature: View service status

    Check the current status of the TFL lines. Note the since we are testing against a live website,
    the result will not be as predictable as in a test environment

    Scenario: Should see the list of available services in the status update section
    Given Trevor is in the "Status update" section
#    When he consults the line statuses
#    Then he should see the following lines:
#        | Central   |
#        | Circle    |
#        | District  |
#
#    Scenario: Should see the list of available services for a future date
#        Given Trevor is in the "Status update" section
#        When he consults the line statuses for this weekend
#        Then he should see the following lines:
#            |   Central |
#            |   Circle  |
#            |   District    |
#        And the statuses should be shown for this weekend