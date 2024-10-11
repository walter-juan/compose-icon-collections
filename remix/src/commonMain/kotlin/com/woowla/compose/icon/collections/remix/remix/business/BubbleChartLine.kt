package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.BubbleChartLine: ImageVector
    get() {
        if (_bubbleChartLine != null) {
            return _bubbleChartLine!!
        }
        _bubbleChartLine = Builder(name = "BubbleChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                curveTo(17.657f, 16.0f, 19.0f, 17.343f, 19.0f, 19.0f)
                curveTo(19.0f, 20.657f, 17.657f, 22.0f, 16.0f, 22.0f)
                curveTo(14.343f, 22.0f, 13.0f, 20.657f, 13.0f, 19.0f)
                curveTo(13.0f, 17.343f, 14.343f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(6.0f, 12.0f)
                curveTo(8.209f, 12.0f, 10.0f, 13.791f, 10.0f, 16.0f)
                curveTo(10.0f, 18.209f, 8.209f, 20.0f, 6.0f, 20.0f)
                curveTo(3.791f, 20.0f, 2.0f, 18.209f, 2.0f, 16.0f)
                curveTo(2.0f, 13.791f, 3.791f, 12.0f, 6.0f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(15.448f, 18.0f, 15.0f, 18.448f, 15.0f, 19.0f)
                curveTo(15.0f, 19.552f, 15.448f, 20.0f, 16.0f, 20.0f)
                curveTo(16.552f, 20.0f, 17.0f, 19.552f, 17.0f, 19.0f)
                curveTo(17.0f, 18.448f, 16.552f, 18.0f, 16.0f, 18.0f)
                close()
                moveTo(6.0f, 14.0f)
                curveTo(4.895f, 14.0f, 4.0f, 14.895f, 4.0f, 16.0f)
                curveTo(4.0f, 17.105f, 4.895f, 18.0f, 6.0f, 18.0f)
                curveTo(7.105f, 18.0f, 8.0f, 17.105f, 8.0f, 16.0f)
                curveTo(8.0f, 14.895f, 7.105f, 14.0f, 6.0f, 14.0f)
                close()
                moveTo(14.5f, 2.0f)
                curveTo(17.538f, 2.0f, 20.0f, 4.462f, 20.0f, 7.5f)
                curveTo(20.0f, 10.538f, 17.538f, 13.0f, 14.5f, 13.0f)
                curveTo(11.462f, 13.0f, 9.0f, 10.538f, 9.0f, 7.5f)
                curveTo(9.0f, 4.462f, 11.462f, 2.0f, 14.5f, 2.0f)
                close()
                moveTo(14.5f, 4.0f)
                curveTo(12.567f, 4.0f, 11.0f, 5.567f, 11.0f, 7.5f)
                curveTo(11.0f, 9.433f, 12.567f, 11.0f, 14.5f, 11.0f)
                curveTo(16.433f, 11.0f, 18.0f, 9.433f, 18.0f, 7.5f)
                curveTo(18.0f, 5.567f, 16.433f, 4.0f, 14.5f, 4.0f)
                close()
            }
        }
        .build()
        return _bubbleChartLine!!
    }

private var _bubbleChartLine: ImageVector? = null
