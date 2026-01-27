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

public val SolidGroup.PersonCircleCheck: ImageVector
    get() {
        if (_personCircleCheck != null) {
            return _personCircleCheck!!
        }
        _personCircleCheck = Builder(name = "PersonCircleCheck", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, 24.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 112.0f, 0.0f)
                close()
                moveTo(304.0f, 236.7f)
                lineTo(341.0f, 286.6f)
                curveToRelative(12.8f, -17.5f, 28.5f, -32.7f, 46.3f, -45.0f)
                lineToRelative(-56.2f, -75.7f)
                curveTo(306.0f, 132.0f, 266.3f, 112.0f, 224.0f, 112.0f)
                reflectiveCurveToRelative(-82.0f, 20.0f, -107.2f, 53.9f)
                lineToRelative(-70.5f, 95.0f)
                curveToRelative(-10.5f, 14.2f, -7.6f, 34.2f, 6.6f, 44.8f)
                reflectiveCurveToRelative(34.2f, 7.6f, 44.8f, -6.6f)
                lineTo(144.0f, 236.7f)
                lineTo(144.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -275.3f)
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
        return _personCircleCheck!!
    }

private var _personCircleCheck: ImageVector? = null
