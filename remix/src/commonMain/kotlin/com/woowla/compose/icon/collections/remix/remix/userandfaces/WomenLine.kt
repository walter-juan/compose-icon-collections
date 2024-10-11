package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.WomenLine: ImageVector
    get() {
        if (_womenLine != null) {
            return _womenLine!!
        }
        _womenLine = Builder(name = "WomenLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.934f)
                curveTo(7.331f, 15.445f, 4.5f, 12.303f, 4.5f, 8.5f)
                curveTo(4.5f, 4.358f, 7.858f, 1.0f, 12.0f, 1.0f)
                curveTo(16.142f, 1.0f, 19.5f, 4.358f, 19.5f, 8.5f)
                curveTo(19.5f, 12.303f, 16.669f, 15.445f, 13.0f, 15.934f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.934f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(15.038f, 14.0f, 17.5f, 11.538f, 17.5f, 8.5f)
                curveTo(17.5f, 5.462f, 15.038f, 3.0f, 12.0f, 3.0f)
                curveTo(8.962f, 3.0f, 6.5f, 5.462f, 6.5f, 8.5f)
                curveTo(6.5f, 11.538f, 8.962f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _womenLine!!
    }

private var _womenLine: ImageVector? = null
