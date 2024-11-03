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

public val Twbs.PinMapFill: ImageVector
    get() {
        if (_pinMapFill != null) {
            return _pinMapFill!!
        }
        _pinMapFill = Builder(name = "PinMapFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1f, 11.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, -0.2f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(3.75f)
                lineTo(1.5f, 15.0f)
                horizontalLineToRelative(13.0f)
                lineToRelative(-2.25f, -3.0f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, 0.2f)
                lineToRelative(3.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.8f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.5f, 3.969f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(7.97f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.999f)
                close()
            }
        }
        .build()
        return _pinMapFill!!
    }

private var _pinMapFill: ImageVector? = null
