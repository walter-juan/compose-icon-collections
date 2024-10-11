package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.SafeLine: ImageVector
    get() {
        if (_safeLine != null) {
            return _safeLine!!
        }
        _safeLine = Builder(name = "SafeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.005f, 20.0f)
                horizontalLineTo(6.005f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 20.0f, 2.005f, 19.552f, 2.005f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(2.005f, 3.447f, 2.453f, 3.0f, 3.005f, 3.0f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.0f, 22.005f, 3.447f, 22.005f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(22.005f, 19.552f, 21.557f, 20.0f, 21.005f, 20.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.005f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.005f, 18.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.005f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.005f, 13.874f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(13.874f)
                curveTo(9.28f, 13.43f, 8.005f, 11.864f, 8.005f, 10.0f)
                curveTo(8.005f, 7.791f, 9.796f, 6.0f, 12.005f, 6.0f)
                curveTo(14.214f, 6.0f, 16.005f, 7.791f, 16.005f, 10.0f)
                curveTo(16.005f, 11.864f, 14.73f, 13.43f, 13.005f, 13.874f)
                close()
                moveTo(12.005f, 12.0f)
                curveTo(13.109f, 12.0f, 14.005f, 11.104f, 14.005f, 10.0f)
                curveTo(14.005f, 8.895f, 13.109f, 8.0f, 12.005f, 8.0f)
                curveTo(10.9f, 8.0f, 10.005f, 8.895f, 10.005f, 10.0f)
                curveTo(10.005f, 11.104f, 10.9f, 12.0f, 12.005f, 12.0f)
                close()
            }
        }
        .build()
        return _safeLine!!
    }

private var _safeLine: ImageVector? = null
