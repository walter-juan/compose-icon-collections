package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) {
            return _alarmSmoke!!
        }
        _alarmSmoke = Builder(name = "AlarmSmoke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                lineToRelative(-0.8f, 3.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.2f, 1.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.2f, -1.0f)
                lineToRelative(-0.8f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1.0f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1.0f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1.0f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1.0f, 1.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1.0f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1.0f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1.0f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1.0f, 1.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                curveToRelative(0.643f, 0.288f, 1.017f, 0.756f, 1.0f, 1.25f)
                curveToRelative(0.017f, 0.494f, -0.357f, 0.962f, -1.0f, 1.25f)
                reflectiveCurveToRelative(-1.017f, 0.756f, -1.0f, 1.25f)
                curveToRelative(-0.017f, 0.494f, 0.357f, 0.962f, 1.0f, 1.25f)
            }
        }
        .build()
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
