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

public val BrandsGroup.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineTo(34.9f, 427.8f)
                lineTo(191.5f, 480.0f)
                lineTo(349.1f, 427.8f)
                lineTo(384.0f, 32.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(308.2f, 159.9f)
                lineToRelative(-183.8f, 0.0f)
                lineToRelative(4.1f, 49.4f)
                lineToRelative(175.6f, 0.0f)
                lineToRelative(-13.6f, 148.4f)
                lineToRelative(-97.9f, 27.0f)
                lineToRelative(0.0f, 0.3f)
                lineToRelative(-1.1f, 0.0f)
                lineToRelative(-98.7f, -27.3f)
                lineToRelative(-6.0f, -75.8f)
                lineToRelative(47.7f, 0.0f)
                lineToRelative(3.5f, 38.1f)
                lineToRelative(53.5f, 14.5f)
                lineToRelative(53.7f, -14.5f)
                lineToRelative(6.0f, -62.2f)
                lineToRelative(-166.9f, 0.0f)
                lineToRelative(-12.8f, -145.6f)
                lineToRelative(241.1f, 0.0f)
                lineToRelative(-4.4f, 47.7f)
                close()
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
