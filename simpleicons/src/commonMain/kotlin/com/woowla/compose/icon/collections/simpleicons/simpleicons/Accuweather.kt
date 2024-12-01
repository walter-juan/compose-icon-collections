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

public val Simpleicons.Accuweather: ImageVector
    get() {
        if (_accuweather != null) {
            return _accuweather!!
        }
        _accuweather = Builder(name = "Accuweather", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.74f, 6.772f)
                arcToRelative(7.436f, 7.436f, 0.0f, false, true, 10.519f, 0.0f)
                arcToRelative(7.432f, 7.432f, 0.0f, false, true, 0.0f, 10.515f)
                arcToRelative(7.436f, 7.436f, 0.0f, false, true, -10.52f, 0.0f)
                curveToRelative(-2.904f, -2.905f, -2.904f, -7.64f, 0.0f, -10.515f)
                moveTo(12.0f, 20.337f)
                curveToRelative(-4.59f, 0.0f, -8.338f, -3.747f, -8.338f, -8.337f)
                reflectiveCurveToRelative(3.748f, -8.308f, 8.338f, -8.308f)
                curveToRelative(4.591f, 0.0f, 8.31f, 3.748f, 8.31f, 8.308f)
                curveToRelative(0.0f, 4.619f, -3.719f, 8.337f, -8.31f, 8.337f)
                close()
                moveTo(24.0f, 11.971f)
                lineTo(21.27f, 9.5f)
                lineToRelative(1.103f, -3.514f)
                lineToRelative(-3.603f, -0.784f)
                lineToRelative(-0.784f, -3.602f)
                lineToRelative(-3.515f, 1.133f)
                lineTo(11.97f, 0.004f)
                lineToRelative(-2.47f, 2.73f)
                lineTo(5.986f, 1.63f)
                lineTo(5.2f, 5.231f)
                lineToRelative(-3.602f, 0.785f)
                lineToRelative(1.133f, 3.515f)
                lineTo(0.0f, 12.03f)
                lineToRelative(2.732f, 2.47f)
                lineToRelative(-1.105f, 3.514f)
                lineToRelative(3.603f, 0.784f)
                lineToRelative(0.784f, 3.603f)
                lineToRelative(3.516f, -1.134f)
                lineToRelative(2.5f, 2.731f)
                lineToRelative(2.468f, -2.73f)
                lineToRelative(3.516f, 1.103f)
                lineToRelative(0.785f, -3.602f)
                lineToRelative(3.603f, -0.813f)
                lineToRelative(-1.134f, -3.515f)
                lineTo(24.0f, 11.97f)
                close()
            }
        }
        .build()
        return _accuweather!!
    }

private var _accuweather: ImageVector? = null
