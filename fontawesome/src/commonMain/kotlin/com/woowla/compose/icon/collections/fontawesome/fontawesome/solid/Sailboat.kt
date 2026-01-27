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

public val SolidGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 35.9f)
                lineToRelative(0.0f, 348.1f)
                lineToRelative(-224.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-208.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(161.7f, 0.0f)
                curveToRelative(12.9f, 0.0f, 20.5f, -14.4f, 13.2f, -25.0f)
                lineTo(269.2f, 26.9f)
                curveToRelative(-8.9f, -13.0f, -29.2f, -6.7f, -29.2f, 9.0f)
                close()
                moveTo(192.0f, 320.0f)
                lineToRelative(0.0f, -184.2f)
                curveToRelative(0.0f, -16.1f, -21.0f, -22.1f, -29.6f, -8.5f)
                lineTo(47.3f, 311.5f)
                curveToRelative(-6.7f, 10.7f, 1.0f, 24.5f, 13.6f, 24.5f)
                lineTo(176.0f, 336.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
