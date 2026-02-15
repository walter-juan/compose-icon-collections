package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Gitee: ImageVector
    get() {
        if (_gitee != null) {
            return _gitee!!
        }
        _gitee = Builder(name = "Gitee", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                close()
                moveTo(385.6f, 113.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-177.0f, 0.0f)
                curveToRelative(-52.4f, 0.0f, -94.8f, 42.4f, -94.8f, 94.8f)
                lineToRelative(0.0f, 177.0f)
                curveToRelative(0.0f, 7.0f, 5.7f, 12.6f, 12.6f, 12.6f)
                lineToRelative(186.5f, 0.0f)
                curveToRelative(47.1f, 0.0f, 85.3f, -38.2f, 85.3f, -85.3f)
                lineToRelative(0.0f, -72.7f)
                curveToRelative(0.0f, -7.0f, -5.7f, -12.6f, -12.6f, -12.6f)
                lineToRelative(-145.4f, 0.0f)
                curveToRelative(-7.0f, 0.0f, -12.6f, 5.7f, -12.6f, 12.6f)
                lineToRelative(0.0f, 31.6f)
                curveToRelative(0.0f, 6.6f, 5.1f, 12.1f, 11.6f, 12.6f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(88.5f, 0.0f)
                curveToRelative(6.6f, 0.0f, 12.1f, 5.1f, 12.6f, 11.6f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(0.0f, 6.3f)
                curveToRelative(0.0f, 20.9f, -17.0f, 37.9f, -37.9f, 37.9f)
                lineToRelative(-120.1f, 0.0f)
                curveToRelative(-7.0f, 0.0f, -12.6f, -5.7f, -12.6f, -12.6f)
                lineToRelative(0.0f, -120.1f)
                curveToRelative(0.0f, -20.4f, 16.1f, -37.1f, 36.4f, -37.9f)
                lineToRelative(1.6f, 0.0f)
                lineToRelative(177.0f, 0.0f)
                curveToRelative(7.0f, 0.0f, 12.6f, -5.7f, 12.6f, -12.6f)
                lineToRelative(0.0f, -31.6f)
                curveToRelative(0.0f, -7.0f, -5.6f, -12.6f, -12.6f, -12.6f)
                close()
            }
        }
        .build()
        return _gitee!!
    }

private var _gitee: ImageVector? = null
