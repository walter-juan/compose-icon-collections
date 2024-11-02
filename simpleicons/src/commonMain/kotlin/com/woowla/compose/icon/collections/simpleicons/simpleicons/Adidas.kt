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

public val Simpleicons.Adidas: ImageVector
    get() {
        if (_adidas != null) {
            return _adidas!!
        }
        _adidas = Builder(name = "Adidas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.535f)
                lineToRelative(-8.697f, -15.07f)
                lineToRelative(-4.659f, 2.687f)
                lineToRelative(7.145f, 12.383f)
                close()
                moveTo(15.713f, 19.535f)
                lineTo(9.969f, 9.59f)
                lineTo(5.31f, 12.277f)
                lineToRelative(4.192f, 7.258f)
                close()
                moveTo(4.658f, 14.723f)
                lineToRelative(2.776f, 4.812f)
                lineTo(1.223f, 19.535f)
                lineTo(0.0f, 17.41f)
                close()
            }
        }
        .build()
        return _adidas!!
    }

private var _adidas: ImageVector? = null
