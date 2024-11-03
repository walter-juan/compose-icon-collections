package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.757f, 1.071f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.172f, 0.686f)
                lineTo(3.383f, 6.0f)
                horizontalLineToRelative(9.234f)
                lineTo(10.07f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.858f, -0.514f)
                lineTo(13.783f, 6.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 1.0f, 13.5f)
                lineTo(1.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(0.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.217f)
                lineTo(5.07f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.686f, -0.172f)
                close()
                moveTo(2.0f, 9.0f)
                verticalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 15.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(1.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(4.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 10.0f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 10.0f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.0f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
