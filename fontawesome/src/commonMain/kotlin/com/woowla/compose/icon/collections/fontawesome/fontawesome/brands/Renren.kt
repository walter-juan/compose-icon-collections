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

public val BrandsGroup.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 169.1f)
                curveTo(214.0f, 279.5f, 153.0f, 374.5f, 66.4f, 416.5f)
                curveTo(30.0f, 373.2f, 8.0f, 317.7f, 8.0f, 256.6f)
                curveTo(8.0f, 133.9f, 97.1f, 32.2f, 214.0f, 12.5f)
                lineToRelative(0.0f, 156.6f)
                close()
                moveTo(255.0f, 504.0f)
                curveToRelative(-42.9f, 0.0f, -83.3f, -11.0f, -118.5f, -30.4f)
                curveToRelative(57.2f, -36.1f, 103.4f, -90.7f, 118.5f, -154.6f)
                curveToRelative(15.5f, 63.9f, 61.7f, 118.5f, 118.8f, 154.7f)
                curveToRelative(-35.1f, 19.3f, -75.5f, 30.3f, -118.8f, 30.3f)
                close()
                moveTo(445.6f, 416.5f)
                curveTo(359.0f, 374.5f, 298.0f, 279.6f, 298.0f, 169.1f)
                lineToRelative(0.0f, -156.6f)
                curveToRelative(116.9f, 19.7f, 206.0f, 121.4f, 206.0f, 244.1f)
                curveToRelative(0.0f, 61.1f, -22.0f, 116.6f, -58.4f, 159.9f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
