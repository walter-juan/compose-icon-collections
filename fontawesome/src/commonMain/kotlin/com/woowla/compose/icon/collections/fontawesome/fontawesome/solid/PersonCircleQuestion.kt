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

public val SolidGroup.PersonCircleQuestion: ImageVector
    get() {
        if (_personCircleQuestion != null) {
            return _personCircleQuestion!!
        }
        _personCircleQuestion = Builder(name = "PersonCircleQuestion", defaultWidth = 640.0.dp,
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
                moveTo(496.0f, 544.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(496.0f, 444.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -40.0f)
                close()
                moveTo(496.0f, 344.0f)
                curveToRelative(-11.6f, 0.0f, -21.3f, 8.2f, -23.5f, 19.2f)
                curveToRelative(-1.8f, 8.7f, -10.2f, 14.3f, -18.9f, 12.5f)
                reflectiveCurveToRelative(-14.3f, -10.2f, -12.5f, -18.9f)
                curveToRelative(5.2f, -25.6f, 27.8f, -44.8f, 54.9f, -44.8f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                curveToRelative(0.0f, 19.8f, -11.7f, 37.8f, -29.8f, 45.9f)
                lineToRelative(-10.4f, 4.6f)
                curveToRelative(-1.2f, 7.7f, -7.8f, 13.5f, -15.8f, 13.5f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -11.2f, 6.6f, -21.3f, 16.8f, -25.9f)
                lineToRelative(12.4f, -5.5f)
                curveToRelative(6.6f, -2.9f, 10.8f, -9.4f, 10.8f, -16.6f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _personCircleQuestion!!
    }

private var _personCircleQuestion: ImageVector? = null
