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

public val BrandsGroup.Disqus: ImageVector
    get() {
        if (_disqus != null) {
            return _disqus!!
        }
        _disqus = Builder(name = "Disqus", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.2f, 512.0f)
                curveToRelative(-62.6f, 0.0f, -119.9f, -22.9f, -164.2f, -60.8f)
                lineTo(17.0f, 466.1f)
                lineTo(59.1f, 362.2f)
                curveToRelative(-14.7f, -32.4f, -22.9f, -68.3f, -22.9f, -106.2f)
                curveToRelative(0.0f, -141.4f, 113.7f, -256.0f, 254.0f, -256.0f)
                curveToRelative(140.3f, 0.0f, 254.0f, 114.6f, 254.0f, 256.0f)
                curveToRelative(0.0f, 141.4f, -113.7f, 256.0f, -254.0f, 256.0f)
                close()
                moveTo(428.9f, 255.3f)
                lineToRelative(0.0f, -0.7f)
                curveTo(428.9f, 180.7f, 376.8f, 128.0f, 287.0f, 128.0f)
                lineToRelative(-97.0f, 0.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(95.6f, 0.0f)
                curveToRelative(90.5f, 0.0f, 143.4f, -54.9f, 143.4f, -128.7f)
                close()
                moveTo(288.0f, 321.1f)
                lineToRelative(-28.4f, 0.0f)
                lineToRelative(0.0f, -130.2f)
                lineToRelative(28.4f, 0.0f)
                curveToRelative(41.7f, 0.0f, 69.3f, 23.8f, 69.3f, 64.7f)
                lineToRelative(0.0f, 0.7f)
                curveToRelative(0.0f, 41.3f, -27.7f, 64.7f, -69.3f, 64.7f)
                close()
            }
        }
        .build()
        return _disqus!!
    }

private var _disqus: ImageVector? = null
