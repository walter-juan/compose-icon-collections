package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.Focus3Fill: ImageVector
    get() {
        if (_focus3Fill != null) {
            return _focus3Fill!!
        }
        _focus3Fill = Builder(name = "Focus3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 1.0f)
                lineTo(13.001f, 4.062f)
                curveTo(16.619f, 4.514f, 19.487f, 7.382f, 19.938f, 11.0f)
                lineTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(19.938f, 13.001f)
                curveTo(19.486f, 16.619f, 16.619f, 19.486f, 13.001f, 19.938f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 19.938f)
                curveTo(7.382f, 19.487f, 4.514f, 16.619f, 4.062f, 13.001f)
                lineTo(1.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(4.062f, 11.0f)
                curveTo(4.513f, 7.381f, 7.381f, 4.513f, 11.0f, 4.062f)
                lineTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _focus3Fill!!
    }

private var _focus3Fill: ImageVector? = null
