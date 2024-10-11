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

public val SystemGroup.DownloadCloud2Fill: ImageVector
    get() {
        if (_downloadCloud2Fill != null) {
            return _downloadCloud2Fill!!
        }
        _downloadCloud2Fill = Builder(name = "DownloadCloud2Fill", defaultWidth = 24.0.dp,
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
                lineTo(18.0f, 17.0f)
                curveTo(18.0f, 13.686f, 15.314f, 11.0f, 12.0f, 11.0f)
                curveTo(8.762f, 11.0f, 6.122f, 13.566f, 6.004f, 16.775f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 18.978f)
                curveTo(3.197f, 18.725f, 1.0f, 16.369f, 1.0f, 13.5f)
                curveTo(1.0f, 10.966f, 2.714f, 8.832f, 5.046f, 8.194f)
                curveTo(5.446f, 4.708f, 8.407f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _downloadCloud2Fill!!
    }

private var _downloadCloud2Fill: ImageVector? = null
