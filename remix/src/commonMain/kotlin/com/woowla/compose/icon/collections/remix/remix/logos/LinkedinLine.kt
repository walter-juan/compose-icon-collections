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

public val LogosGroup.LinkedinLine: ImageVector
    get() {
        if (_linkedinLine != null) {
            return _linkedinLine!!
        }
        _linkedinLine = Builder(name = "LinkedinLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 9.55f)
                curveTo(12.918f, 8.613f, 14.112f, 8.0f, 15.501f, 8.0f)
                curveTo(18.538f, 8.0f, 21.001f, 10.462f, 21.001f, 13.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(13.5f)
                curveTo(19.001f, 11.567f, 17.434f, 10.0f, 15.501f, 10.0f)
                curveTo(13.568f, 10.0f, 12.001f, 11.567f, 12.001f, 13.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.001f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.001f)
                verticalLineTo(9.55f)
                close()
                moveTo(5.001f, 6.5f)
                curveTo(4.173f, 6.5f, 3.501f, 5.828f, 3.501f, 5.0f)
                curveTo(3.501f, 4.172f, 4.173f, 3.5f, 5.001f, 3.5f)
                curveTo(5.829f, 3.5f, 6.501f, 4.172f, 6.501f, 5.0f)
                curveTo(6.501f, 5.828f, 5.829f, 6.5f, 5.001f, 6.5f)
                close()
                moveTo(4.001f, 8.5f)
                horizontalLineTo(6.001f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.001f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _linkedinLine!!
    }

private var _linkedinLine: ImageVector? = null
