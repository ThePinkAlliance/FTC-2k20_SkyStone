package org.firstinspires.ftc.PinkCode.Subsystems;

import org.firstinspires.ftc.PinkCode.Robot.Hardware;
import org.firstinspires.ftc.PinkCode.OpModes.Teleop;
// Class Which Defines Variables Used in Other Subsystems and Sets Powers and Commands for Teleop/Auto
public abstract class Subsystem extends Teleop {
    // Define Class Members
    public static Hardware robot = new Hardware();
    static double front_left_wheel_command;
    static double back_left_wheel_command;
    static double front_right_wheel_command;
    static double back_right_wheel_command;
    static double collect_command;
    public static double collector_rotate_command;
    static double extend_command;
    static double lift_command;
    static double lift_target_position;
    static double lift_error;
    static double lift_speed;
    static double previous_lift_position;
    static double lift_hold_position;
    static double score_target_position;
    static double score_flap_target_position;
    static double score_kicker_target_position;

    // Method Which Sends the Motor Powers to the Motors
    public static void set_motor_powers() {
        // Set Motor Powers
        robot.rightF_drive.setPower(Subsystem.front_right_wheel_command);
        robot.rightB_drive.setPower(Subsystem.back_right_wheel_command);
        robot.leftF_drive.setPower(Subsystem.front_left_wheel_command);
        robot.leftB_drive.setPower(Subsystem.back_left_wheel_command);
        robot.collect.setPower(Subsystem.collect_command);
        robot.collector_rotate.setPower(Subsystem.collector_rotate_command);
        robot.right_extend.setPower(extend_command);
        robot.left_extend.setPower(extend_command);
        robot.right_lift.setPower(lift_command);
        robot.left_lift.setPower(lift_command);
    }

    // Method Which Sends the Servo Positions to the Servos
    public static void set_servo_positions() {
        // Set Servo Positions
        robot.scorer_rotate.setPosition(score_target_position);
    }

}