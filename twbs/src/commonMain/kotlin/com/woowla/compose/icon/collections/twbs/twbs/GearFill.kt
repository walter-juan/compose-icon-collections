package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GearFill: ImageVector
    get() {
        if (_gearFill != null) {
            return _gearFill!!
        }
        _gearFill = Builder(name = "GearFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.405f, 1.05f)
                curveToRelative(-0.413f, -1.4f, -2.397f, -1.4f, -2.81f, 0.0f)
                lineToRelative(-0.1f, 0.34f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, -2.105f, 0.872f)
                lineToRelative(-0.31f, -0.17f)
                curveToRelative(-1.283f, -0.698f, -2.686f, 0.705f, -1.987f, 1.987f)
                lineToRelative(0.169f, 0.311f)
                curveToRelative(0.446f, 0.82f, 0.023f, 1.841f, -0.872f, 2.105f)
                lineToRelative(-0.34f, 0.1f)
                curveToRelative(-1.4f, 0.413f, -1.4f, 2.397f, 0.0f, 2.81f)
                lineToRelative(0.34f, 0.1f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, 0.872f, 2.105f)
                lineToRelative(-0.17f, 0.31f)
                curveToRelative(-0.698f, 1.283f, 0.705f, 2.686f, 1.987f, 1.987f)
                lineToRelative(0.311f, -0.169f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, 2.105f, 0.872f)
                lineToRelative(0.1f, 0.34f)
                curveToRelative(0.413f, 1.4f, 2.397f, 1.4f, 2.81f, 0.0f)
                lineToRelative(0.1f, -0.34f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, 2.105f, -0.872f)
                lineToRelative(0.31f, 0.17f)
                curveToRelative(1.283f, 0.698f, 2.686f, -0.705f, 1.987f, -1.987f)
                lineToRelative(-0.169f, -0.311f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, 0.872f, -2.105f)
                lineToRelative(0.34f, -0.1f)
                curveToRelative(1.4f, -0.413f, 1.4f, -2.397f, 0.0f, -2.81f)
                lineToRelative(-0.34f, -0.1f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, -0.872f, -2.105f)
                lineToRelative(0.17f, -0.31f)
                curveToRelative(0.698f, -1.283f, -0.705f, -2.686f, -1.987f, -1.987f)
                lineToRelative(-0.311f, 0.169f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, true, -2.105f, -0.872f)
                close()
                moveTo(8.0f, 10.93f)
                arcToRelative(2.929f, 2.929f, 0.0f, true, true, 0.0f, -5.86f)
                arcToRelative(2.929f, 2.929f, 0.0f, false, true, 0.0f, 5.858f)
                close()
            }
        }
        .build()
        return _gearFill!!
    }

private var _gearFill: ImageVector? = null
