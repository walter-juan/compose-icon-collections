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

public val Simpleicons.Eac: ImageVector
    get() {
        if (_eac != null) {
            return _eac!!
        }
        _eac = Builder(name = "Eac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.667f, 24.0f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.667f)
                lineTo(2.667f, 21.333f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.666f)
                lineTo(2.667f, 10.667f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.667f)
                lineTo(5.334f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(24.001f, 21.333f)
                horizontalLineToRelative(-2.668f)
                lineTo(21.333f, 2.667f)
                horizontalLineToRelative(2.668f)
                lineTo(24.001f, 0.0f)
                horizontalLineToRelative(-5.333f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(5.333f)
                close()
                moveTo(13.334f, 0.0f)
                lineTo(8.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(2.667f)
                lineTo(10.667f, 13.335f)
                horizontalLineToRelative(2.667f)
                lineTo(13.334f, 24.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 0.0f)
                close()
                moveTo(13.334f, 10.667f)
                horizontalLineToRelative(-2.667f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.667f)
                close()
            }
        }
        .build()
        return _eac!!
    }

private var _eac: ImageVector? = null
