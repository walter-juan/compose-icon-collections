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

public val FinanceGroup.Swap3Line: ImageVector
    get() {
        if (_swap3Line != null) {
            return _swap3Line!!
        }
        _swap3Line = Builder(name = "Swap3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.914f)
                lineTo(3.707f, 8.207f)
                lineTo(2.293f, 6.793f)
                lineTo(7.0f, 2.086f)
                lineTo(11.707f, 6.793f)
                lineTo(10.293f, 8.207f)
                lineTo(8.0f, 5.914f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 5.914f)
                close()
                moveTo(17.0f, 9.5f)
                curveTo(18.381f, 9.5f, 19.5f, 8.381f, 19.5f, 7.0f)
                curveTo(19.5f, 5.619f, 18.381f, 4.5f, 17.0f, 4.5f)
                curveTo(15.619f, 4.5f, 14.5f, 5.619f, 14.5f, 7.0f)
                curveTo(14.5f, 8.381f, 15.619f, 9.5f, 17.0f, 9.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveTo(14.515f, 11.5f, 12.5f, 9.485f, 12.5f, 7.0f)
                curveTo(12.5f, 4.515f, 14.515f, 2.5f, 17.0f, 2.5f)
                curveTo(19.485f, 2.5f, 21.5f, 4.515f, 21.5f, 7.0f)
                curveTo(21.5f, 9.485f, 19.485f, 11.5f, 17.0f, 11.5f)
                close()
                moveTo(21.707f, 17.207f)
                lineTo(20.293f, 15.793f)
                lineTo(18.0f, 18.086f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.086f)
                lineTo(13.707f, 15.793f)
                lineTo(12.293f, 17.207f)
                lineTo(17.0f, 21.914f)
                lineTo(21.707f, 17.207f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(10.552f, 13.0f, 11.0f, 13.448f, 11.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.552f, 10.552f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                lineTo(3.0f, 14.0f)
                curveTo(3.0f, 13.448f, 3.448f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _swap3Line!!
    }

private var _swap3Line: ImageVector? = null
