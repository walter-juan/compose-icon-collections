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

public val DesignGroup.PencilRuler2Fill: ImageVector
    get() {
        if (_pencilRuler2Fill != null) {
            return _pencilRuler2Fill!!
        }
        _pencilRuler2Fill = Builder(name = "PencilRuler2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 12.707f)
                lineTo(7.465f, 14.535f)
                lineTo(8.879f, 13.121f)
                lineTo(7.05f, 11.293f)
                lineTo(8.465f, 9.879f)
                lineTo(10.293f, 11.707f)
                lineTo(11.707f, 10.293f)
                lineTo(9.879f, 8.464f)
                lineTo(11.293f, 7.05f)
                lineTo(13.121f, 8.879f)
                lineTo(14.536f, 7.464f)
                lineTo(12.707f, 5.636f)
                lineTo(15.536f, 2.808f)
                curveTo(15.926f, 2.417f, 16.559f, 2.417f, 16.95f, 2.808f)
                lineTo(21.192f, 7.05f)
                curveTo(21.583f, 7.441f, 21.583f, 8.074f, 21.192f, 8.464f)
                lineTo(8.465f, 21.192f)
                curveTo(8.074f, 21.583f, 7.441f, 21.583f, 7.05f, 21.192f)
                lineTo(2.808f, 16.95f)
                curveTo(2.417f, 16.559f, 2.417f, 15.926f, 2.808f, 15.535f)
                lineTo(5.636f, 12.707f)
                close()
                moveTo(14.121f, 18.364f)
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
                lineTo(5.636f, 9.878f)
                close()
            }
        }
        .build()
        return _pencilRuler2Fill!!
    }

private var _pencilRuler2Fill: ImageVector? = null
