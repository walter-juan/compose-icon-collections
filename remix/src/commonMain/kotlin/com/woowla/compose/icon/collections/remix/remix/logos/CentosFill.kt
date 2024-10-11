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

public val LogosGroup.CentosFill: ImageVector
    get() {
        if (_centosFill != null) {
            return _centosFill!!
        }
        _centosFill = Builder(name = "CentosFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.061f)
                lineTo(16.47f, 17.531f)
                lineTo(12.0f, 22.0f)
                lineTo(7.53f, 17.53f)
                lineTo(12.0f, 13.061f)
                close()
                moveTo(4.0f, 16.121f)
                lineTo(7.879f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 16.121f)
                close()
                moveTo(20.0f, 16.121f)
                lineTo(20.0f, 20.0f)
                lineTo(16.121f, 20.0f)
                lineTo(20.0f, 16.121f)
                close()
                moveTo(17.53f, 7.53f)
                lineTo(22.0f, 12.0f)
                lineTo(17.531f, 16.47f)
                lineTo(13.061f, 12.0f)
                lineTo(17.53f, 7.53f)
                close()
                moveTo(6.47f, 7.53f)
                lineTo(10.939f, 12.0f)
                lineTo(6.469f, 16.469f)
                lineTo(2.0f, 12.0f)
                lineTo(6.47f, 7.53f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(16.469f, 6.469f)
                lineTo(12.0f, 10.939f)
                lineTo(7.53f, 6.47f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(7.879f, 4.0f)
                lineTo(4.0f, 7.879f)
                lineTo(4.0f, 4.0f)
                lineTo(7.879f, 4.0f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(20.0f, 7.879f)
                lineTo(16.121f, 4.0f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _centosFill!!
    }

private var _centosFill: ImageVector? = null
