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

public val SolidGroup.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(346.6f, 110.2f)
                curveToRelative(-7.8f, -11.7f, -22.4f, -17.0f, -35.9f, -12.9f)
                reflectiveCurveTo(288.0f, 113.9f, 288.0f, 128.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -150.3f)
                lineToRelative(69.4f, 104.1f)
                curveToRelative(5.9f, 8.9f, 15.9f, 14.2f, 26.6f, 14.2f)
                reflectiveCurveToRelative(20.7f, -5.3f, 26.6f, -14.2f)
                lineTo(544.0f, 233.7f)
                lineTo(544.0f, 384.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -14.1f, -9.2f, -26.5f, -22.7f, -30.6f)
                reflectiveCurveToRelative(-28.1f, 1.1f, -35.9f, 12.9f)
                lineTo(448.0f, 262.3f)
                lineTo(346.6f, 110.2f)
                close()
                moveTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 110.3f, 0.0f, 128.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -224.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 96.0f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
