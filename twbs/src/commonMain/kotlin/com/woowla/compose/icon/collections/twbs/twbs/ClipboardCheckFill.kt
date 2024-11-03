package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ClipboardCheckFill: ImageVector
    get() {
        if (_clipboardCheckFill != null) {
            return _clipboardCheckFill!!
        }
        _clipboardCheckFill = Builder(name = "ClipboardCheckFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 1.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 0.0f)
                close()
                moveTo(9.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.5f)
                lineTo(3.0f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(1.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(15.0f, 3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 2.5f)
                close()
                moveTo(10.854f, 8.854f)
                lineTo(7.854f, 11.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.708f)
                lineTo(7.5f, 10.793f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
            }
        }
        .build()
        return _clipboardCheckFill!!
    }

private var _clipboardCheckFill: ImageVector? = null
