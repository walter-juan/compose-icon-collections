package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.MinecartLoaded: ImageVector
    get() {
        if (_minecartLoaded != null) {
            return _minecartLoaded!!
        }
        _minecartLoaded = Builder(name = "MinecartLoaded", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(8.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveTo(0.115f, 3.18f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.491f, 0.592f)
                lineToRelative(-1.5f, 8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.491f, -0.408f)
                lineToRelative(-1.5f, -8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.106f, -0.411f)
                close()
                moveTo(1.102f, 4.0f)
                lineTo(2.415f, 11.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(1.313f, -7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 1.0f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.818f, 0.0f, 1.545f, 0.394f, 2.0f, 1.0f)
                curveToRelative(0.67f, 0.0f, 1.552f, 0.57f, 2.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.314f, 0.0f, -0.611f, -0.15f, -0.8f, -0.4f)
                curveToRelative(-0.274f, -0.365f, -0.71f, -0.6f, -1.2f, -0.6f)
                curveToRelative(-0.314f, 0.0f, -0.611f, -0.15f, -0.8f, -0.4f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, false, -2.4f, 0.0f)
                curveToRelative(-0.189f, 0.25f, -0.486f, 0.4f, -0.8f, 0.4f)
                curveToRelative(-0.507f, 0.0f, -0.955f, 0.251f, -1.228f, 0.638f)
                quadToRelative(-0.136f, 0.194f, -0.308f, 0.362f)
                horizontalLineTo(3.0f)
                curveToRelative(0.13f, -0.147f, 0.401f, -0.432f, 0.562f, -0.545f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.393f, -0.393f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 1.0f)
            }
        }
        .build()
        return _minecartLoaded!!
    }

private var _minecartLoaded: ImageVector? = null
