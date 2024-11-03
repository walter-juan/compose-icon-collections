package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(4.736f, 1.968f)
                lineToRelative(-0.892f, 3.269f)
                lineToRelative(-0.014f, 0.058f)
                curveTo(2.113f, 5.568f, 1.0f, 6.006f, 1.0f, 6.5f)
                curveTo(1.0f, 7.328f, 4.134f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(7.0f, -0.672f, 7.0f, -1.5f)
                curveToRelative(0.0f, -0.494f, -1.113f, -0.932f, -2.83f, -1.205f)
                lineToRelative(-0.014f, -0.058f)
                lineToRelative(-0.892f, -3.27f)
                curveToRelative(-0.146f, -0.533f, -0.698f, -0.849f, -1.239f, -0.734f)
                curveTo(9.411f, 1.363f, 8.62f, 1.5f, 8.0f, 1.5f)
                reflectiveCurveToRelative(-1.411f, -0.136f, -2.025f, -0.267f)
                curveToRelative(-0.541f, -0.115f, -1.093f, 0.2f, -1.239f, 0.735f)
                moveToRelative(0.015f, 3.867f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.274f, -0.224f)
                curveToRelative(0.9f, 0.092f, 1.91f, 0.143f, 2.975f, 0.143f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 2.975f, -0.143f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.05f, 0.498f)
                curveToRelative(-0.918f, 0.093f, -1.944f, 0.145f, -3.025f, 0.145f)
                reflectiveCurveToRelative(-2.107f, -0.052f, -3.025f, -0.145f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.224f, -0.274f)
                moveTo(3.5f, 10.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(-1.5f, 0.5f)
                quadToRelative(0.001f, -0.264f, 0.085f, -0.5f)
                lineTo(2.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.488f, 1.312f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.024f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 9.0f)
                lineTo(14.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.085f)
                quadToRelative(0.084f, 0.236f, 0.085f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                verticalLineToRelative(-0.14f)
                lineToRelative(-0.21f, -0.07f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.58f, 0.0f)
                lineToRelative(-0.21f, 0.07f)
                verticalLineToRelative(0.14f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(10.5f, 10.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
