package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) {
            return _brandTinder!!
        }
        _brandTinder = Builder(name = "BrandTinder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.595f, 2.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.455f, -1.016f)
                curveToRelative(3.11f, 1.625f, 5.41f, 3.797f, 6.77f, 6.627f)
                lineToRelative(-0.013f, -0.024f)
                lineToRelative(0.01f, 0.019f)
                lineToRelative(0.115f, 0.232f)
                curveToRelative(2.751f, 5.7f, 0.088f, 12.587f, -5.913f, 13.76f)
                lineToRelative(-0.267f, 0.049f)
                curveToRelative(-8.719f, 1.91f, -14.455f, -8.74f, -7.97f, -14.918f)
                curveToRelative(0.466f, -0.46f, 1.28f, -1.196f, 1.636f, -1.45f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.582f, 0.813f)
                curveToRelative(0.0f, 0.311f, 0.086f, 1.117f, 0.205f, 1.694f)
                quadToRelative(0.046f, 0.215f, 0.093f, 0.383f)
                lineToRelative(0.017f, 0.058f)
                lineToRelative(0.1f, -0.02f)
                curveToRelative(1.562f, -0.396f, 2.522f, -3.021f, 2.21f, -5.955f)
                close()
            }
        }
        .build()
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
