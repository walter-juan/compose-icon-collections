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

public val BrandsGroup.Xmpp: ImageVector
    get() {
        if (_xmpp != null) {
            return _xmpp!!
        }
        _xmpp = Builder(name = "Xmpp", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 47.2f)
                curveToRelative(3.5f, 137.1f, 117.1f, 278.6f, 252.9f, 356.7f)
                curveToRelative(-31.5f, 25.0f, -67.2f, 44.1f, -106.2f, 53.9f)
                lineToRelative(0.0f, 5.4f)
                curveToRelative(56.4f, -2.3f, 98.1f, -20.1f, 141.3f, -40.7f)
                curveToRelative(65.7f, 34.6f, 122.2f, 39.9f, 141.4f, 40.7f)
                lineToRelative(0.0f, -5.4f)
                curveToRelative(-39.0f, -9.8f, -74.7f, -28.8f, -106.2f, -53.8f)
                curveToRelative(135.7f, -78.2f, 249.3f, -219.8f, 252.8f, -356.8f)
                curveToRelative(-58.4f, 25.7f, -119.1f, 44.2f, -180.1f, 62.3f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(3.4f, 59.0f, -20.2f, 170.4f, -107.9f, 262.3f)
                curveToRelative(-88.4f, -92.3f, -111.2f, -204.1f, -107.8f, -262.3f)
                lineToRelative(0.0f, 0.0f)
                curveTo(117.7f, 92.6f, 59.3f, 70.2f, 0.0f, 47.2f)
                close()
                moveTo(93.9f, 97.0f)
                lineToRelative(73.6f, 21.8f)
                curveTo(165.4f, 216.0f, 226.8f, 358.0f, 341.3f, 432.2f)
                curveTo(190.5f, 376.9f, 89.9f, 215.7f, 93.9f, 97.0f)
                close()
                moveTo(482.2f, 97.0f)
                curveToRelative(3.3f, 99.0f, -65.6f, 224.7f, -171.7f, 296.4f)
                curveToRelative(-4.7f, -4.1f, -9.3f, -8.4f, -13.8f, -12.7f)
                curveToRelative(77.0f, -80.2f, 113.2f, -186.3f, 111.9f, -261.9f)
                lineTo(482.1f, 97.0f)
                close()
                moveTo(264.5f, 410.5f)
                curveToRelative(3.0f, 1.6f, 5.9f, 3.2f, 8.9f, 4.7f)
                curveToRelative(-12.5f, 6.4f, -25.4f, 12.1f, -38.6f, 17.0f)
                curveToRelative(10.3f, -6.7f, 20.2f, -13.9f, 29.7f, -21.7f)
                close()
            }
        }
        .build()
        return _xmpp!!
    }

private var _xmpp: ImageVector? = null
