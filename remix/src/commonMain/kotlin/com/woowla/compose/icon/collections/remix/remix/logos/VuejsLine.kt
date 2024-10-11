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

public val LogosGroup.VuejsLine: ImageVector
    get() {
        if (_vuejsLine != null) {
            return _vuejsLine!!
        }
        _vuejsLine = Builder(name = "VuejsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.317f, 3.0f)
                lineTo(12.001f, 18.0f)
                lineTo(20.685f, 3.0f)
                horizontalLineTo(23.001f)
                lineTo(12.001f, 22.0f)
                lineTo(1.001f, 3.0f)
                horizontalLineTo(3.317f)
                close()
                moveTo(7.659f, 3.0f)
                lineTo(12.001f, 10.5f)
                lineTo(16.343f, 3.0f)
                horizontalLineTo(18.659f)
                lineTo(12.001f, 14.5f)
                lineTo(5.343f, 3.0f)
                horizontalLineTo(7.659f)
                close()
            }
        }
        .build()
        return _vuejsLine!!
    }

private var _vuejsLine: ImageVector? = null
