package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = Builder(name = "Flickr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.334f, 6.666f)
                curveTo(2.388f, 6.666f, 0.0f, 9.055f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.946f, 2.388f, 5.334f, 5.334f, 5.334f)
                curveToRelative(2.946f, 0.0f, 5.332f, -2.388f, 5.332f, -5.334f)
                curveToRelative(0.0f, -2.945f, -2.386f, -5.334f, -5.332f, -5.334f)
                close()
                moveTo(18.666f, 6.666f)
                curveToRelative(-2.946f, 0.0f, -5.332f, 2.389f, -5.332f, 5.334f)
                curveToRelative(0.0f, 2.946f, 2.386f, 5.334f, 5.332f, 5.334f)
                curveTo(21.612f, 17.334f, 24.0f, 14.946f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.945f, -2.388f, -5.334f, -5.334f, -5.334f)
                close()
            }
        }
        .build()
        return _flickr!!
    }

private var _flickr: ImageVector? = null