package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BrowserChrome: ImageVector
    get() {
        if (_browserChrome != null) {
            return _browserChrome!!
        }
        _browserChrome = Builder(name = "BrowserChrome", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.022f, 7.94f)
                lineToRelative(1.902f, -7.098f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.05f, -1.492f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.237f, 6.0f)
                horizontalLineToRelative(5.511f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 8.0f)
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.927f, 8.0f)
                lineToRelative(1.426f, -5.321f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.723f, 0.255f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.743f, -0.147f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.043f, -0.7f)
                lineTo(0.633f, 4.876f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f)
                moveToRelative(5.004f, -0.167f)
                lineTo(1.108f, 3.936f)
                arcTo(8.003f, 8.003f, 0.0f, false, true, 15.418f, 5.0f)
                horizontalLineTo(8.066f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.252f, 0.243f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.81f, 2.59f)
                moveTo(8.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
        }
        .build()
        return _browserChrome!!
    }

private var _browserChrome: ImageVector? = null
