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

public val BrandsGroup.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(name = "Sketch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.8f, 162.2f)
                lineToRelative(-18.5f, 24.9f)
                lineToRelative(90.5f, 0.0f)
                lineToRelative(6.9f, -130.7f)
                lineToRelative(-78.9f, 105.8f)
                close()
                moveTo(396.6f, 45.7f)
                lineTo(268.0f, 32.0f)
                lineTo(403.7f, 179.2f)
                lineTo(396.6f, 45.7f)
                close()
                moveTo(112.5f, 218.3f)
                lineToRelative(-11.2f, -22.0f)
                lineToRelative(-91.1f, 0.0f)
                lineToRelative(224.9f, 261.7f)
                lineToRelative(-122.6f, -239.7f)
                close()
                moveTo(114.5f, 187.1f)
                lineToRelative(284.0f, 0.0f)
                curveTo(340.6f, 124.3f, 293.3f, 72.9f, 256.6f, 33.0f)
                lineTo(114.5f, 187.1f)
                close()
                moveTo(411.8f, 196.2f)
                lineToRelative(-133.9f, 261.8f)
                lineToRelative(224.8f, -261.7f)
                lineToRelative(-90.9f, 0.0f)
                lineToRelative(0.0f, -0.1f)
                close()
                moveTo(415.7f, 69.0f)
                lineToRelative(-9.4f, -12.6f)
                lineToRelative(0.9f, 17.3f)
                lineToRelative(6.1f, 113.4f)
                lineToRelative(90.3f, 0.0f)
                lineToRelative(-87.9f, -118.1f)
                close()
                moveTo(113.8f, 93.5f)
                lineTo(109.2f, 179.1f)
                lineTo(245.0f, 32.0f)
                lineTo(116.4f, 45.7f)
                lineTo(113.8f, 93.5f)
                close()
                moveTo(401.5f, 196.2f)
                lineToRelative(-290.0f, 0.0f)
                curveToRelative(18.2f, 35.6f, 66.6f, 130.2f, 145.1f, 283.8f)
                lineTo(401.5f, 196.2f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
