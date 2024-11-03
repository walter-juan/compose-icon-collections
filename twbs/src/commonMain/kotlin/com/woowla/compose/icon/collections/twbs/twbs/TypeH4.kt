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

public val Twbs.TypeH4: ImageVector
    get() {
        if (_typeH4 != null) {
            return _typeH4!!
        }
        _typeH4 = Builder(name = "TypeH4", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.007f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.29f)
                verticalLineToRelative(-2.051f)
                horizontalLineTo(8.854f)
                verticalLineToRelative(-1.18f)
                curveTo(10.1f, 7.513f, 11.586f, 5.256f, 13.007f, 3.0f)
                moveToRelative(-2.82f, 6.777f)
                horizontalLineToRelative(3.524f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(-0.074f)
                arcToRelative(95.0f, 95.0f, 0.0f, false, false, -3.45f, 5.554f)
                close()
                moveTo(7.495f, 13.0f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.513f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _typeH4!!
    }

private var _typeH4: ImageVector? = null
