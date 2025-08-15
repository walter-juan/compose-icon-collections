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

public val SolidGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.5f, 220.3f)
                curveToRelative(-12.7f, 22.2f, -12.7f, 49.4f, 0.0f, 71.5f)
                lineToRelative(96.2f, 168.1f)
                curveToRelative(12.8f, 22.4f, 36.7f, 36.2f, 62.5f, 36.2f)
                lineToRelative(191.6f, 0.0f)
                curveToRelative(25.8f, 0.0f, 49.7f, -13.8f, 62.5f, -36.2f)
                lineToRelative(96.2f, -168.1f)
                curveToRelative(12.7f, -22.2f, 12.7f, -49.4f, 0.0f, -71.5f)
                lineTo(446.3f, 52.2f)
                curveTo(433.5f, 29.8f, 409.6f, 16.0f, 383.8f, 16.0f)
                lineTo(192.2f, 16.0f)
                curveToRelative(-25.8f, 0.0f, -49.7f, 13.8f, -62.5f, 36.2f)
                lineTo(33.5f, 220.3f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
