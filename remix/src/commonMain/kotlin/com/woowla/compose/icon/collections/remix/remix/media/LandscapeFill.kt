package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.LandscapeFill: ImageVector
    get() {
        if (_landscapeFill != null) {
            return _landscapeFill!!
        }
        _landscapeFill = Builder(name = "LandscapeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                lineTo(11.238f, 12.27f)
                lineTo(15.0f, 6.0f)
                lineTo(23.0f, 21.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(14.0f, 21.0f)
                horizontalLineTo(2.0f)
                lineTo(8.0f, 10.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(4.119f, 8.0f, 3.0f, 6.881f, 3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                curveTo(6.881f, 3.0f, 8.0f, 4.119f, 8.0f, 5.5f)
                curveTo(8.0f, 6.881f, 6.881f, 8.0f, 5.5f, 8.0f)
                close()
            }
        }
        .build()
        return _landscapeFill!!
    }

private var _landscapeFill: ImageVector? = null
