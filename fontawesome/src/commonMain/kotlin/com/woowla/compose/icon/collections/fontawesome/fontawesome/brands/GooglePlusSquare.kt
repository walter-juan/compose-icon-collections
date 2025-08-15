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

public val BrandsGroup.GooglePlusSquare: ImageVector
    get() {
        if (_googlePlusSquare != null) {
            return _googlePlusSquare!!
        }
        _googlePlusSquare = Builder(name = "GooglePlusSquare", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                close()
                moveTo(64.0f, 256.0f)
                curveToRelative(0.0f, -55.3f, 44.7f, -100.0f, 100.0f, -100.0f)
                curveToRelative(27.0f, 0.0f, 49.5f, 9.8f, 67.0f, 26.2f)
                lineToRelative(-27.1f, 26.1f)
                curveToRelative(-7.4f, -7.1f, -20.3f, -15.4f, -39.8f, -15.4f)
                curveToRelative(-34.1f, 0.0f, -61.9f, 28.2f, -61.9f, 63.2f)
                curveToRelative(0.0f, 34.9f, 27.8f, 63.2f, 61.9f, 63.2f)
                curveToRelative(39.6f, 0.0f, 54.4f, -28.5f, 56.8f, -43.1f)
                lineToRelative(-56.9f, 0.0f)
                lineToRelative(0.0f, -34.4f)
                lineToRelative(94.4f, 0.0f)
                curveToRelative(1.0f, 5.0f, 1.6f, 10.1f, 1.6f, 16.6f)
                curveToRelative(0.0f, 57.1f, -38.3f, 97.6f, -96.0f, 97.6f)
                curveToRelative(-55.3f, 0.0f, -100.0f, -44.7f, -100.0f, -100.0f)
                close()
                moveTo(355.0f, 274.2f)
                lineToRelative(0.0f, 29.0f)
                lineToRelative(-29.2f, 0.0f)
                lineToRelative(0.0f, -29.0f)
                lineToRelative(-29.0f, 0.0f)
                lineToRelative(0.0f, -29.2f)
                lineToRelative(29.0f, 0.0f)
                lineToRelative(0.0f, -29.0f)
                lineToRelative(29.2f, 0.0f)
                lineToRelative(0.0f, 29.0f)
                lineToRelative(29.0f, 0.0f)
                lineToRelative(0.0f, 29.2f)
                lineToRelative(-29.0f, 0.0f)
                close()
            }
        }
        .build()
        return _googlePlusSquare!!
    }

private var _googlePlusSquare: ImageVector? = null
