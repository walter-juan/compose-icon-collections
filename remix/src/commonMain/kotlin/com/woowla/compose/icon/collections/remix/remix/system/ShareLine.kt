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

public val SystemGroup.ShareLine: ImageVector
    get() {
        if (_shareLine != null) {
            return _shareLine!!
        }
        _shareLine = Builder(name = "ShareLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.12f, 17.023f)
                lineTo(8.921f, 14.732f)
                curveTo(8.191f, 15.512f, 7.153f, 16.0f, 6.0f, 16.0f)
                curveTo(3.791f, 16.0f, 2.0f, 14.209f, 2.0f, 12.0f)
                curveTo(2.0f, 9.791f, 3.791f, 8.0f, 6.0f, 8.0f)
                curveTo(7.153f, 8.0f, 8.191f, 8.487f, 8.921f, 9.267f)
                lineTo(13.12f, 6.977f)
                curveTo(13.042f, 6.664f, 13.0f, 6.337f, 13.0f, 6.0f)
                curveTo(13.0f, 3.791f, 14.791f, 2.0f, 17.0f, 2.0f)
                curveTo(19.209f, 2.0f, 21.0f, 3.791f, 21.0f, 6.0f)
                curveTo(21.0f, 8.209f, 19.209f, 10.0f, 17.0f, 10.0f)
                curveTo(15.847f, 10.0f, 14.809f, 9.513f, 14.079f, 8.732f)
                lineTo(9.88f, 11.023f)
                curveTo(9.958f, 11.335f, 10.0f, 11.663f, 10.0f, 12.0f)
                curveTo(10.0f, 12.337f, 9.958f, 12.664f, 9.88f, 12.977f)
                lineTo(14.079f, 15.267f)
                curveTo(14.809f, 14.488f, 15.847f, 14.0f, 17.0f, 14.0f)
                curveTo(19.209f, 14.0f, 21.0f, 15.791f, 21.0f, 18.0f)
                curveTo(21.0f, 20.209f, 19.209f, 22.0f, 17.0f, 22.0f)
                curveTo(14.791f, 22.0f, 13.0f, 20.209f, 13.0f, 18.0f)
                curveTo(13.0f, 17.663f, 13.042f, 17.336f, 13.12f, 17.023f)
                close()
                moveTo(6.0f, 14.0f)
                curveTo(7.105f, 14.0f, 8.0f, 13.105f, 8.0f, 12.0f)
                curveTo(8.0f, 10.895f, 7.105f, 10.0f, 6.0f, 10.0f)
                curveTo(4.895f, 10.0f, 4.0f, 10.895f, 4.0f, 12.0f)
                curveTo(4.0f, 13.105f, 4.895f, 14.0f, 6.0f, 14.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(18.105f, 8.0f, 19.0f, 7.105f, 19.0f, 6.0f)
                curveTo(19.0f, 4.895f, 18.105f, 4.0f, 17.0f, 4.0f)
                curveTo(15.895f, 4.0f, 15.0f, 4.895f, 15.0f, 6.0f)
                curveTo(15.0f, 7.105f, 15.895f, 8.0f, 17.0f, 8.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveTo(18.105f, 20.0f, 19.0f, 19.105f, 19.0f, 18.0f)
                curveTo(19.0f, 16.895f, 18.105f, 16.0f, 17.0f, 16.0f)
                curveTo(15.895f, 16.0f, 15.0f, 16.895f, 15.0f, 18.0f)
                curveTo(15.0f, 19.105f, 15.895f, 20.0f, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shareLine!!
    }

private var _shareLine: ImageVector? = null
