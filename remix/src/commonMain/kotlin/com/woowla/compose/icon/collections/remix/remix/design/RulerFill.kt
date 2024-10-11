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

public val DesignGroup.RulerFill: ImageVector
    get() {
        if (_rulerFill != null) {
            return _rulerFill!!
        }
        _rulerFill = Builder(name = "RulerFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 13.314f)
                lineTo(7.05f, 15.435f)
                lineTo(8.465f, 14.021f)
                lineTo(6.343f, 11.9f)
                lineTo(8.465f, 9.778f)
                lineTo(11.293f, 12.607f)
                lineTo(12.707f, 11.193f)
                lineTo(9.879f, 8.364f)
                lineTo(12.0f, 6.243f)
                lineTo(14.121f, 8.364f)
                lineTo(15.536f, 6.95f)
                lineTo(13.414f, 4.829f)
                lineTo(16.243f, 2.0f)
                curveTo(16.633f, 1.61f, 17.266f, 1.61f, 17.657f, 2.0f)
                lineTo(22.607f, 6.95f)
                curveTo(22.997f, 7.34f, 22.997f, 7.974f, 22.607f, 8.364f)
                lineTo(7.757f, 23.213f)
                curveTo(7.367f, 23.604f, 6.734f, 23.604f, 6.343f, 23.213f)
                lineTo(1.393f, 18.264f)
                curveTo(1.003f, 17.873f, 1.003f, 17.24f, 1.393f, 16.849f)
                lineTo(4.929f, 13.314f)
                close()
            }
        }
        .build()
        return _rulerFill!!
    }

private var _rulerFill: ImageVector? = null
