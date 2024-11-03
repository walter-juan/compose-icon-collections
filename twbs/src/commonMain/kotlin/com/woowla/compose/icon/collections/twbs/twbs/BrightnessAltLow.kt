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

public val Twbs.BrightnessAltLow: ImageVector
    get() {
        if (_brightnessAltLow != null) {
            return _brightnessAltLow!!
        }
        _brightnessAltLow = Builder(name = "BrightnessAltLow", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(5.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                moveTo(2.0f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                moveToRelative(10.243f, -3.536f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.707f)
                moveToRelative(-8.486f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.707f)
                moveTo(8.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.959f, 2.5f)
                horizontalLineTo(5.04f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 8.0f)
            }
        }
        .build()
        return _brightnessAltLow!!
    }

private var _brightnessAltLow: ImageVector? = null
