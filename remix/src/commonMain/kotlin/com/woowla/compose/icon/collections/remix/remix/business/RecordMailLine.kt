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

public val BusinessGroup.RecordMailLine: ImageVector
    get() {
        if (_recordMailLine != null) {
            return _recordMailLine!!
        }
        _recordMailLine = Builder(name = "RecordMailLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.257f, 15.0f)
                curveTo(13.472f, 14.049f, 13.0f, 12.83f, 13.0f, 11.5f)
                curveTo(13.0f, 8.462f, 15.462f, 6.0f, 18.5f, 6.0f)
                curveTo(21.538f, 6.0f, 24.0f, 8.462f, 24.0f, 11.5f)
                curveTo(24.0f, 14.538f, 21.538f, 17.0f, 18.5f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(2.462f, 17.0f, 0.0f, 14.538f, 0.0f, 11.5f)
                curveTo(0.0f, 8.462f, 2.462f, 6.0f, 5.5f, 6.0f)
                curveTo(8.538f, 6.0f, 11.0f, 8.462f, 11.0f, 11.5f)
                curveTo(11.0f, 12.83f, 10.528f, 14.049f, 9.743f, 15.0f)
                horizontalLineTo(14.257f)
                close()
                moveTo(5.5f, 15.0f)
                curveTo(7.433f, 15.0f, 9.0f, 13.433f, 9.0f, 11.5f)
                curveTo(9.0f, 9.567f, 7.433f, 8.0f, 5.5f, 8.0f)
                curveTo(3.567f, 8.0f, 2.0f, 9.567f, 2.0f, 11.5f)
                curveTo(2.0f, 13.433f, 3.567f, 15.0f, 5.5f, 15.0f)
                close()
                moveTo(18.5f, 15.0f)
                curveTo(20.433f, 15.0f, 22.0f, 13.433f, 22.0f, 11.5f)
                curveTo(22.0f, 9.567f, 20.433f, 8.0f, 18.5f, 8.0f)
                curveTo(16.567f, 8.0f, 15.0f, 9.567f, 15.0f, 11.5f)
                curveTo(15.0f, 13.433f, 16.567f, 15.0f, 18.5f, 15.0f)
                close()
            }
        }
        .build()
        return _recordMailLine!!
    }

private var _recordMailLine: ImageVector? = null
