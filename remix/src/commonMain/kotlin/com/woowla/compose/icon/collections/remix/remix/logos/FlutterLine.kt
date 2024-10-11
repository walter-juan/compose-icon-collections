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

public val LogosGroup.FlutterLine: ImageVector
    get() {
        if (_flutterLine != null) {
            return _flutterLine!!
        }
        _flutterLine = Builder(name = "FlutterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.598f, 10.684f)
                horizontalLineTo(17.426f)
                lineTo(11.769f, 16.342f)
                lineTo(17.426f, 21.998f)
                horizontalLineTo(14.598f)
                lineTo(8.941f, 16.341f)
                lineTo(14.598f, 10.684f)
                close()
                moveTo(14.404f, 2.004f)
                horizontalLineTo(17.233f)
                lineTo(5.919f, 13.318f)
                lineTo(4.505f, 11.904f)
                lineTo(14.404f, 2.004f)
                close()
            }
        }
        .build()
        return _flutterLine!!
    }

private var _flutterLine: ImageVector? = null
