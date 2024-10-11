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

public val FinanceGroup.P2pFill: ImageVector
    get() {
        if (_p2pFill != null) {
            return _p2pFill!!
        }
        _p2pFill = Builder(name = "P2pFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveTo(20.0f, 6.657f, 18.657f, 8.0f, 17.0f, 8.0f)
                curveTo(15.343f, 8.0f, 14.0f, 6.657f, 14.0f, 5.0f)
                curveTo(14.0f, 3.343f, 15.343f, 2.0f, 17.0f, 2.0f)
                curveTo(18.657f, 2.0f, 20.0f, 3.343f, 20.0f, 5.0f)
                close()
                moveTo(7.0f, 3.0f)
                curveTo(4.791f, 3.0f, 3.0f, 4.791f, 3.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.895f, 5.895f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 21.0f)
                curveTo(19.209f, 21.0f, 21.0f, 19.209f, 21.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.105f, 18.105f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(8.657f, 16.0f, 10.0f, 14.657f, 10.0f, 13.0f)
                curveTo(10.0f, 11.343f, 8.657f, 10.0f, 7.0f, 10.0f)
                curveTo(5.343f, 10.0f, 4.0f, 11.343f, 4.0f, 13.0f)
                curveTo(4.0f, 14.657f, 5.343f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(14.791f, 9.0f, 13.0f, 10.791f, 13.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 10.791f, 19.209f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(3.0f, 21.0f)
                curveTo(3.0f, 18.791f, 4.791f, 17.0f, 7.0f, 17.0f)
                curveTo(9.209f, 17.0f, 11.0f, 18.791f, 11.0f, 21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _p2pFill!!
    }

private var _p2pFill: ImageVector? = null
