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

public val Simpleicons.Nexon: ImageVector
    get() {
        if (_nexon != null) {
            return _nexon!!
        }
        _nexon = Builder(name = "Nexon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.714f, 15.358f)
                lineTo(10.714f, 0.0f)
                lineTo(0.0f, 5.697f)
                verticalLineToRelative(15.358f)
                lineTo(13.29f, 24.0f)
                lineTo(24.0f, 18.303f)
                close()
                moveTo(1.219f, 14.139f)
                lineTo(8.51f, 15.707f)
                lineTo(1.219f, 19.539f)
                close()
                moveTo(13.114f, 22.717f)
                lineTo(2.35f, 20.327f)
                lineToRelative(7.454f, -3.926f)
                lineToRelative(10.846f, 2.406f)
                close()
            }
        }
        .build()
        return _nexon!!
    }

private var _nexon: ImageVector? = null
