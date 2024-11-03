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

public val Twbs.Basket2Fill: ImageVector
    get() {
        if (_basket2Fill != null) {
            return _basket2Fill!!
        }
        _basket2Fill = Builder(name = "Basket2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.929f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.858f, -0.514f)
                lineTo(2.217f, 6.0f)
                lineTo(0.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.623f)
                lineToRelative(1.844f, 6.456f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 3.69f, 15.0f)
                horizontalLineToRelative(8.622f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.722f, -0.544f)
                lineTo(14.877f, 8.0f)
                horizontalLineToRelative(0.623f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.717f)
                lineTo(10.93f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.858f, 0.514f)
                lineTo(12.617f, 6.0f)
                lineTo(3.383f, 6.0f)
                close()
                moveTo(4.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                close()
                moveTo(7.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                close()
                moveTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _basket2Fill!!
    }

private var _basket2Fill: ImageVector? = null
