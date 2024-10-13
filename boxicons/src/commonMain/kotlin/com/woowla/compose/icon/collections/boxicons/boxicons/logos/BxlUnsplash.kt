package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlUnsplash: ImageVector
    get() {
        if (_bxlUnsplash != null) {
            return _bxlUnsplash!!
        }
        _bxlUnsplash = Builder(name = "BxlUnsplash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.625f, 8.063f)
                lineTo(8.625f, 3.0f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(5.063f)
                horizontalLineToRelative(-6.75f)
                close()
                moveTo(15.375f, 10.875f)
                lineTo(21.0f, 10.875f)
                lineTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.875f)
                horizontalLineToRelative(5.625f)
                verticalLineToRelative(5.063f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(-5.063f)
                close()
            }
        }
        .build()
        return _bxlUnsplash!!
    }

private var _bxlUnsplash: ImageVector? = null
