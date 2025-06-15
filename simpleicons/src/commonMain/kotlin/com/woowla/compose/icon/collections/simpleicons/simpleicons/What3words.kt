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

public val Simpleicons.What3words: ImageVector
    get() {
        if (_what3words != null) {
            return _what3words!!
        }
        _what3words = Builder(name = "What3words", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(13.515f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.696f, 0.987f)
                lineToRelative(-3.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.711f, 0.513f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.712f, -0.987f)
                lineToRelative(3.0f, -9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.727f, -0.513f)
                close()
                moveTo(9.016f, 6.752f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.695f, 0.985f)
                lineToRelative(-3.0f, 9.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.712f, -0.987f)
                lineToRelative(3.0f, -9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.728f, -0.511f)
                close()
                moveTo(18.016f, 6.752f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.695f, 0.985f)
                lineToRelative(-3.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.711f, 0.513f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.712f, -0.987f)
                lineToRelative(3.0f, -9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.728f, -0.511f)
                close()
            }
        }
        .build()
        return _what3words!!
    }

private var _what3words: ImageVector? = null
