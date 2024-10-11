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

public val OthersGroup.WeightLine: ImageVector
    get() {
        if (_weightLine != null) {
            return _weightLine!!
        }
        _weightLine = Builder(name = "WeightLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                curveTo(14.0f, 7.105f, 13.105f, 8.0f, 12.0f, 8.0f)
                curveTo(10.896f, 8.0f, 10.0f, 7.105f, 10.0f, 6.0f)
                curveTo(10.0f, 4.895f, 10.896f, 4.0f, 12.0f, 4.0f)
                curveTo(13.105f, 4.0f, 14.0f, 4.895f, 14.0f, 6.0f)
                close()
                moveTo(15.465f, 8.0f)
                curveTo(15.806f, 7.412f, 16.0f, 6.729f, 16.0f, 6.0f)
                curveTo(16.0f, 3.791f, 14.21f, 2.0f, 12.0f, 2.0f)
                curveTo(9.791f, 2.0f, 8.0f, 3.791f, 8.0f, 6.0f)
                curveTo(8.0f, 6.729f, 8.195f, 7.412f, 8.535f, 8.0f)
                horizontalLineTo(5.066f)
                curveTo(4.579f, 8.0f, 4.163f, 8.351f, 4.08f, 8.832f)
                lineTo(2.2f, 19.831f)
                curveTo(2.096f, 20.442f, 2.566f, 21.0f, 3.186f, 21.0f)
                horizontalLineTo(20.815f)
                curveTo(21.434f, 21.0f, 21.905f, 20.442f, 21.801f, 19.831f)
                lineTo(19.92f, 8.832f)
                curveTo(19.838f, 8.351f, 19.422f, 8.0f, 18.935f, 8.0f)
                horizontalLineTo(15.465f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineTo(18.091f)
                lineTo(19.629f, 19.0f)
                horizontalLineTo(4.371f)
                lineTo(5.91f, 10.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _weightLine!!
    }

private var _weightLine: ImageVector? = null
