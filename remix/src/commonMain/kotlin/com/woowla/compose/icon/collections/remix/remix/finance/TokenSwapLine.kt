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

public val FinanceGroup.TokenSwapLine: ImageVector
    get() {
        if (_tokenSwapLine != null) {
            return _tokenSwapLine!!
        }
        _tokenSwapLine = Builder(name = "TokenSwapLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.5f)
                lineTo(6.5f, 15.0f)
                lineTo(9.0f, 17.5f)
                lineTo(11.5f, 15.0f)
                lineTo(9.0f, 12.5f)
                close()
                moveTo(15.0f, 2.5f)
                curveTo(11.572f, 2.5f, 8.764f, 5.153f, 8.518f, 8.518f)
                curveTo(5.153f, 8.764f, 2.5f, 11.572f, 2.5f, 15.0f)
                curveTo(2.5f, 18.59f, 5.41f, 21.5f, 9.0f, 21.5f)
                curveTo(12.428f, 21.5f, 15.236f, 18.847f, 15.482f, 15.482f)
                curveTo(18.847f, 15.236f, 21.5f, 12.428f, 21.5f, 9.0f)
                curveTo(21.5f, 5.41f, 18.59f, 2.5f, 15.0f, 2.5f)
                close()
                moveTo(15.323f, 13.489f)
                curveTo(14.757f, 11.113f, 12.887f, 9.242f, 10.511f, 8.677f)
                curveTo(10.677f, 6.342f, 12.623f, 4.5f, 15.0f, 4.5f)
                curveTo(17.485f, 4.5f, 19.5f, 6.515f, 19.5f, 9.0f)
                curveTo(19.5f, 11.377f, 17.658f, 13.323f, 15.323f, 13.489f)
                close()
                moveTo(13.5f, 15.0f)
                curveTo(13.5f, 17.485f, 11.485f, 19.5f, 9.0f, 19.5f)
                curveTo(6.515f, 19.5f, 4.5f, 17.485f, 4.5f, 15.0f)
                curveTo(4.5f, 12.515f, 6.515f, 10.5f, 9.0f, 10.5f)
                curveTo(11.485f, 10.5f, 13.5f, 12.515f, 13.5f, 15.0f)
                close()
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 4.791f, 4.791f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 5.0f, 5.0f, 5.895f, 5.0f, 7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 19.209f, 19.209f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 19.0f, 19.0f, 18.105f, 19.0f, 17.0f)
                close()
            }
        }
        .build()
        return _tokenSwapLine!!
    }

private var _tokenSwapLine: ImageVector? = null
