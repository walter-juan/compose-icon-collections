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

public val SolidGroup.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) {
            return _clapperboard!!
        }
        _clapperboard = Builder(name = "Clapperboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 64.0f)
                curveToRelative(2.0f, 0.0f, 3.9f, 0.1f, 5.8f, 0.3f)
                lineToRelative(-95.7f, 95.7f)
                lineToRelative(67.9f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(8.8f, 11.0f, 14.0f, 24.9f, 14.0f, 40.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 128.0f)
                curveTo(0.0f, 92.7f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(70.1f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                lineToRelative(67.9f, 0.0f)
                lineToRelative(95.0f, -95.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(92.1f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                lineToRelative(67.9f, 0.0f)
                lineToRelative(95.0f, -95.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(86.1f, 0.0f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
