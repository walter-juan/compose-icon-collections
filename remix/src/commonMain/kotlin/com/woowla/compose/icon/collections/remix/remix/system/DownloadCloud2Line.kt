package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.DownloadCloud2Line: ImageVector
    get() {
        if (_downloadCloud2Line != null) {
            return _downloadCloud2Line!!
        }
        _downloadCloud2Line = Builder(name = "DownloadCloud2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                verticalLineTo(18.585f)
                lineTo(14.828f, 16.757f)
                lineTo(16.243f, 18.172f)
                lineTo(12.0f, 22.414f)
                lineTo(7.757f, 18.172f)
                lineTo(9.172f, 16.757f)
                lineTo(11.0f, 18.585f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.593f, 2.0f, 18.554f, 4.708f, 18.954f, 8.194f)
                curveTo(21.286f, 8.832f, 23.0f, 10.966f, 23.0f, 13.5f)
                curveTo(23.0f, 16.369f, 20.804f, 18.725f, 18.001f, 18.978f)
                lineTo(18.001f, 16.964f)
                curveTo(19.697f, 16.721f, 21.0f, 15.263f, 21.0f, 13.5f)
                curveTo(21.0f, 11.567f, 19.433f, 10.0f, 17.5f, 10.0f)
                curveTo(17.291f, 10.0f, 17.087f, 10.018f, 16.889f, 10.054f)
                curveTo(16.962f, 9.714f, 17.0f, 9.362f, 17.0f, 9.0f)
                curveTo(17.0f, 6.239f, 14.761f, 4.0f, 12.0f, 4.0f)
                curveTo(9.239f, 4.0f, 7.0f, 6.239f, 7.0f, 9.0f)
                curveTo(7.0f, 9.362f, 7.038f, 9.714f, 7.112f, 10.053f)
                curveTo(6.913f, 10.018f, 6.709f, 10.0f, 6.5f, 10.0f)
                curveTo(4.567f, 10.0f, 3.0f, 11.567f, 3.0f, 13.5f)
                curveTo(3.0f, 15.2f, 4.212f, 16.617f, 5.82f, 16.934f)
                lineTo(6.0f, 16.965f)
                lineTo(6.0f, 18.978f)
                curveTo(3.197f, 18.725f, 1.0f, 16.369f, 1.0f, 13.5f)
                curveTo(1.0f, 10.966f, 2.714f, 8.832f, 5.046f, 8.194f)
                curveTo(5.446f, 4.708f, 8.407f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _downloadCloud2Line!!
    }

private var _downloadCloud2Line: ImageVector? = null
