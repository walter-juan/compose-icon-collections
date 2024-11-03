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

public val Twbs.EmojiAstonished: ImageVector
    get() {
        if (_emojiAstonished != null) {
            return _emojiAstonished!!
        }
        _emojiAstonished = Builder(name = "EmojiAstonished", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 7.328f, 6.552f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveToRelative(4.0f, 0.0f)
                curveToRelative(0.0f, 0.828f, -0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(9.448f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                moveTo(4.884f, 4.022f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.458f, -0.048f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.316f, -0.948f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.167f, 0.077f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -0.773f, 0.478f)
                quadToRelative(-0.036f, 0.03f, -0.07f, 0.064f)
                lineToRelative(-0.002f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(0.001f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.122f, -0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.41f, -0.232f)
                close()
                moveTo(11.116f, 4.022f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.458f, -0.048f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.316f, -0.948f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.168f, 0.077f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.773f, 0.478f)
                lineToRelative(0.07f, 0.064f)
                verticalLineToRelative(0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.706f, 0.708f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.122f, -0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.41f, -0.232f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(-0.998f, 0.0f, -1.747f, 0.623f, -2.247f, 1.246f)
                curveToRelative(-0.383f, 0.478f, 0.08f, 1.06f, 0.687f, 0.98f)
                quadToRelative(1.56f, -0.202f, 3.12f, 0.0f)
                curveToRelative(0.606f, 0.08f, 1.07f, -0.502f, 0.687f, -0.98f)
                curveTo(9.747f, 10.623f, 8.998f, 10.0f, 8.0f, 10.0f)
            }
        }
        .build()
        return _emojiAstonished!!
    }

private var _emojiAstonished: ImageVector? = null
