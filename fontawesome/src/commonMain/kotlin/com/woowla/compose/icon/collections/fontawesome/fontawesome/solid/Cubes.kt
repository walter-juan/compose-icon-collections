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

public val SolidGroup.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.0f, -1.3f)
                curveToRelative(-17.3f, -10.0f, -38.7f, -10.0f, -56.0f, 0.0f)
                lineTo(143.8f, 47.3f)
                curveToRelative(-17.3f, 10.0f, -28.0f, 28.5f, -28.0f, 48.5f)
                lineToRelative(0.0f, 101.9f)
                lineToRelative(-88.3f, 51.0f)
                curveToRelative(-17.3f, 10.0f, -28.0f, 28.5f, -28.0f, 48.5f)
                lineToRelative(0.0f, 97.3f)
                curveToRelative(0.0f, 20.0f, 10.7f, 38.5f, 28.0f, 48.5f)
                lineToRelative(84.3f, 48.6f)
                curveToRelative(17.3f, 10.0f, 38.7f, 10.0f, 56.0f, 0.0f)
                lineToRelative(88.3f, -51.0f)
                lineToRelative(88.3f, 51.0f)
                curveToRelative(17.3f, 10.0f, 38.7f, 10.0f, 56.0f, 0.0f)
                lineTo(484.5f, 443.0f)
                curveToRelative(17.3f, -10.0f, 28.0f, -28.5f, 28.0f, -48.5f)
                lineToRelative(0.0f, -97.3f)
                curveToRelative(0.0f, -20.0f, -10.7f, -38.5f, -28.0f, -48.5f)
                lineToRelative(-88.3f, -51.0f)
                lineToRelative(0.0f, -101.9f)
                curveToRelative(0.0f, -20.0f, -10.7f, -38.5f, -28.0f, -48.5f)
                lineTo(284.0f, -1.3f)
                close()
                moveTo(232.0f, 292.6f)
                lineToRelative(0.0f, 106.5f)
                lineToRelative(-88.3f, 51.0f)
                curveToRelative(-1.2f, 0.7f, -2.6f, 1.1f, -4.0f, 1.1f)
                lineToRelative(0.0f, -105.3f)
                lineToRelative(92.3f, -53.3f)
                close()
                moveTo(463.4f, 293.2f)
                curveToRelative(0.7f, 1.2f, 1.1f, 2.6f, 1.1f, 4.0f)
                lineToRelative(0.0f, 97.3f)
                curveToRelative(0.0f, 2.9f, -1.5f, 5.5f, -4.0f, 6.9f)
                lineToRelative(-84.3f, 48.6f)
                curveToRelative(-1.2f, 0.7f, -2.6f, 1.1f, -4.0f, 1.1f)
                lineToRelative(0.0f, -105.3f)
                lineToRelative(91.2f, -52.6f)
                close()
                moveTo(348.3f, 95.8f)
                lineToRelative(0.0f, 101.9f)
                lineToRelative(-92.3f, 53.3f)
                lineToRelative(0.0f, -106.5f)
                lineToRelative(91.2f, -52.6f)
                curveToRelative(0.7f, 1.2f, 1.1f, 2.6f, 1.1f, 4.0f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
