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

public val FinanceGroup.P2pLine: ImageVector
    get() {
        if (_p2pLine != null) {
            return _p2pLine!!
        }
        _p2pLine = Builder(name = "P2pLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(16.448f, 6.0f, 16.0f, 5.552f, 16.0f, 5.0f)
                curveTo(16.0f, 4.448f, 16.448f, 4.0f, 17.0f, 4.0f)
                curveTo(17.552f, 4.0f, 18.0f, 4.448f, 18.0f, 5.0f)
                curveTo(18.0f, 5.552f, 17.552f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(18.657f, 8.0f, 20.0f, 6.657f, 20.0f, 5.0f)
                curveTo(20.0f, 3.343f, 18.657f, 2.0f, 17.0f, 2.0f)
                curveTo(15.343f, 2.0f, 14.0f, 3.343f, 14.0f, 5.0f)
                curveTo(14.0f, 6.657f, 15.343f, 8.0f, 17.0f, 8.0f)
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
                moveTo(8.0f, 13.0f)
                curveTo(8.0f, 12.448f, 7.552f, 12.0f, 7.0f, 12.0f)
                curveTo(6.448f, 12.0f, 6.0f, 12.448f, 6.0f, 13.0f)
                curveTo(6.0f, 13.552f, 6.448f, 14.0f, 7.0f, 14.0f)
                curveTo(7.552f, 14.0f, 8.0f, 13.552f, 8.0f, 13.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(10.0f, 14.657f, 8.657f, 16.0f, 7.0f, 16.0f)
                curveTo(5.343f, 16.0f, 4.0f, 14.657f, 4.0f, 13.0f)
                curveTo(4.0f, 11.343f, 5.343f, 10.0f, 7.0f, 10.0f)
                curveTo(8.657f, 10.0f, 10.0f, 11.343f, 10.0f, 13.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(15.895f, 11.0f, 15.0f, 11.895f, 15.0f, 13.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 10.791f, 14.791f, 9.0f, 17.0f, 9.0f)
                curveTo(19.209f, 9.0f, 21.0f, 10.791f, 21.0f, 13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 11.895f, 18.105f, 11.0f, 17.0f, 11.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveTo(5.0f, 19.895f, 5.895f, 19.0f, 7.0f, 19.0f)
                curveTo(8.105f, 19.0f, 9.0f, 19.895f, 9.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 18.791f, 9.209f, 17.0f, 7.0f, 17.0f)
                curveTo(4.791f, 17.0f, 3.0f, 18.791f, 3.0f, 21.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _p2pLine!!
    }

private var _p2pLine: ImageVector? = null
