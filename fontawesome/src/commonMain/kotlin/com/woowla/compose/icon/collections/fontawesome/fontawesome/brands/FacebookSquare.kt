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

public val BrandsGroup.FacebookSquare: ImageVector
    get() {
        if (_facebookSquare != null) {
            return _facebookSquare!!
        }
        _facebookSquare = Builder(name = "FacebookSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(98.2f, 0.0f)
                lineToRelative(0.0f, -145.8f)
                lineToRelative(-52.8f, 0.0f)
                lineToRelative(0.0f, -78.2f)
                lineToRelative(52.8f, 0.0f)
                lineToRelative(0.0f, -33.7f)
                curveToRelative(0.0f, -87.1f, 39.4f, -127.5f, 125.0f, -127.5f)
                curveToRelative(16.2f, 0.0f, 44.2f, 3.2f, 55.7f, 6.4f)
                lineToRelative(0.0f, 70.8f)
                curveToRelative(-6.0f, -0.6f, -16.5f, -1.0f, -29.6f, -1.0f)
                curveToRelative(-42.0f, 0.0f, -58.2f, 15.9f, -58.2f, 57.2f)
                lineToRelative(0.0f, 27.8f)
                lineToRelative(83.6f, 0.0f)
                lineToRelative(-14.4f, 78.2f)
                lineToRelative(-69.3f, 0.0f)
                lineToRelative(0.0f, 145.8f)
                lineToRelative(129.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
            }
        }
        .build()
        return _facebookSquare!!
    }

private var _facebookSquare: ImageVector? = null
