package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.LeafLine: ImageVector
    get() {
        if (_leafLine != null) {
            return _leafLine!!
        }
        _leafLine = Builder(name = "LeafLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(20.998f, 14.627f, 15.625f, 19.0f, 8.998f, 19.0f)
                lineTo(5.241f, 19.0f)
                curveTo(5.079f, 19.912f, 4.998f, 20.907f, 4.998f, 22.0f)
                horizontalLineTo(2.998f)
                curveTo(2.998f, 20.637f, 3.114f, 19.4f, 3.344f, 18.268f)
                curveTo(3.113f, 16.974f, 2.998f, 15.218f, 2.998f, 13.0f)
                curveTo(2.998f, 7.477f, 7.475f, 3.0f, 12.998f, 3.0f)
                curveTo(14.998f, 3.0f, 16.998f, 4.0f, 20.998f, 3.0f)
                close()
                moveTo(12.998f, 5.0f)
                curveTo(8.58f, 5.0f, 4.998f, 8.582f, 4.998f, 13.0f)
                curveTo(4.998f, 13.362f, 5.001f, 13.711f, 5.008f, 14.046f)
                curveTo(6.262f, 12.068f, 8.099f, 10.505f, 10.502f, 9.132f)
                lineTo(11.494f, 10.868f)
                curveTo(8.639f, 12.5f, 6.746f, 14.354f, 5.773f, 17.0f)
                lineTo(8.998f, 17.0f)
                curveTo(15.013f, 17.0f, 18.869f, 13.027f, 18.995f, 5.388f)
                curveTo(17.623f, 5.521f, 16.348f, 5.436f, 14.775f, 5.2f)
                curveTo(13.624f, 5.027f, 13.399f, 5.0f, 12.998f, 5.0f)
                close()
            }
        }
        .build()
        return _leafLine!!
    }

private var _leafLine: ImageVector? = null
