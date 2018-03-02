CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `question_statistic` AS
    SELECT 
        `question`.`id` AS `questionId`,
        `question`.`description` AS `description`,
        COUNT(`statistic`.`questionId`) AS `count`,
        SUM(`statistic`.`correct`) AS `correct`,
        (COUNT(`statistic`.`questionId`) - SUM(`statistic`.`correct`)) AS `incorrect`
    FROM
        (`question`
        JOIN `statistic`)
    WHERE
        (`question`.`id` IN (SELECT 
                `statistic`.`questionId`
            FROM
                `statistic`
            GROUP BY `statistic`.`questionId`)
            AND (`statistic`.`questionId` = `question`.`id`))
    GROUP BY `statistic`.`questionId`