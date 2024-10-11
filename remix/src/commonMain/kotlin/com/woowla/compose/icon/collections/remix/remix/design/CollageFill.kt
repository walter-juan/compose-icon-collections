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

public val DesignGroup.CollageFill: ImageVector
    get() {
        if (_collageFill != null) {
            return _collageFill!!
        }
        _collageFill = Builder(name = "CollageFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.189f, 13.264f)
                lineTo(12.571f, 21.106f)
                lineTo(4.0f, 21.107f)
                curveTo(3.448f, 21.107f, 3.0f, 20.659f, 3.0f, 20.107f)
                lineTo(3.0f, 14.709f)
                lineTo(11.189f, 13.264f)
                close()
                moveTo(20.0f, 3.107f)
                curveTo(20.552f, 3.107f, 21.0f, 3.554f, 21.0f, 4.107f)
                verticalLineTo(20.107f)
                curveTo(21.0f, 20.659f, 20.552f, 21.107f, 20.0f, 21.107f)
                lineTo(14.602f, 21.106f)
                lineTo(11.429f, 3.106f)
                lineTo(20.0f, 3.107f)
                close()
                moveTo(9.398f, 3.106f)
                lineTo(10.842f, 11.295f)
                lineTo(3.0f, 12.678f)
                lineTo(3.0f, 4.107f)
                curveTo(3.0f, 3.554f, 3.448f, 3.107f, 4.0f, 3.107f)
                lineTo(9.398f, 3.106f)
                close()
            }
        }
        .build()
        return _collageFill!!
    }

private var _collageFill: ImageVector? = null
