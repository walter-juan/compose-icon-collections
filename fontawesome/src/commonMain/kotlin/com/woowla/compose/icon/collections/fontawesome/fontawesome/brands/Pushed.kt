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

public val BrandsGroup.Pushed: ImageVector
    get() {
        if (_pushed != null) {
            return _pushed!!
        }
        _pushed = Builder(name = "Pushed", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.1f, 111.9f)
                lineToRelative(-98.5f, -9.0f)
                lineToRelative(14.0f, -33.4f)
                curveToRelative(10.4f, -23.5f, -10.8f, -40.4f, -28.7f, -37.0f)
                lineTo(30.6f, 76.9f)
                curveToRelative(-15.1f, 2.7f, -26.0f, 18.3f, -21.4f, 36.6f)
                lineTo(114.3f, 461.8f)
                curveToRelative(6.5f, 21.3f, 36.7f, 24.2f, 47.7f, 7.0f)
                lineTo(197.3f, 388.0f)
                lineTo(432.5f, 156.7f)
                curveToRelative(16.4f, -16.8f, 4.3f, -42.9f, -17.4f, -44.8f)
                close()
                moveTo(305.7f, 53.6f)
                curveToRelative(5.1f, -0.7f, 7.5f, 2.5f, 5.2f, 7.4f)
                lineToRelative(-16.8f, 39.9f)
                lineToRelative(-177.4f, -16.3f)
                lineToRelative(189.0f, -31.0f)
                close()
                moveTo(30.8f, 107.9f)
                curveToRelative(-3.1f, -5.1f, 1.0f, -10.0f, 6.1f, -9.1f)
                lineToRelative(248.7f, 22.7f)
                lineToRelative(-96.9f, 230.7f)
                lineToRelative(-157.9f, -244.3f)
                close()
                moveTo(144.1f, 456.4f)
                curveToRelative(-2.6f, 4.0f, -7.9f, 3.1f, -9.4f, -1.2f)
                lineTo(51.6f, 179.7f)
                lineTo(179.3f, 377.3f)
                curveToRelative(-7.0f, 15.0f, -35.2f, 79.1f, -35.2f, 79.1f)
                close()
                moveTo(416.9f, 141.9f)
                lineToRelative(-198.7f, 195.4f)
                lineToRelative(89.7f, -213.7f)
                lineToRelative(106.4f, 9.7f)
                curveToRelative(4.0f, 1.1f, 5.7f, 5.3f, 2.6f, 8.6f)
                close()
            }
        }
        .build()
        return _pushed!!
    }

private var _pushed: ImageVector? = null
