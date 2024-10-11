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

public val LogosGroup.VuejsFill: ImageVector
    get() {
        if (_vuejsFill != null) {
            return _vuejsFill!!
        }
        _vuejsFill = Builder(name = "VuejsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.001f, 3.0f)
                horizontalLineTo(5.001f)
                lineTo(12.001f, 15.0f)
                lineTo(19.001f, 3.0f)
                horizontalLineTo(23.001f)
                lineTo(12.001f, 22.0f)
                lineTo(1.001f, 3.0f)
                close()
                moveTo(9.668f, 3.0f)
                lineTo(12.001f, 7.0f)
                lineTo(14.334f, 3.0f)
                horizontalLineTo(18.369f)
                lineTo(12.001f, 14.0f)
                lineTo(5.633f, 3.0f)
                horizontalLineTo(9.668f)
                close()
            }
        }
        .build()
        return _vuejsFill!!
    }

private var _vuejsFill: ImageVector? = null
