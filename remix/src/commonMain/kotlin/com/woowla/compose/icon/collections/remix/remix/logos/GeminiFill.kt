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

public val LogosGroup.GeminiFill: ImageVector
    get() {
        if (_geminiFill != null) {
            return _geminiFill!!
        }
        _geminiFill = Builder(name = "GeminiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.024f)
                curveTo(17.563f, 12.412f, 12.411f, 17.563f, 12.023f, 24.0f)
                horizontalLineTo(11.976f)
                curveTo(11.588f, 17.563f, 6.437f, 12.412f, 0.0f, 12.024f)
                verticalLineTo(11.976f)
                curveTo(6.437f, 11.588f, 11.588f, 6.437f, 11.976f, 0.0f)
                horizontalLineTo(12.023f)
                curveTo(12.411f, 6.437f, 17.563f, 11.588f, 24.0f, 11.976f)
                verticalLineTo(12.024f)
                close()
            }
        }
        .build()
        return _geminiFill!!
    }

private var _geminiFill: ImageVector? = null
