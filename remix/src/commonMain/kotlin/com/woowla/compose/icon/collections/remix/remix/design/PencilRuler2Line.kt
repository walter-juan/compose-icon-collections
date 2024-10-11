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

public val DesignGroup.PencilRuler2Line: ImageVector
    get() {
        if (_pencilRuler2Line != null) {
            return _pencilRuler2Line!!
        }
        _pencilRuler2Line = Builder(name = "PencilRuler2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 14.121f)
                lineTo(4.929f, 16.243f)
                lineTo(7.757f, 19.071f)
                lineTo(19.071f, 7.757f)
                lineTo(16.243f, 4.929f)
                lineTo(14.121f, 7.05f)
                lineTo(15.536f, 8.464f)
                lineTo(14.121f, 9.879f)
                lineTo(12.707f, 8.464f)
                lineTo(11.293f, 9.879f)
                lineTo(12.707f, 11.293f)
                lineTo(11.293f, 12.707f)
                lineTo(9.879f, 11.293f)
                lineTo(8.465f, 12.707f)
                lineTo(9.879f, 14.121f)
                lineTo(8.465f, 15.535f)
                lineTo(7.05f, 14.121f)
                close()
                moveTo(16.95f, 2.808f)
                lineTo(21.192f, 7.05f)
                curveTo(21.583f, 7.441f, 21.583f, 8.074f, 21.192f, 8.464f)
                lineTo(8.465f, 21.192f)
                curveTo(8.074f, 21.583f, 7.441f, 21.583f, 7.05f, 21.192f)
                lineTo(2.808f, 16.95f)
                curveTo(2.417f, 16.559f, 2.417f, 15.926f, 2.808f, 15.535f)
                lineTo(15.536f, 2.808f)
                curveTo(15.926f, 2.417f, 16.559f, 2.417f, 16.95f, 2.808f)
                close()
                moveTo(14.121f, 18.364f)
                lineTo(15.536f, 16.949f)
                lineTo(17.778f, 19.192f)
                horizontalLineTo(19.192f)
                verticalLineTo(17.778f)
                lineTo(16.95f, 15.535f)
                lineTo(18.364f, 14.121f)
                lineTo(21.0f, 16.757f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.758f)
                lineTo(14.121f, 18.364f)
                close()
                moveTo(5.636f, 9.878f)
                lineTo(2.808f, 7.05f)
                curveTo(2.417f, 6.659f, 2.417f, 6.026f, 2.808f, 5.635f)
                lineTo(5.636f, 2.807f)
                curveTo(6.026f, 2.416f, 6.66f, 2.416f, 7.05f, 2.807f)
                lineTo(9.879f, 5.635f)
                lineTo(8.464f, 7.05f)
                lineTo(6.343f, 4.928f)
                lineTo(4.929f, 6.343f)
                lineTo(7.05f, 8.464f)
                lineTo(5.636f, 9.878f)
                close()
            }
        }
        .build()
        return _pencilRuler2Line!!
    }

private var _pencilRuler2Line: ImageVector? = null
