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

public val LogosGroup.BxlTwitch: ImageVector
    get() {
        if (_bxlTwitch != null) {
            return _bxlTwitch!!
        }
        _bxlTwitch = Builder(name = "BxlTwitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.265f, 3.0f)
                lineTo(3.0f, 6.236f)
                verticalLineToRelative(13.223f)
                horizontalLineToRelative(4.502f)
                lineTo(7.502f, 21.0f)
                lineToRelative(2.531f, 0.85f)
                lineToRelative(2.392f, -2.391f)
                horizontalLineToRelative(3.658f)
                lineToRelative(4.923f, -4.924f)
                lineTo(21.006f, 3.0f)
                lineTo(4.265f, 3.0f)
                close()
                moveTo(19.317f, 13.691f)
                lineTo(16.504f, 16.505f)
                horizontalLineToRelative(-4.502f)
                lineToRelative(-2.391f, 2.391f)
                verticalLineToRelative(-2.391f)
                lineTo(5.813f, 16.505f)
                lineTo(5.813f, 4.688f)
                horizontalLineToRelative(13.504f)
                verticalLineToRelative(9.003f)
                close()
                moveTo(16.505f, 7.924f)
                verticalLineToRelative(4.923f)
                horizontalLineToRelative(-1.688f)
                lineTo(14.817f, 7.924f)
                horizontalLineToRelative(1.688f)
                close()
                moveTo(12.003f, 7.924f)
                verticalLineToRelative(4.923f)
                horizontalLineToRelative(-1.688f)
                lineTo(10.315f, 7.924f)
                horizontalLineToRelative(1.688f)
                close()
            }
        }
        .build()
        return _bxlTwitch!!
    }

private var _bxlTwitch: ImageVector? = null
