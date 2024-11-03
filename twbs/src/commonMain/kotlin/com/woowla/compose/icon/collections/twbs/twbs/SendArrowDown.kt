package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.SendArrowDown: ImageVector
    get() {
        if (_sendArrowDown != null) {
            return _sendArrowDown!!
        }
        _sendArrowDown = Builder(name = "SendArrowDown", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.11f, 0.54f)
                lineToRelative(-2.8f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.928f, -0.372f)
                lineToRelative(1.895f, -4.738f)
                lineToRelative(-7.494f, 7.494f)
                lineToRelative(1.376f, 2.162f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.844f, 0.537f)
                lineToRelative(-1.531f, -2.407f)
                lineTo(0.643f, 7.184f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.124f, -1.33f)
                lineTo(15.314f, 0.037f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.54f, 0.11f)
                close()
                moveTo(5.93f, 9.363f)
                lineToRelative(7.494f, -7.494f)
                lineTo(1.591f, 6.602f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(0.354f, -1.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.722f, -0.016f)
                lineToRelative(-1.149f, -1.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.737f, -0.676f)
                lineToRelative(0.28f, 0.305f)
                verticalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(1.793f)
                lineToRelative(0.396f, -0.397f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _sendArrowDown!!
    }

private var _sendArrowDown: ImageVector? = null
