package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.QuillPenLine: ImageVector
    get() {
        if (_quillPenLine != null) {
            return _quillPenLine!!
        }
        _quillPenLine = Builder(name = "QuillPenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.939f, 14.033f)
                curveTo(6.707f, 14.656f, 6.51f, 15.233f, 6.334f, 15.816f)
                curveTo(7.293f, 15.119f, 8.435f, 14.677f, 9.752f, 14.512f)
                curveTo(12.265f, 14.198f, 14.498f, 12.538f, 15.628f, 10.454f)
                lineTo(14.172f, 8.999f)
                lineTo(15.585f, 7.584f)
                curveTo(15.918f, 7.25f, 16.252f, 6.916f, 16.586f, 6.582f)
                curveTo(17.015f, 6.153f, 17.5f, 5.358f, 18.013f, 4.215f)
                curveTo(12.42f, 5.082f, 8.995f, 8.506f, 6.939f, 14.033f)
                close()
                moveTo(17.0f, 8.997f)
                lineTo(18.0f, 9.997f)
                curveTo(17.0f, 12.997f, 14.0f, 15.997f, 10.0f, 16.497f)
                curveTo(7.331f, 16.83f, 5.664f, 18.664f, 4.998f, 21.997f)
                horizontalLineTo(3.0f)
                curveTo(4.0f, 15.997f, 6.0f, 1.997f, 21.0f, 1.997f)
                curveTo(20.001f, 4.994f, 19.002f, 6.993f, 18.003f, 7.994f)
                curveTo(17.666f, 8.33f, 17.333f, 8.664f, 17.0f, 8.997f)
                close()
            }
        }
        .build()
        return _quillPenLine!!
    }

private var _quillPenLine: ImageVector? = null
