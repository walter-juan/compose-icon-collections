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

public val DesignGroup.Contrast2Fill: ImageVector
    get() {
        if (_contrast2Fill != null) {
            return _contrast2Fill!!
        }
        _contrast2Fill = Builder(name = "Contrast2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(17.523f, 1.997f, 22.0f, 6.474f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                close()
                moveTo(5.329f, 16.422f)
                curveTo(6.764f, 18.567f, 9.209f, 19.98f, 11.984f, 19.98f)
                curveTo(16.402f, 19.98f, 19.984f, 16.399f, 19.984f, 11.98f)
                curveTo(19.984f, 9.205f, 18.571f, 6.76f, 16.425f, 5.325f)
                curveTo(17.271f, 8.353f, 16.503f, 11.737f, 14.121f, 14.118f)
                curveTo(11.74f, 16.499f, 8.357f, 17.267f, 5.329f, 16.422f)
                close()
            }
        }
        .build()
        return _contrast2Fill!!
    }

private var _contrast2Fill: ImageVector? = null
