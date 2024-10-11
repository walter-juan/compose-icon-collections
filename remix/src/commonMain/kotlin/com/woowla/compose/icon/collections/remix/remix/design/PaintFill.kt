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

public val DesignGroup.PaintFill: ImageVector
    get() {
        if (_paintFill != null) {
            return _paintFill!!
        }
        _paintFill = Builder(name = "PaintFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.228f, 18.732f)
                lineTo(20.996f, 16.965f)
                lineTo(22.763f, 18.732f)
                curveTo(23.74f, 19.709f, 23.74f, 21.292f, 22.763f, 22.268f)
                curveTo(21.787f, 23.244f, 20.204f, 23.244f, 19.228f, 22.268f)
                curveTo(18.251f, 21.292f, 18.251f, 19.709f, 19.228f, 18.732f)
                close()
                moveTo(8.879f, 1.08f)
                lineTo(20.192f, 12.393f)
                curveTo(20.583f, 12.784f, 20.583f, 13.417f, 20.192f, 13.808f)
                lineTo(11.707f, 22.293f)
                curveTo(11.316f, 22.683f, 10.683f, 22.683f, 10.293f, 22.293f)
                lineTo(1.808f, 13.808f)
                curveTo(1.417f, 13.417f, 1.417f, 12.784f, 1.808f, 12.393f)
                lineTo(9.586f, 4.615f)
                lineTo(7.464f, 2.494f)
                lineTo(8.879f, 1.08f)
                close()
                moveTo(11.0f, 6.029f)
                lineTo(3.929f, 13.101f)
                horizontalLineTo(18.071f)
                lineTo(11.0f, 6.029f)
                close()
            }
        }
        .build()
        return _paintFill!!
    }

private var _paintFill: ImageVector? = null
