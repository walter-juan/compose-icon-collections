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

public val SystemGroup.UploadCloud2Fill: ImageVector
    get() {
        if (_uploadCloud2Fill != null) {
            return _uploadCloud2Fill!!
        }
        _uploadCloud2Fill = Builder(name = "UploadCloud2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.586f)
                lineTo(16.243f, 16.828f)
                lineTo(14.828f, 18.243f)
                lineTo(13.0f, 16.415f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.413f)
                lineTo(9.172f, 18.243f)
                lineTo(7.757f, 16.828f)
                lineTo(12.0f, 12.586f)
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
        return _uploadCloud2Fill!!
    }

private var _uploadCloud2Fill: ImageVector? = null
