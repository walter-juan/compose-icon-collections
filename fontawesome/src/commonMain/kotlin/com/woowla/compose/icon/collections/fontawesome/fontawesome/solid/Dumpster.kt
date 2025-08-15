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

public val SolidGroup.Dumpster: ImageVector
    get() {
        if (_dumpster != null) {
            return _dumpster!!
        }
        _dumpster = Builder(name = "Dumpster", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.3f, 64.0f)
                lineTo(106.7f, 192.0f)
                lineTo(24.0f, 192.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -4.1f)
                curveToRelative(0.0f, -2.6f, 0.4f, -5.1f, 1.2f, -7.6f)
                lineTo(26.5f, 80.4f)
                curveTo(29.8f, 70.6f, 39.0f, 64.0f, 49.3f, 64.0f)
                lineToRelative(83.0f, 0.0f)
                close()
                moveTo(155.7f, 192.0f)
                lineToRelative(25.6f, -128.0f)
                lineToRelative(82.7f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-108.3f, 0.0f)
                close()
                moveTo(312.0f, 64.0f)
                lineToRelative(82.7f, 0.0f)
                lineToRelative(25.6f, 128.0f)
                lineToRelative(-108.3f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                close()
                moveTo(443.7f, 64.0f)
                lineToRelative(83.0f, 0.0f)
                curveToRelative(10.3f, 0.0f, 19.5f, 6.6f, 22.8f, 16.4f)
                lineToRelative(25.3f, 75.9f)
                curveToRelative(0.8f, 2.4f, 1.2f, 5.0f, 1.2f, 7.6f)
                lineToRelative(0.0f, 4.1f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-82.7f, 0.0f)
                lineToRelative(-25.6f, -128.0f)
                close()
                moveTo(25.7f, 240.0f)
                lineToRelative(524.7f, 0.0f)
                curveToRelative(-0.4f, 2.1f, -13.3f, 73.4f, -38.9f, 213.7f)
                curveToRelative(-3.0f, 16.3f, -17.9f, 27.6f, -34.4f, 26.1f)
                reflectiveCurveTo(448.0f, 464.6f, 448.0f, 448.0f)
                lineToRelative(0.0f, -16.0f)
                lineToRelative(-320.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 16.6f, -12.6f, 30.4f, -29.1f, 31.9f)
                reflectiveCurveTo(67.5f, 470.0f, 64.5f, 453.7f)
                curveTo(39.0f, 313.3f, 26.0f, 242.1f, 25.7f, 240.0f)
                close()
            }
        }
        .build()
        return _dumpster!!
    }

private var _dumpster: ImageVector? = null
