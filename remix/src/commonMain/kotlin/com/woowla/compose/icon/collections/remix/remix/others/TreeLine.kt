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

public val OthersGroup.TreeLine: ImageVector
    get() {
        if (_treeLine != null) {
            return _treeLine!!
        }
        _treeLine = Builder(name = "TreeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 3.686f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 3.686f, 18.0f, 7.0f)
                curveTo(18.0f, 7.262f, 17.983f, 7.521f, 17.95f, 7.775f)
                curveTo(19.77f, 8.804f, 21.0f, 10.757f, 21.0f, 13.0f)
                curveTo(21.0f, 16.314f, 18.314f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.5f)
                curveTo(5.462f, 19.0f, 3.0f, 16.538f, 3.0f, 13.5f)
                curveTo(3.0f, 11.286f, 4.307f, 9.38f, 6.191f, 8.507f)
                curveTo(6.066f, 8.026f, 6.0f, 7.52f, 6.0f, 7.0f)
                close()
                moveTo(7.01f, 10.332f)
                curveTo(5.822f, 10.892f, 5.0f, 12.101f, 5.0f, 13.5f)
                curveTo(5.0f, 15.433f, 6.567f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(17.209f, 17.0f, 19.0f, 15.209f, 19.0f, 13.0f)
                curveTo(19.0f, 11.306f, 17.946f, 9.855f, 16.454f, 9.272f)
                lineTo(15.613f, 8.944f)
                curveTo(15.791f, 8.303f, 16.0f, 7.672f, 16.0f, 7.0f)
                curveTo(16.0f, 4.791f, 14.209f, 3.0f, 12.0f, 3.0f)
                curveTo(9.791f, 3.0f, 8.0f, 4.791f, 8.0f, 7.0f)
                curveTo(8.0f, 8.308f, 8.627f, 9.469f, 9.6f, 10.2f)
                lineTo(8.399f, 11.8f)
                curveTo(7.858f, 11.393f, 7.387f, 10.896f, 7.01f, 10.332f)
                close()
            }
        }
        .build()
        return _treeLine!!
    }

private var _treeLine: ImageVector? = null
