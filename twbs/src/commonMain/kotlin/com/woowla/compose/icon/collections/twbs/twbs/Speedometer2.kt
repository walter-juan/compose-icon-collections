package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Speedometer2: ImageVector
    get() {
        if (_speedometer2 != null) {
            return _speedometer2!!
        }
        _speedometer2 = Builder(name = "Speedometer2", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 4.0f)
                moveTo(3.732f, 5.732f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(0.915f, 0.914f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.708f)
                lineToRelative(-0.914f, -0.915f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                moveTo(2.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.586f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 10.0f)
                moveToRelative(9.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.754f, -4.246f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.527f, -0.02f)
                lineTo(7.547f, 9.31f)
                arcToRelative(0.91f, 0.91f, 0.0f, true, false, 1.302f, 1.258f)
                lineToRelative(3.434f, -4.297f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.029f, -0.518f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.547f, 2.661f)
                curveToRelative(-0.442f, 1.253f, -1.845f, 1.602f, -2.932f, 1.25f)
                curveTo(11.309f, 13.488f, 9.475f, 13.0f, 8.0f, 13.0f)
                curveToRelative(-1.474f, 0.0f, -3.31f, 0.488f, -4.615f, 0.911f)
                curveToRelative(-1.087f, 0.352f, -2.49f, 0.003f, -2.932f, -1.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 10.0f)
                moveToRelative(8.0f, -7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -6.603f, 9.329f)
                curveToRelative(0.203f, 0.575f, 0.923f, 0.876f, 1.68f, 0.63f)
                curveTo(4.397f, 12.533f, 6.358f, 12.0f, 8.0f, 12.0f)
                reflectiveCurveToRelative(3.604f, 0.532f, 4.923f, 0.96f)
                curveToRelative(0.757f, 0.245f, 1.477f, -0.056f, 1.68f, -0.631f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.0f, 3.0f)
            }
        }
        .build()
        return _speedometer2!!
    }

private var _speedometer2: ImageVector? = null
