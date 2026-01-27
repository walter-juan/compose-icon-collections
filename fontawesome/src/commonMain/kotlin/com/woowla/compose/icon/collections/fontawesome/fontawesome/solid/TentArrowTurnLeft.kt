package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(-0.5f, 113.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-31.0f, -31.0f)
                lineToRelative(350.1f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -24.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                lineToRelative(-350.1f, 0.0f)
                lineToRelative(31.0f, -31.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveTo(80.9f, -2.3f, 71.5f, 7.0f)
                lineTo(-0.5f, 79.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                close()
                moveTo(60.3f, 292.6f)
                lineTo(37.1f, 476.0f)
                curveToRelative(-2.4f, 19.1f, 12.5f, 36.0f, 31.7f, 36.0f)
                lineToRelative(154.5f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -117.4f)
                curveToRelative(0.0f, -5.9f, 4.7f, -10.6f, 10.6f, -10.6f)
                curveToRelative(4.0f, 0.0f, 7.7f, 2.3f, 9.5f, 5.9f)
                lineToRelative(68.2f, 136.5f)
                curveToRelative(5.4f, 10.8f, 16.5f, 17.7f, 28.6f, 17.7f)
                lineToRelative(71.9f, 0.0f)
                curveToRelative(19.3f, 0.0f, 34.2f, -16.9f, 31.7f, -36.0f)
                lineTo(452.7f, 292.7f)
                curveToRelative(-1.2f, -9.7f, -6.9f, -18.4f, -15.3f, -23.4f)
                lineTo(271.9f, 169.9f)
                curveToRelative(-10.2f, -6.1f, -22.9f, -6.1f, -33.1f, 0.1f)
                lineTo(75.4f, 269.3f)
                curveToRelative(-8.3f, 5.1f, -13.9f, 13.7f, -15.1f, 23.3f)
                close()
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
