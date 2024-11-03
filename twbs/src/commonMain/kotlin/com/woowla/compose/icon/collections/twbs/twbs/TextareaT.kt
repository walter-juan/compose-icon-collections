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

public val Twbs.TextareaT: ImageVector
    get() {
        if (_textareaT != null) {
            return _textareaT!!
        }
        _textareaT = Builder(name = "TextareaT", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.563f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.874f)
                lineTo(14.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                lineTo(1.5f, 9.937f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.874f)
                close()
                moveTo(2.5f, 6.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.874f)
                lineTo(2.5f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(13.5f, 9.937f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.874f)
                lineTo(13.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(2.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.434f, 4.0f)
                horizontalLineTo(4.566f)
                lineTo(4.5f, 5.994f)
                horizontalLineToRelative(0.386f)
                curveToRelative(0.21f, -1.252f, 0.612f, -1.446f, 2.173f, -1.495f)
                lineToRelative(0.343f, -0.011f)
                verticalLineToRelative(6.343f)
                curveToRelative(0.0f, 0.537f, -0.116f, 0.665f, -1.049f, 0.748f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(3.294f)
                verticalLineToRelative(-0.421f)
                curveToRelative(-0.938f, -0.083f, -1.054f, -0.21f, -1.054f, -0.748f)
                verticalLineTo(4.488f)
                lineToRelative(0.348f, 0.01f)
                curveToRelative(1.56f, 0.05f, 1.963f, 0.244f, 2.173f, 1.496f)
                horizontalLineToRelative(0.386f)
                close()
            }
        }
        .build()
        return _textareaT!!
    }

private var _textareaT: ImageVector? = null
