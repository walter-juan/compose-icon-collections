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

public val Simpleicons.Playstationportable: ImageVector
    get() {
        if (_playstationportable != null) {
            return _playstationportable!!
        }
        _playstationportable = Builder(name = "Playstationportable", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.93f)
                verticalLineToRelative(0.296f)
                horizontalLineToRelative(7.182f)
                verticalLineToRelative(1.626f)
                lineTo(0.001f, 11.852f)
                verticalLineToRelative(2.217f)
                horizontalLineToRelative(0.295f)
                verticalLineToRelative(-1.921f)
                horizontalLineToRelative(7.182f)
                lineTo(7.478f, 9.93f)
                close()
                moveTo(11.29f, 9.93f)
                verticalLineToRelative(3.844f)
                lineTo(7.478f, 13.774f)
                verticalLineToRelative(0.296f)
                horizontalLineToRelative(4.124f)
                verticalLineToRelative(-3.844f)
                horizontalLineToRelative(3.813f)
                lineTo(15.415f, 9.93f)
                close()
                moveTo(16.523f, 9.93f)
                verticalLineToRelative(0.296f)
                horizontalLineToRelative(7.182f)
                verticalLineToRelative(1.626f)
                horizontalLineToRelative(-7.182f)
                verticalLineToRelative(2.217f)
                horizontalLineToRelative(0.296f)
                verticalLineToRelative(-1.921f)
                lineTo(24.0f, 12.148f)
                lineTo(24.0f, 9.93f)
                close()
            }
        }
        .build()
        return _playstationportable!!
    }

private var _playstationportable: ImageVector? = null
