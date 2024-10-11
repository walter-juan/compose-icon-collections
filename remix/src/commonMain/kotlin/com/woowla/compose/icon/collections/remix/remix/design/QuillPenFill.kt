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

public val DesignGroup.QuillPenFill: ImageVector
    get() {
        if (_quillPenFill != null) {
            return _quillPenFill!!
        }
        _quillPenFill = Builder(name = "QuillPenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.997f)
                curveTo(6.0f, 1.997f, 4.0f, 15.997f, 3.0f, 21.997f)
                curveTo(3.667f, 21.997f, 4.333f, 21.997f, 4.998f, 21.997f)
                curveTo(5.664f, 18.664f, 7.331f, 16.83f, 10.0f, 16.497f)
                curveTo(14.0f, 15.997f, 17.0f, 12.497f, 18.0f, 9.497f)
                lineTo(16.5f, 8.497f)
                curveTo(16.833f, 8.163f, 17.167f, 7.83f, 17.5f, 7.497f)
                curveTo(18.5f, 6.497f, 19.504f, 4.997f, 21.0f, 1.997f)
                close()
            }
        }
        .build()
        return _quillPenFill!!
    }

private var _quillPenFill: ImageVector? = null
