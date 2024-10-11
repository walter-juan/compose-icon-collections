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

public val FinanceGroup.Exchange2Line: ImageVector
    get() {
        if (_exchange2Line != null) {
            return _exchange2Line!!
        }
        _exchange2Line = Builder(name = "Exchange2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.5f)
                curveTo(4.515f, 21.5f, 2.5f, 19.485f, 2.5f, 17.0f)
                curveTo(2.5f, 14.515f, 4.515f, 12.5f, 7.0f, 12.5f)
                curveTo(9.485f, 12.5f, 11.5f, 14.515f, 11.5f, 17.0f)
                curveTo(11.5f, 19.485f, 9.485f, 21.5f, 7.0f, 21.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveTo(14.515f, 11.5f, 12.5f, 9.485f, 12.5f, 7.0f)
                curveTo(12.5f, 4.515f, 14.515f, 2.5f, 17.0f, 2.5f)
                curveTo(19.485f, 2.5f, 21.5f, 4.515f, 21.5f, 7.0f)
                curveTo(21.5f, 9.485f, 19.485f, 11.5f, 17.0f, 11.5f)
                close()
                moveTo(7.0f, 19.5f)
                curveTo(8.381f, 19.5f, 9.5f, 18.381f, 9.5f, 17.0f)
                curveTo(9.5f, 15.619f, 8.381f, 14.5f, 7.0f, 14.5f)
                curveTo(5.619f, 14.5f, 4.5f, 15.619f, 4.5f, 17.0f)
                curveTo(4.5f, 18.381f, 5.619f, 19.5f, 7.0f, 19.5f)
                close()
                moveTo(17.0f, 9.5f)
                curveTo(18.381f, 9.5f, 19.5f, 8.381f, 19.5f, 7.0f)
                curveTo(19.5f, 5.619f, 18.381f, 4.5f, 17.0f, 4.5f)
                curveTo(15.619f, 4.5f, 14.5f, 5.619f, 14.5f, 7.0f)
                curveTo(14.5f, 8.381f, 15.619f, 9.5f, 17.0f, 9.5f)
                close()
                moveTo(3.0f, 8.0f)
                curveTo(3.0f, 5.239f, 5.239f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 5.0f, 5.0f, 6.343f, 5.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 17.657f, 17.657f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                curveTo(18.761f, 21.0f, 21.0f, 18.761f, 21.0f, 16.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _exchange2Line!!
    }

private var _exchange2Line: ImageVector? = null
