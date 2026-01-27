package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.ThinkPeaks: ImageVector
    get() {
        if (_thinkPeaks != null) {
            return _thinkPeaks!!
        }
        _thinkPeaks = Builder(name = "ThinkPeaks", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.4f, 409.4f)
                lineToRelative(87.1f, -150.2f)
                lineToRelative(-32.0f, -0.3f)
                lineToRelative(-55.1f, 95.0f)
                lineToRelative(-206.2f, -353.9f)
                lineToRelative(-236.2f, 407.4f)
                lineToRelative(32.0f, 0.3f)
                lineToRelative(204.2f, -352.1f)
                lineToRelative(206.2f, 353.8f)
                close()
                moveTo(110.1f, 365.3f)
                lineToRelative(32.1f, 0.0f)
                lineToRelative(117.4f, -202.5f)
                lineToRelative(203.4f, 349.1f)
                lineToRelative(32.5f, 0.1f)
                lineToRelative(-235.8f, -404.6f)
                lineToRelative(-149.6f, 257.9f)
                close()
            }
        }
        .build()
        return _thinkPeaks!!
    }

private var _thinkPeaks: ImageVector? = null
