package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FlutterFill: ImageVector
    get() {
        if (_flutterFill != null) {
            return _flutterFill!!
        }
        _flutterFill = Builder(name = "FlutterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.504f, 2.001f)
                lineTo(3.504f, 12.001f)
                lineTo(6.587f, 15.084f)
                lineTo(19.667f, 2.001f)
                horizontalLineTo(13.504f)
                close()
                moveTo(13.498f, 11.199f)
                lineTo(8.123f, 16.62f)
                lineTo(13.496f, 22.0f)
                horizontalLineTo(19.684f)
                lineTo(14.297f, 16.6f)
                lineTo(19.686f, 11.2f)
                lineTo(13.498f, 11.199f)
                close()
            }
        }
        .build()
        return _flutterFill!!
    }

private var _flutterFill: ImageVector? = null
