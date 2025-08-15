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

public val SolidGroup.BedPulse: ImageVector
    get() {
        if (_bedPulse != null) {
            return _bedPulse!!
        }
        _bedPulse = Builder(name = "BedPulse", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(531.2f, -22.4f)
                lineTo(572.0f, 32.0f)
                lineTo(616.0f, 32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-56.0f, 0.0f)
                curveToRelative(-7.6f, 0.0f, -14.7f, -3.6f, -19.2f, -9.6f)
                lineToRelative(-24.1f, -32.1f)
                lineToRelative(-47.0f, 99.9f)
                curveToRelative(-3.7f, 7.8f, -11.3f, 13.1f, -19.9f, 13.7f)
                reflectiveCurveToRelative(-16.9f, -3.4f, -21.7f, -10.6f)
                lineTo(387.2f, 80.0f)
                lineTo(344.0f, 80.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(8.0f, 0.0f, 15.5f, 4.0f, 20.0f, 10.7f)
                lineToRelative(24.4f, 36.6f)
                lineToRelative(45.9f, -97.5f)
                curveToRelative(3.6f, -7.6f, 10.9f, -12.8f, 19.3f, -13.7f)
                reflectiveCurveToRelative(16.6f, 2.7f, 21.6f, 9.5f)
                close()
                moveTo(320.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(9.5f, 0.0f)
                lineToRelative(26.6f, 39.9f)
                curveToRelative(14.4f, 21.6f, 39.3f, 33.8f, 65.2f, 31.9f)
                reflectiveCurveToRelative(48.8f, -17.6f, 59.8f, -41.1f)
                lineTo(527.0f, 129.2f)
                curveToRelative(45.9f, 7.2f, 81.0f, 46.9f, 81.0f, 94.8f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(32.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveTo(96.0f, 46.3f, 96.0f, 64.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                close()
                moveTo(144.0f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bedPulse!!
    }

private var _bedPulse: ImageVector? = null
