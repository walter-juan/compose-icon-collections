package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Beekeeperstudio: ImageVector
    get() {
        if (_beekeeperstudio != null) {
            return _beekeeperstudio!!
        }
        _beekeeperstudio = Builder(name = "Beekeeperstudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.009f, 4.624f)
                lineTo(13.854f, 0.505f)
                curveToRelative(-1.165f, -0.673f, -2.593f, -0.673f, -3.742f, 0.0f)
                lineTo(8.242f, 1.588f)
                verticalLineToRelative(10.42f)
                curveToRelative(0.0f, 1.329f, 0.706f, 2.576f, 1.871f, 3.249f)
                curveToRelative(0.574f, 0.328f, 1.231f, 0.509f, 1.871f, 0.509f)
                reflectiveCurveToRelative(1.296f, -0.164f, 1.871f, -0.509f)
                curveToRelative(1.165f, -0.673f, 1.871f, -1.904f, 1.871f, -3.249f)
                curveToRelative(0.0f, -1.329f, -0.706f, -2.576f, -1.871f, -3.249f)
                curveToRelative(-0.574f, -0.328f, -1.231f, -0.509f, -1.871f, -0.509f)
                lineTo(11.984f, 5.904f)
                curveToRelative(0.64f, 0.0f, 1.296f, 0.164f, 1.871f, 0.509f)
                lineToRelative(2.035f, 1.181f)
                curveToRelative(1.165f, 0.673f, 1.871f, 1.904f, 1.871f, 3.249f)
                verticalLineToRelative(2.347f)
                curveToRelative(0.0f, 1.329f, -0.706f, 2.576f, -1.871f, 3.249f)
                lineToRelative(-2.035f, 1.181f)
                curveToRelative(-0.574f, 0.328f, -1.231f, 0.509f, -1.871f, 0.509f)
                reflectiveCurveToRelative(-1.296f, -0.164f, -1.871f, -0.509f)
                lineTo(8.078f, 16.439f)
                curveToRelative(-1.165f, -0.673f, -1.871f, -1.904f, -1.871f, -3.249f)
                lineTo(6.207f, 2.753f)
                lineTo(2.974f, 4.624f)
                curveToRelative(-1.165f, 0.673f, -1.871f, 1.904f, -1.871f, 3.249f)
                verticalLineToRelative(8.254f)
                curveToRelative(0.0f, 1.329f, 0.706f, 2.576f, 1.871f, 3.249f)
                lineToRelative(7.155f, 4.119f)
                curveToRelative(1.165f, 0.673f, 2.593f, 0.673f, 3.742f, 0.0f)
                lineToRelative(7.155f, -4.119f)
                curveToRelative(1.165f, -0.673f, 1.871f, -1.904f, 1.871f, -3.249f)
                lineTo(22.896f, 7.873f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, -1.887f, -3.249f)
                close()
                moveTo(9.686f, 9.054f)
                curveToRelative(-0.213f, 0.164f, -0.394f, 0.345f, -0.558f, 0.541f)
                lineTo(9.128f, 6.97f)
                lineToRelative(0.558f, -0.328f)
                verticalLineToRelative(2.412f)
                close()
                moveTo(11.114f, 8.365f)
                curveToRelative(-0.197f, 0.049f, -0.377f, 0.098f, -0.558f, 0.181f)
                verticalLineToRelative(-2.363f)
                curveToRelative(0.181f, -0.082f, 0.377f, -0.131f, 0.558f, -0.181f)
                verticalLineToRelative(2.363f)
                close()
            }
        }
        .build()
        return _beekeeperstudio!!
    }

private var _beekeeperstudio: ImageVector? = null
