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

public val SolidGroup.RoadCircleCheck: ImageVector
    get() {
        if (_roadCircleCheck != null) {
            return _roadCircleCheck!!
        }
        _roadCircleCheck = Builder(name = "RoadCircleCheck", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                lineToRelative(-76.3f, 0.0f)
                curveToRelative(-29.4f, 0.0f, -55.1f, 20.1f, -62.1f, 48.6f)
                lineTo(65.4f, 420.5f)
                curveTo(57.9f, 450.7f, 80.8f, 480.0f, 112.0f, 480.0f)
                lineToRelative(209.4f, 0.0f)
                curveToRelative(-11.2f, -24.4f, -17.4f, -51.4f, -17.4f, -80.0f)
                curveToRelative(0.0f, -28.6f, 6.2f, -55.7f, 17.4f, -80.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, 0.0f, -1.5f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 49.0f)
                curveToRelative(35.2f, -39.9f, 86.7f, -65.0f, 144.0f, -65.0f)
                curveToRelative(9.0f, 0.0f, 17.8f, 0.6f, 26.5f, 1.8f)
                lineToRelative(-32.0f, -129.2f)
                curveTo(483.4f, 52.1f, 457.8f, 32.0f, 428.3f, 32.0f)
                lineToRelative(-76.4f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(640.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(553.4f, 339.1f)
                curveToRelative(7.1f, 5.2f, 8.7f, 15.2f, 3.5f, 22.3f)
                lineToRelative(-64.0f, 88.0f)
                curveToRelative(-2.8f, 3.8f, -7.0f, 6.2f, -11.7f, 6.5f)
                reflectiveCurveToRelative(-9.3f, -1.3f, -12.6f, -4.6f)
                lineToRelative(-40.0f, -40.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(26.8f, 26.8f)
                lineToRelative(53.0f, -72.9f)
                curveToRelative(5.2f, -7.1f, 15.2f, -8.7f, 22.4f, -3.5f)
                close()
            }
        }
        .build()
        return _roadCircleCheck!!
    }

private var _roadCircleCheck: ImageVector? = null
